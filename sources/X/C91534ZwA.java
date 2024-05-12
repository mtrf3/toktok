package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dsp.playpage.card.upsell.LandingPageVm", f = "LandingPageVm.kt", l = {54}, m = "fetchPageInfoInner")
/* renamed from: X.ZwA, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91534ZwA extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LandingPageVm LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91534ZwA(LandingPageVm landingPageVm, InterfaceC67352kd<? super C91534ZwA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = landingPageVm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.hv0(this);
    }
}
