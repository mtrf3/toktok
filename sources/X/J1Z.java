package X;

import android.view.KeyEvent;

/* loaded from: classes9.dex */
public final class J1Z implements GHC {
    public final /* synthetic */ JI9 LJLIL;

    public J1Z(JI9 ji9) {
        this.LJLIL = ji9;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        if (this.LJLIL.isPlaying() && JYH.LIZIZ.LJIIJ()) {
            if (i == 24 || i == 25) {
                JI9 ji9 = this.LJLIL;
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                ji9.T(j1m);
                return false;
            }
            return false;
        }
        return false;
    }
}
