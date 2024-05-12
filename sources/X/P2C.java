package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM", f = "FindFriendsPageVM.kt", l = {278}, m = "awaitContactUploadResult")
/* loaded from: classes11.dex */
public final class P2C extends C3CS {
    public FindFriendsPageVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ FindFriendsPageVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2C(FindFriendsPageVM findFriendsPageVM, InterfaceC67352kd<? super P2C> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = findFriendsPageVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, null, this);
    }
}
