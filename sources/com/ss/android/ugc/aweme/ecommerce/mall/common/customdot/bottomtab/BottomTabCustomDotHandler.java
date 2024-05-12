package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.bottomtab;

import X.AbstractC55918Lx4;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C212428Vi;
import X.C34051DXz;
import X.C53811L9z;
import X.C55920Lx6;
import X.C55921Lx7;
import X.C55925LxB;
import X.C56100M0a;
import X.C57568Mia;
import X.C57569Mib;
import X.C78866UxK;
import X.C78897Uxp;
import X.C7MY;
import X.C87277YNd;
import X.DY1;
import X.M12;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BottomTabCustomDotHandler extends M12 {
    public final List<AbstractC55918Lx4> LIZJ = new ArrayList();
    public final String LIZLLL;

    @Override // X.M12
    public final void LIZIZ() {
    }

    public static int LJIIJ() {
        int LIZIZ = C7MY.LIZIZ(32);
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            return C7MY.LIZIZ(26);
        }
        return LIZIZ;
    }

    public static int LJIIJJI() {
        int LIZIZ = C7MY.LIZIZ(50);
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            return C7MY.LIZIZ(48);
        }
        return LIZIZ;
    }

    @Override // X.M12
    public final C55925LxB LIZ() {
        return new C55925LxB(this);
    }

    @Override // X.M12
    public final void LIZJ() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.LLJ(this.LIZLLL);
        }
    }

    @Override // X.M12
    public final void LIZLLL() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.z20(this.LIZLLL);
        }
    }

    @Override // X.M12
    public final void LJFF() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.LLIZ(this.LIZLLL);
        }
    }

    @Override // X.M12
    public final boolean LJI() {
        ActivityC45651qj LIZ;
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LIZ = C212428Vi.LIZ(customDotAssem)) != null) {
            return o.LJ(this.LIZLLL, C116694i1.LIZ(LIZ).nv0());
        }
        return false;
    }

    @Override // X.M12
    public final void LJII() {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.LLZLLIL(this.LIZLLL);
        }
    }

    public BottomTabCustomDotHandler() {
        String str;
        IECMallService LIZJ = FashionMallService.LIZJ();
        o.LJIIIIZZ(LIZJ, "get().getService(IECMallService::class.java)");
        if (C53811L9z.LIZ[LIZJ.LIZIZ().ordinal()] == 1) {
            str = "FASHION_MALL";
        } else {
            str = "SHOP_MALL";
        }
        this.LIZLLL = str;
    }

    @Override // X.M12
    public final void LJIIIZ(int i) {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.S3(i, this.LIZLLL);
        }
    }

    public final void LJIIL(final CustomDotAssem assem) {
        o.LJIIIZ(assem, "assem");
        assem.getLifecycle().addObserver(new LifecycleEventObserver(assem) { // from class: com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.bottomtab.BottomTabCustomDotHandler$onAttachToAssem$1
            public final C56100M0a LJLIL;
            public final /* synthetic */ CustomDotAssem LJLJI;

            {
                this.LJLJI = assem;
                this.LJLIL = new C56100M0a(BottomTabCustomDotHandler.this, assem);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                HomeTabAbility LJIL;
                HomeTabAbility LJIL2;
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_CREATE) {
                    MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this.LJLJI);
                    if (LJJLIIIJJIZ != null && (LJIL2 = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
                        LJIL2.b3(this.LJLIL);
                        return;
                    }
                    return;
                }
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                MainActivityScope LJJLIIIJJIZ2 = C78866UxK.LJJLIIIJJIZ(this.LJLJI);
                if (LJJLIIIJJIZ2 != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ2)) != null) {
                    LJIL.Q6(this.LJLIL);
                }
                Iterator<AbstractC55918Lx4> it = BottomTabCustomDotHandler.this.LIZJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ();
                }
                ((ArrayList) BottomTabCustomDotHandler.this.LIZJ).clear();
            }
        });
    }

    @Override // X.M12
    public final void LJ(Bitmap bitmap, AqS159S0100000_9 aqS159S0100000_9) {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        C57568Mia c57568Mia = new C57568Mia();
        c57568Mia.LIZ(new C55920Lx6(aqS159S0100000_9, this, c57568Mia));
        ((ArrayList) this.LIZJ).add(c57568Mia);
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            LJIIIZ.eu(this.LIZLLL, c57568Mia);
        }
    }

    @Override // X.M12
    public final void LJIIIIZZ(Bitmap bitmap, AqS159S0100000_9 aqS159S0100000_9) {
        MainActivityScope LJJLIIIJJIZ;
        BottomTabAbility LJIIIZ;
        Resources resources;
        ActivityC45651qj LIZ;
        C57569Mib c57569Mib = new C57569Mib();
        c57569Mib.LIZ(new C55921Lx7(aqS159S0100000_9, this, c57569Mib));
        ((ArrayList) this.LIZJ).add(c57569Mib);
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null && (LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(customDotAssem)) != null && (LJIIIZ = C78897Uxp.LJIIIZ(LJJLIIIJJIZ)) != null) {
            String str = this.LIZLLL;
            CustomDotAssem customDotAssem2 = this.LIZ;
            if (customDotAssem2 != null && (LIZ = C212428Vi.LIZ(customDotAssem2)) != null) {
                resources = LIZ.getResources();
            } else {
                resources = null;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJIIJJI(), LJIIJ());
            layoutParams.gravity = 49;
            LJIIIZ.NS(str, bitmapDrawable, c57569Mib, layoutParams, null);
        }
    }
}
