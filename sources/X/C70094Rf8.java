package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi$Companion", f = "PdpApi.kt", l = {207}, m = "getBundleDealData")
/* renamed from: X.Rf8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70094Rf8 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C70091Rf5 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70094Rf8(C70091Rf5 c70091Rf5, InterfaceC67352kd<? super C70094Rf8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c70091Rf5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, this);
    }
}