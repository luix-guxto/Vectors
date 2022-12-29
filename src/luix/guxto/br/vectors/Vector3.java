package luix.guxto.br.vectors;

@SuppressWarnings("unused")
public final class Vector3<E>{


    private static final long serialVersionUID = 1L;

    public E x;

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public E y;
    public E z;

    public Vector3(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(Vector3<E> v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }

    public Vector3(Vector4<E> v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }
}
