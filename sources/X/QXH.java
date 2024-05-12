package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.im.sdk.notification.outapppushwsreconnect.OutAppPushWsReconnectConfigModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public final class QXH implements C31L {
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(QXQ.LJLIL);
    public final OutAppPushWsReconnectConfigModel LIZ;
    public final QXK LIZIZ;
    public volatile HandlerThread LIZJ;
    public volatile boolean LIZLLL;
    public volatile QXL LJ;
    public volatile long LJFF;

    @Override // X.C31L
    public final void LIZ() {
        synchronized (this) {
            if (LJFF() && this.LIZ.upload_event) {
                this.LIZLLL = false;
                C34B.LJI("OutAppPushWsReconnectManager", "onLogout");
                EventBus.LIZJ().LJIJ(this);
                QXL qxl = this.LJ;
                if (qxl != null) {
                    qxl.sendMessageAtFrontOfQueue(qxl.obtainMessage(QXM.LOGOUT.getWhat()));
                }
                HandlerThread handlerThread = this.LIZJ;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                this.LIZJ = null;
                this.LJ = null;
            }
        }
    }

    @Override // X.C31L
    public final void LIZLLL() {
        Looper LLJJJJ;
        synchronized (this) {
            if (LJFF() && this.LIZ.upload_event) {
                if (!this.LIZLLL) {
                    this.LIZLLL = true;
                    C34B.LJI("OutAppPushWsReconnectManager", "onLogin");
                    EventBus.LIZJ().LJIILJJIL(this);
                    this.LIZJ = new HandlerThread("OutAppPushWsReconnectThread");
                    HandlerThread handlerThread = this.LIZJ;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.LIZJ;
                    if (handlerThread2 == null || (LLJJJJ = handlerThread2.getLooper()) == null) {
                        LLJJJJ = C16880lQ.LLJJJJ();
                    }
                    o.LJIIIIZZ(LLJJJJ, "workerThread?.looper ?: Looper.getMainLooper()");
                    this.LJ = new QXL(LLJJJJ, this.LIZIZ);
                }
            }
        }
    }

    public QXH() {
        QXK c67132QWi;
        OutAppPushWsReconnectConfigModel settings = QXI.LIZ();
        QXK.LIZ.getClass();
        if (C35154Dqw.LIZ()) {
            c67132QWi = new C67135QWl();
        } else {
            c67132QWi = new C67132QWi();
        }
        o.LJIIIZ(settings, "settings");
        this.LIZ = settings;
        this.LIZIZ = c67132QWi;
    }

    public static boolean LJFF() {
        return C36839Ed1.LIZIZ(EF7.LIZIZ());
    }

    public final boolean LJ() {
        if (LJFF() && this.LIZ.upload_event) {
            EnumC66933QOr LIZIZ = this.LIZIZ.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("current connectState : ");
            LIZ.append(LIZIZ);
            C34B.LJI("IOutAppPushWsReconnectHelper", X1D.LIZIZ(LIZ));
            if (LIZIZ == EnumC66933QOr.CONNECT_CLOSED || LIZIZ == EnumC66933QOr.CONNECT_FAILED) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C31L
    public final void LIZIZ(String pushRawString) {
        PushSettings LJ;
        QXL qxl;
        Message obtainMessage;
        QXL qxl2;
        QXL qxl3;
        QXL qxl4;
        QXL qxl5;
        QXL qxl6;
        QXL qxl7;
        o.LJIIIZ(pushRawString, "pushRawString");
        if (!LJFF() || (LJ = C85940Xo8.LIZIZ.LJ()) == null || LJ.imPush != 1 || !this.LIZ.upload_event || (qxl = this.LJ) == null || (obtainMessage = qxl.obtainMessage(QXM.PUSH_RECEIVE.getWhat())) == null) {
            return;
        }
        obtainMessage.obj = pushRawString;
        QXL qxl8 = this.LJ;
        if (qxl8 != null) {
            qxl8.sendMessage(obtainMessage);
        }
        int LIZ = C00F.LIZ(31744, 0, "dm_reconnect_strategy", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                if (LIZ != 3) {
                    if (LIZ != 4) {
                        if (LIZ != 5) {
                            return;
                        }
                        if (!C84763XOl.LJIIJJI) {
                            QXL qxl9 = this.LJ;
                            if (qxl9 != null) {
                                LJI(qxl9, pushRawString);
                            }
                            if ((!LJ() && System.currentTimeMillis() - this.LJFF < this.LIZ.ws_foreground_expire_time) || (qxl7 = this.LJ) == null) {
                                return;
                            }
                            LJII(qxl7);
                            return;
                        }
                        if ((!LJ() && System.currentTimeMillis() - this.LJFF < this.LIZ.ws_background_expire_time) || (qxl6 = this.LJ) == null) {
                            return;
                        }
                        LJII(qxl6);
                        return;
                    }
                    if (!C84763XOl.LJIIJJI) {
                        return;
                    }
                    if ((!LJ() && System.currentTimeMillis() - this.LJFF < this.LIZ.ws_background_expire_time) || (qxl5 = this.LJ) == null) {
                        return;
                    }
                    LJII(qxl5);
                    return;
                }
                if (C84763XOl.LJIIJJI) {
                    return;
                }
                QXL qxl10 = this.LJ;
                if (qxl10 != null) {
                    LJI(qxl10, pushRawString);
                }
                if ((!LJ() && System.currentTimeMillis() - this.LJFF < this.LIZ.ws_foreground_expire_time) || (qxl4 = this.LJ) == null) {
                    return;
                }
                LJII(qxl4);
                return;
            }
            if (C84763XOl.LJIIJJI) {
                return;
            }
            QXL qxl11 = this.LJ;
            if (qxl11 != null) {
                LJI(qxl11, pushRawString);
            }
            if (!LJ() || (qxl3 = this.LJ) == null) {
                return;
            }
            LJII(qxl3);
            return;
        }
        if (C84763XOl.LJIIJJI || !LJ() || (qxl2 = this.LJ) == null) {
            return;
        }
        LJII(qxl2);
    }

    @Override // X.C31L
    public final void LIZJ(List<? extends C109544Rq> msgList) {
        PushSettings LJ;
        QXL qxl;
        Message obtainMessage;
        o.LJIIIZ(msgList, "msgList");
        if (!LJFF() || (LJ = C85940Xo8.LIZIZ.LJ()) == null || LJ.imPush != 1 || !this.LIZ.upload_event || (qxl = this.LJ) == null || (obtainMessage = qxl.obtainMessage(QXM.IMSDK_RECEIVE.getWhat())) == null) {
            return;
        }
        obtainMessage.obj = msgList;
        QXL qxl2 = this.LJ;
        if (qxl2 == null) {
            return;
        }
        qxl2.sendMessage(obtainMessage);
    }

    public final void LJII(QXL qxl) {
        QXM qxm = QXM.RECONNECT_WS;
        if (qxl.hasMessages(qxm.getWhat())) {
            return;
        }
        Message obtainMessage = qxl.obtainMessage(qxm.getWhat());
        o.LJIIIIZZ(obtainMessage, "obtainMessage(OutAppPush…er.Msg.RECONNECT_WS.what)");
        obtainMessage.obj = 1;
        qxl.sendMessageDelayed(obtainMessage, this.LIZ.ws_reconnect_delay);
    }

    @QD3
    public final void onWsStatusChangeEvent$im_base_release(C67142QWs wsEvent) {
        o.LJIIIZ(wsEvent, "wsEvent");
        if (!LJFF() || !this.LIZ.upload_event) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ws status change : ");
        LIZ.append(wsEvent.LJLIL.LIZIZ);
        C34B.LJI("OutAppPushWsReconnectManager", X1D.LIZIZ(LIZ));
        if (wsEvent.LJLIL.LIZIZ != EnumC67133QWj.CONNECTED) {
            return;
        }
        this.LJFF = System.currentTimeMillis();
    }

    public final void LJI(QXL qxl, String pushRawString) {
        o.LJIIIZ(pushRawString, "pushRawString");
        QXM qxm = QXM.MIX_CHAIN_FIX;
        if (qxl.hasMessages(qxm.getWhat())) {
            return;
        }
        Message obtainMessage = qxl.obtainMessage(qxm.getWhat());
        o.LJIIIIZZ(obtainMessage, "obtainMessage(OutAppPush…r.Msg.MIX_CHAIN_FIX.what)");
        obtainMessage.obj = pushRawString;
        qxl.sendMessageDelayed(obtainMessage, this.LIZ.mix_chain_fix_delay);
    }
}
