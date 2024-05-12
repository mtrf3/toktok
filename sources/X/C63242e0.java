package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.assem.arch.viewModel.AssemViewModel$runOnUIThread$1", f = "AssemViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2e0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63242e0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC70422pa, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C63242e0(InterfaceC88472Yns<? super InterfaceC70422pa, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C63242e0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C63242e0 c63242e0 = new C63242e0(this.LJLILLLLZI, interfaceC67352kd);
        c63242e0.LJLIL = obj;
        return c63242e0;
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
