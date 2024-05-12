package com.bytedance.ies.xelement.viewpager.childitem;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxTabbarItem$$PropsSetter extends UIGroup$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
        str.getClass();
        if (!str.equals("select")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxTabbarItem.setSelect(vpa.LIZIZ(str, false));
        }
    }
}
