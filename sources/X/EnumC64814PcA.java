package X;

/* renamed from: X.PcA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64814PcA {
    CACHE_UNSET,
    CACHE_VALID,
    CACHE_STALE_BOTH,
    CACHE_STALE_NETCHANGED,
    CACHE_STALE_EXPIRED,
    PRELOAD_BATCH,
    REFRESH_BATCH;

    public static EnumC64814PcA valueOf(String str) {
        return (EnumC64814PcA) V0N.LJJJ(EnumC64814PcA.class, str);
    }
}
