package com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab;

import X.AbstractC55930LxG;
import X.C55876LwO;
import X.C55914Lx0;
import X.C55915Lx1;
import X.C55916Lx2;
import X.C55927LxD;
import X.C68722mq;
import X.C78866UxK;
import X.C87277YNd;
import X.EnumC55811LvL;
import X.InterfaceC56129M1d;
import X.L86;
import X.LQ6;
import X.X1D;
import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopTabCustomDotHandler extends AbstractC55930LxG {
    public LQ6 LJ;
    public final int LJFF = L86.TOP_TAB.getValue();

    @Override // X.AbstractC55930LxG
    public final void LJIIJ(boolean z) {
    }

    @Override // X.AbstractC55930LxG
    public final void LJIIL() {
    }

    @Override // X.AbstractC55930LxG
    public final InterfaceC56129M1d LIZ() {
        return new C55915Lx1(this);
    }

    @Override // X.AbstractC55930LxG
    public final void LIZJ() {
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            lq6.LIZ();
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LIZLLL() {
        View findViewById;
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            lq6.LIZ();
            View LIZJ = lq6.LIZJ();
            if (LIZJ == null || (findViewById = LIZJ.findViewById(R.id.text1)) == null) {
                return;
            }
            findViewById.setVisibility(0);
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJFF() {
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            lq6.LIZ();
        }
    }

    @Override // X.AbstractC55930LxG
    public final boolean LJII() {
        MainActivityScope LJJLIIIJJIZ;
        HomeTabAbility LJIL;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
            return LJIL.zW("Shop");
        }
        return false;
    }

    @Override // X.AbstractC55930LxG
    public final boolean LJIIIIZZ() {
        C55927LxD c55927LxD;
        LQ6 lq6 = this.LJ;
        if (lq6 == null || (c55927LxD = lq6.LIZJ) == null || !c55927LxD.LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55930LxG
    public final void LJIIJJI() {
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            EnumC55811LvL disappearType = EnumC55811LvL.CLICK_SWITCH_TAB;
            o.LJIIIZ(disappearType, "disappearType");
            C55927LxD c55927LxD = lq6.LIZJ;
            if (c55927LxD != null) {
                c55927LxD.LIZ(disappearType);
            }
            lq6.LIZJ = null;
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILIIL() {
        View findViewById;
        LQ6 lq6 = this.LJ;
        if (lq6 == null || lq6.LIZIZ > 0) {
            return;
        }
        View LIZJ = lq6.LIZJ();
        if (LIZJ != null && (findViewById = LIZJ.findViewById(com.zhiliaoapp.musically.R.id.mmd)) != null) {
            findViewById.setVisibility(0);
        }
        TuxTextView LIZIZ = lq6.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.setVisibility(8);
    }

    @Override // X.AbstractC55930LxG
    public final int LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC55930LxG
    public final void LJI(EnumC55811LvL disappearType) {
        o.LJIIIZ(disappearType, "disappearType");
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            C55927LxD c55927LxD = lq6.LIZJ;
            if (c55927LxD != null) {
                c55927LxD.LIZ(disappearType);
            }
            lq6.LIZJ = null;
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJIIIZ(final CustomDotAssem assem) {
        o.LJIIIZ(assem, "assem");
        assem.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab.TopTabCustomDotHandler$onAttachToAssem$1
            public final C55916Lx2 LJLIL;
            public final C55914Lx0 LJLILLLLZI;
            public final /* synthetic */ TopTabCustomDotHandler LJLJJI;

            {
                this.LJLJJI = this;
                this.LJLIL = new C55916Lx2(CustomDotAssem.this);
                this.LJLILLLLZI = new C55914Lx0(CustomDotAssem.this, this);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                HomeTabAbility LJIL;
                HomeTabAbility LJIL2;
                LQ6 lq6;
                HomeTabAbility LJIL3;
                HomeTabAbility LJIL4;
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_CREATE) {
                    MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(CustomDotAssem.this);
                    if (LJJLIIIJJIZ != null && (LJIL4 = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
                        LJIL4.na(this.LJLIL);
                    }
                    MainActivityScope LJJLIIIJJIZ2 = C78866UxK.LJJLIIIJJIZ(CustomDotAssem.this);
                    if (LJJLIIIJJIZ2 != null && (LJIL3 = C87277YNd.LJIL(LJJLIIIJJIZ2)) != null) {
                        LJIL3.b3(this.LJLILLLLZI);
                    }
                    TopTabCustomDotHandler topTabCustomDotHandler = this.LJLJJI;
                    Context context = CustomDotAssem.this.getContext();
                    if (context != null) {
                        lq6 = new LQ6(context);
                    } else {
                        lq6 = null;
                    }
                    topTabCustomDotHandler.LJ = lq6;
                    return;
                }
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                MainActivityScope LJJLIIIJJIZ3 = C78866UxK.LJJLIIIJJIZ(CustomDotAssem.this);
                if (LJJLIIIJJIZ3 != null && (LJIL2 = C87277YNd.LJIL(LJJLIIIJJIZ3)) != null) {
                    LJIL2.a2(this.LJLIL);
                }
                MainActivityScope LJJLIIIJJIZ4 = C78866UxK.LJJLIIIJJIZ(CustomDotAssem.this);
                if (LJJLIIIJJIZ4 == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ4)) == null) {
                    return;
                }
                LJIL.a2(this.LJLILLLLZI);
            }
        });
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILL(int i) {
        View view;
        String valueOf;
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            View LIZJ = lq6.LIZJ();
            if (LIZJ != null) {
                view = LIZJ.findViewById(com.zhiliaoapp.musically.R.id.mmd);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            if (i > 99) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(99);
                LIZ.append('+');
                valueOf = X1D.LIZIZ(LIZ);
                i = 99;
            } else {
                valueOf = String.valueOf(i);
            }
            if (i <= 0) {
                TuxTextView LIZIZ = lq6.LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.setVisibility(8);
                }
                lq6.LIZIZ = 0;
                return;
            }
            TuxTextView LIZIZ2 = lq6.LIZIZ();
            if (LIZIZ2 != null) {
                LIZIZ2.setVisibility(0);
            }
            TuxTextView LIZIZ3 = lq6.LIZIZ();
            if (LIZIZ3 != null) {
                LIZIZ3.setText(valueOf);
            }
            lq6.LIZIZ = i;
        }
    }

    @Override // X.AbstractC55930LxG
    public final void LJ(Bitmap bitmap, AqS159S0100000_9 aqS159S0100000_9) {
        aqS159S0100000_9.invoke();
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILJJIL(Bitmap bitmap, AqS159S0100000_9 aqS159S0100000_9) {
        aqS159S0100000_9.invoke();
    }

    @Override // X.AbstractC55930LxG
    public final void LJIILLIIL(C68722mq tooltipConfig, AqS156S0200000_9 aqS156S0200000_9, AqS140S0200000_9 aqS140S0200000_9, AqS156S0200000_9 aqS156S0200000_92) {
        View findViewById;
        o.LJIIIZ(tooltipConfig, "tooltipConfig");
        LQ6 lq6 = this.LJ;
        if (lq6 != null) {
            View LIZJ = lq6.LIZJ();
            if (LIZJ != null && (findViewById = LIZJ.findViewById(R.id.text1)) != null) {
                lq6.LIZJ = new C55927LxD(lq6.LIZ, findViewById, L86.TOP_TAB.getValue());
            }
            C55927LxD c55927LxD = lq6.LIZJ;
            if (c55927LxD != null) {
                ((ArrayList) c55927LxD.LJI).add(new C55876LwO(aqS156S0200000_9, aqS140S0200000_9, lq6, aqS156S0200000_92));
            }
            C55927LxD c55927LxD2 = lq6.LIZJ;
            if (c55927LxD2 != null) {
                c55927LxD2.LIZJ(tooltipConfig);
            }
        }
    }
}
