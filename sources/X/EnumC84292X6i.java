package X;

/* renamed from: X.X6i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC84292X6i {
    ENCODE_BITRATE_ABR,
    ENCODE_BITRATE_CRF,
    ENCODE_BITRATE_QP,
    ENCODE_BITRATE_VBR;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC84292X6i swigToEnum(int i) {
        EnumC84292X6i[] enumC84292X6iArr = (EnumC84292X6i[]) EnumC84292X6i.class.getEnumConstants();
        if (i < enumC84292X6iArr.length && i >= 0) {
            EnumC84292X6i enumC84292X6i = enumC84292X6iArr[i];
            if (enumC84292X6i.LJLIL == i) {
                return enumC84292X6i;
            }
        }
        for (EnumC84292X6i enumC84292X6i2 : enumC84292X6iArr) {
            if (enumC84292X6i2.LJLIL == i) {
                return enumC84292X6i2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC84292X6i.class, " with value ", i));
    }

    public static EnumC84292X6i valueOf(String str) {
        return (EnumC84292X6i) V0N.LJJJ(EnumC84292X6i.class, str);
    }

    EnumC84292X6i() {
        int i = C84293X6j.LIZ;
        C84293X6j.LIZ = i + 1;
        this.LJLIL = i;
    }
}
