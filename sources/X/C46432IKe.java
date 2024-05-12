package X;

import Y.ARunnableS12S0101000_8;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.IKe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46432IKe {
    public static final Handler LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("PumbaaBPEABackThread");
        handlerThread.start();
        LIZ = new Handler(handlerThread.getLooper());
    }

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        LIZ.post(new ARunnableS12S0101000_8(0, interfaceC65784Pro, 40));
    }
}
