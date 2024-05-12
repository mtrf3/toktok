package com.bytedance.ies.xelement;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxPullRefreshView$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxPullRefreshView lynxPullRefreshView = (LynxPullRefreshView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2113012155:
                if (str.equals("enable-loadmore")) {
                    lynxPullRefreshView.setEnableLoadMore(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -2024299963:
                if (str.equals("detect-scrollchild")) {
                    lynxPullRefreshView.setDetectScrollChild(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1813223279:
                if (str.equals("enable-refresh")) {
                    lynxPullRefreshView.setEnableRefresh(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 886566095:
                if (str.equals("enable-auto-loadmore")) {
                    lynxPullRefreshView.setEnableAutoLoadMore(vpa.LIZIZ(str, true));
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
