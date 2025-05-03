
 # Api Restful Sistema Bancario

 ## Diagrama de Classes
 
 
 ```mermaid
classDiagram
    class Account {
        -String number
        -String agency
        -Float balance
        -Float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -Float limit
    }

    class News {
        -String icon
        -String description
    }

    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    User "1"-- "1"Account 
    User "1"--"N"Feature 
    User "1"--"1"Card 
    User "1"--"N" News 

```
