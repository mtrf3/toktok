package X;

/* loaded from: classes11.dex */
public enum NGB implements InterfaceC58699N1z<String> {
    TOP_BOTTOM_CARD("top_bottom_card"),
    TOP_CARD("top_card");

    public final String LJLIL;

    public static NGB valueOf(String str) {
        return (NGB) V0N.LJJJ(NGB.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    NGB(String str) {
        this.LJLIL = str;
    }
}
