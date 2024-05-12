package X;

/* renamed from: X.4ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC124044ts {
    FACE(0),
    SCENEV1(1),
    SCENEV3(2),
    NH(3),
    RELEATION(4),
    CLASSIFICATION(5);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC124044ts swigToEnum(int i) {
        EnumC124044ts[] enumC124044tsArr = (EnumC124044ts[]) EnumC124044ts.class.getEnumConstants();
        if (i < enumC124044tsArr.length && i >= 0) {
            EnumC124044ts enumC124044ts = enumC124044tsArr[i];
            if (enumC124044ts.LJLIL == i) {
                return enumC124044ts;
            }
        }
        for (EnumC124044ts enumC124044ts2 : enumC124044tsArr) {
            if (enumC124044ts2.LJLIL == i) {
                return enumC124044ts2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC124044ts.class, " with value ", i));
    }

    public static EnumC124044ts valueOf(String str) {
        return (EnumC124044ts) V0N.LJJJ(EnumC124044ts.class, str);
    }

    EnumC124044ts(int i) {
        this.LJLIL = i;
    }
}
