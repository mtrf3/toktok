package X;

/* renamed from: X.YNh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC87281YNh {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC87281YNh swigToEnum(int i) {
        EnumC87281YNh[] enumC87281YNhArr = (EnumC87281YNh[]) EnumC87281YNh.class.getEnumConstants();
        if (i < enumC87281YNhArr.length && i >= 0) {
            EnumC87281YNh enumC87281YNh = enumC87281YNhArr[i];
            if (enumC87281YNh.LJLIL == i) {
                return enumC87281YNh;
            }
        }
        for (EnumC87281YNh enumC87281YNh2 : enumC87281YNhArr) {
            if (enumC87281YNh2.LJLIL == i) {
                return enumC87281YNh2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC87281YNh.class, " with value ", i));
    }

    public static EnumC87281YNh valueOf(String str) {
        return (EnumC87281YNh) V0N.LJJJ(EnumC87281YNh.class, str);
    }

    EnumC87281YNh() {
        int i = C87289YNp.LIZ;
        C87289YNp.LIZ = i + 1;
        this.LJLIL = i;
    }
}
