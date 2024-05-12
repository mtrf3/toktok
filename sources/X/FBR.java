package X;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes7.dex */
public final class FBR extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final FBR LJLIL = new FBR();

    public FBR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        HandlerThread handlerThread = new HandlerThread("forest_handler_thread");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
