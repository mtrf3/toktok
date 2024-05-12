package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.ui.servicelist.ServiceListPanelKt$ServiceListPanelAfterFeatureInit$1$1", f = "ServiceListPanel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68062lm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68062lm(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C68062lm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68062lm(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLILLLLZI.getValue().booleanValue()) {
            V5H.LIZ = true;
            this.LJLIL.invoke();
        }
        this.LJLILLLLZI.setValue(Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
