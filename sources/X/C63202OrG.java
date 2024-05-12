package X;

import com.bytedance.im.core.proto.NewMessageNotify;

/* renamed from: X.OrG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63202OrG implements InterfaceC63352Otg<C63196OrA> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ NewMessageNotify LJLILLLLZI;
    public final /* synthetic */ C63192Or6 LJLJI;

    @Override // X.InterfaceC63352Otg
    public final C63196OrA LIZIZ() {
        C63196OrA c63196OrA = new C63196OrA();
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LJLIL;
        LIZ.getClass();
        long LIZJ = C63291Osh.LIZJ(i);
        C63291Osh LIZ2 = C63291Osh.LIZ();
        int i2 = this.LJLIL;
        LIZ2.getClass();
        long LJFF = C63291Osh.LJFF(i2);
        StringBuilder LIZJ2 = V10.LIZJ("NewMsgNotifyHandler notifyCommandByRecentLink, localCmdIndex:", LIZJ, ", cmdIndex:");
        LIZJ2.append(this.LJLILLLLZI.cmd_message_index);
        LIZJ2.append(", localUserCursor:");
        LIZJ2.append(LJFF);
        LIZJ2.append(", userCursor:");
        LIZJ2.append(this.LJLILLLLZI.next_cursor);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ2));
        Long l = this.LJLILLLLZI.cmd_message_index;
        if (l == null) {
            c63196OrA.LIZIZ = true;
            C63322OtC.LJFF("NewMsgNotifyHandler notifyCommandByRecentLink index discontinuous");
        } else if (l.longValue() < LIZJ) {
            C63322OtC.LJFF("NewMsgNotifyHandler notifyCommandByRecentLink, local already exist, ignore");
            c63196OrA.LIZ = true;
        } else if (this.LJLILLLLZI.cmd_message_index.longValue() == LIZJ) {
            this.LJLJI.LJIIZILJ(c63196OrA, this.LJLILLLLZI);
            if (c63196OrA.LIZJ) {
                C63291Osh LIZ3 = C63291Osh.LIZ();
                int i3 = this.LJLIL;
                long longValue = this.LJLILLLLZI.cmd_message_index.longValue() + 1;
                LIZ3.getClass();
                C63291Osh.LJIIJ(i3, longValue);
            }
            Long l2 = this.LJLILLLLZI.next_cursor;
            if (l2 != null && l2.longValue() > LJFF) {
                C63291Osh LIZ4 = C63291Osh.LIZ();
                int i4 = this.LJLIL;
                long longValue2 = this.LJLILLLLZI.next_cursor.longValue();
                LIZ4.getClass();
                C63291Osh.LJIILIIL(i4, longValue2);
            } else {
                C63322OtC.LIZLLL("NewMsgNotifyHandler notifyCommandByRecentLink mix cursor invalid");
            }
        } else {
            c63196OrA.LIZIZ = true;
            C63322OtC.LJFF("NewMsgNotifyHandler notifyCommandByRecentLink index discontinuous");
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("NewMsgNotifyHandler notifyCommandByRecentLink, result:");
        LIZ5.append(c63196OrA);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ5));
        return c63196OrA;
    }

    public C63202OrG(int i, C63192Or6 c63192Or6, NewMessageNotify newMessageNotify) {
        this.LJLJI = c63192Or6;
        this.LJLIL = i;
        this.LJLILLLLZI = newMessageNotify;
    }
}
