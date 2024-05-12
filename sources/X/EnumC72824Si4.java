package X;

/* renamed from: X.Si4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC72824Si4 {
    INSTANT_WEAK(-2),
    UNKNOWN(-1),
    WEAK(0),
    MEDIUM(1),
    STRONG(2);

    public final int LJLIL;

    public static EnumC72824Si4 valueOf(String str) {
        return (EnumC72824Si4) V0N.LJJJ(EnumC72824Si4.class, str);
    }

    public final EnumC72824Si4 getIncreasedComplexity() {
        int i = C72825Si5.LIZ[ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    return STRONG;
                }
                throw new C162476Zf();
            }
            return MEDIUM;
        }
        return this;
    }

    public final EnumC71789SFl getPasswordComplexity() {
        int i = C72825Si5.LIZ[ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    return EnumC71789SFl.WEAK;
                }
                return EnumC71789SFl.MEDIUM;
            }
            return EnumC71789SFl.STRONG;
        }
        return EnumC71789SFl.UNKNOWN;
    }

    public final int getScore$account_awemeaccount_release() {
        return this.LJLIL;
    }

    EnumC72824Si4(int i) {
        this.LJLIL = i;
    }
}
