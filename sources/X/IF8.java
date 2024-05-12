package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public final class IF8 implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ float LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = this.LJLIL;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekStart(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IF8(OnUIPlayListener onUIPlayListener, String str, int i, float f) {
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = f;
    }
}
