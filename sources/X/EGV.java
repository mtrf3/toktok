package X;

import com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM$onPrepared$1", f = "FriendListVM.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EGV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FriendListVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EGV(FriendListVM friendListVM, InterfaceC67352kd<? super EGV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = friendListVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EGV(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLIL.getValue().getClass();
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
