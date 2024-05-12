package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCB {
    public static StickerInfo LIZ(I0N i0n) {
        Effect effect;
        String str;
        StickerInfo stickerInfo = null;
        if (i0n != null) {
            effect = C82398WVm.LIZJ(i0n);
        } else {
            effect = null;
        }
        FaceStickerBean LIZLLL = SFS.LIZLLL(effect);
        o.LJIIIIZZ(LIZLLL, "covert(stickerApiComponent?.currentEffect)");
        if (i0n != null && !o.LJ(LIZLLL, FaceStickerBean.NONE)) {
            stickerInfo = new StickerInfo(LIZLLL.getPropSource(), LIZLLL.getGradeKey(), LIZLLL.getRecId(), false, false, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT, null);
            stickerInfo.setMParentStickerId(LIZLLL.getParentId());
            stickerInfo.setMusicBeatSticker(V3N.LJJ(LIZLLL));
            stickerInfo.setWelfareActivityId(V3N.LJIIJJI(LIZLLL.getExtra(), "welfare_activity_id"));
            stickerInfo.setGameTypeSticker(V3N.LJIILL(LIZLLL));
            C43916HLk sk = i0n.sk();
            if (sk == null || (str = sk.LIZ) == null) {
                str = "-1";
            }
            stickerInfo.setPropTabId(str);
            boolean z = true;
            if (LIZLLL.getSource() != 1) {
                z = false;
            }
            stickerInfo.setOriginalSticker(z);
            stickerInfo.setAudioGraphOutput(C45804HyK.LJJIJLIJ(LIZLLL.getSdkExtra()));
        }
        return stickerInfo;
    }
}
