package com.bytedance.ies.xelement.viewpager.viewpager;

import X.C16330kX;
import X.C77798Ug6;
import X.C78856UxA;
import X.C78996UzQ;
import X.C79795VTj;
import X.C79860VVw;
import X.C7MY;
import X.C80261Vej;
import X.EWS;
import X.VNA;
import X.VNU;
import X.VOH;
import X.VOJ;
import X.VPD;
import X.VPZ;
import X.VZM;
import X.VZN;
import X.VZO;
import X.VZP;
import X.VZQ;
import X.VZT;
import X.VZU;
import X.X1D;
import Y.IDCListenerS248S0100000_14;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class BaseLynxViewPager<K extends C79860VVw, T extends VZM<K>> extends UISimpleView<T> implements VOH, VOJ {
    public boolean LJLIL;
    public final boolean LJLILLLLZI;
    public boolean LJLJI;
    public C78856UxA LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public T LJLJLJ;
    public VZN LJLJLLL;

    public abstract void LJIJJLI(LynxViewpagerItem lynxViewpagerItem, int i);

    public abstract void LJJI();

    public abstract void LJJIFFI(int i, String str, String str2);

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @EWS
    public abstract void selectTab(ReadableMap readableMap, Callback callback);

    public final T LJIL() {
        T t = this.LJLJLJ;
        if (t != null) {
            return t;
        }
        o.LJIJI("mPager");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void layoutChildren() {
        List<LynxBaseUI> mChildren = this.mChildren;
        o.LJFF(mChildren, "mChildren");
        int size = mChildren.size();
        for (int i = 0; i < size; i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            if (this.LJLJL || !(lynxBaseUI instanceof LynxUI) || C16330kX.LIZIZ(((LynxUI) lynxBaseUI).mView)) {
                if (!needCustomLayout()) {
                    if (lynxBaseUI instanceof LynxUI) {
                        lynxBaseUI.layout();
                    }
                } else if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).layoutChildren();
                }
            }
        }
    }

    @Override // X.VOJ
    public final void LJIIL() {
        T LJIL = LJIL();
        if (LJIL.LJLJLJ) {
            LJIL.LJLJLJ = false;
            ((ArrayList) LJIL.LJLJLLL).clear();
            ((ArrayList) LJIL.LJLJLLL).addAll(LJIL.LJLL);
            LJIL.LJLJJLL.notifyDataSetChanged();
            LJIL.LJI();
        }
    }

    public final void LJJ() {
        LJIL().getMViewPager().setMInterceptTouchEventListener(new VPZ(this));
        this.LJLJLLL = new VZN(this);
        LJIL().setTabSelectedListener$x_element_fold_view_release(this.LJLJLLL);
        LJIL().setTabClickListenerListener(new VZQ(this));
        LJJI();
        LJIL().addOnAttachStateChangeListener(new IDCListenerS248S0100000_14(this, 3));
    }

    @Override // X.VOH
    public final int getCurrentIndex() {
        return LJIL().getMViewPager().getCurrentItem();
    }

    public BaseLynxViewPager(VNU vnu) {
        super(vnu);
        this.LJLILLLLZI = true;
        this.LJLJJL = true;
        this.LJLJJLL = "";
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI child) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            this.mChildren.remove(child);
            child.setParent(null);
            if (child instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) child;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    T LJIL = LJIL();
                    String valueOf = String.valueOf(lynxViewpagerItem.LJLIL);
                    LJIL.getClass();
                    if (valueOf.length() != 0) {
                        if (((ArrayList) LJIL.LJLLI).contains(valueOf)) {
                            ((ArrayList) LJIL.LJLLI).remove(valueOf);
                        }
                        if (((ArrayList) LJIL.LJLLI).size() > 0) {
                            LJIL.LIZIZ(null);
                        }
                    }
                }
                T LJIL2 = LJIL();
                LJIL2.getClass();
                LJIL2.LJLJLJ = true;
                ((ArrayList) LJIL2.LJLL).remove(lynxViewpagerItem);
                return;
            }
            if (child instanceof LynxTabBarView) {
                T LJIL3 = LJIL();
                C77798Ug6 c77798Ug6 = ((LynxTabBarView) child).LJLILLLLZI;
                if (c77798Ug6 != null) {
                    LJIL3.getClass();
                    if (C78996UzQ.LJJIIJZLJL(c77798Ug6)) {
                        C78996UzQ.LJI();
                    }
                    LJIL3.removeView(c77798Ug6);
                    return;
                }
                o.LJIJI("mTabLayout");
                throw null;
            }
            LLog.LIZLLL(4, "LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
        }
    }

    @VPD(name = "allow-horizontal-gesture")
    public final void setAllowHorizontalGesture(boolean z) {
        LJIL().setAllowHorizontalGesture(z);
    }

    @VPD(name = "background")
    public final void setBackground(String color) {
        o.LJIIJ(color, "color");
        LJIL().setBackgroundColor(VZP.LIZLLL(color));
    }

    @VPD(name = "border-height")
    public final void setBorderHeight(float f) {
        LJIL().setBorderHeight(f);
    }

    @VPD(name = "border-color")
    public final void setBorderLineColor(String color) {
        o.LJIIJ(color, "color");
        LJIL().setBorderLineColor(color);
    }

    @VPD(name = "border-width")
    public final void setBorderWidth(float f) {
        LJIL().setBorderWidth(f);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLIL = map.containsKey("change");
            this.LJLJI = map.containsKey("tabbarcellappear");
            boolean containsKey = map.containsKey("tabbarcelldisappear");
            if (this.LJLJI || containsKey) {
                T LJIL = LJIL();
                int sign = getSign();
                C79795VTj c79795VTj = new C79795VTj(this);
                LJIL.getClass();
                if (!LJIL.LLIIIILZ) {
                    DisplayMetrics LIZ = DisplayMetricsHolder.LIZ(LJIL.getContext());
                    LJIL.LLII.set(0, 0, LIZ.widthPixels, LIZ.heightPixels);
                    LJIL.LLIIIJ = sign;
                    LJIL.LLIIIL = c79795VTj;
                    LJIL.LLIIIZ = "tabbarcellappear";
                    LJIL.LLIIJI = "tabbarcelldisappear";
                    LJIL.getViewTreeObserver().addOnDrawListener(new VZT(LJIL));
                    LJIL.getViewTreeObserver().addOnScrollChangedListener(new VZU(LJIL));
                    LJIL.LLIIIILZ = true;
                }
            }
        }
    }

    @VPD(name = "hide-indicator")
    public final void setIndicatorVisibility(String bool) {
        C80261Vej mTabLayout;
        o.LJIIJ(bool, "bool");
        if (o.LJ(bool, "true") && (mTabLayout = LJIL().getMTabLayout()) != null) {
            mTabLayout.setSelectedTabIndicator((Drawable) null);
        }
    }

    @VPD(name = "keep-item-view")
    public final void setKeepItemView(boolean z) {
        this.LJLJL = z;
        LJIL().setKeepItemView(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        super.setLynxDirection(i);
        LJIL().setLynxDirection(i);
    }

    @VPD(name = "select-index")
    public final void setSelect(int i) {
        PagerAdapter adapter;
        C80261Vej mTabLayout = LJIL().getMTabLayout();
        if (mTabLayout != null && mTabLayout.getSelectedTabPosition() == i) {
            return;
        }
        if (i >= 0 && (adapter = LJIL().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
            LJIL().setCurrentSelectIndex(i);
        }
        LJIL().setSelectedIndex(i);
    }

    @VPD(name = "selected-text-color")
    public final void setSelectedTextColor(String color) {
        o.LJIIJ(color, "color");
        LJIL().setSelectedTextColor(color);
    }

    @VPD(name = "selected-text-size")
    public final void setSelectedTextSize(float f) {
        LJIL().setSelectedTextSize(f);
    }

    @VPD(name = "tabbar-drag")
    public final void setTabBarDragEnable(boolean z) {
        LJIL().setTabBarDragEnable(z);
    }

    @VPD(name = "tab-height")
    public final void setTabHeight(float f) {
        LJIL().LJ(f, false);
    }

    @VPD(name = "tab-height-rpx")
    public final void setTabHeightRpx(float f) {
        LJIL().LJ(f, true);
    }

    @VPD(name = "tab-indicator-color")
    public final void setTabIndicatorColor(String color) {
        o.LJIIJ(color, "color");
        LJIL().setSelectedTabIndicatorColor(color);
    }

    @VPD(name = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f) {
        LJIL().setTabIndicatorHeight(f);
    }

    @VPD(name = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f) {
        LJIL().setTabIndicatorRadius(f);
    }

    @VPD(name = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f) {
        LJIL().setTabIndicatorWidth(f);
    }

    @VPD(name = "tab-inter-space")
    public final void setTabInterspace(float f) {
        LJIL().setTabInterspace(f);
    }

    @VPD(name = "tab-padding-bottom")
    public final void setTabPaddingBottom(int i) {
        LJIL().setTabPaddingBottom(i);
    }

    @VPD(name = "tab-padding-left")
    public final void setTabPaddingLeft(int i) {
        LJIL().setTabPaddingStart(i);
    }

    @VPD(name = "tab-padding-right")
    public final void setTabPaddingRight(int i) {
        LJIL().setTabPaddingEnd(i);
    }

    @VPD(name = "tab-padding-top")
    public final void setTabPaddingTop(int i) {
        LJIL().setTabPaddingTop(i);
    }

    @VPD(name = "tabbar-background")
    public final void setTabbarBackground(String color) {
        o.LJIIJ(color, "color");
        LJIL().setTabbarBackground(color);
    }

    @VPD(name = "tab-layout-gravity")
    public final void setTablayoutGravity(String gravity) {
        o.LJIIJ(gravity, "gravity");
        LJIL().setTablayoutGravity(gravity);
    }

    @VPD(name = "text-bold-mode")
    public final void setTextBoldMode(String boldMode) {
        o.LJIIJ(boldMode, "boldMode");
        LJIL().setTextBold(boldMode);
    }

    @VPD(name = "unselected-text-color")
    public final void setUnSelectedTextColor(String color) {
        o.LJIIJ(color, "color");
        LJIL().setUnSelectedTextColor(color);
    }

    @VPD(name = "unselected-text-size")
    public final void setUnSelectedTextSize(float f) {
        LJIL().setUnSelectedTextSize(f);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, child);
            child.setParent(this);
            if (child instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) child;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    StringBuilder LJ = C7MY.LJ("insertChild: at ", i, " with tag = ");
                    LJ.append(String.valueOf(lynxViewpagerItem.LJLIL));
                    LLog.LIZLLL(2, "LynxViewPager", X1D.LIZIZ(LJ));
                    T LJIL = LJIL();
                    String valueOf = String.valueOf(lynxViewpagerItem.LJLIL);
                    LJIL.getClass();
                    ((ArrayList) LJIL.LJLLI).add(valueOf);
                    if (valueOf.length() > 0) {
                        LJIL.LIZIZ(null);
                    }
                    lynxViewpagerItem.LJLILLLLZI = new VZO(this, i);
                }
                LJIJJLI(lynxViewpagerItem, i);
                return;
            }
            if (child instanceof LynxTabBarView) {
                LJIL().setTabBarElementAdded(true);
                LJIL().setTabLayout((LynxTabBarView) child);
            } else {
                LLog.LIZLLL(4, "LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
        }
    }
}
