package X;

/* renamed from: X.MIa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56568MIa implements InterfaceC58699N1z<Integer> {
    REQUEST(0),
    TIMEOUT(1),
    NONETWORK(2),
    FITSPLASH(3),
    REQUEST_START(4);

    public final int LJLIL;

    public static EnumC56568MIa valueOf(String str) {
        return (EnumC56568MIa) V0N.LJJJ(EnumC56568MIa.class, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC58699N1z
    public Integer getParamValue() {
        return Integer.valueOf(this.LJLIL);
    }

    EnumC56568MIa(int i) {
        this.LJLIL = i;
    }
}
