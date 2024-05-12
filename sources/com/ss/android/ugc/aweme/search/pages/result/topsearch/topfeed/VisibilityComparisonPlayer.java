package com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed;

import X.C0A6;
import X.C16880lQ;
import X.C1JD;
import X.C221108m2;
import X.C49111JPf;
import X.C50041JkT;
import X.C50042JkU;
import X.C50420Jqa;
import X.C62822Ol8;
import X.C68182ly;
import X.C78926UyI;
import X.JLU;
import X.JQX;
import X.JVB;
import X.JVD;
import X.JYE;
import X.QD3;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public final class VisibilityComparisonPlayer extends C0A6 implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;
    public final JYE LJLILLLLZI;
    public final SearchStateViewModel LJLJI;
    public final SearchGlobalViewModel LJLJJI;
    public final int[] LJLJJL;
    public C50042JkU LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public Integer LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final LifecycleOwner LJLLLLLL;
    public final JYE LJLZ;
    public final JVB LJZ;
    public final C62822Ol8 LJZI;
    public final C50041JkT LJZL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LJIJI() {
        C68182ly.LIZLLL(this.LJLIL, this);
        C1JD.LJJJJ(EventBus.LIZJ(), this);
        this.LJLILLLLZI.LIZ.LJJLL(this);
        this.LJLILLLLZI.LIZ.setOnFlingListener(null);
        this.LJLJLLL = null;
        JVB jvb = this.LJZ;
        JQX jqx = jvb.LIZIZ;
        if (jqx != null) {
            jvb.LIZ(jqx);
            jvb.LIZIZ = null;
        }
        this.LJLLJ = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLJL) {
            this.LJLJL = false;
        } else if (this.LJLL && this.LJLLILLLL) {
            resume();
        }
    }

    public final void pause() {
        JVB jvb = this.LJZ;
        JQX jqx = jvb.LIZIZ;
        if (jqx != null) {
            jvb.LIZ(jqx);
            jvb.LIZIZ = null;
        }
        JLU.LJFF();
    }

    public final void resume() {
        if (!this.LJLLJ || !this.LJLL || !this.LJLLILLLL || this.LJLLI || this.LJLLLL || this.LJLLL) {
            return;
        }
        Boolean value = this.LJLJI.isScrollingInternal.getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        if (value.booleanValue()) {
            return;
        }
        LJIJ();
        LJIIZILJ(0, false);
    }

    public final void LJIJ() {
        if (C49111JPf.LIZ()) {
            return;
        }
        C50042JkU c50042JkU = this.LJLJJLL;
        int i = c50042JkU.LJLIL;
        if (i > 0 && c50042JkU.LJLILLLLZI > i) {
            return;
        }
        int[] iArr = new int[2];
        this.LJLILLLLZI.LIZIZ.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        this.LJLJJLL = new C50042JkU(i2, this.LJLILLLLZI.LIZIZ.getMeasuredHeight() + i2);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJIJI();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        pause();
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        if (event.LJLJLJ != -1 && event.LJLIL == 66) {
            this.LJLJL = true;
        }
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && this.LJLJLJ) {
            LJIIZILJ(0, false);
            this.LJLJLJ = false;
        }
    }

    public final void LJIILLIIL(JQX holder, boolean z) {
        if (z && C78926UyI.LJIILIIL(holder) == C78926UyI.LJIILIIL(this.LJZ.LIZIZ)) {
            return;
        }
        JVB jvb = this.LJZ;
        jvb.getClass();
        o.LJIIIZ(holder, "holder");
        jvb.LIZ = holder;
        if (holder.LLIIII()) {
            if (C16880lQ.LLJJIJIL(this.LJLIL.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) >= 0) {
                this.LJZ.LIZIZ(holder);
            }
        } else {
            JVB jvb2 = this.LJZ;
            JQX jqx = jvb2.LIZIZ;
            if (jqx == null) {
                return;
            }
            jvb2.LIZ(jqx);
            jvb2.LIZIZ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.VisibilityComparisonPlayer.LJIIZILJ(int, boolean):void");
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i2 == 0 || this.LJLJLJ) {
            return;
        }
        LJIIZILJ(i2, true);
    }

    public VisibilityComparisonPlayer(LifecycleOwner owner, JYE jye, SearchStateViewModel searchStateViewModel, SearchGlobalViewModel searchGlobalViewModel) {
        o.LJIIIZ(owner, "owner");
        this.LJLIL = owner;
        this.LJLILLLLZI = jye;
        this.LJLJI = searchStateViewModel;
        this.LJLJJI = searchGlobalViewModel;
        this.LJLJJL = new int[2];
        this.LJLJJLL = new C50042JkU(-1, -1);
        this.LJLL = true;
        this.LJLLILLLL = true;
        this.LJLLLLLL = owner;
        this.LJLZ = jye;
        this.LJZ = new JVB();
        if (C49111JPf.LIZ()) {
            ViewGroup viewGroup = jye.LIZIZ;
            AqS155S0200000_8 aqS155S0200000_8 = new AqS155S0200000_8(viewGroup, this, 13);
            if (viewGroup.getHeight() <= 0) {
                JVD.LIZIZ(viewGroup, new AqS158S0100000_8(aqS155S0200000_8, 323));
            } else {
                aqS155S0200000_8.invoke();
            }
        }
        this.LJZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 324));
        this.LJZL = new C50041JkT(this);
    }
}
