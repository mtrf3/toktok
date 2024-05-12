package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
/* renamed from: X.2CJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C1OF> LJLJI;
    public final /* synthetic */ C1OH LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CJ(C1OH c1oh, InterfaceC35811ar interfaceC35811ar, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = c1oh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        boolean z = this.LJLILLLLZI;
        return new C2CJ(this.LJLJJI, this.LJLJI, interfaceC67352kd, z);
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
            if (!this.LJLILLLLZI) {
                InterfaceC35811ar<C1OF> interfaceC35811ar = this.LJLJI;
                C1OH c1oh = this.LJLJJI;
                this.LJLIL = 1;
                if (C49211wT.LIZIZ(c1oh, interfaceC35811ar, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
