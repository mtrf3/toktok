package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMainLynxDataPreload;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K1P implements InterfaceC84349X8n {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    @Override // X.InterfaceC84349X8n
    public final void LIZ(X8W trigger) {
        o.LJIIIZ(trigger, "trigger");
        C36746EbW.LIZ(3, "ShopTabV3 Prefetch PRELOAD");
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("mall_request_type", Integer.valueOf(EnumC51775KTr.PREFETCH.getType())), new OSZ("mall_request_scene", "ttmall_homepage"));
        if (!C48189Ivh.LJFF(FKM.LIZ())) {
            C36746EbW.LIZ(3, "ShopTabV3 Prefetch PRELOAD_FAIL");
            C56092Lzs c56092Lzs = C56092Lzs.LIZ;
            int stage = K1Q.PRELOAD_FAIL.getStage();
            long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
            java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", EnumC56121M0v.NETWORK_UNAVAILABLE.getErrMsg()));
            c56092Lzs.getClass();
            C56092Lzs.LJIILLIIL(0, stage, currentTimeMillis, LJJIIZI);
            C56092Lzs.LJIILL(LJJL, false);
            return;
        }
        C56092Lzs.LJIIZILJ(C56092Lzs.LIZ, 0, K1Q.PRELOAD.getStage(), System.currentTimeMillis() - this.LIZ, 8);
        C56092Lzs.LJIILL(LJJL, true);
        trigger.LIZIZ(this.LIZIZ, ShopMainLynxDataPreload.class, new K1R(this.LIZ));
    }

    public K1P(long j, Bundle bundle) {
        this.LIZ = j;
        this.LIZIZ = bundle;
    }
}
