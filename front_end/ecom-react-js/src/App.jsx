// src/App.js
import React, { useEffect, useState } from 'react';
import Navbar from './component/Navbar';
import CardComponent from './component/CardComponent';
import axios from 'axios';

const App = () => {
  const [cards, setCards] = useState([]);

  useEffect(() => {
    // Fetch data from the backend API
    axios.get('http://localhost:8080/api/products') // Update with your API endpoint
      .then(response => {
        console.log(response.data)
        setCards(response.data);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });
  }, []);

  return (
    <div>
      <Navbar />
      <div className="container mx-auto mt-8">
        <div className="flex flex-wrap justify-center">
          {cards.map((card, index) => (
            <CardComponent 
              key={card.id}
              title={card.name}
              description={card.price}
              imageUrl={card.category}
            />
          ))}
        </div>
      </div>
    </div>
  );
}

export default App;
