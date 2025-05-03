
 # Api Restful Sistema Bancario

 ## Diagrama de Classes
 
 
 ```mermaid
classDiagram
    class Account {
        -String number
        -String agency
        -Float balance
        -Float limit
        +getNumber() String
        +getAgency() String
        +getBalance() Float
        +getLimit() Float
    }

    class Feature {
        -String icon
        -String description
        +getIcon() String
        +getDescription() String
    }

    class Card {
        -String number
        -Float limit
        +getNumber() String
        +getLimit() Float
    }

    class News {
        -String icon
        -String description
        +getIcon() String
        +getDescription() String
    }

    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
        +getName() String
        +getAccount() Account
        +getFeatures() Feature[]
        +getCard() Card
        +getNews() News[]
    }

    User --> Account : "has"
    User --> Feature : "has"
    User --> Card : "has"
    User --> News : "has"


```
