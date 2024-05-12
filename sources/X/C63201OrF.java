package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.NewMessageNotify;

/* renamed from: X.OrF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63201OrF implements InterfaceC63352Otg<C63196OrA> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ NewMessageNotify LJLILLLLZI;
    public final /* synthetic */ EP1 LJLJI;
    public final /* synthetic */ C63192Or6 LJLJJI;

    @Override // X.InterfaceC63352Otg
    public final C63196OrA LIZIZ() {
        C63196OrA c63196OrA = new C63196OrA();
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LJLIL;
        LIZ.getClass();
        long LIZLLL = C63291Osh.LIZLLL(i);
        MsgTrace msgTrace = this.LJLILLLLZI.trace;
        C63192Or6 c63192Or6 = this.LJLJJI;
        EP1 ep1 = this.LJLJI;
        c63192Or6.getClass();
        c63196OrA.LJII = C63192Or6.LJIILJJIL(ep1, msgTrace);
        StringBuilder LIZJ = V10.LIZJ("NewMsgNotifyHandler notifyByUserLink, localCursor:", LIZLLL, ", preCursor:");
        LIZJ.append(this.LJLILLLLZI.previous_cursor);
        LIZJ.append(", nextCursor:");
        LIZJ.append(this.LJLILLLLZI.next_cursor);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ));
        if (this.LJLILLLLZI.next_cursor.longValue() <= LIZLLL) {
            C63322OtC.LJFF("NewMsgNotifyHandler notifyByUserLink, local already exist, ignore");
            c63196OrA.LIZ = true;
        } else if (this.LJLILLLLZI.previous_cursor.longValue() == LIZLLL) {
            this.LJLJJI.LJIIZILJ(c63196OrA, this.LJLILLLLZI);
            if (c63196OrA.LIZJ) {
                C63291Osh LIZ2 = C63291Osh.LIZ();
                int i2 = this.LJLIL;
                long longValue = this.LJLILLLLZI.next_cursor.longValue();
                LIZ2.getClass();
                C63291Osh.LJIIJJI(i2, longValue);
            }
        } else {
            C63322OtC.LJFF("NewMsgNotifyHandler notifyByUserLink, cursor discontinuous");
            c63196OrA.LIZIZ = true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("NewMsgNotifyHandler notifyByUserLink, result=");
        LIZ3.append(c63196OrA);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        C63192Or6 c63192Or62 = this.LJLJJI;
        int i3 = this.LJLIL;
        NewMessageNotify newMessageNotify = this.LJLILLLLZI;
        String LJIIIIZZ = c63192Or62.LIZJ.LJIIIIZZ();
        if (C63308Osy.LJI().LIZLLL().LJLLL) {
            RunnableC63345OtZ.LJ(new C63213OrR(newMessageNotify, LJIIIIZZ, i3), new C78866UxK(), false);
        }
        return c63196OrA;
    }

    public C63201OrF(C63192Or6 c63192Or6, int i, NewMessageNotify newMessageNotify, EP1 ep1) {
        this.LJLJJI = c63192Or6;
        this.LJLIL = i;
        this.LJLILLLLZI = newMessageNotify;
        this.LJLJI = ep1;
    }
}
