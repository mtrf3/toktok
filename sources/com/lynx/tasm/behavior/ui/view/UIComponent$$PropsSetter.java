package com.lynx.tasm.behavior.ui.view;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class UIComponent$$PropsSetter extends UIView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIComponent uIComponent = (UIComponent) lynxBaseUI;
        str.getClass();
        if (!str.equals("item-key")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            uIComponent.setItemKey(vpa.LJII(str));
        }
    }
}
