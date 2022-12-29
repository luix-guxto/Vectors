# Vectors for use in Java

- Vector2<T> - 2D vector 
- Vector3<T> - 3D vector 
- Vector4<T> - 4D vector 

## What is a vector?

A vector is a quantity that has both magnitude and direction. Vectors are used to represent quantities that have magnitude and direction. For example, a vector can be used to represent the velocity of an object, the force applied to an object, or the position of an object in space.

## How to use

```java
import luix.guxto.br.vectors.*;

public class Main {
    public static void main(String[] args) {
        Vector2<Integer> vector2 = new Vector2<>(1, 2);
        Vector3<Integer> vector3 = new Vector3<>(1, 2, 3);
        Vector4<Integer> vector4 = new Vector4<>(1, 2, 3, 4);

        // Basic operations
        vector4.w = vector3.z = vector2.y = vector2.x = 0;

        System.out.println(vector4);
        System.out.println(vector3);
        System.out.println(vector2);
    }
}
```

## Basic operations

```java
import luix.guxto.br.vectors.*;
public class Main {
    public static void main(String[] args) {
        Vector2<Integer> vector2 = new Vector2<>(1, 2);
        Vector3<Integer> vector3 = new Vector3<>(1, 2, 3);
        Vector4<Integer> vector4 = new Vector4<>(1, 2, 3, 4);

        vector2 = VectorOperations.addInteger(vector2, new Vector2<>(1, 2));
        vector3 = VectorOperations.subInteger(vector3, new Vector3<>(1, 2, 3));
        vector4 = VectorOperations.mulInteger(vector4, new Vector4<>(1, 2, 3, 4));
        vector2 = VectorOperations.divInteger(vector2, new Vector2<>(1, 2));
        
        System.out.println(vector4);
        System.out.println(vector3);
        System.out.println(vector2);
    }
}
```

## Vector operations

- Add - Adds two vectors
- Sub - Subtracts two vectors
- Mul - Multiplies two vectors
- Div - Divides two vectors
- Negate - Negates a vector
- abs - Returns the absolute value of a vector
- floor - Returns the largest integer less than or equal to a vector
- ceil - Returns the smallest integer greater than or equal to a vector

## Como contribuir

- Faça um fork do projeto
- Crie uma branch para sua modificação (`git checkout -b feature/fooBar`)
- Faça o commit (`git commit -am 'Add some fooBar'`)
- Faça o push (`git push origin feature/fooBar`)
- Crie um novo Pull Request
- Aguarde a aprovação do Pull Request
- Após a aprovação, o projeto será atualizado
- Pronto, você contribuiu para o projeto
- Aproveite e contribua com mais projetos open source

# BY: [Luix-Guxto](https://github.com/luix-guxto "Luix-Guxto")

<img alt="Foto de Perfil GitHub" src="https://avatars.githubusercontent.com/u/77067320?v=4" title="ProfilePic" width="300" height="300"/>