package X;

/* loaded from: classes9.dex */
public enum KB6 {
    SOURCE_MALL("mall"),
    SOURCE_PDP("product_detail"),
    SOURCE_ANCHOR("anchor_product"),
    SOURCE_MALL_MIDDLE("mall_middle_page");

    public final String LJLIL;

    public static KB6 valueOf(String str) {
        return (KB6) V0N.LJJJ(KB6.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KB6(String str) {
        this.LJLIL = str;
    }
}
