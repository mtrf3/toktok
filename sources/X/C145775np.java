package X;

import android.os.HandlerThread;

/* renamed from: X.5np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145775np {
    public static final HandlerThread LIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("ve-async-utils");
        handlerThread.start();
        LIZ = handlerThread;
    }
}
