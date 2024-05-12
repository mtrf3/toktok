package X;

/* renamed from: X.MIc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56570MIc implements InterfaceC58699N1z<Integer> {
    REQUEST_START(0),
    REQUEST(1);

    public final int LJLIL;

    public static EnumC56570MIc valueOf(String str) {
        return (EnumC56570MIc) V0N.LJJJ(EnumC56570MIc.class, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC58699N1z
    public Integer getParamValue() {
        return Integer.valueOf(this.LJLIL);
    }

    EnumC56570MIc(int i) {
        this.LJLIL = i;
    }
}
