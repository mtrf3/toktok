package com.lynx.tasm.behavior.ui.text;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* loaded from: classes15.dex */
public class UIText$$PropsSetter extends UIGroup$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIText uIText = (UIText) lynxBaseUI;
        str.getClass();
        if (!str.equals("text-selection")) {
            if (!str.equals("accessibility-label")) {
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            } else {
                uIText.setAccessibilityLabel(vpa.LIZLLL(str));
                return;
            }
        }
        uIText.setEnableTextSelection(vpa.LIZIZ(str, false));
    }
}
