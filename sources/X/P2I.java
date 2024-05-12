package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.perf.FindFriendsBehaviorMonitor", f = "FindFriendsBehaviorMonitor.kt", l = {148, 148}, m = "invokeFacebookAPI")
/* loaded from: classes11.dex */
public final class P2I<T> extends C3CS {
    public InterfaceC88472Yns LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ P29 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2I(P29 p29, InterfaceC67352kd<? super P2I> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = p29;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(null, this);
    }
}
