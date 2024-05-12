package X;

import Y.IDfS20S0200000;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
/* renamed from: X.2DW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C0X9 LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DW(C0X9 c0x9, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C2DW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c0x9;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2DW(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            ArrayList LJFF = C1JX.LJFF(obj);
            XLL LIZJ = this.LJLILLLLZI.LIZJ();
            IDfS20S0200000 iDfS20S0200000 = new IDfS20S0200000(LJFF, this.LJLJI, 2);
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
