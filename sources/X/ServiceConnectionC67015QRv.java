package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.QRv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67015QRv implements ServiceConnection {
    public final /* synthetic */ Context LJLIL;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public ServiceConnectionC67015QRv(Context context) {
        this.LJLIL = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.LJLIL.unbindService(this);
        } catch (Throwable unused) {
        }
    }
}
