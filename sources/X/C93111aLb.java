package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.BindPaymentMethodNavKt$NavigationHandler$1", f = "BindPaymentMethodNav.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93111aLb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC70422pa LJLIL;
    public final /* synthetic */ C92145a61 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93111aLb(InterfaceC70422pa interfaceC70422pa, C92145a61 c92145a61, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC67352kd<? super C93111aLb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC70422pa;
        this.LJLILLLLZI = c92145a61;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC88472Yns2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93111aLb(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL(this.LJLIL, null, null, new C93110aLa(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
