package X;

import Y.AgS22S0100100_15;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushReverseExp;
import com.zhiliaoapp.musically.R;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XxB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class HandlerC86501XxB extends Handler {
    public static final HandlerC86501XxB LIZ = new HandlerC86501XxB();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C86531Xxf.LJLIL);
    public static volatile boolean LIZJ;

    public static PriorityQueue LIZJ() {
        return (PriorityQueue) LIZIZ.getValue();
    }

    public HandlerC86501XxB() {
        super(C16880lQ.LLJJJJ());
    }

    public static void LIZ(InnerPushMessage innerPushMessage) {
        innerPushMessage.getTracker().LJIJJLI = 0L;
        innerPushMessage.getTracker().LJIL = 0L;
        innerPushMessage.getTracker().LJJ = 0L;
        innerPushMessage.getTracker().LJJI = 0L;
        innerPushMessage.getTracker().LJJIFFI = 0L;
        innerPushMessage.getTracker().LJJII = 0L;
        innerPushMessage.getTracker().LJJIII = 0L;
        innerPushMessage.getTracker().LJJIIJ = 0L;
    }

    public static void LIZLLL(InnerPushMessage innerPushMessage) {
        if (innerPushMessage.getTracker().LJIJJLI > 0) {
            C86503XxD tracker = innerPushMessage.getTracker();
            tracker.LJJIIZ = (System.currentTimeMillis() - innerPushMessage.getTracker().LJIJJLI) + tracker.LJJIIZ;
        } else if (innerPushMessage.getTracker().LJIL > 0) {
            C86503XxD tracker2 = innerPushMessage.getTracker();
            tracker2.LJJIIZI = (System.currentTimeMillis() - innerPushMessage.getTracker().LJIL) + tracker2.LJJIIZI;
        } else if (innerPushMessage.getTracker().LJJ > 0) {
            C86503XxD tracker3 = innerPushMessage.getTracker();
            tracker3.LJJIJ = (System.currentTimeMillis() - innerPushMessage.getTracker().LJJ) + tracker3.LJJIJ;
        } else if (innerPushMessage.getTracker().LJJI > 0) {
            C86503XxD tracker4 = innerPushMessage.getTracker();
            tracker4.LJJIJIIJI = (System.currentTimeMillis() - innerPushMessage.getTracker().LJJI) + tracker4.LJJIJIIJI;
        } else if (innerPushMessage.getTracker().LJJIFFI > 0) {
            C86503XxD tracker5 = innerPushMessage.getTracker();
            tracker5.LJJIJIIJIL = (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIFFI) + tracker5.LJJIJIIJIL;
        } else if (innerPushMessage.getTracker().LJJII > 0) {
            C86503XxD tracker6 = innerPushMessage.getTracker();
            tracker6.LJJIJIL = (System.currentTimeMillis() - innerPushMessage.getTracker().LJJII) + tracker6.LJJIJIL;
        } else if (innerPushMessage.getTracker().LJJIII > 0) {
            C86503XxD tracker7 = innerPushMessage.getTracker();
            tracker7.LJJIJL = (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIII) + tracker7.LJJIJL;
        } else if (innerPushMessage.getTracker().LJJIIJ > 0) {
            C86503XxD tracker8 = innerPushMessage.getTracker();
            tracker8.LJJIJLIJ = (System.currentTimeMillis() - innerPushMessage.getTracker().LJJIIJ) + tracker8.LJJIJLIJ;
        }
        LIZ(innerPushMessage);
        switch (C86516XxQ.LIZ[C86494Xx4.LJII(innerPushMessage).ordinal()]) {
            case 1:
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("handleMessageLatencyMob message:");
                LIZ2.append(innerPushMessage);
                LIZ2.append(" LIVE");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ2));
                innerPushMessage.getTracker().LJIJJLI = System.currentTimeMillis();
                return;
            case 2:
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("handleMessageLatencyMob message:");
                LIZ3.append(innerPushMessage);
                LIZ3.append(" SHOOTING");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ3));
                innerPushMessage.getTracker().LJIL = System.currentTimeMillis();
                return;
            case 3:
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("handleMessageLatencyMob message:");
                LIZ4.append(innerPushMessage);
                LIZ4.append(" ALBUM");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ4));
                innerPushMessage.getTracker().LJJ = System.currentTimeMillis();
                return;
            case 4:
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("handleMessageLatencyMob message:");
                LIZ5.append(innerPushMessage);
                LIZ5.append(" KEYBOARD");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ5));
                innerPushMessage.getTracker().LJJI = System.currentTimeMillis();
                return;
            case 5:
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("handleMessageLatencyMob message:");
                LIZ6.append(innerPushMessage);
                LIZ6.append(" COMMERCEAD");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ6));
                innerPushMessage.getTracker().LJJIFFI = System.currentTimeMillis();
                return;
            case 6:
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("handleMessageLatencyMob message:");
                LIZ7.append(innerPushMessage);
                LIZ7.append(" POPUP_WINDOW");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ7));
                innerPushMessage.getTracker().LJJII = System.currentTimeMillis();
                return;
            case 7:
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("handleMessageLatencyMob message:");
                LIZ8.append(innerPushMessage);
                LIZ8.append(" EXTERNAL_HANDLER");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ8));
                innerPushMessage.getTracker().LJJIII = System.currentTimeMillis();
                return;
            case 8:
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("handleMessageLatencyMob message:");
                LIZ9.append(innerPushMessage);
                LIZ9.append(" LANDSCAPE_ORIENTATION");
                C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ9));
                innerPushMessage.getTracker().LJJIIJ = System.currentTimeMillis();
                return;
            default:
                LIZ(innerPushMessage);
                return;
        }
    }

    public final void LJ(boolean z) {
        if (LIZJ || hasMessages(1) || LIZJ().isEmpty()) {
            return;
        }
        if (C86500XxA.LJLJJL) {
            C86478Xwo.LIZLLL("InnerPushQueueLooper", "[notifyLoop], pure mode is on, force stop looping");
            return;
        }
        InnerPushMessage innerPushMessage = (InnerPushMessage) LIZJ().peek();
        long j = 0;
        if (innerPushMessage != null) {
            if (innerPushMessage.getTracker().LJIJJ > 0) {
                C86503XxD tracker = innerPushMessage.getTracker();
                tracker.LJJIIJZLJL = (System.currentTimeMillis() - innerPushMessage.getTracker().LJIJJ) + tracker.LJJIIJZLJL;
            }
            innerPushMessage.getTracker().LJIJJ = 0L;
        }
        if (C84763XOl.LJIIJJI) {
            if (innerPushMessage != null) {
                innerPushMessage.getTracker().LJIJJ = System.currentTimeMillis();
                LIZ.getClass();
                LIZ(innerPushMessage);
                return;
            }
            return;
        }
        if (!z) {
            j = 1000;
        }
        sendEmptyMessageDelayed(1, j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        removeMessages(1);
        LIZJ = true;
        C57419MgB.LJIIIZ(C86498Xx8.LJLIL).LIZLLL(C86509XxJ.LIZ);
    }

    public static void LIZIZ(HandlerC86501XxB handlerC86501XxB, InnerPushMessage message, long j, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        handlerC86501XxB.getClass();
        o.LJIIIZ(message, "message");
        if (InnerPushReverseExp.LIZ() && ORY.LJJIJ(message.getType(), (int[]) InnerPushReverseExp.LIZJ.getValue())) {
            if (o.LJ(EF7.LJIILIIL, "local_test")) {
                C86478Xwo.LIZIZ("InnerPushQueueLooper", "reverse inner push show");
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null) {
                    AnonymousClass114.LIZ(LJIIIIZZ, R.string.g4h);
                    return;
                }
                return;
            }
            return;
        }
        if (j == 0) {
            C57419MgB.LJIIIZ(new AqS165S0100000_15(message, 915));
        } else {
            C10K.LJII(j).LIZLLL(new AgS22S0100100_15(message, j, 4));
        }
    }
}
