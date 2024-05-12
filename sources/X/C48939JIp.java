package X;

import android.view.KeyEvent;

/* renamed from: X.JIp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48939JIp implements GHC {
    public final /* synthetic */ C48948JIy LJLIL;

    public C48939JIp(C48948JIy c48948JIy) {
        this.LJLIL = c48948JIy;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        if (this.LJLIL.LJLJLLL.getLiveCore().isPlaying() && JYH.LIZIZ.LJIIJ()) {
            if (i == 24 || i == 25) {
                C48948JIy c48948JIy = this.LJLIL;
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                c48948JIy.Q(j1m);
                return false;
            }
            return false;
        }
        return false;
    }
}
