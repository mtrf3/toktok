package com.bytedance.ies.xelement.viewpager.childitem;

import X.C78856UxA;
import X.C80261Vej;
import X.VNU;
import X.VOJ;
import X.VPD;
import X.VRK;
import X.VTD;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxTabbarItem extends UIGroup<VRK> implements VOJ {
    public Integer LJLIL;
    public C78856UxA LJLILLLLZI;
    public VTD LJLJI;
    public boolean LJLJJI;
    public C80261Vej LJLJJL;
    public boolean LJLJJLL;

    @Override // X.VOJ
    public final void LJIIL() {
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            LJIJJLI();
        }
    }

    public final void LJIJJLI() {
        C80261Vej c80261Vej;
        Integer num;
        C78856UxA tabAt;
        if (this.LJLJJI && (c80261Vej = this.LJLJJL) != null && (num = this.LJLIL) != null && (tabAt = c80261Vej.getTabAt(num.intValue())) != null) {
            tabAt.LIZIZ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        T mView = this.mView;
        o.LJFF(mView, "mView");
        ViewParent parent = mView.getParent();
        if (!(parent instanceof VTD)) {
            parent = null;
        }
        VTD vtd = (VTD) parent;
        if (vtd != null) {
            vtd.setOverflow(getOverflow());
        }
    }

    public LynxTabbarItem(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }

    @VPD(name = "select")
    public final void setSelect(boolean z) {
        if (this.LJLJJI == z) {
            return;
        }
        this.LJLJJLL = true;
        this.LJLJJI = z;
        LJIJJLI();
    }
}
