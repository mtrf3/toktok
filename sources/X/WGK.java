package X;

import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;

/* loaded from: classes15.dex */
public final class WGK implements WG8 {
    public final /* synthetic */ CutMusicPanel LIZ;

    public WGK(CutMusicPanel cutMusicPanel) {
        this.LIZ = cutMusicPanel;
    }

    @Override // X.WG8
    public final void LIZ(float f) {
        int i;
        this.LIZ.getClass();
        CutMusicPanel cutMusicPanel = this.LIZ;
        WGL wgl = cutMusicPanel.LLILL;
        if (wgl != null) {
            i = wgl.LIZJ(f);
        } else {
            i = 0;
        }
        cutMusicPanel.Gl(i);
    }

    @Override // X.WG8
    public final void LIZIZ(float f) {
        int i;
        this.LIZ.getClass();
        CutMusicPanel cutMusicPanel = this.LIZ;
        WGL wgl = cutMusicPanel.LLILL;
        if (wgl != null) {
            i = wgl.LIZJ(f);
        } else {
            i = 0;
        }
        cutMusicPanel.Gl(i);
        WGL wgl2 = this.LIZ.LLILL;
        if (wgl2 != null) {
            wgl2.LIZLLL(f);
        }
    }
}
