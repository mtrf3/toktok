package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl", f = "RssRepo.kt", l = {63}, m = "updateRss")
/* renamed from: X.RcC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69912RcC extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C69910RcA LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69912RcC(C69910RcA c69910RcA, InterfaceC67352kd<? super C69912RcC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c69910RcA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.updateRss(null, this);
    }
}
