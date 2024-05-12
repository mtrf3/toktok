package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.NewMessageNotify;

/* renamed from: X.OrE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63200OrE implements InterfaceC63352Otg<C63196OrA> {
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
        long LJI = C63291Osh.LJI(i);
        StringBuilder LIZJ = V10.LIZJ("NewMsgNotifyHandler notifyNormalByRecentLink, localVersion:", LJI, ", pre_version:");
        LIZJ.append(this.LJLILLLLZI.previous_conversation_version);
        LIZJ.append(", version:");
        LIZJ.append(this.LJLILLLLZI.conversation_version);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ));
        MsgTrace msgTrace = this.LJLILLLLZI.trace;
        C63192Or6 c63192Or6 = this.LJLJJI;
        EP1 ep1 = this.LJLJI;
        c63192Or6.getClass();
        c63196OrA.LJII = C63192Or6.LJIILJJIL(ep1, msgTrace);
        NewMessageNotify newMessageNotify = this.LJLILLLLZI;
        Long l = newMessageNotify.conversation_version;
        if (l == null || newMessageNotify.previous_conversation_version == null) {
            c63196OrA.LIZIZ = true;
            C63322OtC.LJFF("NewMsgNotifyHandler notifyNormalByRecentLink version discontinuous");
        } else if (l.longValue() <= LJI) {
            C63322OtC.LJFF("NewMsgNotifyHandler notifyNormalByRecentLink, local already exist, ignore");
            c63196OrA.LIZ = true;
        } else if (this.LJLILLLLZI.previous_conversation_version.longValue() <= LJI) {
            this.LJLJJI.LJIIZILJ(c63196OrA, this.LJLILLLLZI);
            if (c63196OrA.LIZJ) {
                C63291Osh LIZ2 = C63291Osh.LIZ();
                int i2 = this.LJLIL;
                long longValue = this.LJLILLLLZI.conversation_version.longValue();
                LIZ2.getClass();
                C63291Osh.LJIILJJIL(i2, longValue);
            }
        } else {
            c63196OrA.LIZIZ = true;
            C63322OtC.LJFF("NewMsgNotifyHandler notifyNormalByRecentLink version discontinuous");
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("NewMsgNotifyHandler notifyNormalByRecentLink, result:");
        LIZ3.append(c63196OrA);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        return c63196OrA;
    }

    public C63200OrE(C63192Or6 c63192Or6, int i, NewMessageNotify newMessageNotify, EP1 ep1) {
        this.LJLJJI = c63192Or6;
        this.LJLIL = i;
        this.LJLILLLLZI = newMessageNotify;
        this.LJLJI = ep1;
    }
}
