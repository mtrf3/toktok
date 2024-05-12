package X;

import android.view.KeyEvent;

/* loaded from: classes9.dex */
public final class JHO implements GHC {
    public final /* synthetic */ JHN LJLIL;

    public JHO(JHN jhn) {
        this.LJLIL = jhn;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.LJLIL.isPlaying() && JYH.LIZIZ.LJIIJ() && (i == 24 || i == 25)) {
            this.LJLIL.LJFF("modifySoundStatus", C113554cx.LJJJLZIJ(new OSZ("isMute", 0)));
        }
        return false;
    }
}
