package X;

import Y.ARunnableS6S0500000_14;
import android.view.View;

/* loaded from: classes15.dex */
public final class WMX implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C43356Gzw LJLJI;
    public final /* synthetic */ C82158WMg LJLJJI;
    public final /* synthetic */ C82158WMg LJLJJL;
    public final /* synthetic */ Runnable LJLJJLL;
    public final /* synthetic */ C42051Get LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ WMU LJLJLLL;

    public final void LIZ() {
        boolean z;
        if (!this.LJLIL) {
            this.LJLILLLLZI.setVisibility(8);
        }
        C43356Gzw c43356Gzw = this.LJLJI;
        synchronized (c43356Gzw) {
            z = c43356Gzw.LIZ;
        }
        if (!z) {
            this.LJLJLLL.LIZIZ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL.LIZLLL());
        } else {
            if (this.LJLIL || !this.LJLJLJ) {
                return;
            }
            this.LJLILLLLZI.setVisibility(0);
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

    public WMX(WMU wmu, boolean z, View view, C43356Gzw c43356Gzw, C82158WMg c82158WMg, C82158WMg c82158WMg2, ARunnableS6S0500000_14 aRunnableS6S0500000_14, C42051Get c42051Get, boolean z2) {
        this.LJLJLLL = wmu;
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = c43356Gzw;
        this.LJLJJI = c82158WMg;
        this.LJLJJL = c82158WMg2;
        this.LJLJJLL = aRunnableS6S0500000_14;
        this.LJLJL = c42051Get;
        this.LJLJLJ = z2;
    }
}
