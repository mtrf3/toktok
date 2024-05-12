package X;

import Y.IDfS25S0200000_10;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$subscribeGlobalAuthState$1$1", f = "FindFriendsPageVM.kt", l = {332}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P2T extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC77147UPn LJLILLLLZI;
    public final /* synthetic */ FindFriendsPageVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2T(EnumC77147UPn enumC77147UPn, FindFriendsPageVM findFriendsPageVM, InterfaceC67352kd<? super P2T> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC77147UPn;
        this.LJLJI = findFriendsPageVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P2T(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70352pT<C57148Mbo> LJIIIZ = UTK.LIZIZ.LJIIIZ(this.LJLILLLLZI);
            IDfS25S0200000_10 iDfS25S0200000_10 = new IDfS25S0200000_10(this.LJLJI, this.LJLILLLLZI, 1);
            this.LJLIL = 1;
            if (LJIIIZ.collect(iDfS25S0200000_10, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
