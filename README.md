# teste-de-software-dojoII

## Plano de teste - Sequência de números

| Entrada             | Condição                            | Classes Válidas                  | Classes Inválidas             |
| -------------       | -------------                       | -------------------------------- | ----------------              |
| String              | É do tipo String                    | isString(entrada) == true        | isString(entrada) == false    |
|                     | Está no limide de caracteres        | entrada.size() < 256             | entrada.size() >= 256         |
| entrada.split("")   | Caractere digitado                  | entrada[0] == "A"                | entrada[0] != "A"             |
| caractere           | Caractere repetido                  | entrada.getLast() == caractere   | entrada.getLast() == caractere|

### Caso de teste 1 - entrada do tipo String
| Numero              | Entrada                             | Saida                            |
| -------------       | -------------                       | -------------------------------- |
| 1                   | "STRING"                            | true                             |
| 2                   | 123                                 | fasle                            |

### Caso de teste 2 - total de caracteres inferioir a 256
| Numero              | Entrada                             | Saida                            |
| -------------       | -------------                       | -------------------------------- |
| 1                   | "STRING"                            | true                             |
| 2                   | palavraTesteTamanho(256)            | fasle                            |

### Caso de teste 3 - impressão em digitos do caractere digitado
| Numero              | Entrada                             | Saida                            |
| -------------       | -------------                       | -------------------------------- |
| 1                   | "S"                                 | 7777                             |
| 2                   | "ST"                                | 77778                            |

### Caso de teste 4 - impressão do separador para caractere repetido
| Numero              | Entrada                             | Saida                            |
| -------------       | -------------                       | -------------------------------- |
| 1                   | "S"                                 | 7777                             |
| 2                   | "SS"                                | 7777_7777                        |
