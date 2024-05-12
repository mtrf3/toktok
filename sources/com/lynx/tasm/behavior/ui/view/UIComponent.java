package com.lynx.tasm.behavior.ui.view;

import X.C79662VOg;
import X.VNU;
import X.VPD;
import X.VRK;
import android.content.Context;

/* loaded from: classes15.dex */
public class UIComponent extends UIView {
    public String LJLIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
    }

    public UIComponent(VNU vnu) {
        super(vnu);
        if (vnu.LJZ) {
            this.mOverflow = 3;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView
    public final VRK LJIJJLI(Context context) {
        return new C79662VOg(context);
    }

    @VPD(name = "item-key")
    public void setItemKey(String str) {
        this.LJLIL = str;
    }
}
