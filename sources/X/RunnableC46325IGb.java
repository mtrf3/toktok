package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* renamed from: X.IGb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC46325IGb implements Runnable {
    public final /* synthetic */ OnUIPlayListener LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

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
                onUIPlayListener2.onBufferedTimeMs(this.LJLJI, this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC46325IGb(OnUIPlayListener onUIPlayListener, long j, String str) {
        this.LJLIL = onUIPlayListener;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
    }
}
