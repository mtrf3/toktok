package X;

/* renamed from: X.Qbp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67341Qbp implements InterfaceC67342Qbq {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ES384(-35),
    ES512(-36);

    public final int LJLIL;

    @Override // X.InterfaceC67342Qbq
    public int getAlgoValue() {
        return this.LJLIL;
    }

    public static EnumC67341Qbp valueOf(String str) {
        return (EnumC67341Qbp) V0N.LJJJ(EnumC67341Qbp.class, str);
    }

    EnumC67341Qbp(int i) {
        this.LJLIL = i;
    }
}
