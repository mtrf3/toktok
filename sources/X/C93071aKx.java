package X;

import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity$showComposeView$1$2$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKx, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93071aKx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CheckoutActivity LJLIL;
    public final /* synthetic */ C92145a61 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93071aKx(CheckoutActivity checkoutActivity, C92145a61 c92145a61, InterfaceC67352kd<? super C93071aKx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = checkoutActivity;
        this.LJLILLLLZI = c92145a61;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93071aKx(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLIL = this.LJLILLLLZI;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
