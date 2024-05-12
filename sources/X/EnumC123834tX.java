package X;

/* renamed from: X.4tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123834tX {
    NORMAL(0),
    AMAZING(1);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123834tX swigToEnum(int i) {
        EnumC123834tX[] enumC123834tXArr = (EnumC123834tX[]) EnumC123834tX.class.getEnumConstants();
        if (i < enumC123834tXArr.length && i >= 0) {
            EnumC123834tX enumC123834tX = enumC123834tXArr[i];
            if (enumC123834tX.LJLIL == i) {
                return enumC123834tX;
            }
        }
        for (EnumC123834tX enumC123834tX2 : enumC123834tXArr) {
            if (enumC123834tX2.LJLIL == i) {
                return enumC123834tX2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123834tX.class, " with value ", i));
    }

    public static EnumC123834tX valueOf(String str) {
        return (EnumC123834tX) V0N.LJJJ(EnumC123834tX.class, str);
    }

    EnumC123834tX(int i) {
        this.LJLIL = i;
    }
}
