package com.lynx.tasm.behavior.ui.swiper;

import X.C16880lQ;
import X.C49615Jdb;
import X.EWS;
import X.F5B;
import X.V9Y;
import X.VNA;
import X.VNU;
import X.VOH;
import X.VPD;
import X.VPR;
import X.VZ9;
import X.VZA;
import X.VZB;
import X.VZD;
import X.VZE;
import X.VZF;
import X.VZI;
import Y.IDCListenerS248S0100000_14;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class XSwiperUI extends UISimpleView<VZ9> implements VOH {
    public static final int LLIIII = Color.argb(255, 255, 255, 255);
    public static final int LLIIIILZ = Color.argb(89, 255, 255, 255);
    public String LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public long LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final VZF LLFII;
    public final VZE LLFZ;
    public final Handler LLI;
    public final List<View> LLIFFJFJJ;
    public final VZD LLII;

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean enableAutoClipRadius() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
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

    public final void LJIL() {
        ((VZ9) this.mView).getViewPager().setAdapter(new VZI(this));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getAccessibilityHostView() {
        return ((VZ9) this.mView).getViewPager();
    }

    @Override // X.VOH
    public final int getCurrentIndex() {
        return ((VZ9) this.mView).getViewPager().getCurrentIndex();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        boolean z;
        int width = getWidth();
        int height = getHeight();
        super.onLayoutUpdated();
        this.mView.setPadding(this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
        ((ArrayList) this.LLIFFJFJJ).clear();
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            ((ArrayList) this.LLIFFJFJJ).add(((LynxUI) it.next()).mView);
        }
        LJIL();
        ((VZ9) this.mView).setIsRtl(isRtl());
        if (getOverflow() != 0) {
            ((ViewGroup) this.mView).setClipChildren(false);
        }
        boolean z2 = true;
        if (this.LJLJLJ != width) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLJLLL == height) {
            z2 = false;
        }
        LJIJJLI(z, z2, false);
        if (this.LJLJLJ != width || this.LJLJLLL != height) {
            float f = width;
            float f2 = height;
            if (this.LJLJL && DisplayMetricsHolder.LIZIZ() != null) {
                C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "contentsizechanged");
                c49615Jdb.LIZJ(Float.valueOf(V9Y.LIZIZ(f)), "contentWidth");
                c49615Jdb.LIZJ(Float.valueOf(V9Y.LIZIZ(f2)), "contentHeight");
                VNU vnu = this.mContext;
                if (vnu != null) {
                    vnu.LJLJJL.LIZIZ(c49615Jdb);
                }
            }
            this.LJLJLJ = width;
            this.LJLJLLL = height;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLF) {
            LJIJJLI(false, false, true);
            this.LLF = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return this.LJLLJ;
    }

    public XSwiperUI(VNU vnu) {
        super(vnu);
        this.LJLIL = "normal";
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLL = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
        this.LJLLLLLL = true;
        this.LJLZ = 5000;
        this.LJZ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LLFF = true;
        this.LLFII = new VZF();
        this.LLFZ = new VZE();
        this.LLI = new Handler(C16880lQ.LLJJJJ());
        this.LLIFFJFJJ = new ArrayList();
        this.LLII = new VZD(this);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        VZ9 vz9 = new VZ9(context);
        VZA viewPager = vz9.getViewPager();
        ((ArrayList) viewPager.LLILLJJLI).add(new VZB(this, vz9));
        vz9.addOnAttachStateChangeListener(new IDCListenerS248S0100000_14(this, 4));
        LLog.LIZLLL(2, "LynxSwiperUI", "create Android NewSwiperView");
        return vz9;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            ((ArrayList) this.LLIFFJFJJ).remove(((LynxUI) lynxBaseUI).mView);
            LJIL();
            VZ9 vz9 = (VZ9) this.mView;
            if (vz9.LJLILLLLZI.getChildCount() > 0) {
                C16880lQ.LLII(vz9.LJLILLLLZI, 0);
                vz9.setSelected(vz9.LJLJJLL);
            }
            LJIJJLI(false, false, true);
        }
    }

    @VPD(defaultBoolean = false, name = "autoplay")
    public void setAutoPlay(boolean z) {
        this.LJLLL = z;
        this.LLI.removeCallbacks(this.LLII);
        if (this.LJLLL) {
            this.LLI.postDelayed(this.LLII, this.LJLZ);
        }
    }

    @VPD(defaultFloat = LiveBgMusicDefaultVolumeSetting.DEFAULT, name = "bounce-begin-threshold")
    public void setBounceBeginThreshold(float f) {
        ((VZ9) this.mView).getViewPager().setBounceBeginThreshold(f);
    }

    @VPD(defaultInt = LiveMaxRetainAlogMessageSizeSetting.DEFAULT, name = "bounce-duration")
    public void setBounceDuration(int i) {
        ((VZ9) this.mView).getViewPager().setBounceDuration(i);
    }

    @VPD(defaultFloat = LiveBgMusicDefaultVolumeSetting.DEFAULT, name = "bounce-end-threshold")
    public void setBounceEndThreshold(float f) {
        ((VZ9) this.mView).getViewPager().setBounceEndThreshold(f);
    }

    @VPD(defaultBoolean = false, name = "circular")
    public void setCircular(boolean z) {
        this.LJLLLL = z;
        ((VZ9) this.mView).getViewPager().setLoop(z);
    }

    @VPD(defaultBoolean = true, name = "compatible")
    public void setCompatible(boolean z) {
        this.LLFF = z;
        this.LLF = true;
    }

    @VPD(defaultInt = 0, name = "current")
    public void setCurrentIndex(int i) {
        VZA viewPager = ((VZ9) this.mView).getViewPager();
        if (viewPager.getChildCount() > 0) {
            boolean z = this.LJLLLLLL;
            viewPager.LJLJLJ = i;
            viewPager.LJLIL = z;
            LJJ(viewPager, i, z, false);
            return;
        }
        viewPager.LJLJLJ = i;
        viewPager.LJLIL = false;
    }

    @VPD(defaultInt = LiveMaxRetainAlogMessageSizeSetting.DEFAULT, name = "duration")
    public void setDuration(int i) {
        this.LJZ = i;
        if (this.LJLLLLLL) {
            ((VZ9) this.mView).getViewPager().setAnimDuration(i);
        } else {
            ((VZ9) this.mView).getViewPager().setAnimDuration(0);
        }
    }

    @VPD(defaultBoolean = false, name = "enable-bounce")
    public void setEnableBounce(boolean z) {
        ((VZ9) this.mView).getViewPager().setEnableBounce(z);
    }

    @VPD(defaultBoolean = false, name = "enable-nested-child")
    public void setEnableNestedChild(boolean z) {
        VZA viewPager = ((VZ9) this.mView).getViewPager();
        if (viewPager != null) {
            viewPager.setEnableNestedChild(z);
        }
    }

    @VPD(defaultBoolean = true, name = "enable-vice-loop")
    public void setEnableViceLoop(boolean z) {
        ((VZ9) this.mView).getViewPager().setEnableViceLoop(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLILLLLZI = map.containsKey("change");
            this.LJLJI = map.containsKey("scrollstart");
            this.LJLJJI = map.containsKey("scrollend");
            this.LJLJJL = map.containsKey("transition");
            this.LJLJJLL = map.containsKey("scrolltobounce");
            this.LJLJL = map.containsKey("contentsizechanged");
        }
    }

    @VPD(defaultBoolean = false, name = "finish-reset")
    public void setFinishReset(boolean z) {
        this.LLD = z;
    }

    @VPD(defaultBoolean = false, name = "force-can-scroll")
    public void setForceCanScroll(boolean z) {
        ((VZ9) this.mView).getViewPager().setForceCanScroll(z);
    }

    @VPD(defaultBoolean = true, name = "handle-gesture")
    public void setHandleGesture(boolean z) {
        ((VZ9) this.mView).getViewPager().setHandleGesture(z);
    }

    @VPD(defaultBoolean = false, name = "ignore-layout-update")
    public void setIgnoreLayoutUpdate(boolean z) {
        ((VZ9) this.mView).getViewPager().setIgnoreLayoutUpdate(z);
    }

    @VPD(defaultBoolean = false, name = "indicator-dots")
    public void setIndicator(boolean z) {
        int i;
        LinearLayout linearLayout = ((VZ9) this.mView).LJLILLLLZI;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    @VPD(name = "indicator-active-color")
    public void setIndicatorActiveColor(String str) {
        int i;
        try {
            i = ColorUtils.LIZ(str);
        } catch (Exception unused) {
            i = LLIIII;
        }
        ((VZ9) this.mView).setSelectedColor(i);
    }

    @VPD(name = "indicator-color")
    public void setIndicatorColor(String str) {
        int i;
        try {
            i = ColorUtils.LIZ(str);
        } catch (Exception unused) {
            i = LLIIIILZ;
        }
        ((VZ9) this.mView).setUnSelectedColor(i);
    }

    @VPD(defaultInt = 5000, name = "interval")
    public void setInterval(int i) {
        this.LJLZ = i;
    }

    @VPD(defaultBoolean = false, name = "keep-item-view")
    public void setKeepItemView(boolean z) {
        ((VZ9) this.mView).getViewPager().setKeepItemView(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        super.setLynxDirection(i);
        if (i == 2 || i == 2) {
            ((VZ9) this.mView).setIsRtl(true);
        } else {
            ((VZ9) this.mView).setIsRtl(false);
        }
        this.LLF = true;
    }

    @VPD(name = "max-x-scale")
    public void setMaxXScale(double d) {
        this.LLFZ.LIZJ = (float) d;
    }

    @VPD(name = "max-y-scale")
    public void setMaxYScale(double d) {
        this.LLFZ.LJ = (float) d;
    }

    @VPD(name = "min-x-scale")
    public void setMinXScale(double d) {
        this.LLFZ.LIZIZ = (float) d;
    }

    @VPD(name = "min-y-scale")
    public void setMinYScale(double d) {
        this.LLFZ.LIZLLL = (float) d;
    }

    @VPD(name = "mode")
    public void setMode(String str) {
        this.LJLIL = str;
        this.LLF = true;
    }

    @VPD(name = "next-margin")
    public void setNextMargin(F5B f5b) {
        if (f5b.getType() != ReadableType.String) {
            return;
        }
        String asString = f5b.asString();
        if (asString.endsWith("px") || asString.endsWith("rpx")) {
            int LIZIZ = (int) VPR.LIZIZ(asString, -1.0f);
            if (LIZIZ < 0) {
                LIZIZ = -1;
            }
            this.LJLLI = LIZIZ;
            this.LLF = true;
        }
    }

    @VPD(defaultFloat = 0.0f, name = "norm-translation-factor")
    public void setNormalTranslationFactor(double d) {
        if (d <= 1.0d && d >= -1.0d) {
            this.LLFZ.LIZ = (float) d;
            this.LLF = true;
        }
    }

    @VPD(name = "orientation")
    public void setOrientation(String str) {
        if ("vertical".equals(str)) {
            this.LJLLJ = true;
            ((VZ9) this.mView).setOrientation(1);
        } else if ("horizontal".equals(str)) {
            this.LJLLJ = false;
            ((VZ9) this.mView).setOrientation(0);
        }
        this.LLF = true;
    }

    @VPD(name = "page-margin")
    public void setPageMargin(F5B f5b) {
        if (f5b.getType() == ReadableType.String) {
            String asString = f5b.asString();
            if (asString.endsWith("px") || asString.endsWith("rpx")) {
                int LIZIZ = (int) VPR.LIZIZ(asString, 0.0f);
                if (LIZIZ <= 0) {
                    LIZIZ = 0;
                }
                this.LJLL = LIZIZ;
                this.LLF = true;
            }
        }
    }

    @VPD(name = "previous-margin")
    public void setPreviousMargin(F5B f5b) {
        if (f5b.getType() != ReadableType.String) {
            return;
        }
        String asString = f5b.asString();
        if (asString.endsWith("px") || asString.endsWith("rpx")) {
            int LIZIZ = (int) VPR.LIZIZ(asString, -1.0f);
            if (LIZIZ < 0) {
                LIZIZ = -1;
            }
            this.LJLLILLLL = LIZIZ;
            this.LLF = true;
        }
    }

    @VPD(defaultBoolean = false, name = "scroll-before-detached")
    public void setScrollBeforeDetached(boolean z) {
        this.LLFFF = z;
    }

    @VPD(defaultBoolean = true, name = "smooth-scroll")
    public void setSmoothScroll(boolean z) {
        this.LJLLLLLL = z;
        if (z) {
            ((VZ9) this.mView).getViewPager().setAnimDuration(this.LJZ);
        } else {
            ((VZ9) this.mView).getViewPager().setAnimDuration(0);
        }
    }

    @VPD(defaultBoolean = false, name = "touchable")
    public void setTouchable(boolean z) {
        ((VZ9) this.mView).getViewPager().setTouchable(z);
    }

    @VPD(defaultInt = 0, name = "transition-throttle")
    public void setTransitionThrottle(int i) {
        this.LJZI = i;
    }

    @VPD(defaultBoolean = false, name = "vertical")
    public void setVertical(boolean z) {
        if (z) {
            ((VZ9) this.mView).setOrientation(1);
        } else {
            ((VZ9) this.mView).setOrientation(0);
        }
        this.LJLLJ = z;
        this.LLF = true;
    }

    public final boolean LJJI(VZA vza, int i) {
        int i2 = this.LJLLILLLL;
        int i3 = this.LJLLI;
        int i4 = (i - i2) - i3;
        int i5 = this.LJLL;
        int i6 = (i4 - i5) - i5;
        if (this.LLFF) {
            i4 = i6;
        }
        if (i2 >= 0 && i3 >= 0 && i4 > 0) {
            vza.setPageSize(i4);
            int i7 = this.LJLLILLLL;
            int i8 = this.LJLL + i7;
            if (this.LLFF) {
                i7 = i8;
            }
            if (isRtl() && !this.LJLLJ) {
                vza.LJIJJ(-i7, false);
            } else {
                vza.LJIJJ(i7, false);
            }
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            lynxBaseUI.setParent(this);
            ListProtector.add(this.LLIFFJFJJ, i, ((LynxUI) lynxBaseUI).mView);
            LJIL();
            ((VZ9) this.mView).LIZ();
            LJIJJLI(false, false, true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellPrepareForReuse(String str, UIList uIList) {
        int i;
        super.onListCellPrepareForReuse(str, uIList);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String constructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        if (((HashMap) uIList.LLFF).containsKey(constructListStateCacheKey)) {
            i = ((Integer) ((HashMap) uIList.LLFF).get(constructListStateCacheKey)).intValue();
        } else {
            i = -1;
        }
        LJJ(((VZ9) this.mView).getViewPager(), i, false, false);
    }

    @EWS
    public void scrollTo(ReadableMap readableMap, Callback callback) {
        VZA viewPager = ((VZ9) this.mView).getViewPager();
        if (viewPager == null || viewPager.getAdapter() == null) {
            callback.invoke(1, "Check failed when invoking scrollTo method: viewPager == null || adapter == null");
            return;
        }
        int i = readableMap.getInt("index", -1);
        boolean z = readableMap.getBoolean("smooth", this.LJLLLLLL);
        int i2 = !readableMap.getString("direction", "end").equals("begin") ? 1 : 0;
        if (viewPager.getChildCount() == 0) {
            callback.invoke(1, "Check failed when invoking scrollTo method: no swiper item added to viewpager");
            return;
        }
        if (i < 0 || i >= viewPager.getTotalCount()) {
            callback.invoke(4, "Check failed when invoking scrollTo method: index < 0 or index >= data count");
            return;
        }
        if (i < viewPager.getTotalCount()) {
            viewPager.LJIJI(i, i2, z);
        }
        callback.invoke(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if (r1.equals("carry") == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.swiper.XSwiperUI.LJIJJLI(boolean, boolean, boolean):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellDisAppear(String str, UIList uIList, boolean z) {
        super.onListCellDisAppear(str, uIList, z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String constructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        if (z) {
            ((HashMap) uIList.LLFF).put(constructListStateCacheKey, Integer.valueOf(((VZ9) this.mView).getViewPager().getCurrentIndex()));
            return;
        }
        ((HashMap) uIList.LLFF).remove(constructListStateCacheKey);
    }

    public final void LJJ(VZA vza, int i, boolean z, boolean z2) {
        int totalCount = vza.getTotalCount();
        int currentIndex = vza.getCurrentIndex();
        int i2 = 1;
        if (this.LJLLLL) {
            if (i == 0 && currentIndex == totalCount - 1) {
                if (totalCount <= 2 && !z2) {
                    i2 = 0;
                }
                if (i < vza.getTotalCount()) {
                    vza.LJIJI(i, i2, z);
                    return;
                }
                return;
            }
            if (i == totalCount - 1 && currentIndex == 0) {
                if (totalCount > 2) {
                    i2 = 0;
                }
                int totalCount2 = vza.getTotalCount();
                if (i < 0 || i >= totalCount2) {
                    return;
                }
                vza.LJIJI(i, i2, z);
                return;
            }
        }
        if (i < currentIndex) {
            i2 = 0;
        }
        int totalCount3 = vza.getTotalCount();
        if (i < 0 || i >= totalCount3) {
            return;
        }
        vza.LJIJI(i, i2, z);
    }
}
