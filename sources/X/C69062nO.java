package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.ui.servicelist.ServiceListPanelKt$ServiceListPanel$1$1", f = "ServiceListPanel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69062nO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC24760y8<Boolean> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69062nO(InterfaceC24760y8<Boolean> interfaceC24760y8, InterfaceC67352kd<? super C69062nO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69062nO(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLIL.getValue().booleanValue()) {
            F6I.LIZJ(null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}