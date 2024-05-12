package X;

/* loaded from: classes10.dex */
public enum LMF {
    DM_NOTICE("dm_notice"),
    SPECIAL("special_event"),
    SCAN("scan"),
    LIVE("live"),
    SEARCH("search"),
    SHOP("shop"),
    INBOX("NOTIFICATION"),
    MY_PROFILE("USER");

    public final String LJLIL;

    public static LMF valueOf(String str) {
        return (LMF) V0N.LJJJ(LMF.class, str);
    }

    public final String getTag() {
        return this.LJLIL;
    }

    LMF(String str) {
        this.LJLIL = str;
    }
}
