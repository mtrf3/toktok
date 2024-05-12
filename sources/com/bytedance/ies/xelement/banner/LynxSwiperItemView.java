package com.bytedance.ies.xelement.banner;

import X.C16320kW;
import X.C37692Eqm;
import X.VNU;
import X.VRK;
import X.VRV;
import X.VRW;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lynx.tasm.behavior.ui.view.UIView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxSwiperItemView extends UIView {
    public final void LJIL() {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        if (mView.getParent() instanceof ViewGroup) {
            T mView2 = this.mView;
            o.LJFF(mView2, "mView");
            ViewParent parent = mView2.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (getOverflow() != 0) {
                    viewGroup.setClipChildren(false);
                }
                C16320kW.LIZJ(this.mView, getBoundRectForOverflow());
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxSwiperItemView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxUI
    public final VRK createView(Context context) {
        VRK createView = super.createView(context);
        createView.addOnAttachStateChangeListener(new VRW());
        return createView;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(int i) {
        super.setOverflow(i);
        this.mView.addOnAttachStateChangeListener(new VRV(this));
        LJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }
}
