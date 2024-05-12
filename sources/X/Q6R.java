package X;

import android.content.ComponentName;
import android.os.RemoteException;

/* loaded from: classes12.dex */
public final class Q6R extends AnonymousClass007 {
    public final /* synthetic */ Q6S LJLIL;

    public Q6R(Q6S q6s) {
        this.LJLIL = q6s;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Q6T.LIZ("CustomTabsService is disconnected", new Object[0]);
        this.LJLIL.LIZIZ.set(null);
        this.LJLIL.LIZJ.countDown();
    }

    @Override // X.AnonymousClass007
    public final void onCustomTabsServiceConnected(ComponentName componentName, AnonymousClass003 anonymousClass003) {
        Q6T.LIZ("CustomTabsService is connected", new Object[0]);
        anonymousClass003.getClass();
        try {
            anonymousClass003.LIZ.LLZLLIL(0L);
        } catch (RemoteException unused) {
        }
        this.LJLIL.LIZIZ.set(anonymousClass003);
        this.LJLIL.LIZJ.countDown();
    }
}
