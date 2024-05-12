package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.api.WishListBulletApi;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager.WishListManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Ny1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61073Ny1<T> implements C4G1<T> {
    @Override // X.C4G1
    public final T get() {
        WishListBulletApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        WishListBulletApi wishListBulletApi = (WishListBulletApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(WishListBulletApi.class);
        C78555UsJ.LJII(wishListBulletApi);
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        o.LJIIIIZZ(LJJI, "get().getService<IAdLand…eloadService::class.java)");
        return (T) new WishListManager(wishListBulletApi, LJJI);
    }
}
