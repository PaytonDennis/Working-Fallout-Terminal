import { useState, useEffect } from "react";

type TypingProps = {
  text: string;
  speed?: number;
  onComplete?: () => void;
};

export default function TypingText({
  text,
  speed = 50,
  onComplete,
}: TypingProps) {
  const [displayed, setDisplayed] = useState("");

  useEffect(() => {
    setDisplayed("");
    const interval = setInterval(() => {
      setDisplayed((prev) =>
        prev.length < text.length ? prev + text[prev.length] : prev
      );
    }, speed);

    return () => clearInterval(interval);
  }, [text, speed]);

  useEffect(() => {
    if (text.length > 0 && displayed.length === text.length) {
      onComplete && onComplete();
    }
  }, [displayed, text, onComplete]);

  return <p className="text-green-400 font-mono">{displayed}</p>;
}
