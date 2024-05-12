package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* renamed from: X.IGc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC46326IGc implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = this.LJLIL;
            if (onUIPlayListener instanceof InterfaceC46324IGa) {
                ((InterfaceC46324IGa) onUIPlayListener).xH();
            }
            OnUIPlayListener onUIPlayListener2 = this.LJLIL;
            if (onUIPlayListener2 != null) {
                onUIPlayListener2.onBufferedPercent(this.LJLJI, this.LJLILLLLZI, this.LJLJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC46326IGc(OnUIPlayListener onUIPlayListener, long j, String str, int i) {
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = i;
    }
}
