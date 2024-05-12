package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.react.bridge.ReadableMap;
import defpackage.q;

/* loaded from: classes15.dex */
public final class VNQ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final String LJJII;
    public final boolean LJJIII;
    public final boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final boolean LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final boolean LJJIJIL;
    public final boolean LJJIJL;
    public final boolean LJJIJLIJ;
    public final boolean LJJIL;
    public final boolean LJJIZ;
    public final int LJJJ;
    public final boolean LJJJI;
    public final int LJJJIL;
    public final boolean LJJJJ;
    public final String LJJJJI;
    public final String LJJJJIZL;
    public final String LJJJJJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageConfig{autoExpose=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageVersion='");
        return q.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public VNQ(ReadableMap readableMap) {
        boolean z;
        boolean z2;
        this.LJJIJIIJI = true;
        this.LJJIJIIJIL = true;
        this.LJJJ = 20;
        this.LJJJIL = -1;
        this.LJJJJ = true;
        this.LIZ = true;
        this.LIZLLL = "error";
        if (readableMap != null) {
            if (readableMap.hasKey("autoExpose")) {
                this.LIZ = readableMap.getBoolean("autoExpose");
            }
            if (readableMap.hasKey("pageVersion")) {
                this.LIZLLL = readableMap.getString("pageVersion");
            }
            if (readableMap.hasKey("enableEventThrough")) {
                this.LIZIZ = readableMap.getBoolean("enableEventThrough");
            }
            if (readableMap.hasKey("defaultOverflowVisible")) {
                this.LIZJ = readableMap.getBoolean("defaultOverflowVisible");
            }
            if (readableMap.hasKey("syncImageAttach")) {
                this.LJFF = readableMap.getBoolean("syncImageAttach");
            }
            if (readableMap.hasKey("enableCheckLocalImage")) {
                this.LJI = readableMap.getBoolean("enableCheckLocalImage");
            }
            if (readableMap.hasKey("useImagePostProcessor")) {
                readableMap.getBoolean("useImagePostProcessor");
            }
            if (readableMap.hasKey("enableNewImage")) {
                this.LJII = readableMap.getBoolean("enableNewImage");
            }
            if (readableMap.hasKey("asyncRedirect")) {
                this.LJ = readableMap.getBoolean("asyncRedirect");
            }
            if (readableMap.hasKey("pageType")) {
                this.LJIIIIZZ = readableMap.getString("pageType");
            }
            if (readableMap.hasKey("cliVersion")) {
                this.LJIIIZ = readableMap.getString("cliVersion");
            }
            if (readableMap.hasKey("customData")) {
                this.LJIIJ = readableMap.getString("customData");
            }
            if (readableMap.hasKey("useNewSwiper")) {
                this.LJIIJJI = readableMap.getBoolean("useNewSwiper");
            }
            if (readableMap.hasKey("enableAsyncInitVideoEngine")) {
                this.LJIIL = readableMap.getBoolean("enableAsyncInitVideoEngine");
            }
            if (readableMap.hasKey("targetSdkVersion")) {
                String string = readableMap.getString("targetSdkVersion");
                this.LJIILIIL = string;
                try {
                    float parseFloat = CastFloatProtector.parseFloat(string);
                    if (parseFloat >= 2.4f && parseFloat < 2.9f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJJIJ = z;
                    if (parseFloat >= 2.5f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LJJIJL = z2;
                } catch (NumberFormatException unused) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("NumberFormatException: ");
                    C13870gZ.LIZJ(LIZ, this.LJIILIIL, LIZ, 4, "PageConfig");
                }
            }
            if (readableMap.hasKey("includeFontPadding")) {
                this.LJJIJ = readableMap.getBoolean("includeFontPadding");
            }
            if (readableMap.hasKey("lepusVersion")) {
                this.LJIILJJIL = readableMap.getString("lepusVersion");
            }
            if (readableMap.hasKey("enableLepusNG")) {
                this.LJIILL = readableMap.getBoolean("enableLepusNG");
            }
            if (readableMap.hasKey("radonMode")) {
                this.LJIILLIIL = readableMap.getString("radonMode");
            }
            if (readableMap.hasKey("tapSlop")) {
                this.LJIIZILJ = readableMap.getString("tapSlop");
            }
            if (readableMap.hasKey("enableCreateViewAsync")) {
                this.LJIJ = readableMap.getBoolean("enableCreateViewAsync");
            }
            if (readableMap.hasKey("enableVsyncAlignedFlush")) {
                this.LJIJI = readableMap.getBoolean("enableVsyncAlignedFlush");
            }
            if (readableMap.hasKey("cssAlignWithLegacyW3c")) {
                this.LJIJJ = readableMap.getBoolean("cssAlignWithLegacyW3c");
            }
            if (readableMap.hasKey("enableAccessibilityElement")) {
                this.LJIJJLI = readableMap.getBoolean("enableAccessibilityElement");
            }
            if (readableMap.hasKey("enableOverlapForAccessibilityElement")) {
                this.LJIL = readableMap.getBoolean("enableOverlapForAccessibilityElement", true);
            }
            if (readableMap.hasKey("enableNewAccessibility")) {
                this.LJJ = readableMap.getBoolean("enableNewAccessibility", false);
            }
            if (readableMap.hasKey("enableA11yIDMutationObserver")) {
                this.LJJI = readableMap.getBoolean("enableA11yIDMutationObserver", false);
            }
            if (readableMap.hasKey("enableA11y")) {
                this.LJJIFFI = readableMap.getBoolean("enableA11y", false);
            }
            if (readableMap.hasKey("reactVersion")) {
                this.LJJII = readableMap.getString("reactVersion");
            }
            if (readableMap.hasKey("enableTextRefactor")) {
                this.LJJIII = readableMap.getBoolean("enableTextRefactor");
            }
            if (readableMap.hasKey("enableTextOverflow")) {
                this.LJJIIJ = readableMap.getBoolean("enableTextOverflow");
            }
            if (readableMap.hasKey("enableNewClipMode")) {
                this.LJJIIJZLJL = readableMap.getBoolean("enableNewClipMode");
            }
            if (readableMap.hasKey("keyboardCallbackPassRelativeHeight")) {
                this.LJJIIZ = readableMap.getBoolean("keyboardCallbackPassRelativeHeight");
            }
            if (readableMap.hasKey("enableCSSParser")) {
                this.LJJIIZI = readableMap.getBoolean("enableCSSParser");
            }
            if (readableMap.hasKey("enableEventRefactor")) {
                this.LJJIJIIJI = readableMap.getBoolean("enableEventRefactor");
            }
            if (readableMap.hasKey("enableDisexposureWhenLynxHidden")) {
                this.LJJIJIIJIL = readableMap.getBoolean("enableDisexposureWhenLynxHidden");
            }
            if (readableMap.hasKey("enableExposureWhenLayout")) {
                this.LJJIJIL = readableMap.getBoolean("enableExposureWhenLayout", false);
            }
            if (readableMap.hasKey("textNewEventDispatch")) {
                this.LJJIJLIJ = readableMap.getBoolean("textNewEventDispatch");
            }
            if (readableMap.hasKey("enableNewIntersectionObserver")) {
                this.LJJIL = readableMap.getBoolean("enableNewIntersectionObserver");
            }
            if (readableMap.hasKey("observerFrameRate")) {
                this.LJJJ = readableMap.getInt("observerFrameRate");
            }
            if (readableMap.hasKey("enableExposureUIMargin")) {
                this.LJJJI = readableMap.getBoolean("enableExposureUIMargin");
            }
            if (readableMap.hasKey("longPressDuration")) {
                this.LJJJIL = readableMap.getInt("longPressDuration");
            }
            if (readableMap.hasKey("pageFlatten")) {
                this.LJJJJ = readableMap.getBoolean("pageFlatten");
            }
            if (readableMap.hasKey("user")) {
                this.LJJJJI = readableMap.getString("user");
            }
            if (readableMap.hasKey("git")) {
                this.LJJJJIZL = readableMap.getString("git");
            }
            if (readableMap.hasKey("filePath")) {
                this.LJJJJJ = readableMap.getString("filePath");
            }
            if (readableMap.hasKey("enableFiber")) {
                this.LJJIZ = readableMap.getBoolean("enableFiber");
            }
        }
    }
}
