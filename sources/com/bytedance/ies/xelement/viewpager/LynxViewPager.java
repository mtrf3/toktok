package com.bytedance.ies.xelement.viewpager;

import X.C49615Jdb;
import X.C79793VTh;
import X.C79859VVv;
import X.EWS;
import X.VNL;
import X.VNU;
import X.VPD;
import X.WM7;
import Y.IDiS275S0100000_14;
import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxViewPager extends BaseLynxViewPager<C79859VVv, C79793VTh> {
    public boolean LJLL;

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJJI() {
        LJIL().getMViewPager().addOnPageChangeListener(new IDiS275S0100000_14(this, 1));
    }

    public LynxViewPager(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.LJLJLJ = new C79793VTh(context);
        LJJ();
        return LJIL();
    }

    @VPD(name = "viewpager-dynamic")
    public final void setViewPagerDynamic(boolean z) {
        this.LJLL = z;
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJIJJLI(LynxViewpagerItem child, int i) {
        o.LJIIJ(child, "child");
        if (this.LJLL) {
            if (LJIL().getMTabLayout() == null || LJIL().getTabLayoutCodeMode() == 0) {
                C79793VTh LJIL = LJIL();
                LJIL.getClass();
                LJIL.setMChanged(true);
                ListProtector.add(LJIL.getMPendingChildren(), i, child);
                return;
            }
            C79793VTh LJIL2 = LJIL();
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            LJIL2.getClass();
            LJIL2.setMChanged(true);
            ListProtector.add(LJIL2.getMPendingChildren(), i2, child);
            return;
        }
        C79793VTh LJIL3 = LJIL();
        LJIL3.getClass();
        LJIL3.LJLJLJ = true;
        ((ArrayList) LJIL3.LJLL).add(child);
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
                LJIL().setCurrentSelectIndex(i);
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
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJJIFFI(int i, String tag, String str) {
        o.LJIIJ(tag, "tag");
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "change");
        c49615Jdb.LIZJ(tag, "tag");
        c49615Jdb.LIZJ(Integer.valueOf(i), "index");
        c49615Jdb.LIZJ(str, WM7.SCENE_SERVICE);
        vnl.LIZIZ(c49615Jdb);
    }
}
