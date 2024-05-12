package X;

import android.content.ComponentName;

/* renamed from: X.Qlf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67951Qlf implements Runnable {
    public final /* synthetic */ ComponentName LJLIL;
    public final /* synthetic */ ServiceConnectionC67949Qld LJLILLLLZI;

    public RunnableC67951Qlf(ServiceConnectionC67949Qld serviceConnectionC67949Qld, ComponentName componentName) {
        this.LJLILLLLZI = serviceConnectionC67949Qld;
        this.LJLIL = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo.LJIJ(this.LJLILLLLZI.LJLJI, this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
