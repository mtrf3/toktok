package X;

import android.view.KeyEvent;

/* renamed from: X.JJh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48957JJh implements GHC {
    public final /* synthetic */ JKG LJLIL;

    public C48957JJh(JKG jkg) {
        this.LJLIL = jkg;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        if (this.LJLIL.isPlaying() && JYH.LIZIZ.LJIIJ()) {
            if (i == 24 || i == 25) {
                JKG jkg = this.LJLIL;
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                jkg.v0(j1m);
                return false;
            }
            return false;
        }
        return false;
    }
}
