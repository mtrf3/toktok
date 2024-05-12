package com.bytedance.ies.xelement;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxVideoManager$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxVideoManager lynxVideoManager = (LynxVideoManager) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1664825047:
                if (str.equals("singleplayer")) {
                    lynxVideoManager.setSinglePlayer(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1596019157:
                if (str.equals("videowidth")) {
                    lynxVideoManager.setVideoWidth(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1531319052:
                if (str.equals("performanceLog")) {
                    lynxVideoManager.setPerformanceLog(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoManager.setObjectFit(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoManager.setPoster(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoManager.setControl(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoManager.setVolume(vpa.LJ(str, 0.0f));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -318476791:
                if (str.equals("preload")) {
                    lynxVideoManager.setPreload(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoManager.setSrc(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoManager.setLoop(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoManager.setRate(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoManager.setMuted(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 139108611:
                if (str.equals("singleplayerscene")) {
                    lynxVideoManager.setSinglePlayerScene(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoManager.setInitTime(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 850708551:
                if (str.equals("log-extra")) {
                    lynxVideoManager.setLogExtra(vpa.LJI(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoManager.setAutoLifecycle(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoManager.setAutoPlay(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1630018914:
                if (str.equals("videoheight")) {
                    lynxVideoManager.setVideoHeight(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1933829272:
                if (str.equals("devicechangeaware")) {
                    lynxVideoManager.setDeviceChangeAware(vpa.LIZIZ(str, false));
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
