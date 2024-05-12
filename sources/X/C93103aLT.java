package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.CheckoutHomeKt$CheckoutHome$2", f = "CheckoutHome.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLT, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93103aLT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC91961a33 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93103aLT(InterfaceC91961a33 interfaceC91961a33, InterfaceC67352kd<? super C93103aLT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC91961a33;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93103aLT(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C91943a2l.LIZJ(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
