package X;

/* renamed from: X.FHl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38717FHl {
    UNKNOWN,
    EXP,
    PRECISE_EXP,
    CONFIG_CENTER,
    CUSTOM_LOADER;

    public static EnumC38717FHl fromTypeValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return UNKNOWN;
                    }
                    return CUSTOM_LOADER;
                }
                return CONFIG_CENTER;
            }
            return PRECISE_EXP;
        }
        return EXP;
    }

    public static EnumC38717FHl valueOf(String str) {
        return (EnumC38717FHl) V0N.LJJJ(EnumC38717FHl.class, str);
    }
}
