package X;

/* renamed from: X.4uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC124224uA {
    RES_FILL_MODE_NONE(0),
    RES_FILL_MODE_ASPECT_FILL(1),
    RES_FILL_MODE_ASPECT_WIDTH(2),
    RES_FILL_MODE_ASPECT_FIT(3),
    RES_FILL_MODE_FREE_MODE(4),
    RES_FILL_MODE_CENTER_ZOOM(5),
    RES_FILL_MODE_FREE_MODE_ROT(6),
    RES_FILL_MODE_CENTER_ZOOM_AND_ASPECT_WIDTH(7);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC124224uA swigToEnum(int i) {
        EnumC124224uA[] enumC124224uAArr = (EnumC124224uA[]) EnumC124224uA.class.getEnumConstants();
        if (i < enumC124224uAArr.length && i >= 0) {
            EnumC124224uA enumC124224uA = enumC124224uAArr[i];
            if (enumC124224uA.LJLIL == i) {
                return enumC124224uA;
            }
        }
        for (EnumC124224uA enumC124224uA2 : enumC124224uAArr) {
            if (enumC124224uA2.LJLIL == i) {
                return enumC124224uA2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC124224uA.class, " with value ", i));
    }

    public static EnumC124224uA valueOf(String str) {
        return (EnumC124224uA) V0N.LJJJ(EnumC124224uA.class, str);
    }

    EnumC124224uA(int i) {
        this.LJLIL = i;
    }
}
