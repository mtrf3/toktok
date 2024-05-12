package X;

import Y.IDcS365S0100000_10;
import com.bytedance.im.core.proto.MessageBody;

/* renamed from: X.Otu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63366Otu implements InterfaceC63395OuN {
    @Override // X.InterfaceC63395OuN
    public final void LJFF() {
        C63269OsL.LIZLLL(false);
    }

    @Override // X.InterfaceC63395OuN
    public final void LIZIZ(C63120Opw c63120Opw) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateConversation: ");
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        C63322OtC.LJI("NewMsgNotifyUseCase", C40084FoG.LIZ(LIZ, str, ", reason: ", 2, LIZ), null);
        C115284fk.LJIILIIL().LJIJI(2, c63120Opw);
    }

    @Override // X.InterfaceC63395OuN
    public final C63120Opw LJ(String str) {
        return C115284fk.LJIILIIL().LJIIIZ(str);
    }

    @Override // X.InterfaceC63395OuN
    public final C63120Opw LJI(String str) {
        return C63133Oq9.LJIIIZ(str, true);
    }

    @Override // X.InterfaceC63395OuN
    public final void LIZLLL(int i, MessageBody messageBody) {
        C115394fv.LJII().LJI(i, messageBody);
    }

    @Override // X.InterfaceC63395OuN
    public final void LIZ(C63120Opw c63120Opw, C109544Rq c109544Rq, int i) {
        C63192Or6.LJIJI(c63120Opw, c109544Rq, Integer.valueOf(i));
    }

    @Override // X.InterfaceC63395OuN
    public final Object LIZJ(int i, C109544Rq c109544Rq, int i2, C63393OuL c63393OuL) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c63393OuL));
        new C63217OrV(new IDcS365S0100000_10(c84654XKg, 0)).LJIILJJIL(i, i2, c109544Rq);
        return c84654XKg.LIZ();
    }
}
