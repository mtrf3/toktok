package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QXL extends Handler {
    public final QXK LIZ;
    public final QXV LIZIZ;
    public final int LIZJ;
    public final C35979EAd<String, QXN> LIZLLL;
    public final C35979EAd<String, QXN> LJ;
    public final C35979EAd<String, C76800UCe> LJFF;

    public static String LIZIZ(String str) {
        try {
            String optString = new JSONObject(str).optString("open_url");
            if (optString == null) {
                return null;
            }
            return UriProtector.getQueryParameter(UriProtector.parse(optString), "msg_id");
        } catch (Exception e) {
            C34B.LJ("OutAppPushWsReconnectHandler", e);
            return null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        QXP qxp = QXM.Companion;
        int i = msg.what;
        qxp.getClass();
        QXM LIZ = QXP.LIZ(i);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleMessage : ");
        LIZ2.append(LIZ);
        C34B.LJI("OutAppPushWsReconnectHandler", X1D.LIZIZ(LIZ2));
        switch (QXO.LIZ[LIZ.ordinal()]) {
            case 1:
                if (this.LIZ.LIZ()) {
                    return;
                }
                Object obj2 = msg.obj;
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                if (intValue >= 10) {
                    return;
                }
                Message obtainMessage = obtainMessage(QXM.RECONNECT_WS.getWhat());
                o.LJIIIIZZ(obtainMessage, "obtainMessage(Msg.RECONNECT_WS.what)");
                obtainMessage.obj = Integer.valueOf(intValue + 1);
                sendMessageDelayed(obtainMessage, this.LIZJ * intValue);
                return;
            case 2:
                if (!(obj instanceof String)) {
                    C34B.LIZJ("OutAppPushWsReconnectHandler", "handleOutPushReceived data is not String, what the hell you pass?");
                    return;
                }
                QXN qxn = new QXN(System.currentTimeMillis(), this.LIZ.LIZIZ(), C84763XOl.LJIIJJI);
                String LIZIZ = LIZIZ((String) obj);
                if (LIZIZ == null) {
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("key : ");
                LIZ3.append(LIZIZ);
                C34B.LJI("OutAppPushWsReconnectHandler", X1D.LIZIZ(LIZ3));
                QXN LIZIZ2 = this.LJ.LIZIZ(LIZIZ);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("imsdkTime : ");
                LIZ4.append(LIZIZ2);
                C34B.LJI("OutAppPushWsReconnectHandler", X1D.LIZIZ(LIZ4));
                if (LIZIZ2 == null) {
                    this.LIZLLL.LIZLLL(LIZIZ, qxn);
                    return;
                }
                this.LIZIZ.LIZ(LIZ(qxn, LIZIZ2));
                this.LJ.LJ(LIZIZ);
                return;
            case 3:
                if (!(obj instanceof List)) {
                    C34B.LIZJ("OutAppPushWsReconnectHandler", "handleIMSDKMsgReceive data is not list, what the hell you pass?");
                    return;
                }
                QXN qxn2 = new QXN(System.currentTimeMillis(), this.LIZ.LIZIZ(), C84763XOl.LJIIJJI);
                for (Object obj3 : (List) obj) {
                    if (obj3 instanceof C109544Rq) {
                        C109544Rq c109544Rq = (C109544Rq) obj3;
                        this.LJFF.LIZLLL(String.valueOf(c109544Rq.getMsgId()), C76800UCe.LIZ);
                        String valueOf = String.valueOf(c109544Rq.getMsgId());
                        QXN LIZIZ3 = this.LIZLLL.LIZIZ(valueOf);
                        if (LIZIZ3 != null) {
                            this.LIZIZ.LIZ(LIZ(LIZIZ3, qxn2));
                            this.LIZLLL.LJ(valueOf);
                        } else {
                            this.LJ.LIZLLL(valueOf, qxn2);
                        }
                    }
                }
                return;
            case 4:
                if (!(obj instanceof String)) {
                    C34B.LIZJ("OutAppPushWsReconnectHandler", "handleMixedChainFix data is not string, what the hell you pass?");
                    return;
                }
                String LIZIZ4 = LIZIZ((String) obj);
                if (LIZIZ4 == null || this.LJFF.LIZIZ(LIZIZ4) != null || C106674Gp.LJIIIIZZ(LIZIZ4) != null) {
                    return;
                }
                C106674Gp.LJIIJJI("out_push_compensation", false);
                return;
            case 5:
                this.LIZLLL.LIZ();
                this.LJ.LIZ();
                this.LJFF.LIZ();
                for (QXM qxm : QXM.values()) {
                    removeMessages(qxm.getWhat());
                }
                return;
            case 6:
                C34B.LJI("OutAppPushWsReconnectHandler", "what the hell you send?");
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QXL(Looper looper, QXK wsReconnectHelper) {
        super(looper);
        QXV qxv = new QXV();
        int i = QXI.LIZ().cache_size;
        int i2 = QXI.LIZ().ws_reconnect_delay;
        o.LJIIIZ(wsReconnectHelper, "wsReconnectHelper");
        this.LIZ = wsReconnectHelper;
        this.LIZIZ = qxv;
        this.LIZJ = i2;
        this.LIZLLL = new C35979EAd<>(i);
        this.LJ = new C35979EAd<>(i);
        this.LJFF = new C35979EAd<>(i);
    }

    public static QXU LIZ(QXN qxn, QXN qxn2) {
        return new QXU(qxn.LIZ - qxn2.LIZ, qxn.LIZIZ, qxn2.LIZIZ, qxn.LIZJ, qxn2.LIZJ);
    }
}
