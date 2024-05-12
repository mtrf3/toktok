package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.Qfe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67578Qfe implements ServiceConnection {
    public final /* synthetic */ C67574Qfa LJLIL;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.LIZIZ.LIZ("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.LJLIL.LIZ().post(new C67579Qff(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLIL.LIZIZ.LIZ("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.LJLIL.LIZ().post(new C67575Qfb(this, iBinder));
    }
}
