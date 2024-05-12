package com.bytedance.ies.xelement.banner;

import X.C16880lQ;
import X.C79862VVy;
import X.F5B;
import X.VNA;
import X.VOH;
import X.VPD;
import X.VPR;
import X.VZ7;
import Y.IDiS275S0100000_14;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import e32.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxSwiperView extends UISimpleView<c> implements VOH {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getAccessibilityHostView() {
        return ((c) this.mView).LLFZ;
    }

    @Override // X.VOH
    public final int getCurrentIndex() {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        return ((c) mView).getCurrentItem();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        this.mView.setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
        ((c) this.mView).LLFFF = getWidth();
        ((c) this.mView).LJII();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxSwiperView(Context context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    public static int LJIJJLI(F5B itemWidth) {
        Integer valueOf;
        int intValue;
        o.LJIIJ(itemWidth, "itemWidth");
        if (itemWidth.getType() == ReadableType.String) {
            String itemWidthStrValue = itemWidth.asString();
            o.LJFF(itemWidthStrValue, "itemWidthStrValue");
            if ((ujb.o.LJJJJ(itemWidthStrValue, "px", false) || ujb.o.LJJJJ(itemWidthStrValue, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) VPR.LIZIZ(itemWidthStrValue, 10.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.LIZIZ().widthPixels) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        c cVar = new c(context);
        cVar.setTwoItemCircularSwipe(false);
        cVar.setOnPageChangeListener(new IDiS275S0100000_14(this, 6));
        return cVar;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI child) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            this.mChildren.remove(child);
            c cVar = (c) this.mView;
            Iterator it = ((CopyOnWriteArrayList) cVar.LLIIIILZ).iterator();
            while (it.hasNext()) {
                if (it.next() == child) {
                    ((CopyOnWriteArrayList) cVar.LLIIIILZ).remove(child);
                    if (cVar.LJLLL) {
                        try {
                            ListProtector.remove(cVar.LLFII, 0);
                            LinearLayout linearLayout = cVar.LLI;
                            C16880lQ.LJZI(linearLayout, linearLayout.getChildAt(0));
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    if (cVar.LLIFFJFJJ != null) {
                        cVar.LJ();
                        cVar.LLIFFJFJJ.notifyDataSetChanged();
                    }
                    cVar.LIZJ();
                    return;
                }
            }
        }
    }

    @VPD(defaultBoolean = false, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        c cVar = (c) this.mView;
        cVar.LJLLLLLL = z;
        cVar.LJIIIIZZ();
    }

    @VPD(defaultBoolean = false, name = "circular")
    public final void setCircular(boolean z) {
        c cVar = (c) this.mView;
        if (cVar.LJLLLL != z) {
            int LJIIIZ = cVar.LJIIIZ(cVar.LLFZ.getCurrentItem());
            cVar.LJLLLL = z;
            VZ7 vz7 = cVar.LLIFFJFJJ;
            if (vz7 != null) {
                vz7.notifyDataSetChanged();
                cVar.LLFZ.setCurrentItem(LJIIIZ);
            }
        }
    }

    @VPD(defaultInt = 0, name = "current")
    public final void setCurrentIndex(int i) {
        ((c) this.mView).LJI(i);
    }

    @VPD(name = "current-item-id")
    public final void setCurrentItemId(String id) {
        o.LJIIJ(id, "id");
        List<LynxBaseUI> mChildren = this.mChildren;
        o.LJFF(mChildren, "mChildren");
        for (LynxBaseUI lynxBaseUI : mChildren) {
            LynxBaseUI it = lynxBaseUI;
            o.LJFF(it, "it");
            if (o.LJ(it.mName, id)) {
                if (lynxBaseUI != null) {
                    ((c) this.mView).LJI(this.mChildren.indexOf(lynxBaseUI));
                    return;
                }
                return;
            }
        }
    }

    @VPD(defaultInt = LiveMaxRetainAlogMessageSizeSetting.DEFAULT, name = "duration")
    public final void setDuration(int i) {
        ((c) this.mView).LJLJJLL = i;
    }

    @VPD(name = "end-margin")
    public final void setEndMargin(F5B margin) {
        o.LJIIJ(margin, "margin");
        ((c) this.mView).LJLLI = LJIJJLI(margin);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLIL = map.containsKey("change");
            this.LJLILLLLZI = map.containsKey("transition");
            this.LJLJI = map.containsKey("scrollstart");
            this.LJLJJI = map.containsKey("scrollend");
        }
    }

    @VPD(defaultBoolean = true, name = "hideshadow")
    public final void setHideShadow(boolean z) {
        ((c) this.mView).LJZ = z;
    }

    @VPD(defaultBoolean = false, name = "indicator-dots")
    public final void setIndicator(boolean z) {
        ((c) this.mView).LJLLL = z;
    }

    @VPD(name = "indicator-active-color")
    public final void setIndicatorActiveColor(String color) {
        o.LJIIJ(color, "color");
        try {
            ((c) this.mView).LL = ColorUtils.LIZ(color);
        } catch (Exception unused) {
        }
    }

    @VPD(name = "indicator-color")
    public final void setIndicatorColor(String color) {
        o.LJIIJ(color, "color");
        try {
            ((c) this.mView).LLD = ColorUtils.LIZ(color);
        } catch (Exception unused) {
        }
    }

    @VPD(defaultInt = 5000, name = "interval")
    public final void setInterval(int i) {
        c cVar = (c) this.mView;
        cVar.LJLJJL = i;
        cVar.LJIIIIZZ();
    }

    @VPD(name = "item-width")
    public final void setItemWidth(F5B itemWidth) {
        o.LJIIJ(itemWidth, "itemWidth");
        ((c) this.mView).LJLLILLLL = LJIJJLI(itemWidth);
    }

    @VPD(name = "mode")
    public final void setMode(String mode) {
        o.LJIIJ(mode, "mode");
        c cVar = (c) this.mView;
        cVar.LJLLJ = mode;
        if (!mode.equals("coverflow") && !mode.equals("flat-coverflow")) {
            cVar.LJZ = true;
            cVar.LJZL = Color.argb(128, 0, 0, 0);
        }
        cVar.LJFF(cVar.LJLJL, cVar.LJLJLJ, cVar.LJLLJ, cVar.LJLJLLL);
    }

    @VPD(name = "next-margin")
    public final void setNextMargin(F5B nextMarginValue) {
        Integer valueOf;
        int intValue;
        o.LJIIJ(nextMarginValue, "nextMarginValue");
        if (nextMarginValue.getType() == ReadableType.String) {
            String nextMarginStrValue = nextMarginValue.asString();
            o.LJFF(nextMarginStrValue, "nextMarginStrValue");
            if ((ujb.o.LJJJJ(nextMarginStrValue, "px", false) || ujb.o.LJJJJ(nextMarginStrValue, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) VPR.LIZIZ(nextMarginStrValue, -1.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.LIZIZ().widthPixels) {
                int intValue2 = valueOf.intValue();
                c cVar = (c) this.mView;
                cVar.LJLJLLL = intValue2;
                cVar.LJFF(cVar.LJLJL, cVar.LJLJLJ, cVar.LJLLJ, intValue2);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(int i) {
        super.setOverflow(i);
        ((c) this.mView).setOverflow(i);
    }

    @VPD(name = "page-margin")
    public final void setPageMargin(F5B pageMargin) {
        Integer valueOf;
        int intValue;
        o.LJIIJ(pageMargin, "pageMargin");
        if (pageMargin.getType() == ReadableType.String) {
            String pageMarginStrValue = pageMargin.asString();
            o.LJFF(pageMarginStrValue, "pageMarginStrValue");
            if ((ujb.o.LJJJJ(pageMarginStrValue, "px", false) || ujb.o.LJJJJ(pageMarginStrValue, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) VPR.LIZIZ(pageMarginStrValue, 10.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.LIZIZ().widthPixels) {
                int intValue2 = valueOf.intValue();
                c cVar = (c) this.mView;
                cVar.LJLJL = intValue2;
                cVar.LJFF(intValue2, cVar.LJLJLJ, cVar.LJLLJ, cVar.LJLJLLL);
            }
        }
    }

    @VPD(name = "previous-margin")
    public final void setPreviousMargin(F5B previousMarginValue) {
        Integer valueOf;
        int intValue;
        o.LJIIJ(previousMarginValue, "previousMarginValue");
        if (previousMarginValue.getType() == ReadableType.String) {
            String previousMarginStrValue = previousMarginValue.asString();
            o.LJFF(previousMarginStrValue, "previousMarginStrValue");
            if ((ujb.o.LJJJJ(previousMarginStrValue, "px", false) || ujb.o.LJJJJ(previousMarginStrValue, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) VPR.LIZIZ(previousMarginStrValue, -1.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.LIZIZ().widthPixels) {
                int intValue2 = valueOf.intValue();
                c cVar = (c) this.mView;
                cVar.LJLJLJ = intValue2;
                cVar.LJFF(cVar.LJLJL, intValue2, cVar.LJLLJ, cVar.LJLJLLL);
            }
        }
    }

    @VPD(name = "hardware_texture")
    public final void setRenderHardwareTexture(boolean z) {
        if (z) {
            ((c) this.mView).setLayerTextureType(2);
        } else {
            ((c) this.mView).setLayerTextureType(0);
        }
    }

    @VPD(name = "shadow-color")
    public final void setShadowColor(String shadowColor) {
        o.LJIIJ(shadowColor, "shadowColor");
        try {
            ((c) this.mView).LJZL = ColorUtils.LIZ(shadowColor);
        } catch (Exception unused) {
        }
    }

    @VPD(defaultBoolean = true, name = "smooth-scroll")
    public final void setSmoothScroll(boolean z) {
        c cVar = (c) this.mView;
        cVar.LJZI = z;
        cVar.LJFF(cVar.LJLJL, cVar.LJLJLJ, cVar.LJLLJ, cVar.LJLJLLL);
    }

    @VPD(name = "start-margin")
    public final void setStartMargin(F5B margin) {
        o.LJIIJ(margin, "margin");
        ((c) this.mView).LJLL = LJIJJLI(margin);
    }

    @VPD(defaultBoolean = false, name = "touchable")
    public final void setTouchable(boolean z) {
        c cVar = (c) this.mView;
        cVar.LJLZ = z;
        C79862VVy c79862VVy = cVar.LLFZ;
        if (c79862VVy != null) {
            c79862VVy.setScrollable(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI child, int i) {
        o.LJIIJ(child, "child");
        if (child instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, child);
            c cVar = (c) this.mView;
            ((CopyOnWriteArrayList) cVar.LLIIIILZ).add(child);
            if (cVar.LJLLL) {
                View view = new View(cVar.getContext());
                view.setClickable(false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cVar.LJLJI, cVar.LJLJJI);
                int i2 = cVar.LJLILLLLZI;
                layoutParams.leftMargin = i2;
                layoutParams.rightMargin = i2;
                cVar.LLI.addView(view, layoutParams);
                view.setBackground(c.LIZ(cVar.LLD));
                ((ArrayList) cVar.LLFII).add(view);
            }
            if (cVar.LLIFFJFJJ != null) {
                cVar.LJ();
                cVar.LLIFFJFJJ.notifyDataSetChanged();
            }
            cVar.LIZJ();
            child.setParent(this);
        }
    }
}
