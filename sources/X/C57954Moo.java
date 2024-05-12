package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1$1", f = "UserCardListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Moo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57954Moo extends AbstractC65782Prm implements InterfaceC88471Ynr<C57969Mp3, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ UserCardListViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57954Moo(UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57954Moo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userCardListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C57954Moo c57954Moo = new C57954Moo(this.LJLILLLLZI, interfaceC67352kd);
        c57954Moo.LJLIL = obj;
        return c57954Moo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object obj2 = this.LJLIL;
        AYY ayy = AYY.LIZ;
        String str = this.LJLILLLLZI.LJLJJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("collect source state: ");
        LIZ.append(obj2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ(str, LIZIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C57969Mp3 c57969Mp3, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c57969Mp3, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
