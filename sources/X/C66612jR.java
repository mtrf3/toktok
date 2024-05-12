package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.autocut.ui.AutoCutPopupUIHandler$clearTempFiles$1", f = "AutoCutPopupUIHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66612jR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C45254HpS LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66612jR(C45254HpS c45254HpS, InterfaceC67352kd<? super C66612jR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c45254HpS;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66612jR(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = this.LJLIL.LJI;
        if (str != null) {
            C44687HgJ.LJIILJJIL(str);
        }
        this.LJLIL.LJI = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
