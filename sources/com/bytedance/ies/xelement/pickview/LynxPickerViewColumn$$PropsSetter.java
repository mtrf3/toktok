package com.bytedance.ies.xelement.pickview;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxPickerViewColumn$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxPickerViewColumn lynxPickerViewColumn = (LynxPickerViewColumn) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerViewColumn.setRangeKey(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -208291852:
                if (str.equals("visible-count")) {
                    lynxPickerViewColumn.setVisibleCount(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerViewColumn.setRange(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 108532386:
                if (str.equals("font-family")) {
                    lynxPickerViewColumn.setFontFamily(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerViewColumn.setValue(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1256871824:
                if (str.equals("mask-style")) {
                    lynxPickerViewColumn.setMaskStyle(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2065426547:
                if (str.equals("indicator-style")) {
                    lynxPickerViewColumn.setIndicatorStyle(vpa.LJII(str));
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
