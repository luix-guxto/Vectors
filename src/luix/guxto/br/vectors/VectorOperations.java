package luix.guxto.br.vectors;

@SuppressWarnings("unused")
public final class VectorOperations{

    private static final long serialVersionUID = 1L;

    public static Vector2<Integer> addInteger(Vector2<Integer> v1, Vector2<Integer> v2){
        Integer x = v1.x + v2.x;
        Integer y = v1.y + v2.y;
        return new Vector2<>(x, y);
    }
    public static Vector2<Double> addDouble(Vector2<Double> v1, Vector2<Double> v2){
        return new Vector2<>(v1.x + v2.x, v1.y + v2.y);
    }
    public static Vector2<Float> addFloat(Vector2<Float> v1, Vector2<Float> v2){
        return new Vector2<>(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vector2<Long> addLong(Vector2<Long> v1, Vector2<Long> v2){
        return new Vector2<>(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vector2<Short> addShort(Vector2<Short> v1, Vector2<Short> v2){
        return new Vector2<>((short)(v1.x + v2.x), (short)(v1.y + v2.y));
    }

    public static Vector2<Byte> addByte(Vector2<Byte> v1, Vector2<Byte> v2){
        return new Vector2<>((byte)(v1.x + v2.x), (byte)(v1.y + v2.y));
    }

    public static Vector3<Integer> addInteger(Vector3<Integer> v1, Vector3<Integer> v2){
        return new Vector3<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector3<Double> addDouble(Vector3<Double> v1, Vector3<Double> v2){
        return new Vector3<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector3<Float> addFloat(Vector3<Float> v1, Vector3<Float> v2){
        return new Vector3<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector3<Long> addLong(Vector3<Long> v1, Vector3<Long> v2){
        return new Vector3<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector3<Short> addShort(Vector3<Short> v1, Vector3<Short> v2){
        return new Vector3<>((short)(v1.x + v2.x), (short)(v1.y + v2.y), (short)(v1.z + v2.z));
    }

    public static Vector3<Byte> addByte(Vector3<Byte> v1, Vector3<Byte> v2){
        return new Vector3<>((byte)(v1.x + v2.x), (byte)(v1.y + v2.y), (byte)(v1.z + v2.z));
    }

    public static Vector4<Integer> addInteger(Vector4<Integer> v1, Vector4<Integer> v2){
        return new Vector4<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z, v1.w + v2.w);
    }

    public static Vector4<Double> addDouble(Vector4<Double> v1, Vector4<Double> v2){
        return new Vector4<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z, v1.w + v2.w);
    }

    public static Vector4<Float> addFloat(Vector4<Float> v1, Vector4<Float> v2){
        return new Vector4<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z, v1.w + v2.w);
    }

    public static Vector4<Long> addLong(Vector4<Long> v1, Vector4<Long> v2){
        return new Vector4<>(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z, v1.w + v2.w);
    }

    public static Vector4<Short> addShort(Vector4<Short> v1, Vector4<Short> v2){
        return new Vector4<>((short)(v1.x + v2.x), (short)(v1.y + v2.y), (short)(v1.z + v2.z), (short)(v1.w + v2.w));
    }

    public static Vector4<Byte> addByte(Vector4<Byte> v1, Vector4<Byte> v2){
        return new Vector4<>((byte)(v1.x + v2.x), (byte)(v1.y + v2.y), (byte)(v1.z + v2.z), (byte)(v1.w + v2.w));
    }

    public static Vector2<Integer> subInteger(Vector2<Integer> v1, Vector2<Integer> v2){
        return new Vector2<>(v1.x - v2.x, v1.y - v2.y);
    }

    public static Vector2<Double> subDouble(Vector2<Double> v1, Vector2<Double> v2){
        return new Vector2<>(v1.x - v2.x, v1.y - v2.y);
    }

    public static Vector2<Float> subFloat(Vector2<Float> v1, Vector2<Float> v2){
        return new Vector2<>(v1.x - v2.x, v1.y - v2.y);
    }

    public static Vector2<Long> subLong(Vector2<Long> v1, Vector2<Long> v2){
        return new Vector2<>(v1.x - v2.x, v1.y - v2.y);
    }

    public static Vector2<Short> subShort(Vector2<Short> v1, Vector2<Short> v2){
        return new Vector2<>((short)(v1.x - v2.x), (short)(v1.y - v2.y));
    }

    public static Vector2<Byte> subByte(Vector2<Byte> v1, Vector2<Byte> v2){
        return new Vector2<>((byte)(v1.x - v2.x), (byte)(v1.y - v2.y));
    }

    public static Vector3<Integer> subInteger(Vector3<Integer> v1, Vector3<Integer> v2){
        return new Vector3<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector3<Double> subDouble(Vector3<Double> v1, Vector3<Double> v2){
        return new Vector3<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector3<Float> subFloat(Vector3<Float> v1, Vector3<Float> v2){
        return new Vector3<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector3<Long> subLong(Vector3<Long> v1, Vector3<Long> v2){
        return new Vector3<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector3<Short> subShort(Vector3<Short> v1, Vector3<Short> v2){
        return new Vector3<>((short)(v1.x - v2.x), (short)(v1.y - v2.y), (short)(v1.z - v2.z));
    }

    public static Vector3<Byte> subByte(Vector3<Byte> v1, Vector3<Byte> v2){
        return new Vector3<>((byte)(v1.x - v2.x), (byte)(v1.y - v2.y), (byte)(v1.z - v2.z));
    }

    public static Vector4<Integer> subInteger(Vector4<Integer> v1, Vector4<Integer> v2){
        return new Vector4<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z, v1.w - v2.w);
    }

    public static Vector4<Double> subDouble(Vector4<Double> v1, Vector4<Double> v2){
        return new Vector4<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z, v1.w - v2.w);
    }

    public static Vector4<Float> subFloat(Vector4<Float> v1, Vector4<Float> v2){
        return new Vector4<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z, v1.w - v2.w);
    }

    public static Vector4<Long> subLong(Vector4<Long> v1, Vector4<Long> v2){
        return new Vector4<>(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z, v1.w - v2.w);
    }

    public static Vector4<Short> subShort(Vector4<Short> v1, Vector4<Short> v2){
        return new Vector4<>((short)(v1.x - v2.x), (short)(v1.y - v2.y), (short)(v1.z - v2.z), (short)(v1.w - v2.w));
    }

    public static Vector4<Byte> subByte(Vector4<Byte> v1, Vector4<Byte> v2){
        return new Vector4<>((byte)(v1.x - v2.x), (byte)(v1.y - v2.y), (byte)(v1.z - v2.z), (byte)(v1.w - v2.w));
    }

    public static Vector2<Integer> mulInteger(Vector2<Integer> v1, Vector2<Integer> v2){
        return new Vector2<>(v1.x * v2.x, v1.y * v2.y);
    }

    public static Vector2<Double> mulDouble(Vector2<Double> v1, Vector2<Double> v2){
        return new Vector2<>(v1.x * v2.x, v1.y * v2.y);
    }

    public static Vector2<Float> mulFloat(Vector2<Float> v1, Vector2<Float> v2){
        return new Vector2<>(v1.x * v2.x, v1.y * v2.y);
    }

    public static Vector2<Long> mulLong(Vector2<Long> v1, Vector2<Long> v2){
        return new Vector2<>(v1.x * v2.x, v1.y * v2.y);
    }

    public static Vector2<Short> mulShort(Vector2<Short> v1, Vector2<Short> v2){
        return new Vector2<>((short)(v1.x * v2.x), (short)(v1.y * v2.y));
    }

    public static Vector2<Byte> mulByte(Vector2<Byte> v1, Vector2<Byte> v2){
        return new Vector2<>((byte)(v1.x * v2.x), (byte)(v1.y * v2.y));
    }

    public static Vector3<Integer> mulInteger(Vector3<Integer> v1, Vector3<Integer> v2){
        return new Vector3<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
    }

    public static Vector3<Double> mulDouble(Vector3<Double> v1, Vector3<Double> v2){
        return new Vector3<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
    }

    public static Vector3<Float> mulFloat(Vector3<Float> v1, Vector3<Float> v2){
        return new Vector3<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
    }

    public static Vector3<Long> mulLong(Vector3<Long> v1, Vector3<Long> v2){
        return new Vector3<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z);
    }

    public static Vector3<Short> mulShort(Vector3<Short> v1, Vector3<Short> v2){
        return new Vector3<>((short)(v1.x * v2.x), (short)(v1.y * v2.y), (short)(v1.z * v2.z));
    }

    public static Vector3<Byte> mulByte(Vector3<Byte> v1, Vector3<Byte> v2){
        return new Vector3<>((byte)(v1.x * v2.x), (byte)(v1.y * v2.y), (byte)(v1.z * v2.z));
    }

    public static Vector4<Integer> mulInteger(Vector4<Integer> v1, Vector4<Integer> v2){
        return new Vector4<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z, v1.w * v2.w);
    }

    public static Vector4<Double> mulDouble(Vector4<Double> v1, Vector4<Double> v2){
        return new Vector4<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z, v1.w * v2.w);
    }

    public static Vector4<Float> mulFloat(Vector4<Float> v1, Vector4<Float> v2){
        return new Vector4<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z, v1.w * v2.w);
    }

    public static Vector4<Long> mulLong(Vector4<Long> v1, Vector4<Long> v2){
        return new Vector4<>(v1.x * v2.x, v1.y * v2.y, v1.z * v2.z, v1.w * v2.w);
    }

    public static Vector4<Short> mulShort(Vector4<Short> v1, Vector4<Short> v2){
        return new Vector4<>((short)(v1.x * v2.x), (short)(v1.y * v2.y), (short)(v1.z * v2.z), (short)(v1.w * v2.w));
    }

    public static Vector4<Byte> mulByte(Vector4<Byte> v1, Vector4<Byte> v2){
        return new Vector4<>((byte)(v1.x * v2.x), (byte)(v1.y * v2.y), (byte)(v1.z * v2.z), (byte)(v1.w * v2.w));
    }

    public static Vector2<Integer> divInteger(Vector2<Integer> v1, Vector2<Integer> v2){
        return new Vector2<>(v1.x / v2.x, v1.y / v2.y);
    }

    public static Vector2<Double> divDouble(Vector2<Double> v1, Vector2<Double> v2){
        return new Vector2<>(v1.x / v2.x, v1.y / v2.y);
    }

    public static Vector2<Float> divFloat(Vector2<Float> v1, Vector2<Float> v2){
        return new Vector2<>(v1.x / v2.x, v1.y / v2.y);
    }

    public static Vector2<Long> divLong(Vector2<Long> v1, Vector2<Long> v2){
        return new Vector2<>(v1.x / v2.x, v1.y / v2.y);
    }

    public static Vector2<Short> divShort(Vector2<Short> v1, Vector2<Short> v2){
        return new Vector2<>((short)(v1.x / v2.x), (short)(v1.y / v2.y));
    }

    public static Vector2<Byte> divByte(Vector2<Byte> v1, Vector2<Byte> v2){
        return new Vector2<>((byte)(v1.x / v2.x), (byte)(v1.y / v2.y));
    }

    public static Vector3<Integer> divInteger(Vector3<Integer> v1, Vector3<Integer> v2){
        return new Vector3<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z);
    }

    public static Vector3<Double> divDouble(Vector3<Double> v1, Vector3<Double> v2){
        return new Vector3<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z);
    }

    public static Vector3<Float> divFloat(Vector3<Float> v1, Vector3<Float> v2){
        return new Vector3<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z);
    }

    public static Vector3<Long> divLong(Vector3<Long> v1, Vector3<Long> v2){
        return new Vector3<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z);
    }

    public static Vector3<Short> divShort(Vector3<Short> v1, Vector3<Short> v2){
        return new Vector3<>((short)(v1.x / v2.x), (short)(v1.y / v2.y), (short)(v1.z / v2.z));
    }

    public static Vector3<Byte> divByte(Vector3<Byte> v1, Vector3<Byte> v2){
        return new Vector3<>((byte)(v1.x / v2.x), (byte)(v1.y / v2.y), (byte)(v1.z / v2.z));
    }

    public static Vector4<Integer> divInteger(Vector4<Integer> v1, Vector4<Integer> v2){
        return new Vector4<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z, v1.w / v2.w);
    }

    public static Vector4<Double> divDouble(Vector4<Double> v1, Vector4<Double> v2){
        return new Vector4<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z, v1.w / v2.w);
    }

    public static Vector4<Float> divFloat(Vector4<Float> v1, Vector4<Float> v2){
        return new Vector4<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z, v1.w / v2.w);
    }

    public static Vector4<Long> divLong(Vector4<Long> v1, Vector4<Long> v2){
        return new Vector4<>(v1.x / v2.x, v1.y / v2.y, v1.z / v2.z, v1.w / v2.w);
    }

    public static Vector4<Short> divShort(Vector4<Short> v1, Vector4<Short> v2){
        return new Vector4<>((short)(v1.x / v2.x), (short)(v1.y / v2.y), (short)(v1.z / v2.z), (short)(v1.w / v2.w));
    }

    public static Vector4<Byte> divByte(Vector4<Byte> v1, Vector4<Byte> v2){
        return new Vector4<>((byte)(v1.x / v2.x), (byte)(v1.y / v2.y), (byte)(v1.z / v2.z), (byte)(v1.w / v2.w));
    }

    public static Vector2<Integer> negateInteger(Vector2<Integer> v){
        return new Vector2<>(-v.x, -v.y);
    }

    public static Vector2<Double> negateDouble(Vector2<Double> v){
        return new Vector2<>(-v.x, -v.y);
    }

    public static Vector2<Float> negateFloat(Vector2<Float> v){
        return new Vector2<>(-v.x, -v.y);
    }

    public static Vector2<Long> negateLong(Vector2<Long> v){
        return new Vector2<>(-v.x, -v.y);
    }

    public static Vector2<Short> negateShort(Vector2<Short> v){
        return new Vector2<>((short)-v.x, (short)-v.y);
    }

    public static Vector2<Byte> negateByte(Vector2<Byte> v){
        return new Vector2<>((byte)-v.x, (byte)-v.y);
    }

    public static Vector3<Integer> negateInteger(Vector3<Integer> v){
        return new Vector3<>(-v.x, -v.y, -v.z);
    }

    public static Vector3<Double> negateDouble(Vector3<Double> v){
        return new Vector3<>(-v.x, -v.y, -v.z);
    }

    public static Vector3<Float> negateFloat(Vector3<Float> v){
        return new Vector3<>(-v.x, -v.y, -v.z);
    }

    public static Vector3<Long> negateLong(Vector3<Long> v){
        return new Vector3<>(-v.x, -v.y, -v.z);
    }

    public static Vector3<Short> negateShort(Vector3<Short> v){
        return new Vector3<>((short)-v.x, (short)-v.y, (short)-v.z);
    }

    public static Vector3<Byte> negateByte(Vector3<Byte> v){
        return new Vector3<>((byte)-v.x, (byte)-v.y, (byte)-v.z);
    }

    public static Vector4<Integer> negateInteger(Vector4<Integer> v){
        return new Vector4<>(-v.x, -v.y, -v.z, -v.w);
    }

    public static Vector4<Double> negateDouble(Vector4<Double> v){
        return new Vector4<>(-v.x, -v.y, -v.z, -v.w);
    }

    public static Vector4<Float> negateFloat(Vector4<Float> v){
        return new Vector4<>(-v.x, -v.y, -v.z, -v.w);
    }

    public static Vector4<Long> negateLong(Vector4<Long> v){
        return new Vector4<>(-v.x, -v.y, -v.z, -v.w);
    }

    public static Vector4<Short> negateShort(Vector4<Short> v){
        return new Vector4<>((short)-v.x, (short)-v.y, (short)-v.z, (short)-v.w);
    }

    public static Vector4<Byte> negateByte(Vector4<Byte> v){
        return new Vector4<>((byte)-v.x, (byte)-v.y, (byte)-v.z, (byte)-v.w);
    }

    public static Vector2<Integer> absInteger(Vector2<Integer> v){
        return new Vector2<>(Math.abs(v.x), Math.abs(v.y));
    }

    public static Vector2<Double> absDouble(Vector2<Double> v){
        return new Vector2<>(Math.abs(v.x), Math.abs(v.y));
    }

    public static Vector2<Float> absFloat(Vector2<Float> v){
        return new Vector2<>(Math.abs(v.x), Math.abs(v.y));
    }

    public static Vector2<Long> absLong(Vector2<Long> v){
        return new Vector2<>(Math.abs(v.x), Math.abs(v.y));
    }

    public static Vector2<Short> absShort(Vector2<Short> v){
        return new Vector2<>((short)Math.abs(v.x), (short)Math.abs(v.y));
    }

    public static Vector2<Byte> absByte(Vector2<Byte> v){
        return new Vector2<>((byte)Math.abs(v.x), (byte)Math.abs(v.y));
    }

    public static Vector3<Integer> absInteger(Vector3<Integer> v){
        return new Vector3<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z));
    }

    public static Vector3<Double> absDouble(Vector3<Double> v){
        return new Vector3<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z));
    }

    public static Vector3<Float> absFloat(Vector3<Float> v){
        return new Vector3<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z));
    }

    public static Vector3<Long> absLong(Vector3<Long> v){
        return new Vector3<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z));
    }

    public static Vector3<Short> absShort(Vector3<Short> v){
        return new Vector3<>((short)Math.abs(v.x), (short)Math.abs(v.y), (short)Math.abs(v.z));
    }

    public static Vector3<Byte> absByte(Vector3<Byte> v){
        return new Vector3<>((byte)Math.abs(v.x), (byte)Math.abs(v.y), (byte)Math.abs(v.z));
    }

    public static Vector4<Integer> absInteger(Vector4<Integer> v){
        return new Vector4<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z), Math.abs(v.w));
    }

    public static Vector4<Double> absDouble(Vector4<Double> v){
        return new Vector4<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z), Math.abs(v.w));
    }

    public static Vector4<Float> absFloat(Vector4<Float> v){
        return new Vector4<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z), Math.abs(v.w));
    }

    public static Vector4<Long> absLong(Vector4<Long> v){
        return new Vector4<>(Math.abs(v.x), Math.abs(v.y), Math.abs(v.z), Math.abs(v.w));
    }

    public static Vector4<Short> absShort(Vector4<Short> v){
        return new Vector4<>((short)Math.abs(v.x), (short)Math.abs(v.y), (short)Math.abs(v.z), (short)Math.abs(v.w));
    }

    public static Vector4<Byte> absByte(Vector4<Byte> v){
        return new Vector4<>((byte)Math.abs(v.x), (byte)Math.abs(v.y), (byte)Math.abs(v.z), (byte)Math.abs(v.w));
    }

    public static Vector2<Integer> floorInteger(Vector2<Integer> v){
        return new Vector2<>((int)Math.floor(v.x), (int)Math.floor(v.y));
    }

    public static Vector2<Double> floorDouble(Vector2<Double> v){
        return new Vector2<>(Math.floor(v.x), Math.floor(v.y));
    }

    public static Vector2<Float> floorFloat(Vector2<Float> v){
        return new Vector2<>((float)Math.floor(v.x), (float)Math.floor(v.y));
    }

    public static Vector2<Long> floorLong(Vector2<Long> v){
        return new Vector2<>((long)Math.floor(v.x), (long)Math.floor(v.y));
    }

    public static Vector2<Short> floorShort(Vector2<Short> v){
        return new Vector2<>((short)Math.floor(v.x), (short)Math.floor(v.y));
    }

    public static Vector2<Byte> floorByte(Vector2<Byte> v){
        return new Vector2<>((byte)Math.floor(v.x), (byte)Math.floor(v.y));
    }

    public static Vector3<Integer> floorInteger(Vector3<Integer> v){
        return new Vector3<>((int)Math.floor(v.x), (int)Math.floor(v.y), (int)Math.floor(v.z));
    }

    public static Vector3<Double> floorDouble(Vector3<Double> v){
        return new Vector3<>(Math.floor(v.x), Math.floor(v.y), Math.floor(v.z));
    }

    public static Vector3<Float> floorFloat(Vector3<Float> v){
        return new Vector3<>((float)Math.floor(v.x), (float)Math.floor(v.y), (float)Math.floor(v.z));
    }

    public static Vector3<Long> floorLong(Vector3<Long> v){
        return new Vector3<>((long)Math.floor(v.x), (long)Math.floor(v.y), (long)Math.floor(v.z));
    }

    public static Vector3<Short> floorShort(Vector3<Short> v){
        return new Vector3<>((short)Math.floor(v.x), (short)Math.floor(v.y), (short)Math.floor(v.z));
    }

    public static Vector3<Byte> floorByte(Vector3<Byte> v){
        return new Vector3<>((byte)Math.floor(v.x), (byte)Math.floor(v.y), (byte)Math.floor(v.z));
    }

    public static Vector4<Integer> floorInteger(Vector4<Integer> v){
        return new Vector4<>((int)Math.floor(v.x), (int)Math.floor(v.y), (int)Math.floor(v.z), (int)Math.floor(v.w));
    }

    public static Vector4<Double> floorDouble(Vector4<Double> v){
        return new Vector4<>(Math.floor(v.x), Math.floor(v.y), Math.floor(v.z), Math.floor(v.w));
    }

    public static Vector4<Float> floorFloat(Vector4<Float> v){
        return new Vector4<>((float)Math.floor(v.x), (float)Math.floor(v.y), (float)Math.floor(v.z), (float)Math.floor(v.w));
    }

    public static Vector4<Long> floorLong(Vector4<Long> v){
        return new Vector4<>((long)Math.floor(v.x), (long)Math.floor(v.y), (long)Math.floor(v.z), (long)Math.floor(v.w));
    }

    public static Vector4<Short> floorShort(Vector4<Short> v){
        return new Vector4<>((short)Math.floor(v.x), (short)Math.floor(v.y), (short)Math.floor(v.z), (short)Math.floor(v.w));
    }

    public static Vector4<Byte> floorByte(Vector4<Byte> v){
        return new Vector4<>((byte)Math.floor(v.x), (byte)Math.floor(v.y), (byte)Math.floor(v.z), (byte)Math.floor(v.w));
    }

    public static Vector2<Integer> ceilInteger(Vector2<Integer> v){
        return new Vector2<>((int)Math.ceil(v.x), (int)Math.ceil(v.y));
    }

    public static Vector2<Double> ceilDouble(Vector2<Double> v){
        return new Vector2<>(Math.ceil(v.x), Math.ceil(v.y));
    }

    public static Vector2<Float> ceilFloat(Vector2<Float> v){
        return new Vector2<>((float)Math.ceil(v.x), (float)Math.ceil(v.y));
    }

    public static Vector2<Long> ceilLong(Vector2<Long> v){
        return new Vector2<>((long)Math.ceil(v.x), (long)Math.ceil(v.y));
    }

    public static Vector2<Short> ceilShort(Vector2<Short> v){
        return new Vector2<>((short)Math.ceil(v.x), (short)Math.ceil(v.y));
    }

    public static Vector2<Byte> ceilByte(Vector2<Byte> v){
        return new Vector2<>((byte)Math.ceil(v.x), (byte)Math.ceil(v.y));
    }

    public static Vector3<Integer> ceilInteger(Vector3<Integer> v){
        return new Vector3<>((int)Math.ceil(v.x), (int)Math.ceil(v.y), (int)Math.ceil(v.z));
    }

    public static Vector3<Double> ceilDouble(Vector3<Double> v){
        return new Vector3<>(Math.ceil(v.x), Math.ceil(v.y), Math.ceil(v.z));
    }

    public static Vector3<Float> ceilFloat(Vector3<Float> v){
        return new Vector3<>((float)Math.ceil(v.x), (float)Math.ceil(v.y), (float)Math.ceil(v.z));
    }

    public static Vector3<Long> ceilLong(Vector3<Long> v){
        return new Vector3<>((long)Math.ceil(v.x), (long)Math.ceil(v.y), (long)Math.ceil(v.z));
    }

    public static Vector3<Short> ceilShort(Vector3<Short> v){
        return new Vector3<>((short)Math.ceil(v.x), (short)Math.ceil(v.y), (short)Math.ceil(v.z));
    }

    public static Vector3<Byte> ceilByte(Vector3<Byte> v){
        return new Vector3<>((byte)Math.ceil(v.x), (byte)Math.ceil(v.y), (byte)Math.ceil(v.z));
    }

    public static Vector4<Integer> ceilInteger(Vector4<Integer> v){
        return new Vector4<>((int)Math.ceil(v.x), (int)Math.ceil(v.y), (int)Math.ceil(v.z), (int)Math.ceil(v.w));
    }

    public static Vector4<Double> ceilDouble(Vector4<Double> v){
        return new Vector4<>(Math.ceil(v.x), Math.ceil(v.y), Math.ceil(v.z), Math.ceil(v.w));
    }

    public static Vector4<Float> ceilFloat(Vector4<Float> v){
        return new Vector4<>((float)Math.ceil(v.x), (float)Math.ceil(v.y), (float)Math.ceil(v.z), (float)Math.ceil(v.w));
    }

    public static Vector4<Long> ceilLong(Vector4<Long> v){
        return new Vector4<>((long)Math.ceil(v.x), (long)Math.ceil(v.y), (long)Math.ceil(v.z), (long)Math.ceil(v.w));
    }

    public static Vector4<Short> ceilShort(Vector4<Short> v){
        return new Vector4<>((short)Math.ceil(v.x), (short)Math.ceil(v.y), (short)Math.ceil(v.z), (short)Math.ceil(v.w));
    }

    public static Vector4<Byte> ceilByte(Vector4<Byte> v) {
        return new Vector4<>((byte) Math.ceil(v.x), (byte) Math.ceil(v.y), (byte) Math.ceil(v.z), (byte) Math.ceil(v.w));
    }
}
