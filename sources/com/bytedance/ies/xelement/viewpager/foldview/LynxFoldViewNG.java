package com.bytedance.ies.xelement.viewpager.foldview;

import X.C06F;
import X.C16880lQ;
import X.C37692Eqm;
import X.C78996UzQ;
import X.C79797VTl;
import X.C80217Ve1;
import X.C80218Ve2;
import X.C80221Ve5;
import X.EWS;
import X.VNU;
import X.VPA;
import X.VPD;
import X.VPR;
import X.VPY;
import X.VTB;
import X.VTQ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldSlot;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxFoldViewNG extends BaseLynxFoldView<VTQ, C79797VTl> {
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        LJJI().getAppBarLayout().setScrollListener(null);
    }

    public LynxFoldViewNG(VNU vnu) {
        super(vnu);
        this.LJLJLLL = true;
        this.LJLLILLLL = true;
    }

    public static boolean LJJIIJ(VPY vpy) {
        if (vpy instanceof UIScrollView) {
            return true;
        }
        if (vpy == null || (vpy instanceof LynxFoldViewNG)) {
            return false;
        }
        return LJJIIJ(vpy.parent());
    }

    public static boolean LJJIIJZLJL(VPY vpy) {
        if ((vpy instanceof LynxFoldToolbar) && !((LynxBaseUI) vpy).isUserInteractionEnabled()) {
            return true;
        }
        if (vpy == null || (vpy instanceof LynxFoldViewNG)) {
            return false;
        }
        return LJJIIJZLJL(vpy.parent());
    }

    public final void LJJIII(boolean z) {
        this.LJLLI = z;
        T mView = this.mView;
        o.LJFF(mView, "mView");
        ((ViewGroup) mView).setClipChildren(!z);
        C79797VTl LJJI = LJJI();
        boolean z2 = !z;
        LJJI.LLIFFJFJJ.setClipChildren(z2);
        LJJI.LLII.setClipChildren(z2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(VPA vpa) {
        super.afterPropsUpdated(vpa);
        if (this.mEnableScrollMonitor) {
            LJJI().getAppBarLayout().setScrollListener(new VTB(this));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.LJLIL = new C79797VTl(context);
        LJJIFFI(context);
        return LJJI();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI child) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            this.mChildren.remove(child);
            child.setParent(null);
            if (child instanceof LynxFoldToolbar) {
                C79797VTl LJJI = LJJI();
                T t = ((LynxUI) child).mView;
                o.LJFF(t, "child.view");
                LJJI.getClass();
                LJJI.getMFoldToolBar().setVisibility(8);
                C16880lQ.LJZL(LJJI.getMFoldToolBar(), t);
                return;
            }
            if (child instanceof LynxFoldHeader) {
                C79797VTl LJJI2 = LJJI();
                View view = ((LynxUI) child).mView;
                o.LJFF(view, "child.view");
                LJJI2.getClass();
                C80221Ve5 mCollapsingToolbarLayout = LJJI2.getMCollapsingToolbarLayout();
                if (C78996UzQ.LJJIIJZLJL(view)) {
                    C78996UzQ.LJI();
                }
                mCollapsingToolbarLayout.removeView(view);
                return;
            }
            if (!(child instanceof LynxFoldSlot)) {
                return;
            }
            C79797VTl LJJI3 = LJJI();
            View view2 = ((LynxUI) child).mView;
            o.LJFF(view2, "child.view");
            LJJI3.getClass();
            if (C78996UzQ.LJJIIJZLJL(view2)) {
                C78996UzQ.LJI();
            }
            LJJI3.removeView(view2);
        }
    }

    @VPD(name = "android-header-over-slot")
    public final void setAndroidHeaderOverSlot(boolean z) {
        this.LJLLILLLL = z;
    }

    @VPD(defaultBoolean = true, name = "android-enable-touch-stop-fling")
    public final void setEnableTouchStopFling(boolean z) {
        View findViewById = LJJI().findViewById(R.id.a6n);
        o.LJFF(findViewById, "mFoldViewLayout.findView…tNG>(R.id.app_bar_layout)");
        ((VTQ) findViewById).setEnableTouchStopFling(z);
    }

    @VPD(defaultBoolean = false, name = "header-scrollview-enable")
    public final void setHeaderScrollViewEnable(boolean z) {
        this.LJLL = z;
    }

    @VPD(defaultBoolean = false, name = "android-nested-scroll-as-child")
    public final void setNestedScrollAsChild(boolean z) {
        LJJI().setNestedScrollAsChild(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        super.setOverflow(num);
        Object obj = num;
        if (num == null) {
            obj = Boolean.FALSE;
        }
        LJJIII(!o.LJ(obj, 1));
    }

    @VPD(defaultBoolean = true, name = "tab-movable-enable")
    public final void setTabMovableEnable(boolean z) {
        LJJI().getAppBarLayout().setIsEnableTabbarDrag(z);
    }

    @VPD(defaultBoolean = true, name = "toolbar-interaction-enable")
    public final void setToolbarInteractionEnable(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView
    public final void LJJII(C80217Ve1 c80217Ve1, int i) {
        boolean z;
        if (c80217Ve1 != null) {
            if (Math.abs(i) >= c80217Ve1.getTotalScrollRange()) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJLJ = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, child);
            child.setParent(this);
            if (child instanceof LynxFoldToolbar) {
                C79797VTl LJJI = LJJI();
                View view = ((LynxUI) child).mView;
                o.LJFF(view, "child.view");
                LJJI.LLIIII.setVisibility(0);
                LJJI.LLIIII.addView(view);
                return;
            }
            if (child instanceof LynxFoldHeader) {
                C79797VTl LJJI2 = LJJI();
                View view2 = ((LynxUI) child).mView;
                o.LJFF(view2, "child.view");
                LJJI2.LLII.addView(view2, 0);
                return;
            }
            if (!(child instanceof LynxFoldSlot)) {
                return;
            }
            C79797VTl LJJI3 = LJJI();
            View view3 = ((LynxUI) child).mView;
            o.LJFF(view3, "child.view");
            LJJI3.getClass();
            C06F c06f = new C06F(new ViewGroup.LayoutParams(-1, -1));
            c06f.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
            view3.setLayoutParams(c06f);
            LJJI3.addView(view3);
            if (!this.LJLLI || !this.LJLLILLLL) {
                return;
            }
            C79797VTl LJJI4 = LJJI();
            LJJI4.bringChildToFront(LJJI4.getMAppBarLayout());
        }
    }

    @EWS
    public final void setFoldExpanded(ReadableMap params, Callback callback) {
        int LIZIZ;
        boolean z;
        o.LJIIJ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (params.hasKey("offset")) {
            String offsetValue = params.getString("offset", "");
            o.LJFF(offsetValue, "offsetValue");
            if (ujb.o.LJJJJ(offsetValue, "px", false) || ujb.o.LJJJJ(offsetValue, "rpx", false)) {
                LIZIZ = (int) VPR.LIZIZ(offsetValue, -1.0f);
            } else {
                LIZIZ = -1;
            }
            if (params.hasKey("smooth")) {
                z = params.getBoolean("smooth");
            } else {
                z = true;
            }
            if (z) {
                BaseLynxFoldView.LJIL(this, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LIZIZ, 1);
            } else {
                BaseLynxFoldView.LJJ(this, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LIZIZ, 1);
            }
            javaOnlyMap.put("success", Boolean.TRUE);
        } else {
            javaOnlyMap.put("msg", "no index key");
        }
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final VPY findUIWithCustomLayout(float f, float f2, UIGroup<?> uIGroup) {
        VPY target = super.findUIWithCustomLayout(f, f2, uIGroup);
        if (!this.LJLJLLL && LJJIIJZLJL(target)) {
            Iterator<LynxBaseUI> it = this.mChildren.iterator();
            while (it.hasNext()) {
                if ((it.next() instanceof LynxFoldHeader) && !this.LJLJLJ) {
                    HashMap hashMap = new HashMap();
                    int childCount = getChildCount();
                    while (true) {
                        childCount--;
                        if (childCount < 0) {
                            break;
                        }
                        LynxBaseUI childAt = getChildAt(childCount);
                        if (!(childAt instanceof LynxFoldToolbar)) {
                            if (childAt instanceof UIShadowProxy) {
                                childAt = ((UIShadowProxy) childAt).LJLIL;
                            }
                            if (childAt instanceof LynxUI) {
                                T t = ((LynxUI) childAt).mView;
                                o.LJFF(t, "child.view");
                                hashMap.put(t, childAt);
                            }
                        }
                    }
                    target = findUIWithCustomLayoutByChildren(f, f2, this, hashMap);
                }
            }
        } else if (this.LJLL) {
            boolean z = !LJJIIJ(target);
            ViewGroup.LayoutParams layoutParams = LJJI().getCollapsingToolbarLayout().getLayoutParams();
            if (layoutParams != null) {
                C80218Ve2 c80218Ve2 = (C80218Ve2) layoutParams;
                if (z) {
                    c80218Ve2.LIZ |= 1;
                } else {
                    c80218Ve2.LIZ = (c80218Ve2.LIZ >> 1) << 1;
                }
                LJJI().getCollapsingToolbarLayout().setLayoutParams(c80218Ve2);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            }
        }
        o.LJFF(target, "target");
        return target;
    }
}
