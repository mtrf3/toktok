package com.bytedance.ies.xelement.video.pro;

import X.VPA;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxVideoUI$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxVideoUI lynxVideoUI = (LynxVideoUI) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoUI.setObjectFit(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoUI.setPoster(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoUI.setControl(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoUI.setVolume(vpa.LJ(str, 0.0f));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -642624357:
                if (str.equals("preload-key")) {
                    lynxVideoUI.setPreloadKey(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -17124500:
                if (str.equals("cache-size")) {
                    lynxVideoUI.setCacheSize(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoUI.setSrc(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoUI.setLoop(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoUI.setRate(vpa.LIZJ(str, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 94416770:
                if (str.equals("cache")) {
                    lynxVideoUI.setCache(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoUI.setMuted(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoUI.setInitTime(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoUI.setAutoLifeCycle(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1331794760:
                if (str.equals("video-tag")) {
                    lynxVideoUI.setVideoTag(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoUI.setAutoPlay(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            default:
                super.LIZ(lynxBaseUI, str, vpa);
                return;
        }
    }
}
