package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.controller.PostalCodeController$synchronizedInitializer$1", f = "PostalCodeController.kt", l = {36}, m = "invokeSuspend")
/* renamed from: X.aKw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93070aKw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C92350a9K LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93070aKw(C92350a9K c92350a9K, InterfaceC67352kd<? super C93070aKw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c92350a9K;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93070aKw(this.LJLILLLLZI, interfaceC67352kd);
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
            C79883Bo c79883Bo = new C79883Bo(C92357a9R.LJJIJ);
            C93069aKv c93069aKv = new C93069aKv(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (V1M.LJIIIIZZ(c79883Bo, c93069aKv, this) == enumC58928NAu) {
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
