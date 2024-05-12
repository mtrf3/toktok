package X;

import Y.AfS59S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEC implements InterfaceC44507HdP {
    public final /* synthetic */ C46004I3s LIZ;
    public final /* synthetic */ C68322mC<Workspace> LIZIZ;
    public final /* synthetic */ StitchParams LIZJ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        long longValue;
        long longValue2;
        long duration;
        String musicPath;
        EditVideoSegment videoSegment;
        String audioPath;
        String path = this.LIZIZ.element.E().getPath();
        o.LJIIIIZZ(path, "workspace.concatVideoFile.path");
        this.LIZJ.setVideoSegment(new EditVideoSegment(path, this.LIZIZ.element.LJJJJLI().getPath(), C78926UyI.LJJJLZIJ(this.LIZIZ.element.E().getPath())));
        Long l = this.LIZ.LJJJ().getPlayBoundary().LIZIZ;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        Long l2 = this.LIZ.LJJJ().getPlayBoundary().LIZ;
        if (l2 == null) {
            longValue2 = -1;
        } else {
            longValue2 = l2.longValue();
        }
        StitchParams stitchParams = this.LIZJ;
        if (longValue != -1 && longValue2 != -1) {
            duration = longValue - longValue2;
        } else {
            duration = C78926UyI.LJJJLZIJ(this.LIZIZ.element.E().getPath()).getDuration();
        }
        stitchParams.setDuration(duration);
        if (!this.LIZJ.isPGCMusic() || (musicPath = this.LIZJ.getMusicPath()) == null || musicPath.length() == 0) {
            this.LIZJ.setMusic(null);
            this.LIZ.LLJJI();
            return;
        }
        C46004I3s c46004I3s = this.LIZ;
        StitchParams stitchParams2 = this.LIZJ;
        c46004I3s.getClass();
        String musicPath2 = stitchParams2.getMusicPath();
        if (musicPath2 == null || (videoSegment = stitchParams2.getVideoSegment()) == null || (audioPath = videoSegment.getAudioPath()) == null) {
            return;
        }
        VECutVideoPresenter LLJILJILJ = c46004I3s.LLJILJILJ();
        HED hed = new HED(c46004I3s, stitchParams2);
        LLJILJILJ.getClass();
        AbstractC73672Svk.LJIIJ(new HEE(hed, musicPath2, audioPath)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(hed, 27), new AfS59S0100000_7(hed, 28));
    }

    @Override // X.InterfaceC44507HdP
    public final void LIZ(boolean z) {
        this.LIZ.getClass();
        if (!z) {
            C46004I3s c46004I3s = this.LIZ;
            c46004I3s.LJLJLJ = ProgressDialogC173686rk.LIZJ(c46004I3s.mActivity, c46004I3s.getResources().getString(R.string.ra6));
            ProgressDialogC173686rk progressDialogC173686rk = this.LIZ.LJLJLJ;
            if (progressDialogC173686rk != null) {
                progressDialogC173686rk.setIndeterminate(false);
            }
            C46004I3s.LLJJ(true);
        }
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        ProgressDialogC173686rk progressDialogC173686rk = this.LIZ.LJLJLJ;
        if (progressDialogC173686rk != null && progressDialogC173686rk.isShowing()) {
            progressDialogC173686rk.setProgress((int) (f * 100));
        }
    }

    public HEC(C46004I3s c46004I3s, C68322mC<Workspace> c68322mC, StitchParams stitchParams) {
        this.LIZ = c46004I3s;
        this.LIZIZ = c68322mC;
        this.LIZJ = stitchParams;
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        String string = this.LIZ.getString(R.string.dse, Integer.valueOf(i));
        o.LJIIIIZZ(string, "getString(R.string.concat_error, error)");
        C5S1 c5s1 = new C5S1(this.LIZ.mActivity);
        c5s1.LIZLLL(string);
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
}
