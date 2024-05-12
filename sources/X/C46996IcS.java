package X;

import android.os.HandlerThread;

/* renamed from: X.IcS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46996IcS implements IXI {
    @Override // X.IXI
    public final void LJI(IX7 ix7, HandlerThread handlerThread) {
        if (handlerThread == null || handlerThread.getLooper() == C16880lQ.LLJJJJ()) {
            return;
        }
        handlerThread.quitSafely();
    }
}
