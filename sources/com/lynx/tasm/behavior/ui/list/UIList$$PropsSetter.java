package com.lynx.tasm.behavior.ui.list;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class UIList$$PropsSetter extends AbsLynxList$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIList uIList = (UIList) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1751296064:
                if (str.equals("android-new-scroll-top")) {
                    uIList.setListNewScrollTopSwitch(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1200045995:
                if (str.equals("use-old-sticky")) {
                    uIList.setListOldStickySwitch(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1042889767:
                if (str.equals("enable-async-list")) {
                    uIList.setEnableAsyncList(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1035189822:
                if (str.equals("enable-new-exposure-strategy")) {
                    uIList.setNewAppear(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -529325351:
                if (str.equals("list-platform-info")) {
                    uIList.setListPlatformInfo(vpa.LJI(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -505938823:
                if (str.equals("update-list-info")) {
                    uIList.updateListActionInfo(vpa.LJI(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 616977828:
                if (str.equals("android-preference-consume-gesture")) {
                    uIList.setPreferenceConsumeGesture(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1458283840:
                if (str.equals("enable-size-cache")) {
                    uIList.setEnableSizeCache(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1598314955:
                if (str.equals("scroll-upper-lower-switch")) {
                    uIList.setUpperLowerSwitch(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1636003801:
                if (str.equals("enable-disappear")) {
                    uIList.setEnableDisappear(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1683042429:
                if (str.equals("android-diffable")) {
                    uIList.setDiffable(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1702184795:
                if (str.equals("android-trigger-sticky-layout")) {
                    uIList.setTriggerStickyLayout(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1816872768:
                if (str.equals("auto-measure")) {
                    uIList.setAutoMeasure(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1836550134:
                if (str.equals("android-ignore-attach-for-binding")) {
                    uIList.setAndroidIgnoreAttachForBinding(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2083253753:
                if (str.equals("vertical-orientation")) {
                    uIList.setVerticalOrientation(vpa.LIZIZ(str, true));
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
