package com.bytedance.ies.xelement.viewpager;

import X.VPA;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class LynxViewPager$$PropsSetter extends BaseLynxViewPager$$PropsSetter {
    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxViewPager lynxViewPager = (LynxViewPager) lynxBaseUI;
        str.getClass();
        if (!str.equals("viewpager-dynamic")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxViewPager.setViewPagerDynamic(vpa.LIZIZ(str, false));
        }
    }
}
