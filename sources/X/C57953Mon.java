package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1$3", f = "UserCardListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Mon, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57953Mon extends AbstractC65782Prm implements InterfaceC88471Ynr<C57969Mp3, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ UserCardListViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57953Mon(UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57953Mon> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userCardListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C57953Mon c57953Mon = new C57953Mon(this.LJLILLLLZI, interfaceC67352kd);
        c57953Mon.LJLIL = obj;
        return c57953Mon;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C57969Mp3 c57969Mp3 = (C57969Mp3) this.LJLIL;
        UserCardListViewModel userCardListViewModel = this.LJLILLLLZI;
        C57949Moj c57949Moj = (C57949Moj) userCardListViewModel.getVmDispatcher().getState();
        C72912tb c72912tb = new C72912tb(new C223208pQ(c57969Mp3.LIZLLL, 1));
        c57949Moj.getClass();
        if (c57949Moj.getListState().LJLILLLLZI instanceof C72912tb) {
            userCardListViewModel.setStateImmediate(new AqS175S0100000_9(c72912tb, (C72912tb<C223208pQ>) 14));
        } else if ((c57949Moj.getListState().LJLILLLLZI instanceof C33X) && (c57949Moj.getListState().LJLIL instanceof C72912tb)) {
            userCardListViewModel.setStateImmediate(new AqS175S0100000_9(c72912tb, (C72912tb<C223208pQ>) 12));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C57969Mp3 c57969Mp3, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c57969Mp3, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
