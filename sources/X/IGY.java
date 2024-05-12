package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* loaded from: classes9.dex */
public final class IGY implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = this.LJLIL;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSpeedChanged(this.LJLILLLLZI, this.LJLJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IGY(OnUIPlayListener onUIPlayListener, String str, float f) {
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = str;
        this.LJLJI = f;
    }
}
