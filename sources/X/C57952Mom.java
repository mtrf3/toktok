package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel", f = "UserCardListViewModel.kt", l = {347}, m = "onLoadMore$suspendImpl")
/* renamed from: X.Mom, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57952Mom extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ UserCardListViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57952Mom(UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57952Mom> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = userCardListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return UserCardListViewModel.lv0(this.LJLILLLLZI, null, this);
    }
}
