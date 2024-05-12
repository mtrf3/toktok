package com.lynx.tasm.behavior.ui.list;

import X.C0A2;
import X.C16320kW;
import X.C16880lQ;
import X.C40161hs;
import X.C40171ht;
import X.C49615Jdb;
import X.C49712JfA;
import X.C79655VNz;
import X.C79688VPg;
import X.C79698VPq;
import X.C79818VUg;
import X.C79819VUh;
import X.C79826VUo;
import X.C79829VUr;
import X.C79831VUt;
import X.C79833VUv;
import X.C79834VUw;
import X.C79835VUx;
import X.C79836VUy;
import X.C79837VUz;
import X.ChoreographerFrameCallbackC79832VUu;
import X.EWS;
import X.EnumC59959Ng3;
import X.F5B;
import X.RunnableC79830VUs;
import X.V9Y;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VPQ;
import X.VRX;
import X.VV0;
import X.VV1;
import X.VV2;
import X.ViewOnAttachStateChangeListenerC79828VUq;
import X.X1D;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class UIList extends AbsLynxList<RecyclerView> {
    public static final /* synthetic */ int LLIILII = 0;
    public C79829VUr LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public C79818VUg LJLJLLL;
    public C49712JfA LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public C40161hs LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public C79698VPq LJLLLLLL;
    public ViewOnAttachStateChangeListenerC79828VUq LJLZ;
    public C79834VUw LJZ;
    public int LJZI;
    public int LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public final Map<String, Object> LLFF;
    public ReadableMap LLFFF;
    public final ArrayList<String> LLFII;
    public final HashMap<String, ArrayList<VPQ>> LLFZ;
    public ReadableMap LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public ChoreographerFrameCallbackC79832VUu LLIIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList, com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setCacheQueueRatio(F5B f5b) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollStateChangeEventThrottle(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollX(F5B f5b) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollY(F5B f5b) {
    }

    public final boolean LJJ() {
        VNU vnu = this.mContext;
        if (vnu == null || vnu.LJI() == null) {
            return false;
        }
        EnumC59959Ng3 threadStrategyForRendering = this.mContext.LJI().getThreadStrategyForRendering();
        if (threadStrategyForRendering != EnumC59959Ng3.MOST_ON_TASM && threadStrategyForRendering != EnumC59959Ng3.MULTI_THREADS) {
            return false;
        }
        return true;
    }

    public final boolean LJJI() {
        VNU vnu = this.mContext;
        if (vnu == null || vnu.LJI() == null || this.mContext.LJI().getThreadStrategyForRendering() != EnumC59959Ng3.PART_ON_LAYOUT) {
            return false;
        }
        return true;
    }

    public final void LJJII() {
        if (this.LLIIL != null) {
            C16880lQ.LLIIIJ().removeFrameCallback(this.LLIIL);
            this.LLIIL = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        TraceEvent.LIZIZ("UIList.layout");
        ViewGroup viewGroup = this.LJLLLLLL;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.mView;
        }
        if (!viewGroup.isLayoutRequested()) {
            TraceEvent.LJ("UIList.layout");
            return;
        }
        layoutChildren();
        C79698VPq c79698VPq = this.LJLLLLLL;
        if (c79698VPq != null) {
            c79698VPq.layout(getLeft(), getTop(), getWidth() + getLeft(), getHeight() + getTop());
        } else {
            ((ViewGroup) this.mView).layout(getLeft(), getTop(), getWidth() + getLeft(), getHeight() + getTop());
        }
        C16320kW.LIZJ(this.mView, getBoundRectForOverflow());
        this.LJZ.LIZIZ();
        TraceEvent.LJ("UIList.layout");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void layoutChildren() {
        if (this.LLIIIL && this.LJLLLLLL != null) {
            UIComponent uIComponent = this.LJLZ.LJLJJLL.LIZ;
            if (uIComponent != null) {
                uIComponent.performLayoutChildrenUI();
            }
            UIComponent uIComponent2 = this.LJLZ.LJLJL.LIZ;
            if (uIComponent2 != null) {
                uIComponent2.performLayoutChildrenUI();
            }
        }
        super.layoutChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        int makeMeasureSpec;
        TraceEvent.LIZIZ("UIList.measure");
        ViewGroup viewGroup = this.LJLLLLLL;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.mView;
        }
        if (!viewGroup.isLayoutRequested()) {
            TraceEvent.LJ("UIList.measure");
            return;
        }
        measureChildren();
        setLayoutParamsInternal();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        if (this.LJLLI) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) this.mMaxHeight, LiveLayoutPreloadThreadPriority.DEFAULT);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824);
        }
        C79698VPq c79698VPq = this.LJLLLLLL;
        if (c79698VPq != null) {
            c79698VPq.measure(makeMeasureSpec2, makeMeasureSpec);
        }
        this.mView.measure(makeMeasureSpec2, makeMeasureSpec);
        this.LJLJI.LJLJJL = true;
        TraceEvent.LJ("UIList.measure");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.recyclerview.widget.LinearLayoutManager, com.lynx.tasm.behavior.ui.list.ListLayoutManager$ListGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.lynx.tasm.behavior.ui.list.ListLayoutManager$ListLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        JavaOnlyMap javaOnlyMap;
        int size;
        C79818VUg c79818VUg;
        C79833VUv c79833VUv;
        ReadableMap readableMap;
        super.onPropsUpdated();
        if (this.LJLLLL) {
            this.LJLLLL = false;
            return;
        }
        if (((RecyclerView) this.mView).getAdapter() == null) {
            ((RecyclerView) this.mView).setAdapter(this.LJLJI);
        }
        if (LJJ() && (!this.LLIFFJFJJ || !this.LLIIJI)) {
            VNU vnu = this.mContext;
            if (vnu == null || vnu.LJI() == null) {
                return;
            }
            this.mContext.LJIIIIZZ(new Exception("multi thread strategy can not be used for List !!!"));
            return;
        }
        if (this.LLIFFJFJJ) {
            this.LJLJI.LJLJL = LJJ();
            ReadableMap readableMap2 = this.LLI;
            if (readableMap2 != null) {
                C79829VUr c79829VUr = this.LJLJI;
                c79829VUr.LJLJJI = true;
                ReadableArray array = readableMap2.getArray("updateAction");
                ReadableArray array2 = readableMap2.getArray("insertAction");
                ReadableArray array3 = readableMap2.getArray("removeAction");
                if (array == null && array2 == null && array3 == null) {
                    readableMap = null;
                } else {
                    if (c79829VUr.LJZL == null) {
                        c79829VUr.LJZL = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLJLJ == null) {
                        c79829VUr.LJLJLJ = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLJLLL == null) {
                        c79829VUr.LJLJLLL = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLLL == null) {
                        c79829VUr.LJLLL = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLLLL == null) {
                        c79829VUr.LJLLLL = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLL == null) {
                        c79829VUr.LJLL = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLLLLLL == null) {
                        c79829VUr.LJLLLLLL = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLLI == null) {
                        c79829VUr.LJLLI = new JavaOnlyArray();
                    }
                    if (c79829VUr.LJLLJ == null) {
                        c79829VUr.LJLLJ = new JavaOnlyArray();
                    }
                    C79835VUx c79835VUx = c79829VUr.LJLZ;
                    c79835VUx.getClass();
                    if (array3 != null) {
                        for (int size2 = array3.size() - 1; size2 >= 0; size2--) {
                            int i = array3.getInt(size2);
                            if (i >= 0) {
                                c79835VUx.LJI.LJZL.remove(i);
                                c79835VUx.LJI.LJLJLJ.remove(i);
                                c79835VUx.LJI.LJLLJ.remove(i);
                                c79835VUx.LJI.LJLLL.remove(i);
                                c79835VUx.LJI.LJLLLL.remove(i);
                                c79835VUx.LJI.LJLLLLLL.remove(i);
                            }
                        }
                    }
                    if (array2 != null) {
                        for (int i2 = 0; i2 < array2.size(); i2++) {
                            ReadableMap map = array2.getMap(i2);
                            if (map != null) {
                                int i3 = map.getInt("position");
                                String string = map.getString("item-key");
                                String string2 = map.getString("type");
                                boolean z = map.getBoolean("full-span", false);
                                boolean z2 = map.getBoolean("sticky-top", false);
                                boolean z3 = map.getBoolean("sticky-bottom", false);
                                int i4 = map.getInt("estimated-height-px", -1);
                                c79835VUx.LJI.LJZL.add(i3, string);
                                c79835VUx.LJI.LJLJLJ.add(i3, string2);
                                if (!c79835VUx.LJI.LJLIL.containsKey(string2)) {
                                    HashMap<String, Integer> hashMap = c79835VUx.LJI.LJLIL;
                                    hashMap.put(string2, Integer.valueOf(hashMap.size()));
                                }
                                c79835VUx.LJI.LJLLL.add(i3, Boolean.valueOf(z));
                                c79835VUx.LJI.LJLLLL.add(i3, Boolean.valueOf(z2));
                                c79835VUx.LJI.LJLLLLLL.add(i3, Boolean.valueOf(z3));
                                c79835VUx.LJI.LJLLJ.add(i3, Integer.valueOf(i4));
                            }
                        }
                    }
                    if (array != null) {
                        for (int i5 = 0; i5 < array.size(); i5++) {
                            ReadableMap map2 = array.getMap(i5);
                            if (map2 != null) {
                                int i6 = map2.getInt("from");
                                map2.getInt("to");
                                String string3 = map2.getString("item-key");
                                String string4 = map2.getString("type");
                                boolean z4 = map2.getBoolean("full-span", false);
                                boolean z5 = map2.getBoolean("sticky-top", false);
                                boolean z6 = map2.getBoolean("sticky-bottom", false);
                                int i7 = map2.getInt("estimated-height-px", -1);
                                c79835VUx.LJI.LJZL.set(i6, string3);
                                c79835VUx.LJI.LJLJLJ.set(i6, string4);
                                if (!c79835VUx.LJI.LJLIL.containsKey(string4)) {
                                    HashMap<String, Integer> hashMap2 = c79835VUx.LJI.LJLIL;
                                    hashMap2.put(string4, Integer.valueOf(hashMap2.size()));
                                }
                                c79835VUx.LJI.LJLLL.set(i6, Boolean.valueOf(z4));
                                c79835VUx.LJI.LJLLLL.set(i6, Boolean.valueOf(z5));
                                c79835VUx.LJI.LJLLLLLL.set(i6, Boolean.valueOf(z6));
                                c79835VUx.LJI.LJLLJ.set(i6, Integer.valueOf(i7));
                            }
                        }
                    }
                    C79835VUx c79835VUx2 = c79829VUr.LJLZ;
                    c79835VUx2.LJI.LJLJLLL.clear();
                    c79835VUx2.LJI.LJLLI.clear();
                    c79835VUx2.LJI.LJLL.clear();
                    for (int i8 = 0; i8 < c79835VUx2.LJI.LJLLL.size(); i8++) {
                        if (c79835VUx2.LJI.LJLLL.getBoolean(i8)) {
                            c79835VUx2.LJI.LJLJLLL.add(Integer.valueOf(i8));
                        }
                    }
                    for (int i9 = 0; i9 < c79835VUx2.LJI.LJLLLL.size(); i9++) {
                        if (c79835VUx2.LJI.LJLLLL.getBoolean(i9)) {
                            c79835VUx2.LJI.LJLL.add(Integer.valueOf(i9));
                        }
                    }
                    for (int i10 = 0; i10 < c79835VUx2.LJI.LJLLLLLL.size(); i10++) {
                        if (c79835VUx2.LJI.LJLLLL.getBoolean(i10)) {
                            c79835VUx2.LJI.LJLLI.add(Integer.valueOf(i10));
                        }
                    }
                    C79835VUx c79835VUx3 = c79829VUr.LJLZ;
                    c79835VUx3.getClass();
                    if (array3 != null) {
                        for (int size3 = array3.size() - 1; size3 >= 0; size3--) {
                            int i11 = array3.getInt(size3);
                            if (i11 >= 0) {
                                c79835VUx3.LJI.notifyItemRemoved(i11);
                            }
                        }
                    }
                    if (array2 != null) {
                        for (int i12 = 0; i12 < array2.size(); i12++) {
                            ReadableMap map3 = array2.getMap(i12);
                            if (map3 != null) {
                                c79835VUx3.LJI.notifyItemInserted(map3.getInt("position"));
                            }
                        }
                    }
                    if (array != null) {
                        for (int i13 = 0; i13 < array.size(); i13++) {
                            ReadableMap map4 = array.getMap(i13);
                            if (map4 != null) {
                                int i14 = map4.getInt("from");
                                int i15 = map4.getInt("to");
                                if (map4.getBoolean("flush", false)) {
                                    c79835VUx3.LJI.notifyItemChanged(i14, Integer.valueOf(i15));
                                }
                            }
                        }
                    }
                    readableMap = null;
                }
                this.LLI = readableMap;
            } else {
                ReadableMap readableMap3 = this.LLFFF;
                if (readableMap3 instanceof ReadableMap) {
                    this.LJLJI.LLFZ((JavaOnlyMap) readableMap3);
                    this.LLFFF = null;
                }
            }
        } else {
            C79829VUr c79829VUr2 = this.LJLJI;
            C79655VNz c79655VNz = this.LJLIL;
            int sign = getSign();
            TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
            if (templateAssembler != null) {
                javaOnlyMap = templateAssembler.LIZLLL(sign);
            } else {
                javaOnlyMap = null;
            }
            c79829VUr2.LLFZ(javaOnlyMap);
        }
        if (this.LJLJLJ) {
            C79829VUr c79829VUr3 = this.LJLJI;
            c79829VUr3.LLFFF.clear();
            for (int i16 = 0; i16 < c79829VUr3.LJLJI.LJLJJI; i16++) {
                c79829VUr3.LLFFF.add(new HashMap<>());
            }
            new WeakReference(this);
            if (TextUtils.equals(this.LJLJL, "single")) {
                ?? listLinearLayoutManager = new ListLayoutManager.ListLinearLayoutManager(this);
                listLinearLayoutManager.LLJJIII(this.LLF ? 1 : 0);
                c79833VUv = listLinearLayoutManager;
            } else if (TextUtils.equals(this.LJLJL, "flow")) {
                ?? listGridLayoutManager = new ListLayoutManager.ListGridLayoutManager(this.LJLJJI, this.LJLJJLL, this);
                listGridLayoutManager.LLJJIII(this.LLF ? 1 : 0);
                c79833VUv = listGridLayoutManager;
            } else if (TextUtils.equals(this.LJLJL, "waterfall")) {
                C79833VUv c79833VUv2 = new C79833VUv(this.LJLJJI, this.LJLJJLL, this);
                c79833VUv2.LLJJIJIIJIL(this.LLF ? 1 : 0);
                c79833VUv = c79833VUv2;
            } else {
                c79833VUv = null;
            }
            ViewOnAttachStateChangeListenerC79828VUq viewOnAttachStateChangeListenerC79828VUq = this.LJLZ;
            if (viewOnAttachStateChangeListenerC79828VUq != null) {
                VV0 vv0 = viewOnAttachStateChangeListenerC79828VUq.LJLJJLL;
                if (vv0.LIZIZ != -1) {
                    viewOnAttachStateChangeListenerC79828VUq.LJIILLIIL(vv0);
                }
                VV0 vv02 = viewOnAttachStateChangeListenerC79828VUq.LJLJL;
                if (vv02.LIZIZ != -1) {
                    viewOnAttachStateChangeListenerC79828VUq.LJIILLIIL(vv02);
                }
            }
            ((RecyclerView) this.mView).setLayoutManager(c79833VUv);
        }
        this.LJLJLJ = false;
        if (((RecyclerView) this.mView).getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.mView).getLayoutManager();
            gridLayoutManager.LLJLILLLLZIIL(new C79837VUz(this, gridLayoutManager));
        }
        JavaOnlyArray javaOnlyArray = this.LJLJI.LJLJLJ;
        if (javaOnlyArray == null) {
            size = 0;
        } else {
            size = javaOnlyArray.size();
        }
        int i17 = this.LJZI;
        if (size > i17 && i17 > -1) {
            this.LJLL.LIZ(i17, 0, null);
            this.LJZI = -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPropsUpdated viewNames ");
        LIZ.append(size);
        LLog.LIZLLL(2, "UIList", X1D.LIZIZ(LIZ));
        if ((this.LJLJLLL.LJLJI & 16) != 0) {
            this.LJLLILLLL = true;
        }
        ViewOnAttachStateChangeListenerC79828VUq viewOnAttachStateChangeListenerC79828VUq2 = this.LJLZ;
        if (viewOnAttachStateChangeListenerC79828VUq2 != null) {
            viewOnAttachStateChangeListenerC79828VUq2.LJIIZILJ(viewOnAttachStateChangeListenerC79828VUq2.LJLJL);
            viewOnAttachStateChangeListenerC79828VUq2.LJIIZILJ(viewOnAttachStateChangeListenerC79828VUq2.LJLJJLL);
            this.LJLZ.LJLJLJ = this.LL;
        }
        this.LJLL.LIZIZ.LJLL = this.LLF;
        if (this.LLII && (c79818VUg = this.LJLJLLL) != null) {
            c79818VUg.LJLLJ = 0;
        }
    }

    @EWS
    public void removeStickyView() {
        ViewOnAttachStateChangeListenerC79828VUq viewOnAttachStateChangeListenerC79828VUq = this.LJLZ;
        if (viewOnAttachStateChangeListenerC79828VUq != null) {
            viewOnAttachStateChangeListenerC79828VUq.LJIJ(viewOnAttachStateChangeListenerC79828VUq.LJLJJLL, true, true);
            viewOnAttachStateChangeListenerC79828VUq.LJIJ(viewOnAttachStateChangeListenerC79828VUq.LJLJL, false, true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void requestLayout() {
        ((RecyclerView) this.mView).requestLayout();
        if (!this.mView.isLayoutRequested()) {
            T t = this.mView;
            t.post(new ARunnableS50S0100000_14(t, 41));
        }
    }

    public final void LJJIFFI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutCompleted ");
        LIZ.append(this.LJLJI.LJLJLJ.size());
        LLog.LIZLLL(2, "UIList", X1D.LIZIZ(LIZ));
        if (this.LJLLILLLL && ((ViewGroup) this.mView).getChildCount() > 0) {
            C79818VUg c79818VUg = this.LJLJLLL;
            JavaOnlyArray javaOnlyArray = this.LJLJI.LJLJLJ;
            if ((c79818VUg.LJLJI & 16) != 0) {
                C49615Jdb c49615Jdb = new C49615Jdb(c79818VUg.LJLL.getSign(), "layoutcomplete");
                c49615Jdb.LIZJ(Long.valueOf(new Date().getTime()), "timestamp");
                c49615Jdb.LIZJ(javaOnlyArray, "cells");
                c79818VUg.LJLIL.LIZIZ(c49615Jdb);
            }
            this.LJLLILLLL = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        LJJII();
        ((HashMap) this.LLFF).clear();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingTop + this.mBorderTopWidth;
        int i2 = this.mPaddingBottom + this.mBorderBottomWidth;
        this.mView.setPadding(this.mPaddingLeft + this.mBorderLeftWidth, i, this.mPaddingRight + this.mBorderRightWidth, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return this.LLF;
    }

    public UIList(VNU vnu) {
        super(vnu);
        this.LJLJJI = 1;
        this.LJLJL = "single";
        this.LJLJLJ = true;
        this.LJLLL = true;
        this.LJZI = -1;
        this.LL = true;
        this.LLF = true;
        this.LLFF = new HashMap();
        this.LLFII = new ArrayList<>();
        this.LLFZ = new HashMap<>();
        this.LLII = false;
        this.LLIIII = false;
        this.LLIIIILZ = 0;
        this.LLIIIJ = true;
        this.LLIIIL = false;
        this.LLIIIZ = false;
        this.LLIIJI = false;
        this.LLIIJLIL = false;
        this.LLIIL = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C79688VPg c79688VPg = new C79688VPg(context, this);
        c79688VPg.setClipToPadding(false);
        c79688VPg.setRecycledViewPool(new C79836VUy(this));
        this.LJLJLLL = new C79818VUg(this.mContext.LJLJJL, c79688VPg, this);
        this.LJZ = new C79834VUw(this.mContext.LJLJJL, c79688VPg);
        c79688VPg.setItemAnimator(null);
        this.LJLJI = new C79829VUr(this, this.LJZ);
        this.LJLL = new C49712JfA(context, c79688VPg);
        return c79688VPg;
    }

    @EWS
    public void getVisibleCells(Callback callback) {
        if (callback == null) {
            LLog.LIZLLL(2, "UIList", "getVisibleCells with null callback");
        } else {
            callback.invoke(0, this.LJLJLLL.LJIJ());
        }
    }

    @VPD(defaultBoolean = false, name = "android-ignore-attach-for-binding")
    public void setAndroidIgnoreAttachForBinding(boolean z) {
        this.LLIIIZ = z;
    }

    @VPD(customType = "false", name = "auto-measure")
    public void setAutoMeasure(F5B f5b) {
        this.LJLLI = C79818VUg.LJIILLIIL(f5b, false);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setColumnCount(int i) {
        if (this.LJLJJI == i) {
            return;
        }
        this.LJLJJI = i;
        C0A2 layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLIL(this.LJLJJI);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            ((StaggeredGridLayoutManager) layoutManager).LLJJIJIL(this.LJLJJI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setComponentInitMeasure(boolean z) {
        C79829VUr c79829VUr = this.LJLJI;
        if (c79829VUr != null) {
            c79829VUr.LJLJJLL = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setCrossAxisGap(float f) {
        int round = Math.round(f);
        if (round == this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = round;
        C0A2 layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof ListLayoutManager.ListGridLayoutManager) {
            ((ListLayoutManager.ListGridLayoutManager) layoutManager).LLIL = this.LJLJJLL;
        } else {
            if (!(layoutManager instanceof C79833VUv)) {
                return;
            }
            ((C79833VUv) layoutManager).LLIL = this.LJLJJLL;
        }
    }

    @VPD(customType = "true", name = "android-diffable")
    public void setDiffable(F5B f5b) {
        if (((RecyclerView) this.mView).getAdapter() == null) {
            this.LJLJI.setHasStableIds(!C79818VUg.LJIILLIIL(f5b, true));
        }
    }

    @VPD(defaultBoolean = false, name = "enable-async-list")
    public void setEnableAsyncList(boolean z) {
        this.LLIIJI = z;
    }

    @VPD(defaultBoolean = false, name = "enable-disappear")
    public void setEnableDisappear(boolean z) {
        VV1 vv1 = this.LJZ.LIZJ;
        if (vv1 instanceof C79826VUo) {
            ((C79826VUo) vv1).LJFF = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setEnablePagerSnap(F5B f5b) {
        if (C79818VUg.LJIILLIIL(f5b, false)) {
            if (this.LJLLJ == null) {
                this.LJLLJ = new C40161hs();
            }
            this.LJLLJ.LIZIZ((RecyclerView) this.mView);
        } else {
            C40161hs c40161hs = this.LJLLJ;
            if (c40161hs == null) {
                return;
            }
            c40161hs.LIZIZ(null);
            this.LJLLJ = null;
        }
    }

    @VPD(defaultBoolean = false, name = "enable-size-cache")
    public void setEnableSizeCache(boolean z) {
        this.LLIIJLIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setEnableSticky(F5B f5b) {
        if (C79818VUg.LJIILLIIL(f5b, false) && this.LJLLLLLL == null) {
            ViewOnAttachStateChangeListenerC79828VUq viewOnAttachStateChangeListenerC79828VUq = new ViewOnAttachStateChangeListenerC79828VUq(this);
            this.LJLZ = viewOnAttachStateChangeListenerC79828VUq;
            this.LJLLLLLL = viewOnAttachStateChangeListenerC79828VUq.LJLILLLLZI;
            viewOnAttachStateChangeListenerC79828VUq.LJLJJI = this.LJZL;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        super.setEvents(map);
        C79818VUg c79818VUg = this.LJLJLLL;
        c79818VUg.LJLJI = 0;
        if (map == null) {
            return;
        }
        if (map.containsKey("scroll")) {
            i = c79818VUg.LJLJI | 1;
        } else {
            i = c79818VUg.LJLJI;
        }
        c79818VUg.LJLJI = i;
        if (map.containsKey("scrolltoupper")) {
            i2 = c79818VUg.LJLJI | 2;
        } else {
            i2 = c79818VUg.LJLJI;
        }
        c79818VUg.LJLJI = i2;
        if (map.containsKey("scrolltolower")) {
            i3 = c79818VUg.LJLJI | 4;
        } else {
            i3 = c79818VUg.LJLJI;
        }
        c79818VUg.LJLJI = i3;
        if (map.containsKey("scrollstatechange")) {
            i4 = c79818VUg.LJLJI | 8;
        } else {
            i4 = c79818VUg.LJLJI;
        }
        c79818VUg.LJLJI = i4;
        if (map.containsKey("layoutcomplete")) {
            i5 = c79818VUg.LJLJI | 16;
        } else {
            i5 = c79818VUg.LJLJI;
        }
        c79818VUg.LJLJI = i5;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInitialScrollIndex(F5B f5b) {
        this.LJZI = C79818VUg.LJIIZILJ(f5b, -1);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInternalCellAppearNotification(boolean z) {
        super.setInternalCellAppearNotification(z);
        C79829VUr c79829VUr = this.LJLJI;
        if (c79829VUr != null) {
            c79829VUr.getClass();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInternalCellDisappearNotification(boolean z) {
        super.setInternalCellDisappearNotification(z);
        C79829VUr c79829VUr = this.LJLJI;
        if (c79829VUr != null) {
            c79829VUr.getClass();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInternalCellPrepareForReuseNotification(boolean z) {
        super.setInternalCellPrepareForReuseNotification(z);
        C79829VUr c79829VUr = this.LJLJI;
        if (c79829VUr != null) {
            c79829VUr.LLD = z;
        }
    }

    @VPD(defaultBoolean = false, name = "android-new-scroll-top")
    public void setListNewScrollTopSwitch(boolean z) {
        this.LLD = z;
    }

    @VPD(defaultBoolean = true, name = "use-old-sticky")
    public void setListOldStickySwitch(boolean z) {
        this.LL = z;
    }

    @VPD(name = "list-platform-info")
    public void setListPlatformInfo(ReadableMap readableMap) {
        this.LLIFFJFJJ = true;
        this.LLFFF = readableMap;
        this.LLI = null;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setListType(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "single";
        }
        if (!TextUtils.equals(str, this.LJLJL)) {
            this.LJLJLJ = true;
            this.LJLJL = str;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setLowerThreshold(F5B f5b) {
        C79818VUg c79818VUg = this.LJLJLLL;
        c79818VUg.getClass();
        c79818VUg.LJLJJLL = C79818VUg.LJIIZILJ(f5b, 50);
        c79818VUg.LJLJLJ = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setLowerThresholdItemCount(F5B f5b) {
        C79818VUg c79818VUg = this.LJLJLLL;
        c79818VUg.getClass();
        c79818VUg.LJLJLJ = C79818VUg.LJIIZILJ(f5b, 0);
        c79818VUg.LJLJJLL = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setMainAxisGap(float f) {
        this.LJLJJL = Math.round(f);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setNeedVisibleCells(boolean z) {
        this.LJLJLLL.LJLLL = z;
    }

    @VPD(defaultBoolean = false, name = "enable-new-exposure-strategy")
    public void setNewAppear(boolean z) {
        C79834VUw c79834VUw = this.LJZ;
        if (z == c79834VUw.LIZLLL) {
            return;
        }
        c79834VUw.LIZLLL = z;
        if (z) {
            c79834VUw.LIZJ = new C79819VUh(c79834VUw.LIZ, c79834VUw.LIZIZ);
        } else {
            c79834VUw.LIZJ = new C79826VUo(c79834VUw.LIZ);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setNoInvalidate(boolean z) {
        this.LJLLLL = z;
    }

    @VPD(defaultBoolean = false, name = "android-preference-consume-gesture")
    public void setPreferenceConsumeGesture(boolean z) {
        T t = this.mView;
        if (t instanceof C79688VPg) {
            ((C79688VPg) t).LLLFZ = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollEnable(F5B f5b) {
        this.LJLLL = C79818VUg.LJIILLIIL(f5b, true);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollEventThrottle(F5B f5b) {
        C79818VUg c79818VUg = this.LJLJLLL;
        c79818VUg.getClass();
        c79818VUg.LJLJJI = C79818VUg.LJIIZILJ(f5b, 200);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setStickyOffset(F5B f5b) {
        int LIZ = (int) V9Y.LIZ(C79818VUg.LJIIZILJ(f5b, 0));
        ViewOnAttachStateChangeListenerC79828VUq viewOnAttachStateChangeListenerC79828VUq = this.LJLZ;
        if (viewOnAttachStateChangeListenerC79828VUq == null) {
            this.LJZL = LIZ;
        } else {
            viewOnAttachStateChangeListenerC79828VUq.LJLJJI = LIZ;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setTouchScroll(F5B f5b) {
        T t = this.mView;
        if (t instanceof C79688VPg) {
            ((C79688VPg) t).LLLFFI = C79818VUg.LJIILLIIL(f5b, true);
        }
    }

    @VPD(defaultBoolean = false, name = "android-trigger-sticky-layout")
    public void setTriggerStickyLayout(boolean z) {
        this.LLIIIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setUpdateAnimation(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            ((RecyclerView) this.mView).setItemAnimator(null);
        }
        if (TextUtils.equals(str, "default")) {
            ((RecyclerView) this.mView).setItemAnimator(new C40171ht());
        }
    }

    @VPD(defaultBoolean = false, name = "scroll-upper-lower-switch")
    public void setUpperLowerSwitch(boolean z) {
        this.LLII = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setUpperThreshold(F5B f5b) {
        C79818VUg c79818VUg = this.LJLJLLL;
        c79818VUg.getClass();
        c79818VUg.LJLJJL = C79818VUg.LJIIZILJ(f5b, 50);
        c79818VUg.LJLJL = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setUpperThresholdItemCount(F5B f5b) {
        C79818VUg c79818VUg = this.LJLJLLL;
        c79818VUg.getClass();
        c79818VUg.LJLJL = C79818VUg.LJIIZILJ(f5b, 0);
        c79818VUg.LJLJJL = 0;
    }

    @VPD(defaultBoolean = true, name = "vertical-orientation")
    public void setVerticalOrientation(boolean z) {
        this.LLF = z;
    }

    @VPD(name = "update-list-info")
    public void updateListActionInfo(ReadableMap readableMap) {
        this.LLIFFJFJJ = true;
        this.LLI = readableMap;
        this.LLFFF = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    @X.EWS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void autoScroll(com.lynx.react.bridge.ReadableMap r6, com.lynx.react.bridge.Callback r7) {
        /*
            r5 = this;
            java.lang.String r1 = "rate"
            java.lang.String r0 = ""
            java.lang.String r1 = r6.getString(r1, r0)
            java.lang.String r0 = "start"
            r2 = 1
            boolean r0 = r6.getBoolean(r0, r2)
            r5.LLIIII = r0
            java.lang.String r0 = "autoStop"
            boolean r0 = r6.getBoolean(r0, r2)
            r5.LLIIIJ = r0
            boolean r0 = r5.LLIIII
            r4 = 0
            if (r0 == 0) goto L37
            r0 = 0
            float r0 = X.VPR.LIZIZ(r1, r0)
            int r3 = (int) r0
            if (r3 != 0) goto L3b
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r4] = r0
            java.lang.String r0 = "rate is not right"
            r1[r2] = r0
            r7.invoke(r1)
            return
        L37:
            r5.LJJII()
            goto L62
        L3b:
            X.VNU r0 = r5.mContext
            if (r0 != 0) goto L75
        L3f:
            r0 = 1114636288(0x42700000, float:60.0)
        L41:
            int r0 = (int) r0
            if (r0 > 0) goto L46
            r0 = 60
        L46:
            if (r3 <= 0) goto L6e
            int r3 = r3 / r0
            int r0 = java.lang.Math.max(r3, r2)
        L4d:
            r5.LLIIIILZ = r0
            r5.LJJII()
            X.VUu r0 = new X.VUu
            r0.<init>(r5)
            r5.LLIIL = r0
            android.view.Choreographer r1 = X.C16880lQ.LLIIIJ()
            X.VUu r0 = r5.LLIIL
            r1.postFrameCallback(r0)
        L62:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r4] = r0
            r7.invoke(r1)
            return
        L6e:
            int r3 = r3 / r0
            r0 = -1
            int r0 = java.lang.Math.min(r3, r0)
            goto L4d
        L75:
            android.content.Context r1 = r0.LIZ()
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L3f
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.WindowManager r0 = r1.getWindowManager()
            if (r0 == 0) goto L3f
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L3f
            float r0 = r0.getRefreshRate()
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.UIList.autoScroll(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.VPY hitTest(float r7, float r8) {
        /*
            r6 = this;
            X.VUr r0 = r6.LJLJI
            if (r0 != 0) goto L5
            return r6
        L5:
            X.VUq r4 = r6.LJLZ
            if (r4 == 0) goto L7b
            int r5 = (int) r7
            int r3 = (int) r8
            X.VV0 r0 = r4.LJLJJLL
            com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LIZ
            if (r0 == 0) goto L44
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.VV0 r0 = r4.LJLJJLL
            com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LIZ
            T extends android.view.View r0 = r0.mView
            r0.getHitRect(r1)
            boolean r0 = r1.contains(r5, r3)
            if (r0 == 0) goto L44
            X.VV0 r0 = r4.LJLJJLL
            com.lynx.tasm.behavior.ui.view.UIComponent r2 = r0.LIZ
            T extends android.view.View r0 = r2.mView
            int r0 = r0.getLeft()
            int r5 = r5 - r0
            float r1 = (float) r5
            X.VV0 r0 = r4.LJLJJLL
            com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LIZ
            T extends android.view.View r0 = r0.mView
            int r0 = r0.getTop()
            int r3 = r3 - r0
            float r0 = (float) r3
            X.VPY r0 = r2.hitTest(r1, r0)
        L41:
            if (r0 == 0) goto L7b
            return r0
        L44:
            X.VV0 r0 = r4.LJLJL
            com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LIZ
            if (r0 == 0) goto L7b
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.VV0 r0 = r4.LJLJL
            com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LIZ
            T extends android.view.View r0 = r0.mView
            r0.getHitRect(r1)
            boolean r0 = r1.contains(r5, r3)
            if (r0 == 0) goto L7b
            X.VV0 r0 = r4.LJLJL
            com.lynx.tasm.behavior.ui.view.UIComponent r2 = r0.LIZ
            T extends android.view.View r0 = r2.mView
            int r0 = r0.getLeft()
            int r5 = r5 - r0
            float r1 = (float) r5
            X.VV0 r0 = r4.LJLJL
            com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LIZ
            T extends android.view.View r0 = r0.mView
            int r0 = r0.getTop()
            int r3 = r3 - r0
            float r0 = (float) r3
            X.VPY r0 = r2.hitTest(r1, r0)
            goto L41
        L7b:
            T extends android.view.View r0 = r6.mView
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getChildCount()
            int r4 = r0 + (-1)
        L85:
            if (r4 < 0) goto Lcd
            T extends android.view.View r0 = r6.mView
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r3 = r0.getChildAt(r4)
            T extends android.view.View r0 = r6.mView
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.LJJJJJL(r3)
            boolean r0 = r1 instanceof X.C79831VUt
            if (r0 == 0) goto Lca
            X.VUt r1 = (X.C79831VUt) r1
            if (r1 == 0) goto Lca
            X.VRX r0 = r1.LJLIL
            com.lynx.tasm.behavior.ui.view.UIComponent r2 = r0.LJLILLLLZI
            if (r2 == 0) goto Lca
            int r0 = r3.getLeft()
            float r0 = (float) r0
            float r1 = r7 - r0
            int r0 = r3.getTop()
            float r0 = (float) r0
            float r0 = r8 - r0
            boolean r0 = r2.containsPoint(r1, r0)
            if (r0 == 0) goto Lca
            int r0 = r3.getLeft()
            float r0 = (float) r0
            float r7 = r7 - r0
            int r0 = r3.getTop()
            float r0 = (float) r0
            float r8 = r8 - r0
            X.VPY r0 = r2.hitTest(r7, r8)
            return r0
        Lca:
            int r4 = r4 + (-1)
            goto L85
        Lcd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.UIList.hitTest(float, float):X.VPY");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
        C79831VUt remove;
        boolean z;
        boolean z2 = false;
        if (LJJ()) {
            if (lynxBaseUI instanceof UIComponent) {
                C79829VUr c79829VUr = this.LJLJI;
                UIComponent uIComponent = (UIComponent) lynxBaseUI;
                C79831VUt c79831VUt = c79829VUr.LJLILLLLZI.get(Long.valueOf(j));
                if (c79831VUt == null || c79831VUt.LJLILLLLZI != j) {
                    return;
                }
                c79829VUr.LJLILLLLZI.remove(Long.valueOf(j));
                UIComponent uIComponent2 = c79831VUt.LJLIL.LJLILLLLZI;
                if (uIComponent2 == uIComponent) {
                    c79829VUr.LJZI.LIZLLL(c79831VUt);
                    return;
                }
                if (uIComponent2 != null) {
                    c79829VUr.LLFFF(c79831VUt);
                }
                if (uIComponent != null && uIComponent.mView.getParent() != null) {
                    C16880lQ.LJLLL(uIComponent.mView, (ViewGroup) uIComponent.mView.getParent());
                }
                c79831VUt.L(uIComponent);
                c79829VUr.LJZI.LIZLLL(c79831VUt);
                uIComponent.setTop(0);
                uIComponent.setLeft(0);
                uIComponent.requestLayout();
                c79829VUr.LLFII.put(uIComponent.LJLIL, Integer.valueOf(uIComponent.mView.getHeight()));
                c79831VUt.itemView.requestLayout();
                c79831VUt.LJLIL.LJLIL = 2;
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("component is null! the operationId is ");
            LIZ.append(j);
            LLog.LIZLLL(4, "UIList", X1D.LIZIZ(LIZ));
            return;
        }
        C79829VUr c79829VUr2 = this.LJLJI;
        c79829VUr2.getClass();
        if (c79829VUr2.LJLJL || (remove = c79829VUr2.LJLILLLLZI.remove(Long.valueOf(j))) == null) {
            return;
        }
        UIComponent uIComponent3 = remove.LJLIL.LJLILLLLZI;
        if (uIComponent3 != null) {
            uIComponent3.setTop(0);
            uIComponent3.setLeft(0);
            uIComponent3.requestLayout();
            if (uIComponent3.getWidth() != remove.itemView.getWidth()) {
                z = true;
            } else {
                z = false;
            }
            if (uIComponent3.getHeight() != remove.itemView.getHeight()) {
                z2 = true;
            }
            if (z || z2) {
                remove.itemView.requestLayout();
            }
            UIList uIList = c79829VUr2.LJLJI;
            if (uIList.LLIIJLIL && uIList.LJJI()) {
                c79829VUr2.LLFII.put(uIComponent3.LJLIL, Integer.valueOf(uIComponent3.getHeight()));
            }
        }
        remove.LJLIL.LJLIL = 2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float[] scrollBy(float f, float f2) {
        float[] fArr = new float[4];
        ((RecyclerView) this.mView).scrollBy((int) f, (int) f2);
        if (((RecyclerView) this.mView).getLayoutManager() instanceof VV2) {
            if (this.LLF) {
                fArr[0] = 0.0f;
                float LIZLLL = ((VV2) ((RecyclerView) this.mView).getLayoutManager()).LIZLLL();
                fArr[1] = LIZLLL;
                fArr[2] = f;
                fArr[3] = f2 - LIZLLL;
            } else {
                float LIZIZ = ((VV2) ((RecyclerView) this.mView).getLayoutManager()).LIZIZ();
                fArr[0] = LIZIZ;
                fArr[1] = 0.0f;
                fArr[2] = f - LIZIZ;
                fArr[3] = f2;
            }
        } else {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = f;
            fArr[3] = f2;
        }
        return fArr;
    }

    @EWS
    public void scrollToPosition(ReadableMap readableMap, Callback callback) {
        int height;
        if (this.LJLJI == null) {
            callback.invoke(1, "scrollToPosition before init");
            return;
        }
        int i = readableMap.getInt("position", 0);
        int LIZ = (int) V9Y.LIZ((float) readableMap.getDouble("offset", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        boolean z = readableMap.getBoolean("smooth", false);
        int LIZ2 = (int) V9Y.LIZ((float) readableMap.getDouble("itemHeight", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        String string = readableMap.getString("alignTo", LiveGiftNewGifterBadgeSetting.DEFAULT);
        if (i < 0 || i > this.LJLJI.getItemCount()) {
            callback.invoke(4, "position < 0 or position >= data count");
            return;
        }
        if (z) {
            RunnableC79830VUs runnableC79830VUs = this.LJLL.LIZIZ;
            RecyclerView recyclerView = runnableC79830VUs.LJLIL.get();
            if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
                runnableC79830VUs.LJLJLLL = false;
                callback.invoke(4, "can not scroll before init");
                return;
            }
            runnableC79830VUs.LJLILLLLZI = callback;
            runnableC79830VUs.LJLJI = i;
            runnableC79830VUs.LJLJJI = string;
            runnableC79830VUs.LJLJJL = LIZ;
            runnableC79830VUs.LJLJLJ = null;
            if (runnableC79830VUs.LJLJLLL) {
                return;
            }
            runnableC79830VUs.LJLJLLL = true;
            recyclerView.LJLJJI();
            recyclerView.stopNestedScroll();
            recyclerView.LJIIJ(runnableC79830VUs.LJLLI);
            recyclerView.post(runnableC79830VUs);
            return;
        }
        if (TextUtils.equals(string, "middle")) {
            height = (this.mView.getHeight() - LIZ2) / 2;
        } else {
            if (TextUtils.equals(string, "bottom")) {
                height = this.mView.getHeight() - LIZ2;
            }
            this.LJLL.LIZ(i, LIZ, callback);
            this.mView.post(new ARunnableS50S0100000_14(this, 42));
        }
        LIZ += height;
        this.LJLL.LIZ(i, LIZ, callback);
        this.mView.post(new ARunnableS50S0100000_14(this, 42));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean requestChildUIRectangleOnScreen(LynxBaseUI lynxBaseUI, Rect rect, boolean z) {
        T t;
        if (!this.LJLLL || !(lynxBaseUI instanceof UIComponent) || (t = ((LynxUI) lynxBaseUI).mView) == 0) {
            return false;
        }
        Object parent = t.getParent();
        if (!(parent instanceof VRX)) {
            return false;
        }
        return ((RecyclerView) this.mView).getLayoutManager().LJLLLLLL((RecyclerView) this.mView, (View) parent, rect, false, false);
    }
}
