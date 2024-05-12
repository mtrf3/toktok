package X;

/* renamed from: X.Y0n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86689Y0n {
    HIDDEN,
    COLLAPSED,
    EXPANDED;

    public static EnumC86689Y0n valueOf(String str) {
        return (EnumC86689Y0n) V0N.LJJJ(EnumC86689Y0n.class, str);
    }

    public final String getCaptionShowType() {
        int i = Y15.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "captions";
                }
                throw new C162476Zf();
            }
            return "icon";
        }
        return "hidden";
    }
}
