package com.bytedance.ies.xelement.picker;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxPickerView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        Boolean valueOf;
        LynxPickerView lynxPickerView = (LynxPickerView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1274708295:
                if (str.equals("fields")) {
                    lynxPickerView.setFields(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -854975978:
                if (str.equals("confirm-color")) {
                    lynxPickerView.setConfirmColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerView.setRangeKey(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -586660946:
                if (str.equals("title-color")) {
                    lynxPickerView.setTitleColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -271594562:
                if (str.equals("confirm-string")) {
                    lynxPickerView.setConfirmString(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -28424822:
                if (str.equals("title-font-size")) {
                    lynxPickerView.setTitleFontSize(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 100571:
                if (str.equals("end")) {
                    lynxPickerView.setEnd(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3357091:
                if (str.equals("mode")) {
                    lynxPickerView.setMode(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 49495748:
                if (str.equals("cancel-string")) {
                    lynxPickerView.setCancelString(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerView.setRange(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 109757538:
                if (str.equals("start")) {
                    lynxPickerView.setStart(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 110371416:
                if (str.equals("title")) {
                    lynxPickerView.setTitle(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerView.setValue(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 270940796:
                if (str.equals("disabled")) {
                    if (vpa.LJIIIZ(str)) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(vpa.LIZIZ(str, false));
                    }
                    lynxPickerView.setDisabled(valueOf);
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1372139088:
                if (str.equals("cancel-color")) {
                    lynxPickerView.setCancelColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1732829925:
                if (str.equals("separator")) {
                    lynxPickerView.setSeparator(vpa.LJII(str));
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
