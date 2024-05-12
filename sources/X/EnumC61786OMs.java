package X;

/* renamed from: X.OMs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC61786OMs {
    Half(0),
    Full(1);

    public final int LJLIL;

    public static EnumC61786OMs fromStep(int i) {
        for (EnumC61786OMs enumC61786OMs : values()) {
            if (enumC61786OMs.LJLIL == i) {
                return enumC61786OMs;
            }
        }
        throw new IllegalArgumentException();
    }

    public static EnumC61786OMs valueOf(String str) {
        return (EnumC61786OMs) V0N.LJJJ(EnumC61786OMs.class, str);
    }

    EnumC61786OMs(int i) {
        this.LJLIL = i;
    }
}
