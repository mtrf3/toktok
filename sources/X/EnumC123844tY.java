package X;

/* renamed from: X.4tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123844tY {
    RES_720P(0),
    RES_1080P(1),
    RES_CUSTOM(2);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123844tY swigToEnum(int i) {
        EnumC123844tY[] enumC123844tYArr = (EnumC123844tY[]) EnumC123844tY.class.getEnumConstants();
        if (i < enumC123844tYArr.length && i >= 0) {
            EnumC123844tY enumC123844tY = enumC123844tYArr[i];
            if (enumC123844tY.LJLIL == i) {
                return enumC123844tY;
            }
        }
        for (EnumC123844tY enumC123844tY2 : enumC123844tYArr) {
            if (enumC123844tY2.LJLIL == i) {
                return enumC123844tY2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123844tY.class, " with value ", i));
    }

    public static EnumC123844tY valueOf(String str) {
        return (EnumC123844tY) V0N.LJJJ(EnumC123844tY.class, str);
    }

    EnumC123844tY(int i) {
        this.LJLIL = i;
    }
}
