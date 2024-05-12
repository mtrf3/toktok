package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.assem.arch.viewModel.AssemViewModel$runOnWorkThread$1", f = "AssemViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2e1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63252e1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC70422pa, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C63252e1(InterfaceC88472Yns<? super InterfaceC70422pa, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C63252e1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C63252e1 c63252e1 = new C63252e1(this.LJLILLLLZI, interfaceC67352kd);
        c63252e1.LJLIL = obj;
        return c63252e1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.invoke(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
