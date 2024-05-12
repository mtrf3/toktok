package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.CouponApi$Companion", f = "CouponApi.kt", l = {26}, m = "stopPreTask")
/* loaded from: classes7.dex */
public final class EK5 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EK4 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EK5(EK4 ek4, InterfaceC67352kd<? super EK5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = ek4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
