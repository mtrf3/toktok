package X;

import android.content.Context;

/* renamed from: X.Nm9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60337Nm9 extends C60379Nmp implements InterfaceC60270Nl4 {
    @Override // X.InterfaceC60270Nl4
    public final C60289NlN LJJI(C77125UOr c77125UOr) {
        return new C60289NlN(this, c77125UOr);
    }

    @Override // X.InterfaceC60270Nl4
    public final void LJJIJ(Context context, C0XW c0xw) {
        InterfaceC60336Nm8 interfaceC60336Nm8;
        if (C60625Nqn.LJI == null) {
            C60625Nqn.LJI = C16880lQ.LLLLL(context);
            C60625Nqn.LJII = new C39863Fkh();
        }
        C60625Nqn.LIZIZ("webx_webkit", C60425NnZ.class, new C60338NmA(this));
        InterfaceC60353NmP interfaceC60353NmP = (InterfaceC60353NmP) getService(InterfaceC60353NmP.class);
        if (interfaceC60353NmP != null) {
            interfaceC60353NmP.LJI();
        }
        C60357NmT c60357NmT = (C60357NmT) c0xw.LIZ;
        if (c60357NmT != null && (interfaceC60336Nm8 = (InterfaceC60336Nm8) getService(InterfaceC60336Nm8.class)) != null) {
            interfaceC60336Nm8.LJJIIZI(context, c60357NmT);
        }
    }
}
