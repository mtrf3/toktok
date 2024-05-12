package X;

/* renamed from: X.Vy8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81464Vy8 {
    SUGGEST_TAB,
    FAVORITE_TAB,
    COMMENTSTAB;

    public static EnumC81464Vy8 valueOf(String str) {
        return (EnumC81464Vy8) V0N.LJJJ(EnumC81464Vy8.class, str);
    }

    public final String getTabName() {
        int i = C81469VyD.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "Comments";
                }
                throw new C162476Zf();
            }
            return "favorite";
        }
        return "recommend";
    }
}
