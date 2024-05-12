package com.bytedance.ies.xelement.audiott;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxAudioTTView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxAudioTTView lynxAudioTTView = (LynxAudioTTView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1426991399:
                if (str.equals("enableasync")) {
                    lynxAudioTTView.setEnableAsync(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    lynxAudioTTView.setSrc(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAudioTTView.setLoop(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 570418373:
                if (str.equals("interval")) {
                    lynxAudioTTView.setUpdateInterval(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 795307910:
                if (str.equals("headers")) {
                    lynxAudioTTView.setHeaders(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAudioTTView.isAutoPlay(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2096002969:
                if (str.equals("pause-on-hide")) {
                    lynxAudioTTView.setPauseOnHide(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2096812443:
                if (str.equals("playertype")) {
                    lynxAudioTTView.setPlayerType(vpa.LJII(str));
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
