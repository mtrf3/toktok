package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryApi;

/* renamed from: X.7Zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188117Zv {
    public static final /* synthetic */ C188117Zv LIZ = new C188117Zv();
    public static final WatchHistoryApi LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (WatchHistoryApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(WatchHistoryApi.class);
        LIZJ = C221108m2.LIZIZ(C188127Zw.LJLIL);
    }
}
