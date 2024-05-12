package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2CS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CS extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C0SQ LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CS(C0SQ c0sq, InterfaceC67352kd<? super C2CS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c0sq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CS(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c76800UCe, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
