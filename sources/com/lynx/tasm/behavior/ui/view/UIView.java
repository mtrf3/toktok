package com.lynx.tasm.behavior.ui.view;

import X.VNU;
import X.VPD;
import X.VRK;
import Y.IDCListenerS248S0100000_14;
import android.content.Context;

/* loaded from: classes15.dex */
public class UIView extends UISimpleView<VRK> {
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean enableAutoClipRadius() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getInitialOverflowType() {
        return !this.mContext.LJZ ? 1 : 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        T t = this.mView;
        if (t != 0) {
            ((VRK) t).setNativeInteractionEnabled(this.nativeInteractionEnabled);
        }
        super.onPropsUpdated();
    }

    public UIView(VNU vnu) {
        super(vnu);
        if (vnu.LJZ) {
            this.mOverflow = 3;
        }
    }

    public VRK LJIJJLI(Context context) {
        return new VRK(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public VRK createView(Context context) {
        VRK LJIJJLI = LJIJJLI(context);
        LJIJJLI.addOnAttachStateChangeListener(new IDCListenerS248S0100000_14(this, 0));
        return LJIJJLI;
    }

    @VPD(defaultInt = 0, name = "blur-sampling")
    public void setBlurSampling(int i) {
        ((VRK) this.mView).setBlurSampling(i);
    }

    @VPD(name = "impression_id")
    public void setImpressionId(String str) {
        ((VRK) this.mView).setImpressionId(str);
    }
}
