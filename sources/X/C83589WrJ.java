package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WrJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83589WrJ implements InterfaceC83561Wqr {
    public final InterfaceC83727WtX LIZ;

    @Override // X.InterfaceC83561Wqr
    public final void LLIIIILZ() {
        this.LIZ.LLIIIILZ();
    }

    public C83589WrJ(InterfaceC83727WtX effectController) {
        o.LJIIIZ(effectController, "effectController");
        this.LIZ = effectController;
    }

    @Override // X.InterfaceC83561Wqr
    public final void LIZ(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LIZ.M9(new C83590WrK(interfaceC88472Yns));
    }

    @Override // X.InterfaceC83561Wqr
    public final void v4(String str) {
        this.LIZ.v4(str);
    }

    @Override // X.InterfaceC83561Wqr
    public final void J3(int i, int i2, String str, String str2) {
        InterfaceC83727WtX interfaceC83727WtX = this.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        interfaceC83727WtX.J3(i, i2, str, str2);
    }
}
