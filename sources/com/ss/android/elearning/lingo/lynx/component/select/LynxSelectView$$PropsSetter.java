package com.ss.android.elearning.lingo.lynx.component.select;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxSelectView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxSelectView lynxSelectView = (LynxSelectView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -218491092:
                if (str.equals("selectable-color")) {
                    lynxSelectView.setSelectableColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -168243066:
                if (str.equals("enable-select")) {
                    lynxSelectView.enableSelect(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1167380134:
                if (str.equals("auto-comple")) {
                    lynxSelectView.enableAutoComplete(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1892080416:
                if (str.equals("enable-rtl")) {
                    lynxSelectView.enableRTL(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2004538122:
                if (str.equals("text-models")) {
                    lynxSelectView.setTextModels(vpa.LIZ(str));
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
