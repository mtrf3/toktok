package X;

/* loaded from: classes9.dex */
public enum KAJ {
    SHOP("shop"),
    STORE("store"),
    ECOM_LIVE("ecom_live");

    public static final KCQ Companion = new Object() { // from class: X.KCQ
    };
    public final String LJLIL;

    public static KAJ valueOf(String str) {
        return (KAJ) V0N.LJJJ(KAJ.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KAJ(String str) {
        this.LJLIL = str;
    }
}
