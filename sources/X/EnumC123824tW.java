package X;

/* renamed from: X.4tW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123824tW {
    TYPE_IMAGE(0),
    TYPE_VIDEO(1),
    TYPE_JSON(2);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123824tW swigToEnum(int i) {
        EnumC123824tW[] enumC123824tWArr = (EnumC123824tW[]) EnumC123824tW.class.getEnumConstants();
        if (i < enumC123824tWArr.length && i >= 0) {
            EnumC123824tW enumC123824tW = enumC123824tWArr[i];
            if (enumC123824tW.LJLIL == i) {
                return enumC123824tW;
            }
        }
        for (EnumC123824tW enumC123824tW2 : enumC123824tWArr) {
            if (enumC123824tW2.LJLIL == i) {
                return enumC123824tW2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123824tW.class, " with value ", i));
    }

    public static EnumC123824tW valueOf(String str) {
        return (EnumC123824tW) V0N.LJJJ(EnumC123824tW.class, str);
    }

    EnumC123824tW(int i) {
        this.LJLIL = i;
    }
}
