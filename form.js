// function IsEmpty(){
//     user=document.getElementById("uerinput").value.trim();
//     password=document.getElementById("password").value.trim();

//     if(!user||!password){
//         console.log('pleass fill email/moble number and password');
//         return false;
//     }

//     alert("login succesfull")
//     return false
// }

function ISEmpty() {
    const user = document.getElementById("userInput").value.trim();
    const password = document.getElementById("passwordInput").value.trim();

    if (!user || !password) {
        alert("Please fill in both email/mobile number and password.");
        return false; // Prevent form submission
    }

    // Here you could add login validation logic (e.g., send to server)
    alert("Login successful! (Dummy validation)");

    return false; // Prevent actual submission for demo
}
