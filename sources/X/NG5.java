package X;

/* loaded from: classes11.dex */
public enum NG5 implements InterfaceC58699N1z<String> {
    EMPTY("empty"),
    TOP_CARD("top_card"),
    BOTTOM_CARD("bottom_card"),
    DESCRIPTIVE_CARD("descriptive_card");

    public final String LJLIL;

    public static NG5 valueOf(String str) {
        return (NG5) V0N.LJJJ(NG5.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    NG5(String str) {
        this.LJLIL = str;
    }
}
