package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class X1J extends X1L {
    public int LJLIL;
    public final X1I LJLILLLLZI;

    public X1J() {
        X1K.LJLJI.getClass();
        this.LJLILLLLZI = X1K.LJLIL;
    }

    @Override // X.X1L, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.LJLIL + 1;
        this.LJLIL = i;
        if (i > 0) {
            X1I x1i = this.LJLILLLLZI;
            x1i.getClass();
            try {
                Iterator it = ((ArrayList) x1i.LIZ).iterator();
                while (it.hasNext()) {
                    X1N x1n = (X1N) it.next();
                    if (activity != null) {
                        C16880lQ.LLLLJ(activity);
                    }
                    x1n.LIZ();
                }
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        this.LJLILLLLZI.getClass();
    }

    @Override // X.X1L, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        if (i <= 0) {
            X1I x1i = this.LJLILLLLZI;
            x1i.getClass();
            try {
                Iterator it = ((ArrayList) x1i.LIZIZ).iterator();
                while (it.hasNext()) {
                    X1M x1m = (X1M) it.next();
                    if (activity != null) {
                        C16880lQ.LLLLJ(activity);
                    }
                    x1m.LIZ();
                }
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        this.LJLILLLLZI.getClass();
    }
}
