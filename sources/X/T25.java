package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.composable.ReplyInputKt$ReplyInput$1", f = "ReplyInput.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class T25 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C15020iQ LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C0ZJ> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T25(C15020iQ c15020iQ, InterfaceC35811ar<C0ZJ> interfaceC35811ar, InterfaceC67352kd<? super T25> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c15020iQ;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new T25(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(300L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C15020iQ c15020iQ = this.LJLILLLLZI;
        if (c15020iQ != null && c15020iQ.LIZIZ.get() != null) {
            c15020iQ.LIZ.LJ();
        }
        this.LJLJI.getValue().LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
