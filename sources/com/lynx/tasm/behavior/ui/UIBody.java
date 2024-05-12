package com.lynx.tasm.behavior.ui;

import X.VNS;
import X.VNU;
import X.VOT;
import X.VOU;
import X.VPJ;
import X.VPN;
import android.content.Context;
import android.view.View;

/* loaded from: classes15.dex */
public class UIBody extends UIGroup<VOT> {
    public final VOT LJLIL;
    public boolean LJLILLLLZI;
    public VPN LJLJI;
    public VPJ LJLJJI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public final boolean eventThrough() {
        boolean eventThrough = super.eventThrough();
        if (!eventThrough) {
            return eventThrough | this.mContext.LLIIIL;
        }
        return eventThrough;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        VOT vot = this.LJLIL;
        if (vot == null) {
            return;
        }
        if (this.LJLJI == null) {
            this.LJLJI = new VPN(this);
        }
        vot.setAccessibilityDelegate(new VOU(this));
        vot.mAccessibilityNodeProvider = this.LJLJI;
        this.mAccessibilityElementStatus = 1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.LJLIL.notifyMeaningfulLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeAll() {
        super.removeAll();
        this.LJLIL.clearMeaningfulFlag();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getRealParentView() {
        return this.LJLIL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return this.LJLIL;
    }

    public UIBody(VNU vnu, VNS vns) {
        super(vnu);
        this.LJLIL = vns;
        initialize();
    }
}
