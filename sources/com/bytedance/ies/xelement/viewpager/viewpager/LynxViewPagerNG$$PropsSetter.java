package com.bytedance.ies.xelement.viewpager.viewpager;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class LynxViewPagerNG$$PropsSetter extends BaseLynxViewPager$$PropsSetter {
    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) lynxBaseUI;
        str.getClass();
        if (!str.equals("page-change-animation")) {
            if (!str.equals("android-distinguish-swipe-tap")) {
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            } else {
                lynxViewPagerNG.setDistinguishSwipeTap(vpa.LIZIZ(str, true));
                return;
            }
        }
        lynxViewPagerNG.setPageChangeAnimation(vpa.LIZIZ(str, false));
    }
}
