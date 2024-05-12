package X;

/* renamed from: X.X0c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC84130X0c {
    COMPILE_TYPE_MP4,
    COMPILE_TYPE_GIF,
    COMPILE_TYPE_HIGH_GIF,
    COMPILE_TYPE_JPEG,
    COMPILE_TYPE_PNG,
    COMPILE_TYPE_AAC,
    COMPILE_TYPE_WAV,
    COMPILE_TYPE_WEBP;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC84130X0c swigToEnum(int i) {
        EnumC84130X0c[] enumC84130X0cArr = (EnumC84130X0c[]) EnumC84130X0c.class.getEnumConstants();
        if (i < enumC84130X0cArr.length && i >= 0) {
            EnumC84130X0c enumC84130X0c = enumC84130X0cArr[i];
            if (enumC84130X0c.LJLIL == i) {
                return enumC84130X0c;
            }
        }
        for (EnumC84130X0c enumC84130X0c2 : enumC84130X0cArr) {
            if (enumC84130X0c2.LJLIL == i) {
                return enumC84130X0c2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC84130X0c.class, " with value ", i));
    }

    public static EnumC84130X0c valueOf(String str) {
        return (EnumC84130X0c) V0N.LJJJ(EnumC84130X0c.class, str);
    }

    EnumC84130X0c() {
        int i = C84131X0d.LIZ;
        C84131X0d.LIZ = i + 1;
        this.LJLIL = i;
    }
}
