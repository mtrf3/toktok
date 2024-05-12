package X;

import android.os.HandlerThread;

/* loaded from: classes9.dex */
public class J2Y extends AbstractC48851JFf {
    public J2Y() {
        super(1);
    }

    @Override // X.AbstractC48851JFf
    public final Object LIZIZ(Object[] objArr) {
        HandlerThread handlerThread = new HandlerThread("sync-sdk-v2");
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
