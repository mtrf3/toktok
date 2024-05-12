package X;

import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WGI implements W1X {
    public final /* synthetic */ CutMusicPanel LIZ;

    @Override // X.W1X
    public final void LIZIZ() {
    }

    public WGI(CutMusicPanel cutMusicPanel) {
        this.LIZ = cutMusicPanel;
    }

    @Override // X.W1X
    public final void LIZ(int i) {
        Boolean bool;
        CutMusicPanel cutMusicPanel = this.LIZ;
        if (i != cutMusicPanel.LLIIL) {
            float xl = CutMusicPanel.xl(cutMusicPanel.LLIIIL, cutMusicPanel.LLIIIILZ);
            W1W w1w = this.LIZ.LLIIIZ;
            if (w1w != null) {
                int Dl = CutMusicPanel.Dl(xl);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(xl);
                LIZ.append('x');
                w1w.LIZIZ(Dl, X1D.LIZIZ(LIZ));
            }
            CutMusicPanel cutMusicPanel2 = this.LIZ;
            WGM wgm = cutMusicPanel2.LLILLIZIL;
            if (wgm != null) {
                bool = Boolean.valueOf(wgm.LIZ(cutMusicPanel2.Al(i)));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                float Al = this.LIZ.Al(i);
                CutMusicPanel cutMusicPanel3 = this.LIZ;
                cutMusicPanel3.LLIIL = i;
                cutMusicPanel3.LLIIIILZ = cutMusicPanel3.Al(i);
                XVD xvd = this.LIZ.LLIL;
                if (xvd != null) {
                    XVC.LIZJ(xvd, Al, false);
                } else {
                    o.LJIJI("mInfo");
                    throw null;
                }
            }
        }
    }
}
