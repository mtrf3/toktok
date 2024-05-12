package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl$init$1", f = "SmartCheckIntegrateImpl.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EBU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public EBU(InterfaceC67352kd<? super EBU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EBU(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                EBL ebl = EBL.LIZ;
                this.LJLIL = 1;
                if (ebl.LIZIZ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
            EBX.LIZ("SmartCheck", EBW.INIT);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new EBU(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
