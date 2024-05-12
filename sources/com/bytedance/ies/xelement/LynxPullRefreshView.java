package com.bytedance.ies.xelement;

import X.C62036OWi;
import X.C79838VVa;
import X.C80160Vd6;
import X.C80162Vd8;
import X.C80163Vd9;
import X.C80164VdA;
import X.EWS;
import X.EnumC80174VdK;
import X.RunnableC80173VdJ;
import X.VNU;
import X.VPD;
import X.VVZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxPullRefreshView extends UIGroup<C80164VdA> {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public LynxPullRefreshView(VNU vnu) {
        super(vnu);
        this.LJLIL = true;
        this.LJLILLLLZI = true;
        this.LJLJJI = true;
        this.LJLJJL = true;
    }

    @EWS
    public void autoStartRefresh(ReadableMap params) {
        o.LJIIJ(params, "params");
        this.LJLJJL = false;
        C80164VdA c80164VdA = (C80164VdA) this.mView;
        if (c80164VdA.LLJLIL == EnumC80174VdK.None && c80164VdA.LJIIJ(c80164VdA.LLFZ)) {
            RunnableC80173VdJ runnableC80173VdJ = new RunnableC80173VdJ(c80164VdA);
            c80164VdA.setViceState(EnumC80174VdK.Refreshing);
            runnableC80173VdJ.run();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        boolean z = true;
        this.LJLIL = true;
        this.LJLILLLLZI = true;
        C80160Vd6 c80160Vd6 = new C80160Vd6(this, context);
        c80160Vd6.LLFZ = this.LJLIL;
        boolean z2 = this.LJLILLLLZI;
        c80160Vd6.LLILLJJLI = true;
        c80160Vd6.LLI = z2;
        c80160Vd6.LLILZIL = new C79838VVa(this);
        c80160Vd6.LLILZLL = new VVZ(this);
        if (!z2) {
            z = false;
        }
        c80160Vd6.LLI = z;
        c80160Vd6.LLIZ = new C62036OWi(this);
        return c80160Vd6;
    }

    @EWS
    public void finishLoadMore(ReadableMap params) {
        o.LJIIJ(params, "params");
        boolean z = params.getBoolean("has_more", true);
        if (z) {
            if (!this.LJLJJI) {
                ((C80164VdA) this.mView).LJIIZILJ(false);
            }
            C80164VdA c80164VdA = (C80164VdA) this.mView;
            c80164VdA.getClass();
            c80164VdA.LJII(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - c80164VdA.LLJLL))), 300) << 16, false);
        } else {
            C80164VdA c80164VdA2 = (C80164VdA) this.mView;
            c80164VdA2.getClass();
            c80164VdA2.LJII(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - c80164VdA2.LLJLL))), 300) << 16, true);
        }
        this.LJLJJI = z;
    }

    @EWS
    public void finishRefresh(ReadableMap params) {
        o.LJIIJ(params, "params");
        C80164VdA c80164VdA = (C80164VdA) this.mView;
        c80164VdA.getClass();
        c80164VdA.LJIIIIZZ(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - c80164VdA.LLJLL))), 300) << 16, true, Boolean.FALSE);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        return new FrameLayout.LayoutParams(-1, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI child) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            this.mChildren.remove(child);
        }
    }

    @VPD(defaultBoolean = false, name = "detect-scrollchild")
    public final void setDetectScrollChild(boolean z) {
        this.LJLJI = z;
    }

    @VPD(defaultBoolean = true, name = "enable-auto-loadmore")
    public final void setEnableAutoLoadMore(boolean z) {
        ((C80164VdA) this.mView).LLIIJLIL = z;
    }

    @VPD(defaultBoolean = true, name = "enable-loadmore")
    public final void setEnableLoadMore(boolean z) {
        this.LJLILLLLZI = z;
        C80164VdA c80164VdA = (C80164VdA) this.mView;
        if (c80164VdA != null) {
            c80164VdA.LLILLJJLI = true;
            c80164VdA.LLI = z;
        }
    }

    @VPD(defaultBoolean = true, name = "enable-refresh")
    public final void setEnableRefresh(boolean z) {
        this.LJLIL = z;
        C80164VdA c80164VdA = (C80164VdA) this.mView;
        if (c80164VdA != null) {
            c80164VdA.LLFZ = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        onInsertChild(child, i);
        if (child instanceof LynxRefreshHeader) {
            VNU vnu = this.mContext;
            o.LJFF(vnu, "this.lynxContext");
            C80163Vd9 c80163Vd9 = new C80163Vd9(vnu);
            c80163Vd9.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View view = ((LynxUI) child).mView;
            o.LJFF(view, "child.view");
            c80163Vd9.addView(view, new FrameLayout.LayoutParams(-1, -2));
            ((C80164VdA) this.mView).LJIJJ(c80163Vd9);
            return;
        }
        if (child instanceof LynxRefreshFooter) {
            VNU vnu2 = this.mContext;
            o.LJFF(vnu2, "this.lynxContext");
            C80162Vd8 c80162Vd8 = new C80162Vd8(vnu2);
            c80162Vd8.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View view2 = ((LynxUI) child).mView;
            o.LJFF(view2, "child.view");
            c80162Vd8.addView(view2, new FrameLayout.LayoutParams(-1, -2));
            ((C80164VdA) this.mView).LJIJI(c80162Vd8);
            return;
        }
        if (!(child instanceof LynxUI)) {
            return;
        }
        ((C80164VdA) this.mView).LJIJ(((LynxUI) child).mView);
    }
}
