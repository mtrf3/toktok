package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes12.dex */
public final class QU0 implements Handler.Callback {
    public final Context LJLIL;
    public final Handler LJLILLLLZI = new Handler(((QU4) QPG.LIZ(QU4.class)).get(), this);
    public QU1 LJLJI;

    public static void LIZ() {
        ((InterfaceC67096QUy) QPG.LIZ(InterfaceC67096QUy.class)).LJJIIZ();
        ((QU3) QPG.LIZ(QU3.class)).reset();
        ((QU3) QPG.LIZ(QU3.class)).LJIILJJIL();
    }

    public final void LIZIZ() {
        long j;
        this.LJLJI = new QU1(this);
        ((InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class)).LJIIJ(this.LJLJI);
        InterfaceC67063QTr interfaceC67063QTr = (InterfaceC67063QTr) QPG.LIZ(InterfaceC67063QTr.class);
        if (!QUW.LIZJ(this.LJLIL).LIZIZ().LIZIZ() || interfaceC67063QTr.LJFF()) {
            j = 0;
        } else {
            j = QUW.LIZJ(this.LJLIL).LIZIZ().eventSendDelay * 1000;
            interfaceC67063QTr.LJJIJIIJI(new C67068QTw(this));
        }
        this.LJLILLLLZI.sendMessageDelayed(this.LJLILLLLZI.obtainMessage(101), j);
    }

    public QU0(Context context) {
        this.LJLIL = context;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 102) {
            LIZ();
        }
        if (message.what == 101) {
            LIZ();
            return false;
        }
        return false;
    }
}
