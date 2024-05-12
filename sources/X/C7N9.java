package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowDetailListViewModel", f = "NowDetailListViewModel.kt", l = {50, 52}, m = "onRefresh")
/* renamed from: X.7N9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7N9 extends C3CS {
    public NowDetailListViewModel LJLIL;
    public C84661XKn LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ NowDetailListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7N9(NowDetailListViewModel nowDetailListViewModel, InterfaceC67352kd<? super C7N9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = nowDetailListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onRefresh(this);
    }
}
