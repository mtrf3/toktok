package X;

/* renamed from: X.6Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC159056Mb {
    EFFECT_ID,
    PANEL_RESOURCE_ID;

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC159056Mb swigToEnum(int i) {
        EnumC159056Mb[] enumC159056MbArr = (EnumC159056Mb[]) EnumC159056Mb.class.getEnumConstants();
        if (i < enumC159056MbArr.length && i >= 0) {
            EnumC159056Mb enumC159056Mb = enumC159056MbArr[i];
            if (enumC159056Mb.LJLIL == i) {
                return enumC159056Mb;
            }
        }
        for (EnumC159056Mb enumC159056Mb2 : enumC159056MbArr) {
            if (enumC159056Mb2.LJLIL == i) {
                return enumC159056Mb2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC159056Mb.class, " with value ", i));
    }

    public static EnumC159056Mb valueOf(String str) {
        return (EnumC159056Mb) V0N.LJJJ(EnumC159056Mb.class, str);
    }

    EnumC159056Mb() {
        int i = C159086Me.LIZ;
        C159086Me.LIZ = i + 1;
        this.LJLIL = i;
    }
}
