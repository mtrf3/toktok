package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.BindPaymentMethodNavKt$BindPaymentMethodNav$2", f = "BindPaymentMethodNav.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLZ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93109aLZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C92145a61 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93109aLZ(C92145a61 c92145a61, String str, InterfaceC67352kd<? super C93109aLZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c92145a61;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93109aLZ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C91884a1o.LIZ(this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
