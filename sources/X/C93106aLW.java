package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.CheckoutHomeKt$CheckoutHome$3$3", f = "CheckoutHome.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLW, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93106aLW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC91961a33 LJLIL;
    public final /* synthetic */ C91706Zyw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93106aLW(InterfaceC91961a33 interfaceC91961a33, C91706Zyw c91706Zyw, InterfaceC67352kd<? super C93106aLW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC91961a33;
        this.LJLILLLLZI = c91706Zyw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93106aLW(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL instanceof C92232a7Q) {
            C91706Zyw.LJIIL(this.LJLILLLLZI, "select_pi_without_default", null, 6);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
