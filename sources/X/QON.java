package X;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* loaded from: classes12.dex */
public final class QON implements QOO {
    public static void LJFF(Context context, QOP qop) {
        Message obtain = Message.obtain();
        obtain.what = qop.LIZJ;
        obtain.getData().putParcelable(qop.LIZ, qop.LIZIZ);
        QMS.LIZIZ(context).handleMsg(obtain);
    }

    @Override // X.QOO
    public final void LIZ(Context context, SsWsApp ssWsApp) {
        QOP qop = new QOP();
        qop.LIZ = "ws_app";
        qop.LIZIZ = ssWsApp;
        qop.LIZJ = 0;
        LJFF(context, qop);
    }

    @Override // X.QOO
    public final void LIZIZ(Context context, SsWsApp ssWsApp) {
        if (!C66455Q6h.LIZIZ(context).LIZJ()) {
            return;
        }
        QOP qop = new QOP();
        qop.LIZ = "ws_app";
        qop.LIZIZ = ssWsApp;
        qop.LIZJ = 4;
        LJFF(context, qop);
    }

    @Override // X.QOO
    public final void LIZJ(int i, Context context) {
        QOP qop = new QOP();
        qop.LIZ = "ws_app";
        qop.LIZIZ = new IntegerParcelable(i);
        qop.LIZJ = 1;
        LJFF(context, qop);
    }

    @Override // X.QOO
    public final void LIZLLL(Context context, WsChannelMsg wsChannelMsg) {
        QOP qop = new QOP();
        qop.LIZ = "payload";
        qop.LIZIZ = wsChannelMsg;
        qop.LIZJ = 5;
        LJFF(context, qop);
    }

    public final void LJ(int i, Context context) {
        if (context == null || i <= 0 || i > 3) {
            return;
        }
        Logger.debug();
        if (!C66455Q6h.LIZIZ(context).LIZJ()) {
            return;
        }
        Message message = new Message();
        message.what = 2;
        message.arg1 = i;
        QMS.LIZIZ(context).handleMsg(message);
    }
}
