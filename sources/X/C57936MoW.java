package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$refresh$1", f = "UserCardListViewModel.kt", l = {435}, m = "invokeSuspend")
/* renamed from: X.MoW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57936MoW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XJO LJLIL;
    public UserCardListViewModel LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ UserCardListViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57936MoW(UserCardListViewModel userCardListViewModel, InterfaceC67352kd<? super C57936MoW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = userCardListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57936MoW(this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UserCardListViewModel userCardListViewModel;
        XJO xjo;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                userCardListViewModel = this.LJLILLLLZI;
                xjo = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            userCardListViewModel = this.LJLJJI;
            xjo = userCardListViewModel.LJLLJ;
            this.LJLIL = xjo;
            this.LJLILLLLZI = userCardListViewModel;
            this.LJLJI = 1;
            if (xjo.LIZ(null, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        try {
            int LJII = userCardListViewModel.jv0().LJII();
            AYY ayy = AYY.LIZ;
            String str = userCardListViewModel.LJLJJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("refresh if empty, ");
            LIZ.append(LJII);
            String LIZIZ = X1D.LIZIZ(LIZ);
            ayy.getClass();
            AYY.LIZIZ(str, LIZIZ);
            if (LJII > 0) {
                return C76800UCe.LIZ;
            }
            userCardListViewModel.manualListRefresh();
            xjo.LIZIZ(null);
            return C76800UCe.LIZ;
        } finally {
            xjo.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
