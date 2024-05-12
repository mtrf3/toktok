package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public final class IPI implements Runnable {
    public final /* synthetic */ IPH LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ IX7 LJLJJL;

    public final void LIZ() {
        int i;
        IX7 ix7 = this.LJLJJL;
        OnUIPlayListener onUIPlayListener = ix7.LJIIJ;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPreparePlay(ix7.LIZ);
            IPH iph = this.LJLIL;
            long j = this.LJLILLLLZI;
            iph.LIZLLL = j;
            iph.LJFF = j;
            iph.LJ = this.LJLJI;
            if (this.LJLJJI) {
                i = 2;
            } else {
                i = 3;
            }
            iph.LJIIJ = i;
            IX7 ix72 = this.LJLJJL;
            iph.LJI = ix72.LIZJ;
            IX4 ix4 = ix72.LJII;
            iph.LJIILJJIL = ix4.LLIFFJFJJ;
            iph.LJIIIIZZ = null;
            iph.LJIIJJI = ix4.LJLJLJ;
            try {
                ix72.LJIIJ.onPreparePlay(ix72.LIZ, iph);
            } catch (AbstractMethodError e) {
                e.printStackTrace();
            }
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

    public IPI(IX7 ix7, IPH iph, long j, long j2, boolean z) {
        this.LJLJJL = ix7;
        this.LJLIL = iph;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = z;
    }
}
