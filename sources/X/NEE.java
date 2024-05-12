package X;

import Y.IDfS131S0100000_10;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdAnoleModule$initObservers$1$1$1", f = "SearchAdAnoleModule.kt", l = {267}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NBH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEE(NBH nbh, InterfaceC67352kd<? super NEE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nbh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NEE(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC65462ha LJIIJJI;
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
            InterfaceC65462ha interfaceC65462ha = (InterfaceC65462ha) this.LJLILLLLZI.LJLLI.getValue();
            if (interfaceC65462ha != null && (LJIIJJI = V1M.LJIIJJI(interfaceC65462ha)) != null) {
                IDfS131S0100000_10 iDfS131S0100000_10 = new IDfS131S0100000_10(this.LJLILLLLZI, 16);
                this.LJLIL = 1;
                if (LJIIJJI.collect(iDfS131S0100000_10, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
