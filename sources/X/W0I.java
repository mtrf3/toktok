package X;

import android.widget.FrameLayout;

/* loaded from: classes15.dex */
public final class W0I<T> implements InterfaceC04760Gq<Throwable> {
    public final /* synthetic */ W0G LIZ;

    public W0I(W0G w0g) {
        this.LIZ = w0g;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Throwable th) {
        W0G w0g = this.LIZ;
        FrameLayout frameLayout = w0g.LJLJJI;
        if (frameLayout != null) {
            frameLayout.postDelayed(w0g.LJLLILLLL, 5000L);
        }
        W0G w0g2 = this.LIZ;
        UYF uyf = w0g2.LJLJI;
        if (uyf != null) {
            uyf.LIZ(false, w0g2.LJLIL, W0K.LOTTIE);
        }
    }
}
