package X;

import Y.ARunnableS50S0100000_14;
import android.widget.FrameLayout;

/* loaded from: classes15.dex */
public final class W0H<T> implements InterfaceC04760Gq<C0GY> {
    public final /* synthetic */ W0G LIZ;

    public W0H(W0G w0g) {
        this.LIZ = w0g;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(C0GY c0gy) {
        C0GY c0gy2 = c0gy;
        C29701Eo c29701Eo = this.LIZ.LJLJL;
        if (c29701Eo != null) {
            c29701Eo.setComposition(c0gy2);
        }
        W0G w0g = this.LIZ;
        FrameLayout frameLayout = w0g.LJLJLJ;
        if (frameLayout != null) {
            frameLayout.startAnimation(w0g.LJLLJ);
        }
        FrameLayout frameLayout2 = this.LIZ.LJLJLJ;
        if (frameLayout2 != null) {
            frameLayout2.postDelayed(new ARunnableS50S0100000_14(this, 101), 300L);
        }
        W0G w0g2 = this.LIZ;
        UYF uyf = w0g2.LJLJI;
        if (uyf != null) {
            uyf.LIZ(true, w0g2.LJLIL, W0K.LOTTIE);
        }
    }
}
