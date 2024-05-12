package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM", f = "FriendListVM.kt", l = {104, 104}, m = "whenLoadMore")
/* loaded from: classes16.dex */
public final class XMT extends C3CS {
    public FriendListVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FriendListVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XMT(FriendListVM friendListVM, InterfaceC67352kd<? super XMT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = friendListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.whenLoadMore(null, this);
    }
}
