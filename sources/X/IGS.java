package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public final class IGS implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = this.LJLIL;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayProgressChange(this.LJLILLLLZI);
                this.LJLIL.onPlayProgressChange(this.LJLJI, this.LJLJJI, this.LJLJJL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IGS(OnUIPlayListener onUIPlayListener, float f, String str, long j, long j2) {
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = f;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = j2;
    }
}
