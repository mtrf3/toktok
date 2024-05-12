package X;

/* renamed from: X.4u4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC124164u4 {
    NONE(0),
    MEMORY(1),
    DISK(2);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC124164u4 swigToEnum(int i) {
        EnumC124164u4[] enumC124164u4Arr = (EnumC124164u4[]) EnumC124164u4.class.getEnumConstants();
        if (i < enumC124164u4Arr.length && i >= 0) {
            EnumC124164u4 enumC124164u4 = enumC124164u4Arr[i];
            if (enumC124164u4.LJLIL == i) {
                return enumC124164u4;
            }
        }
        for (EnumC124164u4 enumC124164u42 : enumC124164u4Arr) {
            if (enumC124164u42.LJLIL == i) {
                return enumC124164u42;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC124164u4.class, " with value ", i));
    }

    public static EnumC124164u4 valueOf(String str) {
        return (EnumC124164u4) V0N.LJJJ(EnumC124164u4.class, str);
    }

    EnumC124164u4(int i) {
        this.LJLIL = i;
    }
}
