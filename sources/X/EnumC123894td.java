package X;

/* renamed from: X.4td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123894td {
    COLOR(0),
    IMAGE(1),
    VIDEO_FRAME(2),
    GRADIENT_COLOR(3);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123894td swigToEnum(int i) {
        EnumC123894td[] enumC123894tdArr = (EnumC123894td[]) EnumC123894td.class.getEnumConstants();
        if (i < enumC123894tdArr.length && i >= 0) {
            EnumC123894td enumC123894td = enumC123894tdArr[i];
            if (enumC123894td.LJLIL == i) {
                return enumC123894td;
            }
        }
        for (EnumC123894td enumC123894td2 : enumC123894tdArr) {
            if (enumC123894td2.LJLIL == i) {
                return enumC123894td2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123894td.class, " with value ", i));
    }

    public static EnumC123894td valueOf(String str) {
        return (EnumC123894td) V0N.LJJJ(EnumC123894td.class, str);
    }

    EnumC123894td(int i) {
        this.LJLIL = i;
    }
}
