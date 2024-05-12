package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Lyd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56015Lyd implements X8Q {
    public final /* synthetic */ long LIZ;

    public C56015Lyd(long j) {
        this.LIZ = j;
    }

    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ec_preload preloadMallMainData onFail e: ");
        LIZ.append(exception);
        LIZ.append(' ');
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        int stage = K1T.PRELOAD_FAIL.getStage();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", message));
        c56045Lz7.getClass();
        C56045Lz7.LJIIJ(stage, currentTimeMillis, LJJIIZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        ShopMainResponse shopMainResponse;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ec_preload preloadMallMainData onSuccess() ,thread = ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        if (obj == null) {
            return;
        }
        if (obj instanceof C64797Pbt) {
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            ShopMainResponse shopMainResponse2 = (ShopMainResponse) ((Response) c64797Pbt.LIZIZ).data;
            if ((shopMainResponse2 != null && shopMainResponse2.getLynxData() != null) || ((shopMainResponse = (ShopMainResponse) ((Response) c64797Pbt.LIZIZ).data) != null && shopMainResponse.getPageData() != null)) {
                T t = ((Response) c64797Pbt.LIZIZ).data;
                if (t != 0) {
                    long j = this.LIZ;
                    C56023Lyl.LIZ.LIZJ("ec_shop_main_cache_data", C27739Aud.LJI(t));
                    C79057V0z.LJJJJJ(C56023Lyl.LIZIZ(), "ec_shop_main_cache_data_log_id", C36669EaH.LIZIZ(c64797Pbt));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ShopMainResponse preload ");
                    LIZ2.append(C36669EaH.LIZIZ(c64797Pbt));
                    C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
                    C56045Lz7.LJIIJJI(C56045Lz7.LIZ, K1T.PRELOAD_SUCCESS.getStage(), System.currentTimeMillis() - j, 8);
                    return;
                }
                return;
            }
        }
        PowerPreloadServiceImpl.LIZIZ().LIZ("api/v1/ttf_mall/homepage/get", null);
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        int stage = K1T.PRELOAD_FAIL.getStage();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", EnumC56120M0u.RESPONSE_UNAVAILABLE.getErrMsg()));
        c56045Lz7.getClass();
        C56045Lz7.LJIIJ(stage, currentTimeMillis, LJJIIZI);
    }
}
