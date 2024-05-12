package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I26 implements I0O {
    public final ActivityC45651qj LIZ;
    public final ShortVideoContext LIZIZ;
    public final I0N LIZJ;
    public FaceStickerBean LIZLLL;
    public final WLB LJ;

    public final I27 LIZ() {
        return this.LJ.cE().LIZ();
    }

    public final void LIZIZ(FaceStickerBean faceStickerBean) {
        AVMusic extractAVMusic;
        Integer num;
        String forceBindMusicPath;
        if (this.LIZ.isFinishing() || this.LIZIZ.LJJJI()) {
            return;
        }
        HCA hca = this.LIZIZ.cameraComponentModel.mDurings;
        if ((hca == null || hca.isEmpty()) && faceStickerBean != null && !o.LJ(faceStickerBean, this.LIZLLL)) {
            if (faceStickerBean.isForceBind() && C32151Nz.LJJIIZI(faceStickerBean.getMusicIds()) && ((extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZIZ.creativeModel.musicBuzModel)) == null || extractAVMusic.getMusicPriority() <= -1)) {
                if (UC0.LJJIII(faceStickerBean) == null || (forceBindMusicPath = faceStickerBean.getForceBindMusicPath()) == null || forceBindMusicPath.length() == 0) {
                    num = null;
                } else {
                    num = 1;
                }
                I27 LIZ = LIZ();
                if (LIZ != null) {
                    LIZ.showMusicTips(num);
                }
            }
            this.LIZLLL = faceStickerBean;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I26.LIZJ(com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, boolean):void");
    }

    public I26(C82622Wbi diContainer, C29S activity, LifecycleOwner lifecycleOwner, ShortVideoContext shortVideoContext, I0N stickerApiComponent) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        this.LIZ = activity;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = stickerApiComponent;
        this.LJ = (WLB) diContainer.LJ(WLB.class, null);
        stickerApiComponent.KL().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 74));
        stickerApiComponent.LLLLL().LJIIIIZZ().LJIILL().observe(lifecycleOwner, new AObserverS75S0100000_7(this, 26));
        stickerApiComponent.LLLLL().LJIIIIZZ().LIZ().observe(lifecycleOwner, new AObserverS75S0100000_7(this, 27));
        stickerApiComponent.LLLLL().LJIIIIZZ().LJI().observe(lifecycleOwner, new AObserverS75S0100000_7(this, 28));
        stickerApiComponent.aZ().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 100));
        stickerApiComponent.sF().LIZLLL(lifecycleOwner, new AObjectS86S0100000_7(this, 101));
    }
}
