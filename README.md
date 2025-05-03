
 # Api Restful Sistema Bancario

 ## Diagrama de Classes
 
 
 ```mermaid
classDiagram
    class Account {
        +String Number
        +String agency
        +Float Balance
        +Float Limit
    }

    class Feature {
        +String Icon
        +String description
    }

    class Card {
        +String Number
        +Float Limit
    }

    class News {
        +String newsIcon
        +String newDescription
    }

    class User {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    User --> Account : "has"
    User --> Feature : "has"
    User --> Card : "has"
    User --> News : "has"

```
