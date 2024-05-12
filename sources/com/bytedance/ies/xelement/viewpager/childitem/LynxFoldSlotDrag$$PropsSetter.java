package com.bytedance.ies.xelement.viewpager.childitem;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxFoldSlotDrag$$PropsSetter extends AbsLynxUIScroll$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxFoldSlotDrag lynxFoldSlotDrag = (LynxFoldSlotDrag) lynxBaseUI;
        str.getClass();
        if (!str.equals("enable-drag")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxFoldSlotDrag.setEnableDrag(vpa.LIZIZ(str, true));
        }
    }
}
