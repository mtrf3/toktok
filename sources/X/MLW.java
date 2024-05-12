package X;

/* loaded from: classes10.dex */
public enum MLW {
    PRELOAD_INJECT_CACHE,
    PRELOAD_REFRESH_EXCEPT_REC,
    PRELOAD_REFRESH_CLICK,
    PRELOAD_FORM_CACHE_AND_REFRESH,
    FIRST_REFRESH,
    REFRESH,
    LOAD_MORE,
    EXPAND,
    REFRESH_LIVE,
    REFRESH_FOLLOW_REQ,
    REFRESH_FILTER,
    REFRESH_MANUALLY;

    public static MLW valueOf(String str) {
        return (MLW) V0N.LJJJ(MLW.class, str);
    }
}
