package X;

/* renamed from: X.4tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123974tl {
    PREVIEW_COMPILE(0),
    PREVIEW_ONLY(1),
    COMPILE_ONLY(2),
    SNAPSHOT(3);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123974tl swigToEnum(int i) {
        EnumC123974tl[] enumC123974tlArr = (EnumC123974tl[]) EnumC123974tl.class.getEnumConstants();
        if (i < enumC123974tlArr.length && i >= 0) {
            EnumC123974tl enumC123974tl = enumC123974tlArr[i];
            if (enumC123974tl.LJLIL == i) {
                return enumC123974tl;
            }
        }
        for (EnumC123974tl enumC123974tl2 : enumC123974tlArr) {
            if (enumC123974tl2.LJLIL == i) {
                return enumC123974tl2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123974tl.class, " with value ", i));
    }

    public static EnumC123974tl valueOf(String str) {
        return (EnumC123974tl) V0N.LJJJ(EnumC123974tl.class, str);
    }

    EnumC123974tl(int i) {
        this.LJLIL = i;
    }
}
