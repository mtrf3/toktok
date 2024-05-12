package X;

import android.view.KeyEvent;

/* loaded from: classes9.dex */
public final class JHH implements GHC {
    public static final JHH LJLIL = new JHH();

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            if (i != 24) {
                if (i == 25) {
                    j1m = J1M.TURN_DOWN_VOLUME;
                } else {
                    return false;
                }
            } else {
                j1m = J1M.TURN_UP_VOLUME;
            }
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
            return false;
        }
        return false;
    }
}
