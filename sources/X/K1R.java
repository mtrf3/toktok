package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMainLynxDataPreload;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K1R implements X8Q {
    public final /* synthetic */ long LIZ;

    public K1R(long j) {
        this.LIZ = j;
    }

    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C36746EbW.LIZ(3, "ShopTabV3 Prefetch PRELOAD_FAIL");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        int stage = K1Q.PRELOAD_FAIL.getStage();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", message));
        c56092Lzs.getClass();
        C56092Lzs.LJIILLIIL(0, stage, currentTimeMillis, LJJIIZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof C64797Pbt) {
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            T t = ((Response) c64797Pbt.LIZIZ).data;
            if (t != 0) {
                java.util.Map map = (java.util.Map) t;
                if (map != null) {
                    long j = this.LIZ;
                    C36746EbW.LIZ(3, "ShopTabV3 Prefetch PRELOAD");
                    C51751KSt.LIZ.LJ(C36669EaH.LIZIZ(c64797Pbt), map);
                    C56092Lzs.LJIIZILJ(C56092Lzs.LIZ, 0, K1Q.PRELOAD_SUCCESS.getStage(), System.currentTimeMillis() - j, 8);
                    C51741KSj.LIZJ(map, ShopMainLynxDataPreload.isPrefetch);
                    return;
                }
                return;
            }
        }
        C36746EbW.LIZ(3, "ShopTabV3 Prefetch PRELOAD_FAIL");
        PowerPreloadServiceImpl.LIZIZ().LIZ("api/v1/mall/homepage/lynx/get", null);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        int stage = K1Q.PRELOAD_FAIL.getStage();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", EnumC56121M0v.RESPONSE_UNAVAILABLE.getErrMsg()));
        c56092Lzs.getClass();
        C56092Lzs.LJIILLIIL(0, stage, currentTimeMillis, LJJIIZI);
    }
}
