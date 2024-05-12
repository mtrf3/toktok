package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63352eB extends AbstractC65782Prm implements InterfaceC88471Ynr<Integer, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ int LJLIL;

    public C63352eB(InterfaceC67352kd<? super C63352eB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C63352eB c63352eB = new C63352eB(interfaceC67352kd);
        c63352eB.LJLIL = ((Number) obj).intValue();
        return c63352eB;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (this.LJLIL > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Integer num, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
