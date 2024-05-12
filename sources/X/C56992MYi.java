package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM", f = "InboxTopHorizontalListVM.kt", l = {307}, m = "onRefresh")
/* renamed from: X.MYi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56992MYi extends C3CS {
    public InboxTopHorizontalListVM LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ InboxTopHorizontalListVM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56992MYi(InboxTopHorizontalListVM inboxTopHorizontalListVM, InterfaceC67352kd<? super C56992MYi> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = inboxTopHorizontalListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.onRefresh(this);
    }
}
