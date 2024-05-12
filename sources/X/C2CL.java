package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
/* renamed from: X.2CL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC35811ar<C1OF> LJLILLLLZI;
    public final /* synthetic */ C1OH LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CL(C1OH c1oh, InterfaceC35811ar interfaceC35811ar, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = c1oh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CL(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC35811ar<C1OF> interfaceC35811ar = this.LJLILLLLZI;
            C1OH c1oh = this.LJLJI;
            this.LJLIL = 1;
            if (C49211wT.LIZIZ(c1oh, interfaceC35811ar, this) == enumC58928NAu) {
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
