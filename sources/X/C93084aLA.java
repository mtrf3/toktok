package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$4", f = "Forms.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLA, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93084aLA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C0Z5 LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<Boolean> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93084aLA(C0Z5 c0z5, InterfaceC35811ar<Integer> interfaceC35811ar, InterfaceC24760y8<Boolean> interfaceC24760y8, InterfaceC67352kd<? super C93084aLA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c0z5;
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93084aLA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLJI.getValue().booleanValue()) {
            this.LJLIL.LIZIZ(false);
            this.LJLILLLLZI.setValue(new Integer(-1));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
