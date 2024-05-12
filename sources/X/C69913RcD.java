package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl", f = "RssRepo.kt", l = {57}, m = "fetchRssUser")
/* renamed from: X.RcD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69913RcD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C69910RcA LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69913RcD(C69910RcA c69910RcA, InterfaceC67352kd<? super C69913RcD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c69910RcA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}
