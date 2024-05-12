package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {134}, m = "invokeSuspend")
/* renamed from: X.2BT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07190Pz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BT(C07190Pz c07190Pz, InterfaceC67352kd<? super C2BT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07190Pz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BT(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C56032Hv c56032Hv;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i == 0 || i == 1) {
            C141335gf.LIZJ(obj);
            do {
                c56032Hv = new C56032Hv(this.LJLILLLLZI);
                this.LJLIL = 1;
            } while (C48693J9d.LJII(c56032Hv, this) != enumC58928NAu);
            return enumC58928NAu;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
