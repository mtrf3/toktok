package X;

/* renamed from: X.N2o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC58714N2o implements InterfaceC58699N1z<Integer> {
    UNUSABLE(0),
    USABLE_ORIGINAL_SOUND(1),
    USABLE_COMMERCIAL_SOUND(2);

    public final int LJLIL;

    public static EnumC58714N2o valueOf(String str) {
        return (EnumC58714N2o) V0N.LJJJ(EnumC58714N2o.class, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC58699N1z
    public Integer getParamValue() {
        return Integer.valueOf(this.LJLIL);
    }

    EnumC58714N2o(int i) {
        this.LJLIL = i;
    }
}
