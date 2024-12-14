# demo-springboot-app

Projet a base de Spring boot pour livrer sur des services Azure

A base du projet : <https://github.com/spring-guides/gs-spring-boot/>

## Usage

V1.0.0 : Blue Version Page
V2.0.0 : Green Version Page

## HTML

`Demo Spring Boot V(n)`

Color Green or Blue

## Sytem Out

On start : `Let's start Spring Boot`

On each web call : `2021-09-13T07-42-45.5063Z - Demo Cloud APP - V2.0`

Les system Out d'une application SpringBoot remote directement dans un LAW si les diagnostic settings sont activés.

## Gihub Action Config

```yaml
    - uses: azure/login@v2
      with:
        creds: ${{ secrets.AZURE_CREDENTIALS }}
```

`AZURE_CREDENTIALS` must be a project secret like this

```json
{
    "clientSecret":  "******",
    "subscriptionId":  "******",
    "tenantId":  "******",
    "clientId":  "******"
}
```

## Env Var

Dans les `Apps Settings` de la webapp Azure, mettre un Env Var `CHECK` avec la valeur de votre choix pour le voir dans la home page de l'app.

## Usage

- Si vous n'avez pas a toucher au var env de prod, vous livrez votre app en lançant le build dans les GHA.
- Si vous devez changer/ajouter une var env, vous le faites dans le slot de production, sans relancer l'app, puis vous builder et livrer votre app avec les GHA.