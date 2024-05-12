package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel", f = "UserRecommendListViewModel.kt", l = {55}, m = "onRefresh")
/* renamed from: X.8im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219088im extends C3CS {
    public UserRecommendListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UserRecommendListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219088im(UserRecommendListViewModel userRecommendListViewModel, InterfaceC67352kd<? super C219088im> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = userRecommendListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
