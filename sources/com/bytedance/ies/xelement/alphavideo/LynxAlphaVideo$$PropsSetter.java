package com.bytedance.ies.xelement.alphavideo;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxAlphaVideo$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2133601602:
                if (str.equals("keep-last-frame")) {
                    lynxAlphaVideo.setKeepLastFrame(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -982450867:
                if (str.equals("poster")) {
                    lynxAlphaVideo.setPoster(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -317044449:
                if (str.equals("frame-hold")) {
                    lynxAlphaVideo.setFrameHold(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    lynxAlphaVideo.setSrc(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAlphaVideo.setLoop(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 838895478:
                if (str.equals("last-frame")) {
                    lynxAlphaVideo.setLastFrame(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1026299997:
                if (str.equals("android-ignore-attach-status")) {
                    lynxAlphaVideo.setAndroidIgnoreAttachStatus(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAlphaVideo.setAutoPlay(vpa.LIZIZ(str, true));
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
