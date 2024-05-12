package X;

/* renamed from: X.YNg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC87280YNg {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC87280YNg swigToEnum(int i) {
        EnumC87280YNg[] enumC87280YNgArr = (EnumC87280YNg[]) EnumC87280YNg.class.getEnumConstants();
        if (i < enumC87280YNgArr.length && i >= 0) {
            EnumC87280YNg enumC87280YNg = enumC87280YNgArr[i];
            if (enumC87280YNg.LJLIL == i) {
                return enumC87280YNg;
            }
        }
        for (EnumC87280YNg enumC87280YNg2 : enumC87280YNgArr) {
            if (enumC87280YNg2.LJLIL == i) {
                return enumC87280YNg2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC87280YNg.class, " with value ", i));
    }

    public static EnumC87280YNg valueOf(String str) {
        return (EnumC87280YNg) V0N.LJJJ(EnumC87280YNg.class, str);
    }

    EnumC87280YNg() {
        int i = C87288YNo.LIZ;
        C87288YNo.LIZ = i + 1;
        this.LJLIL = i;
    }
}
