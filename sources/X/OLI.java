package X;

/* loaded from: classes11.dex */
public enum OLI {
    UNKNOWN("unknown"),
    AD_SINGLE_BUBBLE("ad_single_bubble"),
    AD_MULTI_BUBBLE("ad_multi_bubble");

    public final String LJLIL;

    public static OLI valueOf(String str) {
        return (OLI) V0N.LJJJ(OLI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    OLI(String str) {
        this.LJLIL = str;
    }
}
