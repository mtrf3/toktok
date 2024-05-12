package X;

import android.view.KeyEvent;

/* renamed from: X.JUu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49256JUu implements GHC {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49251JUp LJLIL;

    public C49256JUu(ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp) {
        this.LJLIL = viewOnAttachStateChangeListenerC49251JUp;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        if (this.LJLIL.isPlaying() && JYH.LIZIZ.LJIIJ()) {
            if (i == 24 || i == 25) {
                ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp = this.LJLIL;
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                viewOnAttachStateChangeListenerC49251JUp.V(j1m);
                return false;
            }
            return false;
        }
        return false;
    }
}
