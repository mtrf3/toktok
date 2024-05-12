package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM", f = "InboxTopHorizontalListVM.kt", l = {345}, m = "loadDmList")
/* renamed from: X.MYl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56995MYl extends C3CS {
    public InboxTopHorizontalListVM LJLIL;
    public Object LJLILLLLZI;
    public InboxTopHorizontalListVM LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ InboxTopHorizontalListVM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56995MYl(InboxTopHorizontalListVM inboxTopHorizontalListVM, InterfaceC67352kd<? super C56995MYl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = inboxTopHorizontalListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.nv0(this);
    }
}
