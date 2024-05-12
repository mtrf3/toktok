package X;

import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity$showComposeView$1$2$2$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKy, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93072aKy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CheckoutActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93072aKy(CheckoutActivity checkoutActivity, InterfaceC67352kd<? super C93072aKy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = checkoutActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93072aKy(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C16830lL c16830lL = new C16830lL(this.LJLIL.getWindow(), this.LJLIL.getWindow().getDecorView());
        c16830lL.LIZ.LIZ(C91671ZyN.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
