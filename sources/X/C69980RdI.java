package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel", f = "PdpViewModel.kt", l = {2144, 2146}, m = "openSecondPageForResult")
/* renamed from: X.RdI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69980RdI<R> extends C3CS {
    public PdpViewModel LJLIL;
    public Object LJLILLLLZI;
    public C34K LJLJI;
    public boolean LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ PdpViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69980RdI(PdpViewModel pdpViewModel, InterfaceC67352kd<? super C69980RdI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = pdpViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.Nw0(this, null, false);
    }
}
