package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentMethodHelper", f = "PaymentMethodHelper.kt", l = {141, 155}, m = "fetchBillingAddressDetail")
/* loaded from: classes13.dex */
public final class SAO extends C3CS {
    public SAN LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ SAN LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAO(SAN san, InterfaceC67352kd<? super SAO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = san;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, null, this);
    }
}
