package com.bytedance.ies.xelement.input;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class LynxInputView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxInputView lynxInputView = (LynxInputView) lynxBaseUI;
        str.getClass();
        if (!str.equals("password")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxInputView.setIsPassword(vpa.LIZIZ(str, false));
        }
    }
}
