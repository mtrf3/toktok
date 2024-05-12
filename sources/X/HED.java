package X;

import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HED implements HEF {
    public final /* synthetic */ C46004I3s LIZ;
    public final /* synthetic */ StitchParams LIZIZ;

    @Override // X.HEF
    public final void onStart() {
    }

    @Override // X.HEF
    public final void LIZ(int i) {
        boolean z;
        this.LIZIZ.setMusicStart(i);
        StitchParams stitchParams = this.LIZIZ;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        stitchParams.setMuted(z);
        if (i < 0) {
            this.LIZIZ.setMusic(null);
        }
        this.LIZ.LLJJI();
    }

    @Override // X.HEF
    public final void onError(Exception exc) {
        C5S1 c5s1 = new C5S1(this.LIZ.mActivity);
        c5s1.LIZJ(R.string.dse);
        c5s1.LJ();
        C46004I3s c46004I3s = this.LIZ;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = c46004I3s.LJLJJI;
        if (cutVideoTitleBarViewModel != null) {
            cutVideoTitleBarViewModel.Mv0(true);
            C135115Rz.LIZ(c46004I3s.LJLJLJ);
            C46004I3s.LLJJ(false);
            return;
        }
        o.LJIJI("titleBarViewModel");
        throw null;
    }

    public HED(C46004I3s c46004I3s, StitchParams stitchParams) {
        this.LIZ = c46004I3s;
        this.LIZIZ = stitchParams;
    }
}
