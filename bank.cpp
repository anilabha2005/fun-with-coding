#include <iostream>
using namespace std;

class BankAccount {
public:
    long int accountNumber;
    float balance;

public:
    BankAccount() : balance(500),accountNumber(0) {} // Initialize balance
    void setaccount();
    void take();
    void displayAccount();
};

class Savings {
public:
    int accountnumber;
    float balance;

public:
    Savings() : balance(500)  {} // Initialize balance
    void deposit(float amount);
    void withdraw(float amount);
    void displayBalance();
};

class Interest : public BankAccount, public Savings {
private:
    float rate,balance;

public:
    void inputInterestRate();
    void calculateInterest();
};

void BankAccount::setaccount() {
    cout << "Enter account number: ";
    cin >> accountNumber;
}

void BankAccount::displayAccount() {
    if(accountNumber==0){
        cout<<"please take an account number"<<endl;
    }
    else
    cout << "Your account number is: " << accountNumber << endl;
}

void Savings::deposit(float amount) {
        balance += amount;
    cout << "Deposited: " << amount << endl;
}
void Savings::withdraw(float amount) {
     if (balance >= amount) {
      balance -= amount;
      cout << "Withdrawn: " << amount << endl;
    } 
}

void Savings::displayBalance() {
    cout << "Current balance: " << balance << endl;
}

void Interest::inputInterestRate() {
    cout << "Enter interest rate (%): ";
    cin >> rate;
}

void Interest::calculateInterest() {
    if(rate>0){
        float interest = (balance * rate) / 100;
    balance += interest;
    cout << "Interest added: " << interest << endl;
    cout << "Updated balance: " << balance << endl;
    }
    else{
        cout<<"invalid rate"<<endl;
    }
}


int main() {
    Interest bankAccount;
    int choice;
    float amount;

    do {
        cout << "---------- MENU ----------\n";
        cout << "1. Take Account Number\n";
        cout << "2. Deposit\n";
        cout << "3. Withdraw\n";
        cout << "4. Calculate Interest\n";
        cout << "5. Display Account and Balance\n";
        cout << "6. Exit\n";
        cout << "--------------------------\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            bankAccount.setaccount();
            break;
        case 2:
            cout << "Enter amount to deposit: ";
            cin >> amount;
            bankAccount.deposit(amount);
            break;
        case 3:
            cout << "Enter amount to withdraw: ";
            cin >> amount;
            bankAccount.withdraw(amount);
            break;
        case 4:
            bankAccount.inputInterestRate();
            bankAccount.calculateInterest();
            break;
        case 5:
            bankAccount.displayAccount();
            bankAccount.displayBalance();
            break;
        case 6:
            cout << "Exiting...\n";
            break;
        default:
            cout << "Invalid choice! Please try again.\n";
        }
    } while (choice != 6);

    return 0;
}
