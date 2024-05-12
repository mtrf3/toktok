package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel", f = "WatchHistoryListViewModel.kt", l = {121}, m = "fetchList")
/* renamed from: X.7Zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188137Zx extends C3CS {
    public WatchHistoryListViewModel LJLIL;
    public C60482Yy LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ WatchHistoryListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C188137Zx(WatchHistoryListViewModel watchHistoryListViewModel, InterfaceC67352kd<? super C188137Zx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = watchHistoryListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.jv0(null, this);
    }
}
