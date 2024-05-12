package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.repo.SearchMusicApi;

/* renamed from: X.JzL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50963JzL {
    public static final /* synthetic */ C50963JzL LIZ = new C50963JzL();
    public static final SearchMusicApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = InterfaceC51052K1w.LIZ;
        LIZIZ = (SearchMusicApi) C770830u.LIZJ(str, "API_URL", LIZLLL, str).LIZ.LIZ(SearchMusicApi.class);
    }
}
