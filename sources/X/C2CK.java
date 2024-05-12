package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
/* renamed from: X.2CK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1OH LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C1OF> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CK(C1OH c1oh, InterfaceC35811ar<C1OF> interfaceC35811ar, InterfaceC67352kd<? super C2CK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1oh;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CK(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C1OH c1oh = this.LJLILLLLZI;
            InterfaceC35811ar<C1OF> interfaceC35811ar = this.LJLJI;
            this.LJLIL = 1;
            if (C49211wT.LIZ(c1oh, interfaceC35811ar, this) == enumC58928NAu) {
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
