package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.Qfp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67589Qfp implements ServiceConnection {
    public final /* synthetic */ C67585Qfl LJLIL;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.LIZIZ.LIZJ("ServiceConnectionImpl.onServiceDisconnected(%s)", 4, new Object[]{componentName});
        this.LJLIL.LIZJ(new C67588Qfo(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLIL.LIZIZ.LIZJ("ServiceConnectionImpl.onServiceConnected(%s)", 4, new Object[]{componentName});
        this.LJLIL.LIZJ(new C67586Qfm(this, iBinder));
    }
}
