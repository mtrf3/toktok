package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask", f = "ECColdStartFetchTask.kt", l = {87}, m = "preloadShopMainData")
/* loaded from: classes9.dex */
public final class KJX extends C3CS {
    public ECColdStartFetchTask LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ECColdStartFetchTask LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KJX(ECColdStartFetchTask eCColdStartFetchTask, InterfaceC67352kd<? super KJX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = eCColdStartFetchTask;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(0, this);
    }
}
