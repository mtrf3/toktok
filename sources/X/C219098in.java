package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel", f = "UserRecommendListViewModel.kt", l = {37}, m = "onLoadMore")
/* renamed from: X.8in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219098in extends C3CS {
    public UserRecommendListViewModel LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ UserRecommendListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219098in(UserRecommendListViewModel userRecommendListViewModel, InterfaceC67352kd<? super C219098in> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = userRecommendListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(0L, this);
    }
}
