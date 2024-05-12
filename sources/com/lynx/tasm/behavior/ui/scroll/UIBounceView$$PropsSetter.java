package com.lynx.tasm.behavior.ui.scroll;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class UIBounceView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIBounceView uIBounceView = (UIBounceView) lynxBaseUI;
        str.getClass();
        if (!str.equals("direction")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            uIBounceView.setDirection(vpa.LIZLLL(str));
        }
    }
}
