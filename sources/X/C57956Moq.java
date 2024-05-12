package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel", f = "UserCardListViewModel.kt", l = {341}, m = "onRefresh$suspendImpl")
/* renamed from: X.Moq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57956Moq extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ UserCardListViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57956Moq(UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57956Moq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = userCardListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return UserCardListViewModel.mv0(this.LJLILLLLZI, this);
    }
}
