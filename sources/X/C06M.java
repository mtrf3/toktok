package X;

import android.os.HandlerThread;

/* renamed from: X.06M, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C06M {
    public static HandlerThread LIZ(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }
}
