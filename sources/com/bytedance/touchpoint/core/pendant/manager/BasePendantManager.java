package com.bytedance.touchpoint.core.pendant.manager;

import X.AbstractC244999jT;
import X.AbstractC247499nV;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C246049lA;
import X.C249949rS;
import X.C249999rX;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78926UyI;
import X.C95J;
import X.C9OT;
import X.InterfaceC249909rO;
import X.InterfaceC250039rb;
import X.InterfaceC250199rr;
import X.ViewOnClickListenerC250989t8;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.touchpoint.core.pendant.PendantViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public abstract class BasePendantManager extends AbstractC244999jT implements GenericLifecycleObserver, InterfaceC250199rr {
    public C9OT LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public ViewGroup LJLJJLL;
    public LifecycleOwner LJLJL;
    public final C214378bB LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public String LJLLI;

    @Override // X.InterfaceC250199rr
    public final void LJIJ() {
    }

    public final InterfaceC249909rO LJJI() {
        return (InterfaceC249909rO) this.LJLJLLL.getValue();
    }

    public final InterfaceC250039rb LJJIFFI() {
        return (InterfaceC250039rb) this.LJLL.getValue();
    }

    public abstract void LJJII();

    public abstract void LJJIII();

    public abstract ViewOnClickListenerC250989t8 LJJIIJ();

    public abstract C249999rX LJJIIJZLJL();

    public boolean LJJIIZI() {
        return false;
    }

    public boolean LJJIJ() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        return (BaseTouchPointDataVM) this.LJLJLJ.getValue();
    }

    public final boolean LJJIIZ() {
        C9OT c9ot = this.LJLIL;
        if (c9ot == null) {
            return false;
        }
        if (c9ot.LJLIL == null && c9ot.LJLILLLLZI == null) {
            return false;
        }
        return true;
    }

    public final Context getContext() {
        Object obj = this.LJLJL;
        if (obj instanceof Activity) {
            if (obj != null) {
                return (Context) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }
        if (obj instanceof Fragment) {
            if (obj != null) {
                return ((Fragment) obj).getContext();
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            return abstractC247499nV.LJ();
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestory() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LJLJL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LJLJL = null;
        LJJIJIIJIL();
        this.LJLJJLL = null;
        this.LJLIL = null;
    }

    public BasePendantManager() {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        this.LJLJLJ = new C214378bB(C65352Pkq.LIZ(PendantViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C249949rS.INSTANCE, null, null);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 27));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 28));
        this.LJLLI = "For You";
    }

    @Override // X.InterfaceC250199rr
    public final void LJIJI() {
        if (LJJI().LJIJJLI()) {
            return;
        }
        LJJIJIIJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r1.LIZ(r0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r1.LIZ(r2) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.BasePendantManager.LJJIJIIJI():void");
    }

    public final void LJJIJIIJIL() {
        if (!LJJI().LJIJJLI()) {
            return;
        }
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        LJJI().clear();
        LJJIFFI().LIZIZ();
    }
}
