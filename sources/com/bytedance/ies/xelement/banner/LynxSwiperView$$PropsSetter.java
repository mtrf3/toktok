package com.bytedance.ies.xelement.banner;

import X.VPA;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxSwiperView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    lynxSwiperView.setDuration(vpa.LJFF(str, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1597449863:
                if (str.equals("start-margin")) {
                    lynxSwiperView.setStartMargin(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1596393144:
                if (str.equals("indicator-dots")) {
                    lynxSwiperView.setIndicator(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1498085729:
                if (str.equals("circular")) {
                    lynxSwiperView.setCircular(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1235498272:
                if (str.equals("end-margin")) {
                    lynxSwiperView.setEndMargin(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1029251878:
                if (str.equals("indicator-active-color")) {
                    lynxSwiperView.setIndicatorActiveColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -313198140:
                if (str.equals("hardware_texture")) {
                    lynxSwiperView.setRenderHardwareTexture(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -111166008:
                if (str.equals("next-margin")) {
                    lynxSwiperView.setNextMargin(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3357091:
                if (str.equals("mode")) {
                    lynxSwiperView.setMode(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 24002884:
                if (str.equals("previous-margin")) {
                    lynxSwiperView.setPreviousMargin(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 364166425:
                if (str.equals("touchable")) {
                    lynxSwiperView.setTouchable(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 570418373:
                if (str.equals("interval")) {
                    lynxSwiperView.setInterval(vpa.LJFF(str, 5000));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 914875020:
                if (str.equals("item-width")) {
                    lynxSwiperView.setItemWidth(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1126940025:
                if (str.equals("current")) {
                    lynxSwiperView.setCurrentIndex(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1127093697:
                if (str.equals("current-item-id")) {
                    lynxSwiperView.setCurrentItemId(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1255595234:
                if (str.equals("hideshadow")) {
                    lynxSwiperView.setHideShadow(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxSwiperView.setAutoPlay(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1599847372:
                if (str.equals("smooth-scroll")) {
                    lynxSwiperView.setSmoothScroll(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1616798838:
                if (str.equals("shadow-color")) {
                    lynxSwiperView.setShadowColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1665556140:
                if (str.equals("page-margin")) {
                    lynxSwiperView.setPageMargin(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2050488869:
                if (str.equals("indicator-color")) {
                    lynxSwiperView.setIndicatorColor(vpa.LJII(str));
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
