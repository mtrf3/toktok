package X;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q5N extends AnonymousClass007 {
    public static AnonymousClass003 LJLIL;
    public static AnonymousClass008 LJLILLLLZI;
    public static final ReentrantLock LJLJI = new ReentrantLock();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o.LJIIIZ(componentName, "componentName");
    }

    @Override // X.AnonymousClass007
    public final void onCustomTabsServiceConnected(ComponentName name, AnonymousClass003 newClient) {
        AnonymousClass003 anonymousClass003;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(newClient, "newClient");
        try {
            newClient.LIZ.LLZLLIL(0L);
        } catch (RemoteException unused) {
        }
        LJLIL = newClient;
        ReentrantLock reentrantLock = LJLJI;
        reentrantLock.lock();
        if (LJLILLLLZI == null && (anonymousClass003 = LJLIL) != null) {
            LJLILLLLZI = anonymousClass003.LIZIZ(null);
        }
        reentrantLock.unlock();
    }
}
