package X;

/* renamed from: X.2bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC61762bc {
    NO_CACHE("no_cache"),
    USE_COMMON_CACHE("use_common_cache"),
    BEFORE_SEARCH_NO_CACHE("before_search_no_cache"),
    BEFORE_SEARCH_USE_UNIQUE_CACHE("before_search_use_unique_cache");

    public final String LJLIL;

    public static EnumC61762bc valueOf(String str) {
        return (EnumC61762bc) V0N.LJJJ(EnumC61762bc.class, str);
    }

    public final String getCacheStrategy() {
        return this.LJLIL;
    }

    EnumC61762bc(String str) {
        this.LJLIL = str;
    }
}
