// src/Navbar.js
import React from 'react';

const Navbar = () => {
  return (
    <nav className="bg-blue-600 p-4 shadow-lg">
      <div className="container mx-auto flex justify-between items-center">
        <div className="text-white font-bold text-xl">ShopEasy</div>
        <div className="space-x-4">
          <button className="text-white">Home</button>
          <button className="text-white">Products</button>
          <button className="text-white">Cart</button>
          <button className="text-white">Login</button>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
