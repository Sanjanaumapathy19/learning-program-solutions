import React from 'react';
import './App.css';
import CohortDetails from './components/CohortDetails';

function App() {
  return (
    <div className="App">
      <CohortDetails name="React Cohort" status="ongoing" startDate="June 10, 2025" endDate="Aug 10, 2025" />
      <CohortDetails name="Node.js Cohort" status="completed" startDate="April 1, 2025" endDate="May 30, 2025" />
    </div>
  );
}

export default App;
