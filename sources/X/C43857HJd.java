package X;

import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.AqS81S1100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.HJd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43857HJd implements InterfaceC83508Wq0 {
    public final C29S LIZ;
    public final ShortVideoContext LIZIZ;
    public String LIZJ;

    @Override // X.InterfaceC83508Wq0
    public final void LIZ(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC83508Wq0
    public final void LIZIZ(Effect effect) {
        this.LIZJ = "";
        DiyPropParser.LJIILJJIL(IC2.LIZIZ, effect, "");
    }

    @Override // X.InterfaceC83508Wq0
    public final void LIZLLL(Effect effect) {
        int i;
        int i2;
        if (this.LIZJ.length() > 0) {
            DiyPropParser.LJIILJJIL(IC2.LIZIZ, effect, this.LIZJ);
            String str = this.LIZJ;
            if (C2060386t.LIZ(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DiyPropVideo path invalid, videoPath: ");
                LIZ.append(str);
                H78.LIZJ(X1D.LIZIZ(LIZ));
            } else {
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
                if (videoFileInfo != null) {
                    i = videoFileInfo.duration;
                    if (this.LIZIZ.LJJIJIIJIL() && (i2 = (int) this.LIZIZ.cameraComponentModel.mMaxDuration) <= i) {
                        i = i2;
                    }
                    this.LIZIZ.cameraComponentModel.curDiyPropVideo = new DiyPropVideo(this.LIZJ, i, 0L, null, 12, null);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("DiyPropVideo getVideoInfo fail, videoPath: ");
                LIZ2.append(str);
                H78.LIZJ(X1D.LIZIZ(LIZ2));
            }
            i = -1;
            if (this.LIZIZ.LJJIJIIJIL()) {
                i = i2;
            }
            this.LIZIZ.cameraComponentModel.curDiyPropVideo = new DiyPropVideo(this.LIZJ, i, 0L, null, 12, null);
        }
    }

    public C43857HJd(C29S activity, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = activity;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = "";
    }

    @Override // X.InterfaceC83508Wq0
    public final void LIZJ(String str, AqS81S1100000_14 aqS81S1100000_14) {
        IVideoLegalCheckerAndToastService videoLegalCheckerAndToastService = AVServiceImpl.LIZ().getVideoLegalCheckerAndToastService(this.LIZ);
        if (videoLegalCheckerAndToastService != null) {
            videoLegalCheckerAndToastService.isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, aqS81S1100000_14);
        }
    }
}
