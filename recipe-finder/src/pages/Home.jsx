import React, { useState } from "react";
import SearchBar from "../components/SearchBar";

function Home() {
  const [recipes, setRecipes] = useState([]);
  const [loading, setLoading] = useState(false);

  const fetchRecipes = async (query) => {
  setLoading(true);

  try {
    const res = await fetch(
      `https://api.spoonacular.com/recipes/complexSearch?query=${query}&number=10&apiKey=9cf2d96a67a547578e1a17ece644349f`
    );

    const data = await res.json();

    console.log("API Response:", data); // 👈 this helps us see what comes from API

    // if we get correct data, show it
    if (data && data.results) {
      setRecipes(data.results);
    } else {
      setRecipes([]); // no data
    }
  } catch (error) {
    console.log("Error while fetching:", error);
    setRecipes([]); // stop app from crashing
  } finally {
    setLoading(false);
  }
};


  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1 style={{ color: "orangered" }}>🔍 Recipe Finder</h1>

      <SearchBar onSearch={fetchRecipes} />

      {loading && <p>Loading recipes...</p>}

      <div style={{ display: "flex", flexWrap: "wrap", justifyContent: "center" }}>
        {recipes.map((item) => (
          <div key={item.id} style={{ margin: "15px" }}>
            <h3>{item.title}</h3>
            <img src={item.image} alt={item.title} width="200" />
          </div>
        ))}
      </div>
    </div>
  );
}

export default Home;
