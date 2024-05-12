package X;

/* renamed from: X.Qbo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67340Qbo implements InterfaceC67342Qbq {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    public final int LJLIL;

    @Override // X.InterfaceC67342Qbq
    public int getAlgoValue() {
        return this.LJLIL;
    }

    public static EnumC67340Qbo valueOf(String str) {
        return (EnumC67340Qbo) V0N.LJJJ(EnumC67340Qbo.class, str);
    }

    EnumC67340Qbo(int i) {
        this.LJLIL = i;
    }
}
