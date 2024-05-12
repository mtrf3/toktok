package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.PaymentConfig$initStarlingService$1$1", f = "PaymentConfig.kt", l = {106}, m = "invokeSuspend")
/* renamed from: X.aKm, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93060aKm extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C92083a51 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93060aKm(C92083a51 c92083a51, InterfaceC67352kd<? super C93060aKm> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c92083a51;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93060aKm(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C92083a51 c92083a51 = this.LJLILLLLZI;
            C91833a0z.LIZ.getClass();
            String str = C91833a0z.LIZJ;
            this.LJLIL = 1;
            obj = c92083a51.LIZIZ(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C91833a0z.LIZ.getClass();
        C92054a4Y.LJI(C91833a0z.LIZJ, (java.util.Map) obj);
        return C76800UCe.LIZ;
    }
}
