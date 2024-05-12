package X;

import com.ss.android.ugc.aweme.search.service.ecom.ab.SearchClassReflectPreloadConfig;

/* loaded from: classes7.dex */
public final class FPL {
    public static final FPL LIZ = new FPL();
    public static final SearchClassReflectPreloadConfig LIZIZ;
    public static final SearchClassReflectPreloadConfig LIZJ;

    static {
        SearchClassReflectPreloadConfig searchClassReflectPreloadConfig;
        SearchClassReflectPreloadConfig searchClassReflectPreloadConfig2 = new SearchClassReflectPreloadConfig(0L, null, 3, null);
        LIZIZ = searchClassReflectPreloadConfig2;
        try {
            FFL.LJIIIZ().getClass();
            searchClassReflectPreloadConfig = (SearchClassReflectPreloadConfig) FFL.LJIJ(true, "search_reflect_class_preload_opt", 31744, SearchClassReflectPreloadConfig.class, searchClassReflectPreloadConfig2);
        } catch (Exception unused) {
            searchClassReflectPreloadConfig = LIZIZ;
        }
        LIZJ = searchClassReflectPreloadConfig;
    }
}
