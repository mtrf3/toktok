package com.bytedance.ies.xelement.viewpager.childitem;

import X.C37692Eqm;
import X.VNU;
import X.VPH;
import X.VRK;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxFoldHeader extends UIGroup<VRK> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxFoldHeader(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        super.setOverflow(num);
        Object obj = num;
        if (num == null) {
            obj = Boolean.FALSE;
        }
        boolean z = !o.LJ(obj, 1);
        T mView = this.mView;
        o.LJFF(mView, "mView");
        ((ViewGroup) mView).setClipChildren(!z);
        VPH vph = this.mParent;
        if (vph instanceof LynxFoldViewNG) {
            if (vph != null) {
                ((LynxFoldViewNG) vph).LJJIII(z);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG");
        }
    }
}
