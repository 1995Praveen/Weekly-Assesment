function appendToInput(value) {
    document.getElementById('inputBox').value += value;
  }
  
  function clearInput() {
    document.getElementById('inputBox').value = '';
  }
  function deleteCharacter() {
    let inputBox = document.getElementById('inputBox');
    let currentValue = inputBox.value;
    
    // Check if there are characters to delete
    if (currentValue.length > 0) {
      // Remove the last character from the string
      let newValue = currentValue.slice(0, -1);
      
      // Update the input box with the new value
      inputBox.value = newValue;
    }
  }
  function calculate() {
    let input = document.getElementById('inputBox').value;
    let result = eval(input);
    document.getElementById('inputBox').value = result;
  }