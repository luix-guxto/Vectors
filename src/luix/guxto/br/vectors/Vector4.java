package luix.guxto.br.vectors;

@SuppressWarnings("unused")
public final class Vector4<E>{

    private static final long serialVersionUID = 1L;

    public E x;

    @Override
    public String toString() {
        return "Vector4{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", w=" + w +
                '}';
    }

    public E y;
    public E z;
    public E w;

    public Vector4(E x, E y, E z, E w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vector4(Vector4<E> v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        this.w = v.w;
    }
}
