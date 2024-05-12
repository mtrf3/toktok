package X;

/* renamed from: X.MId, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56571MId implements InterfaceC58699N1z<Integer> {
    DEFAULT(0),
    TOPVIEW_JSON_SPILT(1),
    PARTIAL_LOAD(2);

    public final int LJLIL;

    public static EnumC56571MId valueOf(String str) {
        return (EnumC56571MId) V0N.LJJJ(EnumC56571MId.class, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC58699N1z
    public Integer getParamValue() {
        return Integer.valueOf(this.LJLIL);
    }

    EnumC56571MId(int i) {
        this.LJLIL = i;
    }
}
