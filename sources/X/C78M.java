package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListViewModel", f = "RepostListViewModel.kt", l = {42}, m = "fetchRepostList")
/* renamed from: X.78M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78M extends C3CS {
    public RepostListViewModel LJLIL;
    public Object LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ RepostListViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78M(RepostListViewModel repostListViewModel, InterfaceC67352kd<? super C78M> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = repostListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.gv0(0, 0L, null, 0, this);
    }
}
