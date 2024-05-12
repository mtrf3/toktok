package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.CheckoutBarKt$CheckoutBar$2$1", f = "CheckoutBar.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLd, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93113aLd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93113aLd(int i, InterfaceC67352kd<? super C93113aLd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93113aLd(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C91952a2u.LIZJ = this.LJLIL;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
