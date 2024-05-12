package X;

import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public final class G5V implements InterfaceC40961G5t {
    public final /* synthetic */ G63 LIZ;
    public final /* synthetic */ AI8 LIZIZ;
    public final /* synthetic */ VideoPublishContainerScene LIZJ;

    @Override // X.InterfaceC40961G5t
    public final void LIZ() {
        this.LIZ.LJIIJ = false;
    }

    @Override // X.InterfaceC40961G5t
    public final void LIZIZ() {
        this.LIZ.LJ = true;
        ((AEY) this.LIZIZ.getAccessory()).LJIILIIL(true);
        this.LIZ.LJIIJ = false;
        this.LIZJ.LLILZLL.creativeModel.privacySettingModel.aigcInfo.manualChangeSwitch = true;
    }

    public G5V(VideoPublishContainerScene videoPublishContainerScene, G63 g63, AI8 ai8) {
        this.LIZJ = videoPublishContainerScene;
        this.LIZ = g63;
        this.LIZIZ = ai8;
    }
}
