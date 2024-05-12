package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.ar.core.v;

/* renamed from: X.aSY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ServiceConnectionC93542aSY implements ServiceConnection {
    public final /* synthetic */ v LJLIL;

    public ServiceConnectionC93542aSY(v vVar) {
        this.LJLIL = vVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.LJLIL.l(iBinder);
    }
}
