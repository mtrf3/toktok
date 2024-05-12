package X;

import com.ss.android.agilelogger.ALog;

/* renamed from: X.FPi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38922FPi implements InterfaceC11190cF {
    public static final C38922FPi LIZ = new C38922FPi();

    @Override // X.InterfaceC11190cF
    public final void LIZ() {
        try {
            ALog.asyncFlush();
            ALog.forceLogSharding();
            Thread.sleep(1000L);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
