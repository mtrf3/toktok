package com.bytedance.ies.xelement.viewpager.childitem;

import X.C79792VTg;
import X.VNU;
import X.VRK;
import X.VZM;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.viewpager.LynxViewPagerNG;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxFoldSlot extends UIGroup<VRK> {
    public LynxTabBarView LJLIL;
    public LynxFoldSlotDrag LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxFoldSlot(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxViewPagerNG) {
                T t = ((LynxUI) lynxBaseUI).mView;
                if (t == 0 || !(t instanceof C79792VTg)) {
                    return;
                }
                LynxFoldSlotDrag lynxFoldSlotDrag = this.LJLILLLLZI;
                if (lynxFoldSlotDrag != null) {
                    this.LJLIL = lynxFoldSlotDrag.LJLIL;
                }
                LynxTabBarView lynxTabBarView = this.LJLIL;
                if (lynxTabBarView == null) {
                    return;
                }
                VZM vzm = (VZM) t;
                vzm.setTabLayout(lynxTabBarView);
                vzm.setTabBarElementAdded(false);
                return;
            }
            if (lynxBaseUI instanceof LynxTabBarView) {
                this.LJLIL = (LynxTabBarView) lynxBaseUI;
            } else {
                if (!(lynxBaseUI instanceof LynxFoldSlotDrag)) {
                    return;
                }
                this.LJLILLLLZI = (LynxFoldSlotDrag) lynxBaseUI;
            }
        }
    }
}
