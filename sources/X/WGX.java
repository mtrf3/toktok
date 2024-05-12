package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes15.dex */
public final class WGX implements InterfaceC82009WGn {
    public final /* synthetic */ PreviewVideoScene LIZ;

    @Override // X.InterfaceC82009WGn
    public final void LIZIZ() {
        PreviewVideoScene previewVideoScene = this.LIZ;
        if (previewVideoScene.LJLIL) {
            WGT wgt = previewVideoScene.LJLJLJ;
            if (wgt != null) {
                wgt.LJJJJLL();
                return;
            }
            return;
        }
        previewVideoScene.LLJJ(true);
    }

    @Override // X.InterfaceC82009WGn
    public final void LJIIJ() {
        WGT wgt;
        PreviewVideoScene previewVideoScene = this.LIZ;
        MyMediaModel myMediaModel = previewVideoScene.LJLJL;
        if (myMediaModel != null && myMediaModel.libraryState != null && (wgt = previewVideoScene.LJLJLJ) != null) {
            wgt.LLIIL(myMediaModel);
        }
    }

    @Override // X.InterfaceC82009WGn
    public final void onExit() {
        this.LIZ.LLJJ(true);
    }

    @Override // X.InterfaceC82009WGn
    public final void onScaleBegin() {
        WGT wgt = this.LIZ.LJLJLJ;
        if (wgt != null) {
            wgt.onScaleBegin();
        }
    }

    public WGX(PreviewVideoScene previewVideoScene) {
        this.LIZ = previewVideoScene;
    }

    @Override // X.InterfaceC82009WGn
    public final void LIZ(float f) {
        WGT wgt = this.LIZ.LJLJLJ;
        if (wgt != null) {
            wgt.LJIIJJI(f);
        }
        TTVideoEngine tTVideoEngine = this.LIZ.LJLL;
        if (tTVideoEngine != null) {
            if (f < 1.0f) {
                tTVideoEngine.LJJL();
            } else if (f == 1.0f) {
                tTVideoEngine.LJJLI();
            }
        }
        YO7 LLJJIJIL = this.LIZ.LLJJIJIL();
        if (LLJJIJIL != null && C78983UzD.LJJJJIZL(LLJJIJIL) && f == 1.0f && this.LIZ.isVisible()) {
            PreviewVideoScene previewVideoScene = this.LIZ;
            if (!previewVideoScene.LLII) {
                previewVideoScene.LLJJLIIIJLLLLLLLZ();
            }
        }
    }

    @Override // X.InterfaceC82009WGn
    public final void LJLJI(float f) {
        WGT wgt = this.LIZ.LJLJLJ;
        if (wgt != null) {
            wgt.LLIZ();
        }
    }
}
