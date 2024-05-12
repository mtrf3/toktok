package com.ss.android.ugc.aweme.search.pages.common.theme.activitybg;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C48891JGt;
import X.C49710Jf8;
import X.C50238Jne;
import X.C50240Jng;
import X.C50241Jnh;
import X.C50243Jnj;
import X.C51087K3f;
import X.C62822Ol8;
import X.C68182ly;
import X.C7MY;
import X.InterfaceC48888JGq;
import X.InterfaceC50244Jnk;
import X.InterfaceC50548Jse;
import X.JBR;
import X.ViewOnLayoutChangeListenerC50239Jnf;
import X.X1D;
import Y.ARunnableS44S0100000_8;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchActivityCardBgController implements InterfaceC50244Jnk, InterfaceC48888JGq, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LJLLL = 0;
    public final ActivityC45651qj LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final C50243Jnj LJLJI;
    public final int LJLJJI = C7MY.LIZIZ(36);
    public C50240Jng LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public C50240Jng LJLLILLLL;
    public ViewOnLayoutChangeListenerC50239Jnf LJLLJ;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public final C50241Jnh LJ() {
        return (C50241Jnh) this.LJLJL.getValue();
    }

    public final ThemeViewModel LJFF() {
        return (ThemeViewModel) this.LJLJLJ.getValue();
    }

    public final void LJIIIZ() {
        this.LJLILLLLZI.removeOnAttachStateChangeListener(this);
        C51087K3f c51087K3f = (C51087K3f) this.LJLJJLL.getValue();
        c51087K3f.LIZ.runOnUiThread(new ARunnableS44S0100000_8(c51087K3f, 198));
        C50241Jnh LJ = LJ();
        LJ.LJIIZILJ(true);
        LJ.LJLJJI = null;
        LJ.LJLIL.LJJLL(LJ);
    }

    @Override // X.InterfaceC50244Jnk
    public final void LIZ() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hideBackground, maxIndex: ");
        C50240Jng c50240Jng = this.LJLLILLLL;
        if (c50240Jng != null) {
            num = c50240Jng.LIZJ;
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", item visible: ");
        LIZ.append(LJ().LJIILLIIL());
        X1D.LIZIZ(LIZ);
        ThemeViewModel LJFF = LJFF();
        C50240Jng LIZLLL = LIZLLL();
        LJFF.getClass();
        LJFF.gv0().postValue(LIZLLL);
    }

    @Override // X.InterfaceC50244Jnk
    public final void LIZIZ() {
        Integer num;
        C50240Jng info;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showBackground, maxIndex: ");
        C50240Jng c50240Jng = this.LJLLILLLL;
        if (c50240Jng != null) {
            num = c50240Jng.LIZJ;
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", item visible: ");
        LIZ.append(LJ().LJIILLIIL());
        X1D.LIZIZ(LIZ);
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = LIZLLL();
        }
        if (LJ().LJIILLIIL()) {
            info = this.LJLLILLLL;
            o.LJI(info);
        } else {
            info = this.LJLJJL;
        }
        ThemeViewModel LJFF = LJFF();
        LJFF.getClass();
        o.LJIIIZ(info, "info");
        LJFF.gv0().postValue(info);
    }

    public final C50240Jng LIZLLL() {
        String value;
        int i;
        ThemeViewModel LJFF = LJFF();
        if (LJFF.iv0().getValue() == null) {
            value = "light";
        } else {
            value = LJFF.iv0().getValue();
            o.LJI(value);
        }
        InterfaceC50548Jse interfaceC50548Jse = ((SearchStartViewModel) this.LJLJLLL.getValue()).LJLZ;
        if (interfaceC50548Jse != null) {
            i = interfaceC50548Jse.LIZ();
        } else {
            i = 0;
        }
        if (o.LJ(value, "dark") && i == 0) {
            return C50238Jne.LIZIZ(this.LJLIL);
        }
        return C50238Jne.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C48891JGt.onDestroy(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C48891JGt.onPause(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C48891JGt.onResume(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C48891JGt.onStop(this);
    }

    @Override // X.InterfaceC50244Jnk
    public final void LIZJ(boolean z) {
        if (z) {
            LIZIZ();
        } else {
            LIZ();
        }
    }

    public final void LJIIIIZZ(boolean z) {
        String str;
        StringBuilder LJI = JBR.LJI("setFragmentVisible: ", z, ", hasPendingTheme: ");
        LJI.append(this.LJLL);
        LJI.append(", themeInfo: ");
        C50240Jng c50240Jng = this.LJLLILLLL;
        if (c50240Jng != null) {
            str = c50240Jng.LIZ;
        } else {
            str = null;
        }
        LJI.append(str);
        X1D.LIZIZ(LJI);
        this.LJLLI = z;
        if (z && this.LJLL) {
            this.LJLL = false;
            C50240Jng c50240Jng2 = this.LJLLILLLL;
            if (c50240Jng2 != null) {
                ThemeViewModel LJFF = LJFF();
                LJFF.getClass();
                LJFF.hv0().postValue(c50240Jng2);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r7, X.C49710Jf8 r8) {
        /*
            r6 = this;
            r4 = 0
            if (r7 == 0) goto L75
            com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData r1 = r7.getActivityCardBg()
            if (r1 == 0) goto L76
            java.lang.String r0 = r1.getActivityBgColor()
        Ld:
            java.lang.Integer r0 = X.C78897Uxp.LJJJIL(r0)
            if (r0 == 0) goto L73
            int r5 = r0.intValue()
            if (r1 == 0) goto L71
            java.lang.Integer r0 = r1.getActivityBgRange()
            if (r0 == 0) goto L71
            int r0 = r0.intValue()
            if (r0 <= 0) goto L71
            int r0 = r0 + (-1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L2b:
            X.Jng r2 = new X.Jng
            java.lang.String r1 = "dark"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r1, r5, r3, r0)
        L34:
            r6.LJII(r8, r2)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "processActivityCardBg ，activity card background: color = "
            r1.append(r0)
            if (r2 == 0) goto L6f
            int r0 = r2.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L48:
            r1.append(r0)
            java.lang.String r0 = ", maxIndex = "
            r1.append(r0)
            if (r2 == 0) goto L54
            java.lang.Integer r4 = r2.LIZJ
        L54:
            r1.append(r4)
            X.X1D.LIZIZ(r1)
            if (r2 == 0) goto L5e
            if (r8 != 0) goto L5f
        L5e:
            return
        L5f:
            X.Jnf r0 = new X.Jnf
            r0.<init>(r7, r6, r8, r2)
            r6.LJLLJ = r0
            r8.removeOnLayoutChangeListener(r0)
            X.Jnf r0 = r6.LJLLJ
            r8.addOnLayoutChangeListener(r0)
            goto L5e
        L6f:
            r0 = r4
            goto L48
        L71:
            r3 = r4
            goto L2b
        L73:
            r2 = r4
            goto L34
        L75:
            r1 = r4
        L76:
            r0 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController.LJI(com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig, X.Jf8):void");
    }

    public final void LJII(C49710Jf8 c49710Jf8, C50240Jng c50240Jng) {
        this.LJLL = false;
        LJFF().LJLJI = 0;
        if (c50240Jng == null) {
            this.LJLLILLLL = null;
            LJIIIZ();
            ThemeViewModel LJFF = LJFF();
            C50240Jng info = this.LJLJJL;
            LJFF.getClass();
            o.LJIIIZ(info, "info");
            LJFF.hv0().postValue(info);
            C50243Jnj c50243Jnj = this.LJLJI;
            c50243Jnj.LIZLLL = 0;
            c50243Jnj.LJFF = 0.0f;
            c50243Jnj.LJIIIIZZ = 0;
            c50243Jnj.LJII = 0;
            c50243Jnj.LIZ();
            if (c49710Jf8 != null) {
                c49710Jf8.removeOnLayoutChangeListener(this.LJLLJ);
            }
        }
    }

    public SearchActivityCardBgController(ActivityC45651qj activityC45651qj, RecyclerView recyclerView, C50243Jnj c50243Jnj) {
        C50240Jng LIZJ;
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = c50243Jnj;
        if (o.LJ(C50238Jne.LIZLLL(), "dark")) {
            LIZJ = C50238Jne.LIZIZ(activityC45651qj);
        } else {
            LIZJ = C50238Jne.LIZJ(activityC45651qj);
        }
        this.LJLJJL = LIZJ;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 199));
        this.LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 197));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 200));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 198));
        C68182ly.LIZ(activityC45651qj, this);
    }
}
