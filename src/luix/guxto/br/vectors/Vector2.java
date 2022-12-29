package luix.guxto.br.vectors;

@SuppressWarnings("unused")
public final class Vector2<E>{

    private static final long serialVersionUID = 1L;

    public E x;

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public E y;

    public Vector2(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2<E> v) {
        this.x = v.x;
        this.y = v.y;
    }

    public Vector2(Vector3<E> v) {
        this.x = v.x;
        this.y = v.y;
    }

    public Vector2(Vector4<E> v) {
        this.x = v.x;
        this.y = v.y;
    }
}
