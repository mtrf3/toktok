package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public final class IGR implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ IPH LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = this.LJLIL;
            if (onUIPlayListener != null) {
                IPH iph = this.LJLILLLLZI;
                long j = this.LJLJI;
                iph.LIZLLL = j;
                iph.LJFF = j;
                iph.LJ = this.LJLJJI;
                onUIPlayListener.onPausePlay(this.LJLJJL, iph);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IGR(OnUIPlayListener onUIPlayListener, IPH iph, long j, long j2, String str) {
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = iph;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = str;
    }
}
