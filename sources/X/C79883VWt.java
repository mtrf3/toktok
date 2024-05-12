package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.jvm.internal.o;

/* renamed from: X.VWt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79883VWt implements AlphaPlayerAction {
    public final /* synthetic */ LynxAlphaVideo LIZ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void endAction() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("endAction action, url is ");
        C13870gZ.LIZJ(LIZ, this.LIZ.LJLL, LIZ, 2, "x-alpha-video");
        ((C79885VWv) this.LIZ.mView).setMIsShowPoster(false);
        ((C79885VWv) this.LIZ.mView).setMIsShowLastFrame(true);
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        ((C79885VWv) lynxAlphaVideo.mView).setMLastFrame(lynxAlphaVideo.LJLJLLL);
        C79885VWv c79885VWv = (C79885VWv) this.LIZ.mView;
        c79885VWv.LJLJJI = null;
        c79885VWv.invalidate();
        LynxAlphaVideo lynxAlphaVideo2 = this.LIZ;
        lynxAlphaVideo2.getClass();
        lynxAlphaVideo2.LJJIIJ("completion", LynxAlphaVideo.LJJ(2, "play video success", null));
        PlayerController playerController = this.LIZ.LJLIL;
        if (playerController != null) {
            playerController.stop();
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void startAction() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start action, url is ");
        C13870gZ.LIZJ(LIZ, this.LIZ.LJLL, LIZ, 2, "x-alpha-video");
        ((C79885VWv) this.LIZ.mView).setMIsShowPoster(false);
        ((C79885VWv) this.LIZ.mView).setMIsShowLastFrame(false);
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        ((C79885VWv) lynxAlphaVideo.mView).LJLJJL = null;
        lynxAlphaVideo.LJJIIJ("start", LynxAlphaVideo.LJJ(1, "start video", null));
    }

    public C79883VWt(LynxAlphaVideo lynxAlphaVideo) {
        this.LIZ = lynxAlphaVideo;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
        o.LJIIJ(scaleType, "scaleType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoSizeChange: videoWidth = ");
        LIZ.append(i);
        LIZ.append(" videoHeight = ");
        LIZ.append(i2);
        LIZ.append(" scaleType = ");
        LIZ.append(scaleType.name());
        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
    }
}
