package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsConnectTimeoutReconnectExp;

/* renamed from: X.QWf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67129QWf implements Runnable {
    public static final RunnableC67129QWf LJLIL = new RunnableC67129QWf();

    public static void LIZ() {
        C67124QWa.LIZJ();
        if (C84763XOl.LJIIJJI && ((Boolean) WsConnectTimeoutReconnectExp.LJFF.getValue()).booleanValue()) {
            C221018lt.LJFF("WsReconnectUtils", "[reconnect], failed, only in foreground will reconnect");
        } else if (!C2NU.LIZ.LIZIZ()) {
            C221018lt.LJFF("WsReconnectUtils", "[reconnect], failed, network unavailable");
        } else {
            C67124QWa.LIZ("CONNECT_TIMEOUT");
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
