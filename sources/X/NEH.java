package X;

import Y.IDeS151S0200000_10;
import Y.IDfS25S0200000_10;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$subscribe$1$1$1", f = "SearchAdStateBridge.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C58824N6u LJLILLLLZI;
    public final /* synthetic */ N6F LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEH(C58824N6u c58824N6u, N6F n6f, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super NEH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c58824N6u;
        this.LJLJI = n6f;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NEH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LIZIZ;
            N6F n6f = this.LJLJI;
            IDeS151S0200000_10 iDeS151S0200000_10 = new IDeS151S0200000_10(xll, n6f, 1);
            IDfS25S0200000_10 iDfS25S0200000_10 = new IDfS25S0200000_10(n6f, this.LJLJJI, 7);
            this.LJLIL = 1;
            if (iDeS151S0200000_10.collect(iDfS25S0200000_10, this) == enumC58928NAu) {
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
