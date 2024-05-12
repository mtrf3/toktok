package X;

import android.view.KeyEvent;

/* renamed from: X.SmQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73094SmQ implements C5HC {
    public final /* synthetic */ C68322mC<ViewOnClickListenerC74332TFg> LJLIL;

    public C73094SmQ(C68322mC<ViewOnClickListenerC74332TFg> c68322mC) {
        this.LJLIL = c68322mC;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = this.LJLIL.element;
            if (viewOnClickListenerC74332TFg != null) {
                viewOnClickListenerC74332TFg.LJ();
            }
            return true;
        }
        return false;
    }
}
