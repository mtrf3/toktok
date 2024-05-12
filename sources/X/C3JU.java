package X;

/* renamed from: X.3JU, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3JU {
    PRELOAD("PRELOAD"),
    LOAD_MORE("LOAD_MORE"),
    IN_PAGE("IN_PAGE"),
    REFRESH("REFRESH"),
    BATCH_SOURCE_DATA_UPDATE("BATCH_SOURCE_DATA_UPDATE"),
    SINGLE_SOURCE_DATA_UPDATE("SINGLE_SOURCE_DATA_UPDATE"),
    SESSION_UPDATE("SESSION_UPDATE"),
    DECORATE("DECORATE"),
    CONVERT("CONVERT"),
    POST_TO_INBOX("POST_TO_INBOX"),
    ONE_MORE_PAGE("ONE_MORE_PAGE"),
    UNREAD_COUNT("UNREAD_COUNT");

    public final String LJLIL;

    public static C3JU valueOf(String str) {
        return (C3JU) V0N.LJJJ(C3JU.class, str);
    }

    public final String getTag() {
        return this.LJLIL;
    }

    C3JU(String str) {
        this.LJLIL = str;
    }
}
