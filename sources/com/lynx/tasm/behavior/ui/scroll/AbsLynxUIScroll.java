package com.lynx.tasm.behavior.ui.scroll;

import X.F5B;
import X.VNU;
import X.VPD;
import X.VQT;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;

/* loaded from: classes15.dex */
public abstract class AbsLynxUIScroll<T extends ViewGroup> extends UISimpleView<T> {
    public void LJIJJLI(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    public void LJIL(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i) {
    }

    public abstract void LJJ(boolean z);

    public abstract void LJJI(boolean z);

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @VPD(defaultInt = 0, name = "scroll-to-index")
    public abstract void scrollToIndex(int i);

    @VPD(defaultBoolean = false, name = "block-descendant-focusability")
    public void setBlockDescendantFocusability(boolean z) {
    }

    @VPD(defaultBoolean = false, name = "enable-new-nested")
    public void setEnableNewNested(boolean z) {
    }

    @VPD(defaultBoolean = true, name = "enable-scroll")
    public void setEnableScroll(boolean z) {
    }

    @VPD(defaultBoolean = false, name = "forbid-fling-focus-change")
    public void setForbidFlingFocusChange(boolean z) {
    }

    @VPD(defaultInt = 0, name = "lower-threshold")
    public abstract void setLowerThreshole(int i);

    @VPD(defaultBoolean = false, name = "scroll-bar-enable")
    public abstract void setScrollBarEnable(boolean z);

    @VPD(defaultInt = 0, name = "scroll-left")
    public abstract void setScrollLeft(int i);

    @VPD(defaultBoolean = false, name = "scroll-tap")
    public abstract void setScrollTap(boolean z);

    @VPD(defaultInt = 0, name = "scroll-top")
    public abstract void setScrollTop(int i);

    @VPD(defaultInt = 0, name = "upper-threshold")
    public abstract void setUpperThreshole(int i);

    public AbsLynxUIScroll(VNU vnu) {
        super(vnu);
    }

    @VPD(name = "scroll-x")
    public void setScrollX(F5B f5b) {
        if (f5b == null) {
            LJJ(false);
            return;
        }
        int i = VQT.LIZ[f5b.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJJ("true".equals(f5b.asString()));
            return;
        }
        LJJ(f5b.asBoolean());
    }

    @VPD(name = "scroll-y")
    public void setScrollY(F5B f5b) {
        if (f5b == null) {
            LJJI(true);
            return;
        }
        int i = VQT.LIZ[f5b.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJJI("true".equals(f5b.asString()));
            return;
        }
        LJJI(f5b.asBoolean());
    }
}
