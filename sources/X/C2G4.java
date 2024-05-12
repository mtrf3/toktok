package X;

import Y.IDfS20S0200000;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {356}, m = "invokeSuspend")
/* renamed from: X.2G4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C0X9 LJLJI;
    public final /* synthetic */ AbstractC35421aE LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2G4(C0X9 c0x9, AbstractC35421aE abstractC35421aE, InterfaceC67352kd<? super C2G4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c0x9;
        this.LJLJJI = abstractC35421aE;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2G4 c2g4 = new C2G4(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2g4.LJLILLLLZI = obj;
        return c2g4;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            XLL LIZJ = this.LJLJI.LIZJ();
            IDfS20S0200000 iDfS20S0200000 = new IDfS20S0200000(this.LJLJJI, interfaceC70422pa, 6);
            this.LJLIL = 1;
            if (LIZJ.collect(iDfS20S0200000, this) == enumC58928NAu) {
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
