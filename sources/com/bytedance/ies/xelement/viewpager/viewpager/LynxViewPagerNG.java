package com.bytedance.ies.xelement.viewpager.viewpager;

import X.C49615Jdb;
import X.C79792VTg;
import X.C79858VVu;
import X.EWS;
import X.VNL;
import X.VNU;
import X.VPD;
import Y.IDiS275S0100000_14;
import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxViewPagerNG extends BaseLynxViewPager<C79858VVu, C79792VTg> {
    public boolean LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJJI() {
        LJIL().getMViewPager().addOnPageChangeListener(new IDiS275S0100000_14(this, 2));
    }

    public LynxViewPagerNG(VNU vnu) {
        super(vnu);
        this.LJLLILLLL = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.LJLJLJ = new C79792VTg(context);
        LJJ();
        return LJIL();
    }

    @VPD(defaultBoolean = true, name = "android-distinguish-swipe-tap")
    public final void setDistinguishSwipeTap(boolean z) {
        this.LJLLILLLL = z;
    }

    @VPD(name = "page-change-animation")
    public final void setPageChangeAnimation(boolean z) {
        LJIL().setPagerChangeAnimation(z);
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJIJJLI(LynxViewpagerItem child, int i) {
        o.LJIIJ(child, "child");
        C79792VTg LJIL = LJIL();
        LJIL.getClass();
        LJIL.setMChanged(true);
        if (LJIL.getMTabLayout() != null && o.LJ(LJIL.LLIIL, Boolean.TRUE)) {
            i--;
        }
        if (i < 0 || i > LJIL.getMPendingChildren().size()) {
            LJIL.getMPendingChildren().add(child);
        } else {
            ListProtector.add(LJIL.getMPendingChildren(), i, child);
        }
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    @EWS
    public void selectTab(ReadableMap params, Callback callback) {
        PagerAdapter adapter;
        o.LJIIJ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (params.hasKey("index")) {
            int i = params.getInt("index");
            if (i >= 0 && (adapter = LJIL().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
                if (params.hasKey("smooth")) {
                    LJIL().LLIIJLIL.setCurrentItem(i, params.getBoolean("smooth", true));
                } else {
                    LJIL().LLIIJLIL.setCurrentItem(i, true);
                }
                javaOnlyMap.put("success", Boolean.TRUE);
                if (callback != null) {
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                return;
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback == null) {
                return;
            }
            callback.invoke(4, javaOnlyMap);
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback == null) {
            return;
        }
        callback.invoke(4, javaOnlyMap);
    }

    @EWS
    public final void setDragGesture(ReadableMap params, Callback callback) {
        o.LJIIJ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (params.hasKey("canDrag")) {
            setAllowHorizontalGesture(params.getBoolean("canDrag"));
        }
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJJIFFI(int i, String tag, String str) {
        o.LJIIJ(tag, "tag");
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "change");
        c49615Jdb.LIZJ(Boolean.valueOf(this.LJLL), "isDragged");
        c49615Jdb.LIZJ(Integer.valueOf(i), "index");
        vnl.LIZIZ(c49615Jdb);
    }
}
