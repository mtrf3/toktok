package X;

/* renamed from: X.MIe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56572MIe implements InterfaceC58699N1z<Integer> {
    BEFORE(1),
    AFTER(0);

    public final int LJLIL;

    public static EnumC56572MIe valueOf(String str) {
        return (EnumC56572MIe) V0N.LJJJ(EnumC56572MIe.class, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC58699N1z
    public Integer getParamValue() {
        return Integer.valueOf(this.LJLIL);
    }

    EnumC56572MIe(int i) {
        this.LJLIL = i;
    }
}
