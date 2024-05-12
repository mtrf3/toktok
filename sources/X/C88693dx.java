package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel", f = "LandscapeFeedViewModel.kt", l = {67, 68}, m = "onLoadMore")
/* renamed from: X.3dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88693dx extends C3CS {
    public LandscapeFeedViewModel LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ LandscapeFeedViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88693dx(LandscapeFeedViewModel landscapeFeedViewModel, InterfaceC67352kd<? super C88693dx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = landscapeFeedViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(0L, this);
    }
}
