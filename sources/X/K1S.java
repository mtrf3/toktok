package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMainLynxDataPreload;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K1S implements X8Q {
    public final /* synthetic */ long LIZ;

    public K1S(long j) {
        this.LIZ = j;
    }

    @Override // X.X8Q
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C36746EbW.LIZ(3, "ShopTabV3 Preload PRELOAD_FAIL");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        int stage = K1Q.PRELOAD_FAIL.getStage();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", message));
        c56092Lzs.getClass();
        C56092Lzs.LJIILLIIL(1, stage, currentTimeMillis, LJJIIZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X8Q
    public final void onSuccess(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof C64797Pbt) {
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            if (((Response) c64797Pbt.LIZIZ).data != 0) {
                C36746EbW.LIZ(3, "ShopTabV3ForQA Preload Success v3");
                java.util.Map map = (java.util.Map) ((Response) c64797Pbt.LIZIZ).data;
                if (map != null) {
                    long j = this.LIZ;
                    C36746EbW.LIZ(3, "ShopTabV3 Preload PRELOAD_SUCCESS");
                    String LIZIZ = C36669EaH.LIZIZ(c64797Pbt);
                    C51751KSt.LIZ.LJ(LIZIZ, map);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ShopMainResponse preload ");
                    LIZ.append(LIZIZ);
                    C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
                    C56092Lzs.LJIIZILJ(C56092Lzs.LIZ, 1, K1Q.PRELOAD_SUCCESS.getStage(), System.currentTimeMillis() - j, 8);
                    C36746EbW.LIZ(3, "ShopTabV3 ImgPreload preload doImagePreload");
                    C51741KSj.LIZJ(map, ShopMainLynxDataPreload.isPrefetch);
                    return;
                }
                return;
            }
        }
        C36746EbW.LIZ(3, "ShopTabV3 Preload PRELOAD_FAIL");
        PowerPreloadServiceImpl.LIZIZ().LIZ("api/v1/mall/homepage/lynx/get", null);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        int stage = K1Q.PRELOAD_FAIL.getStage();
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", EnumC56121M0v.RESPONSE_UNAVAILABLE.getErrMsg()));
        c56092Lzs.getClass();
        C56092Lzs.LJIILLIIL(1, stage, currentTimeMillis, LJJIIZI);
    }
}
