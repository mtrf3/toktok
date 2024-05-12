package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.favorites.business.FavoriteTabCountApi;

/* renamed from: X.8Z3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z3 {
    public static final /* synthetic */ C8Z3 LIZ = new C8Z3();

    public static FavoriteTabCountApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        return (FavoriteTabCountApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, FavoriteTabCountApi.class);
    }
}
