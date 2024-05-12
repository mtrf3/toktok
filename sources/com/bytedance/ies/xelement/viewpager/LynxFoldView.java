package com.bytedance.ies.xelement.viewpager;

import X.C06F;
import X.C16880lQ;
import X.C37692Eqm;
import X.C78996UzQ;
import X.C79793VTh;
import X.C80217Ve1;
import X.C80261Vej;
import X.EWS;
import X.VNU;
import X.VTM;
import X.VTN;
import X.VTS;
import X.VZM;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxFoldView extends BaseLynxFoldView<VTS, VTN> {
    public final ArrayList<LynxBaseUI> LJLJLJ;
    public Handler LJLJLLL;

    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView
    public final void LJJII(C80217Ve1 c80217Ve1, int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeAll() {
        this.LJLJLJ.clear();
        super.removeAll();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void layoutChildren() {
        super.layoutChildren();
        Iterator<LynxBaseUI> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            LynxBaseUI next = it.next();
            if (next instanceof UIGroup) {
                ((UIGroup) next).layoutChildren();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        super.measureChildren();
        Iterator<LynxBaseUI> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            LynxBaseUI next = it.next();
            if (next != null) {
                next.measure();
            }
        }
    }

    public LynxFoldView(VNU vnu) {
        super(vnu);
        this.LJLJLJ = new ArrayList<>();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.LJLIL = new VTN(context);
        LJJIFFI(context);
        return LJJI();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI child) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            this.mChildren.remove(child);
            LynxUI lynxUI = (LynxUI) child;
            lynxUI.setParent(null);
            VTN LJJI = LJJI();
            View view = lynxUI.mView;
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            LJJI.removeView(view);
            View childAt = LJJI().getAppBarLayout().getChildAt(LJJI().getAppBarLayout().getChildCount() - 1);
            if (childAt instanceof C80261Vej) {
                VTS appBarLayout = LJJI().getAppBarLayout();
                if (C78996UzQ.LJJIIJZLJL(childAt)) {
                    C78996UzQ.LJI();
                }
                appBarLayout.removeView(childAt);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxViewPager) {
            Iterator<LynxBaseUI> it = lynxBaseUI.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LynxBaseUI next = it.next();
                if (next instanceof LynxTabBarView) {
                    if (next != null) {
                        this.LJLJLJ.remove(next);
                    }
                }
            }
        }
        super.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, child);
            LynxUI lynxUI = (LynxUI) child;
            lynxUI.setParent(this);
            if (child instanceof LynxFoldToolbar) {
                VTN LJJI = LJJI();
                View view = ((LynxUI) child).mView;
                o.LJFF(view, "child.view");
                LJJI.LLIIII.setVisibility(0);
                LJJI.LLIIII.addView(view);
                return;
            }
            if (child instanceof LynxFoldHeader) {
                VTN LJJI2 = LJJI();
                View view2 = ((LynxUI) child).mView;
                o.LJFF(view2, "child.view");
                LJJI2.LLII.addView(view2, 0);
                return;
            }
            VTN LJJI3 = LJJI();
            View view3 = lynxUI.mView;
            o.LJFF(view3, "child.view");
            LJJI3.getClass();
            if (view3 instanceof C79793VTh) {
                VZM vzm = (VZM) view3;
                vzm.setTabLayoutUpdateListener$x_element_fold_view_release(new VTM(LJJI3, view3));
                if (vzm.getMTabLayout() != null) {
                    C80261Vej mTabLayout = vzm.getMTabLayout();
                    if (mTabLayout != null) {
                        if (C78996UzQ.LJJIIJZLJL(mTabLayout)) {
                            C78996UzQ.LJI();
                        }
                        vzm.removeView(mTabLayout);
                    }
                    View mTabLayout2 = vzm.getMTabLayout();
                    if (mTabLayout2 != null) {
                        LJJI3.LLIFFJFJJ.addView(mTabLayout2);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type android.view.View");
                    }
                }
                C06F c06f = new C06F(new ViewGroup.LayoutParams(-1, -1));
                c06f.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
                vzm.setLayoutParams(c06f);
            }
            LJJI3.addView(view3);
            if (this.LJLJLLL == null) {
                this.LJLJLLL = new Handler(C16880lQ.LLJJJJ());
            }
            Handler handler = this.LJLJLLL;
            if (handler == null) {
                return;
            }
            handler.post(new ARunnableS46S0100000_10(this, 65));
        }
    }

    @EWS
    public final void setFoldExpanded(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (params.hasKey("expanded")) {
            double d = params.getDouble("expanded", -9999);
            if (d < 0 || d > 1) {
                javaOnlyMap.put("msg", "expanded value must be 0~1");
            } else {
                if (!params.hasKey("enableAnimation") || params.getBoolean("enableAnimation")) {
                    BaseLynxFoldView.LJIL(this, d, 0, 2);
                } else {
                    BaseLynxFoldView.LJJ(this, d, 0, 2);
                }
                javaOnlyMap.put("success", Boolean.TRUE);
            }
        } else {
            javaOnlyMap.put("msg", "no index key");
        }
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }
}
