package X;

import Y.AObserverS77S0100000_9;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM$bindDmStatusObservers$1", f = "InboxTopHorizontalListVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.MYg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56990MYg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InboxTopHorizontalListVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56990MYg(InboxTopHorizontalListVM inboxTopHorizontalListVM, InterfaceC67352kd<? super C56990MYg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = inboxTopHorizontalListVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56990MYg(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InboxTopHorizontalListVM inboxTopHorizontalListVM = this.LJLIL;
        if (!inboxTopHorizontalListVM.LLFZ) {
            inboxTopHorizontalListVM.LLFZ = true;
            ((InterfaceC116174hB) inboxTopHorizontalListVM.LJLJL.getValue()).LIZ().observe(inboxTopHorizontalListVM, new AObserverS77S0100000_9(inboxTopHorizontalListVM, 93));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
