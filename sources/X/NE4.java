package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdStateBridge$sendEvent$1", f = "SearchAdStateBridge.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NE4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ N6F LJLILLLLZI;
    public final /* synthetic */ C58824N6u LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NE4(N6F n6f, C58824N6u c58824N6u, InterfaceC67352kd<? super NE4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = n6f;
        this.LJLJI = c58824N6u;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NE4(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "sendEvent : ");
            LIZIZ.append(this.LJLILLLLZI.name());
            N8M.LIZ(X1D.LIZIZ(LIZIZ));
            XLL xll = this.LJLJI.LIZIZ;
            N6F n6f = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (xll.emit(n6f, this) == enumC58928NAu) {
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
