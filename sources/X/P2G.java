package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.perf.FFPLoadBehavior", f = "FFPLoadBehavior.kt", l = {105}, m = "measureCost")
/* loaded from: classes11.dex */
public final class P2G<T> extends C3CS {
    public long LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ P2A LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2G(P2A p2a, InterfaceC67352kd<? super P2G> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = p2a;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(null, this);
    }
}
