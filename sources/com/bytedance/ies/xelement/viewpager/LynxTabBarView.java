package com.bytedance.ies.xelement.viewpager;

import X.C141335gf;
import X.C16310kV;
import X.C16880lQ;
import X.C37692Eqm;
import X.C3C5;
import X.C65777Prh;
import X.C68322mC;
import X.C76800UCe;
import X.C77798Ug6;
import X.C77873UhJ;
import X.C78856UxA;
import X.C80267Vep;
import X.EWS;
import X.InterfaceC54357LUz;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VTD;
import X.VZL;
import X.VZP;
import X.VZW;
import Y.ACListenerS48S0200000_14;
import Y.IDCListenerS248S0100000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxTabBarView extends UISimpleView<C77798Ug6> {
    public static final /* synthetic */ int LJLLI = 0;
    public boolean LJLIL;
    public C77798Ug6 LJLILLLLZI;
    public float LJLJI;
    public VZW LJLJJI;
    public C78856UxA LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, String> LJLJL;
    public final ArrayList<VTD> LJLJLJ;
    public float LJLJLLL;
    public final VZL LJLL;

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public final void LJIJJLI() {
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            c77798Ug6.addOnTabSelectedListener((InterfaceC54357LUz) this.LJLL);
            if (!this.LJLJJLL) {
                VZL vzl = this.LJLL;
                C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                if (c77798Ug62 != null) {
                    vzl.LIZIZ(c77798Ug62.getTabAt(c77798Ug62.getSelectedTabPosition()));
                    return;
                } else {
                    o.LJIJI("mTabLayout");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    public final void LJIL() {
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            if (c77798Ug6.getBackground() == null) {
                C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                if (c77798Ug62 != null) {
                    c77798Ug62.setBackgroundResource(R.drawable.bqg);
                    C77798Ug6 c77798Ug63 = this.LJLILLLLZI;
                    if (c77798Ug63 != null) {
                        c77798Ug63.getBackground().mutate();
                        return;
                    } else {
                        o.LJIJI("mTabLayout");
                        throw null;
                    }
                }
                o.LJIJI("mTabLayout");
                throw null;
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        if (this.LJLJLLL > 0) {
            C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
            if (c77798Ug6 != null) {
                ViewGroup.LayoutParams layoutParams = c77798Ug6.getLayoutParams();
                if (layoutParams != null) {
                    VNU vnu = this.mContext;
                    o.LJFF(vnu, "this.mContext");
                    layoutParams.height = VZP.LIZJ(vnu, this.LJLJLLL);
                }
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        super.measure();
    }

    public LynxTabBarView(VNU vnu) {
        super(vnu);
        this.LJLJI = 9.0f;
        this.LJLJJLL = true;
        this.LJLJL = new HashMap();
        this.LJLJLJ = new ArrayList<>();
        this.LJLJLLL = -1.0f;
        this.LJLL = new VZL(this);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C77798Ug6 LIZ = C77873UhJ.LIZ(context);
        this.LJLILLLLZI = LIZ;
        this.LJLJJI = new VZW(this);
        LIZ.addOnAttachStateChangeListener(new IDCListenerS248S0100000_14(this, 1));
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            return c77798Ug6;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if ((lynxBaseUI instanceof LynxUI) && (lynxBaseUI instanceof LynxTabbarItem)) {
            this.mChildren.remove(lynxBaseUI);
            ArrayList<VTD> arrayList = this.LJLJLJ;
            LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
            VTD vtd = lynxTabbarItem.LJLJI;
            if (arrayList != null) {
                C65777Prh.LIZ(arrayList).remove(vtd);
                C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
                if (c77798Ug6 != null) {
                    c77798Ug6.removeTab(lynxTabbarItem.LJLILLLLZI);
                    return;
                } else {
                    o.LJIJI("mTabLayout");
                    throw null;
                }
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
    }

    @VPD(name = "tab-indicator-top")
    public final void set(float f) {
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        Drawable drawable = null;
        if (c77798Ug6 != null) {
            Drawable tabSelectedIndicator = c77798Ug6.getTabSelectedIndicator();
            if (tabSelectedIndicator instanceof LayerDrawable) {
                drawable = tabSelectedIndicator;
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable != null) {
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this.mContext");
                layerDrawable.setLayerInset(0, 0, 0, 0, VZP.LIZ(vnu, f));
                return;
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "background")
    public final void setBackground(String color) {
        Drawable drawable;
        o.LJIIJ(color, "color");
        LJIL();
        Drawable drawable2 = null;
        if (Build.VERSION.SDK_INT < 23) {
            C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
            if (c77798Ug6 != null) {
                c77798Ug6.setBackgroundColor(VZP.LIZLLL(color));
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
        if (c77798Ug62 != null) {
            Drawable background = c77798Ug62.getBackground();
            if (!(background instanceof LayerDrawable)) {
                background = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) background;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
            if (drawable instanceof GradientDrawable) {
                drawable2 = drawable;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
            if (gradientDrawable == null) {
                return;
            }
            gradientDrawable.setColor(VZP.LIZLLL(color));
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBackgroundColor(int i) {
        Drawable drawable;
        LJIL();
        Drawable drawable2 = null;
        if (Build.VERSION.SDK_INT < 23) {
            C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
            if (c77798Ug6 != null) {
                c77798Ug6.setBackgroundColor(i);
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
        if (c77798Ug62 != null) {
            Drawable background = c77798Ug62.getBackground();
            if (!(background instanceof LayerDrawable)) {
                background = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) background;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
            if (drawable instanceof GradientDrawable) {
                drawable2 = drawable;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
            if (gradientDrawable == null) {
                return;
            }
            gradientDrawable.setColor(i);
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "border-height")
    public final void setBorderHeight(float f) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        LJIL();
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        Drawable drawable2 = null;
        if (c77798Ug6 != null) {
            Drawable background = c77798Ug6.getBackground();
            if (!(background instanceof LayerDrawable)) {
                background = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) background;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(1);
            } else {
                drawable = null;
            }
            if (drawable instanceof GradientDrawable) {
                drawable2 = drawable;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
            if (gradientDrawable != null) {
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this.mContext");
                gradientDrawable.setSize(intrinsicWidth, VZP.LIZ(vnu, f));
                return;
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "border-color")
    public final void setBorderLineColor(String color) {
        Drawable drawable;
        o.LJIIJ(color, "color");
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        LJIL();
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        Drawable drawable2 = null;
        if (c77798Ug6 != null) {
            Drawable background = c77798Ug6.getBackground();
            if (!(background instanceof LayerDrawable)) {
                background = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) background;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(1);
            } else {
                drawable = null;
            }
            if (drawable instanceof GradientDrawable) {
                drawable2 = drawable;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(VZP.LIZLLL(color));
                return;
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "border-top")
    public final void setBorderTop(float f) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        LJIL();
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        Drawable drawable = null;
        if (c77798Ug6 != null) {
            Drawable background = c77798Ug6.getBackground();
            if (background instanceof LayerDrawable) {
                drawable = background;
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable != null) {
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this.mContext");
                layerDrawable.setLayerInset(0, 0, 0, 0, VZP.LIZ(vnu, f));
                return;
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "border-width")
    public final void setBorderWidth(float f) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        LJIL();
        o.LJFF(this.mContext, "this.mContext");
        int LIZIZ = (int) ((f / 375) * VZP.LIZIZ(r1));
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        Drawable drawable2 = null;
        if (c77798Ug6 != null) {
            Drawable background = c77798Ug6.getBackground();
            if (!(background instanceof LayerDrawable)) {
                background = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) background;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(1);
            } else {
                drawable = null;
            }
            if (drawable instanceof GradientDrawable) {
                drawable2 = drawable;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
            if (gradientDrawable != null) {
                gradientDrawable.setSize(LIZIZ, gradientDrawable.getIntrinsicHeight());
                return;
            }
            return;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(defaultBoolean = true, name = "disable-attach-event")
    public final void setDisableAttachEvent(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLIL = map.containsKey("change");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        super.setLynxDirection(i);
        if (i == 2 || i == 2) {
            C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
            if (c77798Ug6 != null) {
                C16310kV.LJIIIZ(c77798Ug6, 1);
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
        if (c77798Ug62 != null) {
            C16310kV.LJIIIZ(c77798Ug62, 0);
        } else {
            o.LJIJI("mTabLayout");
            throw null;
        }
    }

    @VPD(defaultBoolean = false, name = "android-force-bind-change-event")
    public final void setOriginChangeEvent(boolean z) {
        if (this.LJLILLLLZI != null) {
            LJIJJLI();
        }
    }

    @VPD(name = "tab-height")
    public final void setTabHeight(float f) {
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            ViewGroup.LayoutParams layoutParams = c77798Ug6.getLayoutParams();
            if (layoutParams != null) {
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this.mContext");
                layoutParams.height = VZP.LIZ(vnu, f);
            }
            C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
            if (c77798Ug62 != null) {
                c77798Ug62.requestLayout();
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "tab-height-rpx")
    public final void setTabHeightRpx(float f) {
        this.LJLJLLL = f;
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            ViewGroup.LayoutParams layoutParams = c77798Ug6.getLayoutParams();
            if (layoutParams != null) {
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this.mContext");
                layoutParams.height = VZP.LIZJ(vnu, this.LJLJLLL);
            }
            C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
            if (c77798Ug62 != null) {
                c77798Ug62.requestLayout();
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "tab-indicator-color")
    public final void setTabIndicatorColor(String color) {
        o.LJIIJ(color, "color");
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            c77798Ug6.setSelectedTabIndicatorColor(VZP.LIZLLL(color));
        } else {
            o.LJIJI("mTabLayout");
            throw null;
        }
    }

    @VPD(name = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f) {
        Drawable drawable;
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            Drawable tabSelectedIndicator = c77798Ug6.getTabSelectedIndicator();
            if (!(tabSelectedIndicator instanceof LayerDrawable)) {
                tabSelectedIndicator = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) tabSelectedIndicator;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
            if (!(drawable instanceof GradientDrawable)) {
                drawable = null;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            if (gradientDrawable != null) {
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this.mContext");
                gradientDrawable.setSize(intrinsicWidth, VZP.LIZ(vnu, f));
            }
            C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
            if (c77798Ug62 != null) {
                c77798Ug62.requestLayout();
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f) {
        Drawable drawable;
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            Drawable tabSelectedIndicator = c77798Ug6.getTabSelectedIndicator();
            if (!(tabSelectedIndicator instanceof LayerDrawable)) {
                tabSelectedIndicator = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) tabSelectedIndicator;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
            if (!(drawable instanceof GradientDrawable)) {
                drawable = null;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            if (gradientDrawable != null) {
                o.LJFF(this.mContext, "this.mContext");
                gradientDrawable.setCornerRadius(VZP.LIZ(r1, f));
            }
            C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
            if (c77798Ug62 != null) {
                c77798Ug62.requestLayout();
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f) {
        Drawable drawable;
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            Drawable tabSelectedIndicator = c77798Ug6.getTabSelectedIndicator();
            if (!(tabSelectedIndicator instanceof LayerDrawable)) {
                tabSelectedIndicator = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) tabSelectedIndicator;
            if (layerDrawable != null) {
                drawable = layerDrawable.getDrawable(0);
            } else {
                drawable = null;
            }
            if (!(drawable instanceof GradientDrawable)) {
                drawable = null;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            if (gradientDrawable != null) {
                o.LJFF(this.mContext, "this.mContext");
                gradientDrawable.setSize((int) ((f / 375) * VZP.LIZIZ(r1)), gradientDrawable.getIntrinsicHeight());
            }
            C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
            if (c77798Ug62 != null) {
                c77798Ug62.requestLayout();
                return;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    @VPD(name = "tab-inter-space")
    public final void setTabInterspace(float f) {
        this.LJLJI = f / 2;
    }

    @VPD(defaultBoolean = false, name = "tab-new-gesture-enable")
    public final void setTabNewGesture(boolean z) {
        C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
        if (c77798Ug6 != null) {
            c77798Ug6.setNewGesture(z);
        } else {
            o.LJIJI("mTabLayout");
            throw null;
        }
    }

    @VPD(name = "tab-padding-left")
    public final void setTabPaddingLeft(int i) {
        Field field;
        Method declaredMethod;
        try {
            Object obj = null;
            if (this.LJLILLLLZI != null) {
                Class superclass = C77798Ug6.class.getSuperclass();
                if (superclass != null) {
                    field = superclass.getDeclaredField("contentInsetStart");
                } else {
                    field = null;
                }
                if (field != null) {
                    field.setAccessible(true);
                    C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
                    if (c77798Ug6 != null) {
                        VNU mContext = this.mContext;
                        o.LJFF(mContext, "mContext");
                        field.set(c77798Ug6, Integer.valueOf(VZP.LIZ(mContext, i)));
                    } else {
                        o.LJIJI("mTabLayout");
                        throw null;
                    }
                }
                if (this.LJLILLLLZI != null) {
                    Class superclass2 = C77798Ug6.class.getSuperclass();
                    if (superclass2 != null && (declaredMethod = superclass2.getDeclaredMethod("applyModeAndGravity", new Class[0])) != null) {
                        declaredMethod.setAccessible(true);
                        C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                        if (c77798Ug62 != null) {
                            obj = declaredMethod.invoke(c77798Ug62, new Object[0]);
                        } else {
                            o.LJIJI("mTabLayout");
                            throw null;
                        }
                    }
                    C3C5.m7constructorimpl(obj);
                    return;
                }
                o.LJIJI("mTabLayout");
                throw null;
            }
            o.LJIJI("mTabLayout");
            throw null;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @VPD(name = "tab-padding-right")
    public final void setTabPaddingRight(int i) {
        Field declaredField;
        try {
            if (this.LJLILLLLZI != null) {
                Class superclass = C77798Ug6.class.getSuperclass();
                if (superclass != null && (declaredField = superclass.getDeclaredField("slidingTabIndicator")) != null) {
                    declaredField.setAccessible(true);
                    C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
                    if (c77798Ug6 != null) {
                        Object obj = declaredField.get(c77798Ug6);
                        if (obj != null) {
                            LinearLayout linearLayout = (LinearLayout) obj;
                            int paddingStart = linearLayout.getPaddingStart();
                            int paddingTop = linearLayout.getPaddingTop();
                            VNU mContext = this.mContext;
                            o.LJFF(mContext, "mContext");
                            C16310kV.LJIIJ(linearLayout, paddingStart, paddingTop, VZP.LIZ(mContext, i), linearLayout.getPaddingBottom());
                            C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                            if (c77798Ug62 != null) {
                                c77798Ug62.requestLayout();
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                                return;
                            } else {
                                o.LJIJI("mTabLayout");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mTabLayout");
                        throw null;
                    }
                }
                throw new C37692Eqm("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            o.LJIJI("mTabLayout");
            throw null;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @VPD(name = "tab-layout-gravity")
    public final void setTablayoutGravity(String gravity) {
        Field declaredField;
        o.LJIIJ(gravity, "gravity");
        Locale locale = Locale.ROOT;
        o.LJFF(locale, "Locale.ROOT");
        String lowerCase = gravity.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode != 3317767 || !lowerCase.equals("left")) {
                    return;
                }
                C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
                if (c77798Ug6 != null) {
                    ViewGroup.LayoutParams layoutParams = c77798Ug6.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                    }
                    C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                    if (c77798Ug62 != null) {
                        c77798Ug62.requestLayout();
                        return;
                    } else {
                        o.LJIJI("mTabLayout");
                        throw null;
                    }
                }
                o.LJIJI("mTabLayout");
                throw null;
            }
            if (!lowerCase.equals("fill")) {
                return;
            }
            C77798Ug6 c77798Ug63 = this.LJLILLLLZI;
            if (c77798Ug63 != null) {
                c77798Ug63.setTabMode(1);
                C77798Ug6 c77798Ug64 = this.LJLILLLLZI;
                if (c77798Ug64 != null) {
                    ViewGroup.LayoutParams layoutParams2 = c77798Ug64.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = -1;
                    }
                    C77798Ug6 c77798Ug65 = this.LJLILLLLZI;
                    if (c77798Ug65 != null) {
                        c77798Ug65.setTabGravity(0);
                        C77798Ug6 c77798Ug66 = this.LJLILLLLZI;
                        if (c77798Ug66 != null) {
                            c77798Ug66.requestLayout();
                            return;
                        } else {
                            o.LJIJI("mTabLayout");
                            throw null;
                        }
                    }
                    o.LJIJI("mTabLayout");
                    throw null;
                }
                o.LJIJI("mTabLayout");
                throw null;
            }
            o.LJIJI("mTabLayout");
            throw null;
        }
        if (!lowerCase.equals("center")) {
            return;
        }
        C77798Ug6 c77798Ug67 = this.LJLILLLLZI;
        if (c77798Ug67 != null) {
            c77798Ug67.setTabGravity(1);
            C77798Ug6 c77798Ug68 = this.LJLILLLLZI;
            if (c77798Ug68 != null) {
                ViewGroup.LayoutParams layoutParams3 = c77798Ug68.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = -1;
                }
                try {
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                if (this.LJLILLLLZI != null) {
                    Class superclass = C77798Ug6.class.getSuperclass();
                    if (superclass != null && (declaredField = superclass.getDeclaredField("slidingTabIndicator")) != null) {
                        declaredField.setAccessible(true);
                        C77798Ug6 c77798Ug69 = this.LJLILLLLZI;
                        if (c77798Ug69 != null) {
                            Object obj = declaredField.get(c77798Ug69);
                            if (obj != null) {
                                LinearLayout linearLayout = (LinearLayout) obj;
                                linearLayout.setGravity(17);
                                linearLayout.getLayoutParams().width = -2;
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                                C77798Ug6 c77798Ug610 = this.LJLILLLLZI;
                                if (c77798Ug610 != null) {
                                    c77798Ug610.requestLayout();
                                    return;
                                } else {
                                    o.LJIJI("mTabLayout");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("mTabLayout");
                            throw null;
                        }
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type android.widget.LinearLayout");
                }
                o.LJIJI("mTabLayout");
                throw null;
            }
            o.LJIJI("mTabLayout");
            throw null;
        }
        o.LJIJI("mTabLayout");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.UxA] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, X.UxA] */
    public final void LJJ(int i, int i2) {
        View view;
        View view2;
        View view3;
        C80267Vep c80267Vep;
        C80267Vep c80267Vep2;
        C78856UxA c78856UxA;
        int size = this.mChildren.size();
        while (i < size) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            C68322mC c68322mC = new C68322mC();
            C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
            if (c77798Ug6 != null) {
                ?? tabAt = c77798Ug6.getTabAt(i);
                c68322mC.element = tabAt;
                if (tabAt == 0) {
                    C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                    if (c77798Ug62 != null) {
                        ?? newTab = c77798Ug62.newTab();
                        C77798Ug6 c77798Ug63 = this.LJLILLLLZI;
                        if (c77798Ug63 != 0) {
                            c77798Ug63.addTab(newTab);
                            c68322mC.element = newTab;
                        } else {
                            o.LJIJI("mTabLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mTabLayout");
                        throw null;
                    }
                }
                if (lynxBaseUI instanceof LynxTabbarItem) {
                    ((LynxTabbarItem) lynxBaseUI).LJLILLLLZI = (C78856UxA) c68322mC.element;
                }
                if (i2 == i && (c78856UxA = (C78856UxA) c68322mC.element) != null) {
                    c78856UxA.LIZIZ();
                }
                C78856UxA c78856UxA2 = (C78856UxA) c68322mC.element;
                if (c78856UxA2 != null) {
                    c78856UxA2.LIZLLL((View) ListProtector.get(this.LJLJLJ, i));
                }
                C78856UxA c78856UxA3 = (C78856UxA) c68322mC.element;
                if (c78856UxA3 != null && (c80267Vep2 = c78856UxA3.LJIIIIZZ) != null) {
                    c80267Vep2.setBackgroundColor(0);
                }
                VNU vnu = this.mContext;
                o.LJFF(vnu, "this@LynxTabBarView.mContext");
                int LIZ = VZP.LIZ(vnu, this.LJLJI);
                C78856UxA c78856UxA4 = (C78856UxA) c68322mC.element;
                if (c78856UxA4 != null && (view = c78856UxA4.LJFF) != null) {
                    if (c78856UxA4 != null && (view2 = c78856UxA4.LJFF) != null) {
                        int paddingTop = view2.getPaddingTop();
                        C78856UxA c78856UxA5 = (C78856UxA) c68322mC.element;
                        if (c78856UxA5 != null && (view3 = c78856UxA5.LJFF) != null) {
                            C16310kV.LJIIJ(view, LIZ, paddingTop, LIZ, view3.getPaddingBottom());
                            C78856UxA c78856UxA6 = (C78856UxA) c68322mC.element;
                            if (c78856UxA6 != null && (c80267Vep = c78856UxA6.LJIIIIZZ) != null) {
                                C16880lQ.LJIIJ(new ACListenerS48S0200000_14(this, c68322mC, 1), c80267Vep);
                                i++;
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        int i2;
        if ((lynxBaseUI instanceof LynxUI) && (lynxBaseUI instanceof LynxTabbarItem)) {
            LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
            lynxTabbarItem.setParent(this);
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            VTD vtd = new VTD(this.mContext);
            vtd.setOverflow(lynxTabbarItem.getOverflow());
            vtd.addView(((LynxUI) lynxBaseUI).mView);
            lynxTabbarItem.LJLJI = vtd;
            ListProtector.add(this.LJLJLJ, i, vtd);
            if (lynxTabbarItem.getProps().containsKey("tag")) {
                ((HashMap) this.LJLJL).put(Integer.valueOf(i), String.valueOf(lynxTabbarItem.getProps().get("tag")));
            }
            if (lynxTabbarItem.LJLJJI) {
                i2 = i;
            } else {
                i2 = 0;
            }
            LJJ(i, i2);
            C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
            if (c77798Ug6 != null) {
                lynxTabbarItem.LJLIL = Integer.valueOf(i);
                lynxTabbarItem.LJLJJL = c77798Ug6;
            } else {
                o.LJIJI("mTabLayout");
                throw null;
            }
        }
    }

    @EWS
    public final void selectTab(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (params.hasKey("index")) {
            int i = params.getInt("index");
            if (i >= 0) {
                C77798Ug6 c77798Ug6 = this.LJLILLLLZI;
                if (c77798Ug6 != null) {
                    if (i < c77798Ug6.getTabCount()) {
                        C77798Ug6 c77798Ug62 = this.LJLILLLLZI;
                        if (c77798Ug62 != null) {
                            C78856UxA tabAt = c77798Ug62.getTabAt(i);
                            if (tabAt != null) {
                                tabAt.LIZIZ();
                            }
                            javaOnlyMap.put("success", Boolean.TRUE);
                            if (callback != null) {
                                callback.invoke(0, javaOnlyMap);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("mTabLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("mTabLayout");
                    throw null;
                }
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }
}
