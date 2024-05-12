package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.POk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64378POk extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C64378POk LJLIL = new C64378POk();

    public C64378POk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        Looper looper;
        C64375POh.LIZ.LIZ();
        HandlerThread handlerThread = C64375POh.LIZLLL;
        if (handlerThread == null || (looper = handlerThread.getLooper()) == null) {
            return null;
        }
        return new Handler(looper);
    }
}
