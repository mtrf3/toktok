package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;

/* loaded from: classes15.dex */
public final class WGS implements InterfaceC82009WGn {
    public final /* synthetic */ PreviewImageScene LIZ;

    @Override // X.InterfaceC82009WGn
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC82009WGn
    public final void LIZIZ() {
        PreviewImageScene previewImageScene = this.LIZ;
        if (previewImageScene.LJLIL) {
            WGT wgt = previewImageScene.LJLJJI;
            if (wgt != null) {
                wgt.LJJJJLL();
                return;
            }
            return;
        }
        previewImageScene.LLJILJILJ(true);
    }

    @Override // X.InterfaceC82009WGn
    public final void onExit() {
        this.LIZ.LLJILJILJ(true);
    }

    @Override // X.InterfaceC82009WGn
    public final void onScaleBegin() {
        WGT wgt = this.LIZ.LJLJJI;
        if (wgt != null) {
            wgt.onScaleBegin();
        }
    }

    public WGS(PreviewImageScene previewImageScene) {
        this.LIZ = previewImageScene;
    }

    @Override // X.InterfaceC82009WGn
    public final void LIZ(float f) {
        WGT wgt = this.LIZ.LJLJJI;
        if (wgt != null) {
            wgt.LJIIJJI(f);
        }
    }

    @Override // X.InterfaceC82009WGn
    public final void LJLJI(float f) {
        WGT wgt = this.LIZ.LJLJJI;
        if (wgt != null) {
            wgt.LLIZ();
        }
    }
}
