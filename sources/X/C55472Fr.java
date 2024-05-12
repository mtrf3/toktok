package X;

import Y.IDfS125S0100000;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {506}, m = "invokeSuspend")
/* renamed from: X.2Fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55472Fr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C0X9 LJLILLLLZI;
    public final /* synthetic */ C48211ur<C0X8> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55472Fr(C0X9 c0x9, C48211ur<C0X8> c48211ur, InterfaceC67352kd<? super C55472Fr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c0x9;
        this.LJLJI = c48211ur;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55472Fr(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XLL LIZJ = this.LJLILLLLZI.LIZJ();
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(this.LJLJI, 44);
            this.LJLIL = 1;
            if (LIZJ.collect(iDfS125S0100000, this) == enumC58928NAu) {
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
