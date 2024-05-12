package X;

/* renamed from: X.OoT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63029OoT {
    LOGOUT(0),
    INTERNAL_WEB(1),
    EXTERNAL_WEB(2),
    NATIVE(3),
    INTERNAL_APPEAL_WEB(4),
    EXTERNAL_APPEAL_WEB(5);

    public final int LJLIL;

    public static EnumC63029OoT valueOf(String str) {
        return (EnumC63029OoT) V0N.LJJJ(EnumC63029OoT.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC63029OoT(int i) {
        this.LJLIL = i;
    }
}
