# teste-de-software-dojoII

## Plano de teste - Sequência de números

| Entrada             | Condição                            | Classes Válidas                  | Classes Inválidas             |
| -------------       | -------------                       | -------------------------------- | ----------------              |
| String              | É do tipo String                    | isString(entrada) == true        | isString(entrada) == false    |
|                     | Está no limide de caracteres        | entrada.size() < 256             | entrada.size() >= 256         |
| entrada.split("")   | Caractere digitado                  | entrada[0] == "A"                | entrada[0] != "A"             |
| caractere           | Caractere repetido                  | entrada.getLast() == caractere   | entrada.getLast() == caractere|
