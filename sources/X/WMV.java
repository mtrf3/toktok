package X;

import Y.ARunnableS25S0300000_14;
import android.view.View;

/* loaded from: classes15.dex */
public final class WMV implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C43356Gzw LJLJI;
    public final /* synthetic */ C82158WMg LJLJJI;
    public final /* synthetic */ C82158WMg LJLJJL;
    public final /* synthetic */ Runnable LJLJJLL;
    public final /* synthetic */ C42051Get LJLJL;
    public final /* synthetic */ WMU LJLJLJ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean z;
        try {
            if (!this.LJLIL) {
                C78932UyO.LJFF(this.LJLILLLLZI);
                this.LJLILLLLZI.setVisibility(8);
            }
            C43356Gzw c43356Gzw = this.LJLJI;
            synchronized (c43356Gzw) {
                z = c43356Gzw.LIZ;
            }
            if (!z) {
                this.LJLJLJ.LIZ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL.LIZLLL());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public WMV(WMU wmu, boolean z, View view, C43356Gzw c43356Gzw, C82158WMg c82158WMg, C82158WMg c82158WMg2, ARunnableS25S0300000_14 aRunnableS25S0300000_14, C42051Get c42051Get) {
        this.LJLJLJ = wmu;
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = c43356Gzw;
        this.LJLJJI = c82158WMg;
        this.LJLJJL = c82158WMg2;
        this.LJLJJLL = aRunnableS25S0300000_14;
        this.LJLJL = c42051Get;
    }
}
