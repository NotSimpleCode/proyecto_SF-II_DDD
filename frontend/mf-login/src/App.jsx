import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import Login from "./components/Login";
import "bootstrap/dist/css/bootstrap.min.css";

const App = () => (
  <BrowserRouter>
    <Login />
  </BrowserRouter>
);
ReactDOM.createRoot(document.getElementById("app")).render(<App />);