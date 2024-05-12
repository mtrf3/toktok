package X;

/* renamed from: X.9mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC246809mO {
    PASS(0),
    PRIVACY_SETTING(1),
    BLOCK_RELATION(2),
    BLOCK_SELF_REMOVAL(3);

    public final int LJLIL;

    public static EnumC246809mO valueOf(String str) {
        return (EnumC246809mO) V0N.LJJJ(EnumC246809mO.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC246809mO(int i) {
        this.LJLIL = i;
    }
}
