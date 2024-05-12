package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;

/* renamed from: X.Jbk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49500Jbk {
    public static final SearchPreloadLayoutOptConfig LIZ = new SearchPreloadLayoutOptConfig(false, false, false, false, 15, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49501Jbl.LJLIL);

    public static boolean LIZ() {
        if (((SearchPreloadLayoutOptConfig) LIZIZ.getValue()).enablePreload && C46442IKo.LIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (((SearchPreloadLayoutOptConfig) LIZIZ.getValue()).enableViewStubPreload && C46442IKo.LIZ()) {
            return true;
        }
        return false;
    }
}
