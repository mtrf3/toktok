package X;

import com.ss.android.agilelogger.ALog;

/* renamed from: X.FPj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38923FPj implements InterfaceC11190cF {
    public static final C38923FPj LIZ = new C38923FPj();

    @Override // X.InterfaceC11190cF
    public final void LIZ() {
        try {
            ALog.flush();
            ALog.forceLogSharding();
            Thread.sleep(1000L);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
