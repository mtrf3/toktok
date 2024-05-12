package X;

/* loaded from: classes13.dex */
public enum TBB {
    CLA_REALTIME_STATUS_REQUESTED("CLA_REALTIME_STATUS_REQUESTED", "requested"),
    CLA_REALTIME_STATUS_LEAVE("CLA_REALTIME_STATUS_LEAVE", "leave"),
    CLA_REALTIME_STATUS_FAILED("CLA_REALTIME_STATUS_FAILED", "failure"),
    CLA_REALTIME_STATUS_SUCCESS("CLA_REALTIME_STATUS_SUCCESS", "success"),
    CLA_REALTIME_STATUS_SHOWN_CAPTION("CLA_REALTIME_STATUS_SHOWN_CAPTION", "success");

    public final String LJLIL;
    public final int LJLILLLLZI;

    public static TBB valueOf(String str) {
        return (TBB) V0N.LJJJ(TBB.class, str);
    }

    public final int getRank() {
        return this.LJLILLLLZI;
    }

    public final String getStatusName() {
        return this.LJLIL;
    }

    TBB(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
