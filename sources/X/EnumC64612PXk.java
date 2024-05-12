package X;

/* renamed from: X.PXk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64612PXk {
    NOT_SET(0),
    SERVE_FROM_CACHE(2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVE_FROM_PREFER_ADDR(5),
    SERVE_FROM_HTTP_DNS_JOB(6),
    SERVE_FROM_PROC_DNS_JOB(8),
    SERVE_FROM_HARDCODE_HOSTS(9),
    /* JADX INFO: Fake field, exist only in values array */
    SERVE_FROM_BATCH_PRELOAD(19),
    /* JADX INFO: Fake field, exist only in values array */
    SERVE_FROM_ASYNC_BATCH_PRELOAD(20);

    public final int LJLIL;

    public static EnumC64612PXk valueOf(String str) {
        return (EnumC64612PXk) V0N.LJJJ(EnumC64612PXk.class, str);
    }

    EnumC64612PXk(int i) {
        this.LJLIL = i;
    }
}
