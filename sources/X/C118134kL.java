package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.api.TrendingBillboardApi;

/* renamed from: X.4kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118134kL {
    public static final /* synthetic */ C118134kL LIZ = new C118134kL();
    public static final TrendingBillboardApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (TrendingBillboardApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(TrendingBillboardApi.class);
    }
}
