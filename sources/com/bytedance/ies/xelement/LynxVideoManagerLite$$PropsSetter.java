package com.bytedance.ies.xelement;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxVideoManagerLite$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxVideoManagerLite lynxVideoManagerLite = (LynxVideoManagerLite) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1699818261:
                if (str.equals("enableplaylistener")) {
                    lynxVideoManagerLite.setEnablePlayListener(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1664825047:
                if (str.equals("singleplayer")) {
                    lynxVideoManagerLite.setSinglePlayer(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1531319052:
                if (str.equals("performanceLog")) {
                    lynxVideoManagerLite.setPerformanceLog(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoManagerLite.setObjectFit(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoManagerLite.setPoster(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoManagerLite.setControl(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoManagerLite.setVolume(vpa.LJ(str, 0.0f));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -318476791:
                if (str.equals("preload")) {
                    lynxVideoManagerLite.setPreload(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoManagerLite.setSrc(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoManagerLite.setLoop(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoManagerLite.setRate(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoManagerLite.setMuted(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoManagerLite.setInitTime(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 850708551:
                if (str.equals("log-extra")) {
                    lynxVideoManagerLite.setLogExtra(vpa.LJI(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoManagerLite.setAutoLifecycle(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1331794760:
                if (str.equals("video-tag")) {
                    lynxVideoManagerLite.setVideoTag(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoManagerLite.setAutoPlay(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1933829272:
                if (str.equals("devicechangeaware")) {
                    lynxVideoManagerLite.setDeviceChangeAware(vpa.LIZIZ(str, false));
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
