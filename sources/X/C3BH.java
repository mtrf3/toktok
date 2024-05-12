package X;

import Y.IDfS21S0200000_1;
import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {210}, m = "invokeSuspend")
/* renamed from: X.3BH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C3BM>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC71762rk<Integer> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BH(InterfaceC71762rk<Integer> interfaceC71762rk, InterfaceC67352kd<? super C3BH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC71762rk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3BH c3bh = new C3BH(this.LJLJI, interfaceC67352kd);
        c3bh.LJLILLLLZI = obj;
        return c3bh;
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
            InterfaceC64672gJ interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C34K c34k = new C34K();
            InterfaceC71762rk<Integer> interfaceC71762rk = this.LJLJI;
            IDfS21S0200000_1 iDfS21S0200000_1 = new IDfS21S0200000_1(c34k, interfaceC64672gJ, 3);
            this.LJLIL = 1;
            if (interfaceC71762rk.collect(iDfS21S0200000_1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C3BM> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
