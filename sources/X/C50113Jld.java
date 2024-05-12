package X;

import Y.IDfS129S0100000_8;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment$onViewCreated$4$invokeSuspend$$inlined$collect$1", f = "TopProxyFragment.kt", l = {159}, m = "emit")
/* renamed from: X.Jld, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50113Jld extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS129S0100000_8 LJLJI;
    public IDfS129S0100000_8 LJLJJI;
    public Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50113Jld(IDfS129S0100000_8 iDfS129S0100000_8, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS129S0100000_8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
