package X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes12.dex */
public final class R1B implements Runnable {
    public final /* synthetic */ LifecycleCallback LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ R17 LJLJI;

    public R1B(R17 r17, LifecycleCallback lifecycleCallback, String str) {
        this.LJLJI = r17;
        this.LJLIL = lifecycleCallback;
        this.LJLILLLLZI = str;
    }

    public final void LIZ() {
        Bundle bundle;
        R17 r17 = this.LJLJI;
        if (r17.LJLILLLLZI > 0) {
            LifecycleCallback lifecycleCallback = this.LJLIL;
            Bundle bundle2 = r17.LJLJI;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.LJLILLLLZI);
            } else {
                bundle = null;
            }
            lifecycleCallback.LJ(bundle);
        }
        if (this.LJLJI.LJLILLLLZI >= 2) {
            this.LJLIL.LJII();
        }
        if (this.LJLJI.LJLILLLLZI >= 3) {
            this.LJLIL.LJFF();
        }
        if (this.LJLJI.LJLILLLLZI >= 4) {
            this.LJLIL.LJIIIIZZ();
        }
        if (this.LJLJI.LJLILLLLZI >= 5) {
            this.LJLIL.getClass();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
