package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.VRx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class HandlerThreadC79757VRx extends HandlerThread {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public volatile TC2 LJLIL;

    public HandlerThreadC79757VRx() {
        super("TextLayoutWarmer", 10);
        start();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.LJLIL = new TC2(Looper.myLooper());
    }
}
