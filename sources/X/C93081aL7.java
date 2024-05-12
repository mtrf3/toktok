package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$1", f = "Forms.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aL7, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93081aL7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C0Z5 LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93081aL7(boolean z, C0Z5 c0z5, InterfaceC35811ar<Integer> interfaceC35811ar, InterfaceC67352kd<? super C93081aL7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = c0z5;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93081aL7(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLIL) {
            this.LJLILLLLZI.LIZIZ(false);
            this.LJLJI.setValue(new Integer(-1));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
