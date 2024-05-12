package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.AvailableMethodsPageKt$AvailableMethodsPage$1", f = "AvailableMethodsPage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aL4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93078aL4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<InterfaceC91961a33> LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93078aL4(List<? extends InterfaceC91961a33> list, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C93078aL4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93078aL4(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.size() == 1 && this.LJLILLLLZI.getValue().booleanValue()) {
            C91943a2l.LIZJ((InterfaceC91961a33) ORZ.LJLLJ(this.LJLIL));
            if (!((C91942a2k) C91943a2l.LJIIJJI.getValue()).LIZIZ.isEmpty()) {
                this.LJLJI.invoke("form_page");
                this.LJLILLLLZI.setValue(Boolean.FALSE);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
