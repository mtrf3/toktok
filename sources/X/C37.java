package X;

/* loaded from: classes6.dex */
public enum C37 {
    UNKNOWN("unknown", false, false),
    PREVIEW("preview", false, true),
    BROADCAST("broadcast", false, true),
    MULTI_GUEST("multi_guest", true, false),
    MATCH("match", true, false),
    CO_HOST("co_host", true, false),
    ORDER("order", false, false);

    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public static C37 valueOf(String str) {
        return (C37) V0N.LJJJ(C37.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    public final boolean isBroadcast() {
        return this.LJLJI;
    }

    public final boolean isLink() {
        return this.LJLILLLLZI;
    }

    C37(String str, boolean z, boolean z2) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
