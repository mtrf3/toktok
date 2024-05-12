package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QUO implements InterfaceC67064QTs, Handler.Callback {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJI;
    public final C67091QUt LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final InterfaceC67059QTn LJLJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(QUO.class), "mHandler", "getMHandler()Landroid/os/Handler;");
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    public final Handler LIZLLL() {
        return (Handler) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC67064QTs
    public final void LJJJJJ() {
        this.LJLIL.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC67064QTs
    public final void LJJLI() {
        if (!LIZLLL().hasMessages(102)) {
            LIZLLL().obtainMessage(102).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIJ(msg, "msg");
        if (msg.what == 101) {
            Object obj = msg.obj;
            if (obj != null) {
                QV5 qv5 = (QV5) obj;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("do insert upstream msg -> ");
                LIZ.append(qv5);
                C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
                try {
                    ((InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class)).LJJLIIIJILLIZJL(qv5);
                } catch (Exception e) {
                    QUU.LIZJ().ensureNotReachHere(e, "execute sql failed when insertUploadPayload");
                    C16880lQ.LLLLIIL(e);
                }
                if (!LIZLLL().hasMessages(102)) {
                    LIZLLL().obtainMessage(102).sendToTarget();
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sync.v2.presistence.table.UploadItem");
            }
        }
        if (msg.what == 102) {
            C67091QUt c67091QUt = this.LJLIL;
            if (((LinkedList) c67091QUt.LIZIZ.LIZ).size() > 0) {
                C66629QCz.LIZJ("there is upstream task in queue,throw current one");
            } else {
                c67091QUt.LIZIZ.LIZIZ(new ARunnableS47S0100000_11(c67091QUt, 130));
            }
        }
        return false;
    }

    public QUO(Context context, QUK quk) {
        o.LJIIJ(context, "context");
        this.LJLJI = quk;
        this.LJLIL = new C67091QUt(context);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 99));
    }
}
