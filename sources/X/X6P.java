package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.slark.impl.ECViewTracker$onPreDrawListener$1$onPreDraw$2", f = "ECViewTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class X6P extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ X6T LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6P(X6T x6t, InterfaceC67352kd<? super X6P> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = x6t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new X6P(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ();
        this.LJLIL.LJIIIIZZ = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
