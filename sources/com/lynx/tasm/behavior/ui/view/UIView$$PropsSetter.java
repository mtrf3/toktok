package com.lynx.tasm.behavior.ui.view;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class UIView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIView uIView = (UIView) lynxBaseUI;
        str.getClass();
        if (!str.equals("impression_id")) {
            if (!str.equals("blur-sampling")) {
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            } else {
                uIView.setBlurSampling(vpa.LJFF(str, 0));
                return;
            }
        }
        uIView.setImpressionId(vpa.LJII(str));
    }
}
