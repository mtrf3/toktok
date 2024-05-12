package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab;

import X.AbstractC55918Lx4;
import X.AbstractC55930LxG;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C212428Vi;
import X.C221108m2;
import X.C34051DXz;
import X.C55877LwP;
import X.C55917Lx3;
import X.C55922Lx8;
import X.C55923Lx9;
import X.C55924LxA;
import X.C55927LxD;
import X.C57568Mia;
import X.C57569Mib;
import X.C62822Ol8;
import X.C68722mq;
import X.C78866UxK;
import X.C78897Uxp;
import X.C7MY;
import X.C87277YNd;
import X.DY1;
import X.EnumC55811LvL;
import X.InterfaceC56129M1d;
import X.L86;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BottomTabCustomDotHandler extends AbstractC55930LxG {
    public C55927LxD LJI;
    public final List<AbstractC55918Lx4> LJ = new ArrayList();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
    public final int LJII = L86.BOTTOM_TAB.getValue();

    @Override // X.AbstractC55930LxG
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC55930LxG
    public final InterfaceC56129M1d LIZ() {
        return new C55924LxA(this);
    }

    @Override // X.AbstractC55930LxG
    public final void LIZJ() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.LLJ("SHOP_MALL");
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LIZLLL() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.z20("SHOP_MALL");
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJFF() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.LLIZ("SHOP_MALL");
        }
    }

    @Override // X.AbstractC55930LxG
    public final boolean LJII() {
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj != null) {
            return o.LJ("SHOP_MALL", C116694i1.LIZ(activityC45651qj).nv0());
        }
        return false;
    }

    @Override // X.AbstractC55930LxG
    public final boolean LJIIIIZZ() {
        C55927LxD c55927LxD = this.LJI;
        if (c55927LxD != null && c55927LxD.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC55930LxG
    public final void LJIIL() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.CE();
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILIIL() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.LLZLLIL("SHOP_MALL");
        }
    }

    public final int LJIIZILJ() {
        int LIZIZ = C7MY.LIZIZ(32);
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            return C7MY.LIZIZ(26);
        }
        return LIZIZ;
    }

    public final int LJIJ() {
        int LIZIZ = C7MY.LIZIZ(50);
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            return C7MY.LIZIZ(48);
        }
        return LIZIZ;
    }

    @Override // X.AbstractC55930LxG
    public final int LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC55930LxG
    public final void LJI(EnumC55811LvL disappearType) {
        o.LJIIIZ(disappearType, "disappearType");
        C55927LxD c55927LxD = this.LJI;
        if (c55927LxD != null) {
            c55927LxD.LIZ(disappearType);
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIIIZ(final CustomDotAssem assem) {
        o.LJIIIZ(assem, "assem");
        assem.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler$onAttachToAssem$1
            public final C55917Lx3 LJLIL;
            public final /* synthetic */ BottomTabCustomDotHandler LJLJI;

            {
                this.LJLJI = this;
                this.LJLIL = new C55917Lx3(CustomDotAssem.this);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                HomeTabAbility LJIL;
                HomeTabAbility LJIL2;
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_CREATE) {
                    MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(CustomDotAssem.this);
                    if (LJJLIIIJJIZ != null && (LJIL2 = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
                        LJIL2.b3(this.LJLIL);
                        return;
                    }
                    return;
                }
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                MainActivityScope LJJLIIIJJIZ2 = C78866UxK.LJJLIIIJJIZ(CustomDotAssem.this);
                if (LJJLIIIJJIZ2 != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ2)) != null) {
                    LJIL.Q6(this.LJLIL);
                }
                Iterator<AbstractC55918Lx4> it = this.LJLJI.LJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ();
                }
                ((ArrayList) this.LJLJI.LJ).clear();
            }
        });
    }

    @Override // X.AbstractC55930LxG
    public final void LJIIJ(boolean z) {
        C55927LxD c55927LxD;
        if (z && (c55927LxD = this.LJI) != null) {
            c55927LxD.LIZ(EnumC55811LvL.OTHER);
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILL(int i) {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.S3(i, "SHOP_MALL");
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJ(Bitmap bitmap, AqS159S0100000_9 aqS159S0100000_9) {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        C57568Mia c57568Mia = new C57568Mia();
        c57568Mia.LIZ(new C55922Lx8(aqS159S0100000_9, this, c57568Mia));
        ((ArrayList) this.LJ).add(c57568Mia);
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.eu("SHOP_MALL", c57568Mia);
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILJJIL(Bitmap bitmap, AqS159S0100000_9 aqS159S0100000_9) {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        Resources resources;
        ActivityC45651qj LIZ;
        C57569Mib c57569Mib = new C57569Mib();
        c57569Mib.LIZ(new C55923Lx9(aqS159S0100000_9, this, c57569Mib));
        ((ArrayList) this.LJ).add(c57569Mib);
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            CustomDotAssem customDotAssem2 = this.LIZJ;
            if (customDotAssem2 != null && (LIZ = C212428Vi.LIZ(customDotAssem2)) != null) {
                resources = LIZ.getResources();
            } else {
                resources = null;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJIJ(), LJIIZILJ());
            layoutParams.gravity = 49;
            LJIIIZ.NS("SHOP_MALL", bitmapDrawable, c57569Mib, layoutParams, null);
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILLIIL(C68722mq tooltipConfig, AqS156S0200000_9 aqS156S0200000_9, AqS140S0200000_9 aqS140S0200000_9, AqS156S0200000_9 aqS156S0200000_92) {
        View view;
        o.LJIIIZ(tooltipConfig, "tooltipConfig");
        Context context = this.LIZIZ;
        if (context != null && (view = (View) this.LJFF.getValue()) != null) {
            this.LJI = new C55927LxD(context, view, this.LJII);
        }
        C55927LxD c55927LxD = this.LJI;
        if (c55927LxD != null) {
            ((ArrayList) c55927LxD.LJI).add(new C55877LwP(aqS156S0200000_9, aqS140S0200000_9, this, aqS156S0200000_92));
        }
        C55927LxD c55927LxD2 = this.LJI;
        if (c55927LxD2 != null) {
            c55927LxD2.LIZJ(tooltipConfig);
        }
    }
}
