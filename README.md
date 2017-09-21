# teste-de-software-dojoII

### Equipe: Hugo Pablo Tomas de Araujo (20152014040023) e Ricardo Luiz da Silva Junior (20152014040021)

## Problema:
Um dos serviços mais utilizados pelos usuários de aparelhos celulares são os SMS (Short Message Service), que permite o envio de mensagens curtas (até 255 caracteres em redes GSM e 160 caracteres em redes CDMA). 

Para digitar uma mensagem em um aparelho que não possui um teclado QWERTY embutido é necessário fazer algumas combinações das 10 teclas numéricas do aparelho para conseguir digitar. Cada número é associado a um conjunto de letras como a seguir:

Letras ->  Número 

ABC    ->  2 

DEF    ->  3 

GHI    ->  4 

JKL    ->  5 

MNO    ->  6 

PQRS   ->  7 

TUV    ->  8 

WXYZ   ->  9 

Espaço -> 0 

Desenvolva um programa que, dada uma mensagem de texto limitada a 255 caracteres, retorne a seqüência de números que precisa ser digitada. Uma pausa, para ser possível obter duas letras referenciadas pelo mesmo número, deve ser indicada como _.
Por exemplo, para digitar "SEMPRE ACESSO O DOJOPUZZLES", você precisa digitar:
77773367_7773302_222337777_777766606660366656667889999_9999555337777

## Tecnologia
A tecnologia utilizada para criação dos casos de teste será a linguagem de progamação Java.

## Plano de teste - Sequência de números

| Entrada             | Condição                            | Classes Válidas                     | Classes Inválidas                |
| -------------       | -------------                       | --------------------------------    | ----------------                 |
| String              | É do tipo String                    | isString(entrada) == true           | isString(entrada) == false       |
|                     | Está no limide de caracteres        | entrada.lenght < 256                | entrada.lenght >= 256            |
| entrada.split("")   | Caractere digitado                  | entrada[0] instanceof String        | ~(entrada[0] instanceof String)  |
| caractere           | Caractere repetido                  | entrada.equals(ultimo)==caractere   | entrada.equals(ultimo)!=caractere|

### Caso de teste 1 - entrada do tipo String
| Numero                | Entrada                             | Saida                            |
| -------------         | -------------                       | -------------------------------- |
| 1.1                   | "STRING"                            | true                             |
| 1.2                   | 123                                 | fasle, exceptionEntradaInvalida()|

### Caso de teste 2 - total de caracteres inferioir a 256
| Numero                | Entrada                             | Saida                             |
| -------------         | -------------                       | ----------------------------------|
| 2.1                   | "STRING"                            | true                              |
| 2.2                   | palavraTesteTamanho(256)            | fasle, exceptionLimiteCaracteres()|

### Caso de teste 3 - impressão em digitos do caractere digitado
| Numero                | Entrada                             | Saida                            |
| -------------         | -------------                       | -------------------------------- |
| 3.1                   | "S"                                 | 7777                             |
| 3.2                   | "ST"                                | 77778                            |
| 3.3                   | 123                                 | exceptionEntradaInvalida         |

### Caso de teste 4 - impressão do separador para caractere repetido
| Numero                | Entrada                             | Saida                            |
| -------------         | -------------                       | -------------------------------- |
| 4.1                   | "S"                                 | 7777                             |
| 4.2                   | "SS"                                | 7777_7777                        |
| 4.3                   | 123                                 | exceptionEntradaInvalida         |

