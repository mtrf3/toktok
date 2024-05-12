package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.QWg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67130QWg implements Runnable {
    public static final RunnableC67130QWg LJLIL = new RunnableC67130QWg();

    public static void LIZ() {
        QPY.LIZ("WsReconnectUtils", "[stopReconnectTimer]");
        ScheduledFuture<?> scheduledFuture = QPP.LIZ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        QPP.LIZ = null;
        if (C84763XOl.LJIIJJI) {
            QPY.LIZ("WsReconnectUtils", "[reconnect], failed, only in foreground will reconnect");
        } else if (!C2NU.LIZ.LIZIZ()) {
            QPY.LIZ("WsReconnectUtils", "[reconnect], failed, network unavailable");
        } else {
            C67128QWe.LIZIZ.LJII("CONNECT_TIMEOUT");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
