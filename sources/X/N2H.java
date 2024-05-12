package X;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N2H extends AnonymousClass007 {
    public final WeakReference<N2G> LJLIL;

    public N2H(C58682N1i c58682N1i) {
        this.LJLIL = new WeakReference<>(c58682N1i);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        N2G n2g = this.LJLIL.get();
        if (n2g != null) {
            n2g.LIZ();
        }
    }

    @Override // X.AnonymousClass007
    public final void onCustomTabsServiceConnected(ComponentName name, AnonymousClass003 client) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(client, "client");
        N2G n2g = this.LJLIL.get();
        if (n2g != null) {
            n2g.LIZIZ(client);
        }
    }
}
