import "./App.css";
import IntegratedTerminal from "./IntegratedTerminal";

function App() {
  return (
    <div>
      <div
        style={{
          width: "50vw",
          height: "100vh",
          position: "relative",
          overflow: "hidden",
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
        }}
      >
        {/* Terminal container */}
        <div
          style={{
            position: "relative",
            zIndex: 1,
            width: "100%",
            display: "flex",
            flexDirection: "column",
            alignItems: "center",
            justifyContent: "center",
          }}
        >
          <IntegratedTerminal />
        </div>
      </div>
    </div>
  );
}

export default App;
