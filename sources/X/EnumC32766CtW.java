package X;

/* renamed from: X.CtW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC32766CtW {
    DEFAULT("default"),
    PRICE_DESCEND("high_to_low"),
    PRICE_ASCEND("low_to_high");

    public final String LJLIL;

    public static EnumC32766CtW valueOf(String str) {
        return (EnumC32766CtW) V0N.LJJJ(EnumC32766CtW.class, str);
    }

    public final EnumC32766CtW nextState() {
        int i = C32769CtZ.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return DEFAULT;
                }
                throw new C162476Zf();
            }
            return PRICE_ASCEND;
        }
        return PRICE_DESCEND;
    }

    public final String getDescription() {
        return this.LJLIL;
    }

    EnumC32766CtW(String str) {
        this.LJLIL = str;
    }
}
