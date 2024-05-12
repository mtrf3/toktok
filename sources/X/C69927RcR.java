package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.api.BuyTogetherApi$Companion", f = "BuyTogetherApi.kt", l = {39}, m = "getBundlePrice")
/* renamed from: X.RcR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69927RcR extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C69928RcS LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69927RcR(C69928RcS c69928RcS, InterfaceC67352kd<? super C69927RcR> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c69928RcS;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
