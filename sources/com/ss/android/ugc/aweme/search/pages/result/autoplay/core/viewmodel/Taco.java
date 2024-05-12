package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel;

import X.AbstractC49223JTn;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C48891JGt;
import X.C49133JQb;
import X.C49197JSn;
import X.C49202JSs;
import X.C49219JTj;
import X.C49222JTm;
import X.C49225JTp;
import X.C49226JTq;
import X.C49235JTz;
import X.C55230Lly;
import X.C55247LmF;
import X.C62822Ol8;
import X.C68182ly;
import X.InterfaceC48888JGq;
import X.InterfaceC49148JQq;
import X.InterfaceC49220JTk;
import X.InterfaceC49224JTo;
import X.JSL;
import X.JSV;
import X.JU3;
import X.X1D;
import android.os.Handler;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.enablestatus.LifeCycleEnableStatus;
import java.util.Iterator;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Taco implements InterfaceC48888JGq {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final LifecycleOwner LJLIL;
    public C49197JSn LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C49225JTp.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 716));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C49226JTq.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C49222JTm.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(JSV.LJLIL);

    public final InterfaceC49148JQq LIZLLL() {
        C49197JSn c49197JSn = this.LJLILLLLZI;
        if (c49197JSn != null) {
            return c49197JSn.LIZ;
        }
        return null;
    }

    public final JU3 LJ() {
        return (JU3) this.LJLJI.getValue();
    }

    public final SparseArray<InterfaceC49224JTo> LJI() {
        return (SparseArray) this.LJLJJLL.getValue();
    }

    public final void LJIIIIZZ() {
        C68182ly.LIZ(this.LJLIL, this);
        C68182ly.LIZ(this.LJLIL, (LifeCycleEnableStatus) this.LJLJJL.getValue());
        LIZJ((AbstractC49223JTn) this.LJLJJL.getValue());
        C49197JSn c49197JSn = new C49197JSn();
        JU3 LJ = LJ();
        LJ.getClass();
        LJ.LIZJ = c49197JSn;
        this.LJLILLLLZI = c49197JSn;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("this ");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if (lifecycleOwner instanceof ActivityC45651qj) {
            C55247LmF.LIZIZ(C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null), new C49219JTj(this), C49219JTj.class, "source_default_key");
        } else {
            if (!(lifecycleOwner instanceof Fragment)) {
                return;
            }
            C55247LmF.LIZIZ(C55230Lly.LIZJ((Fragment) lifecycleOwner, null), new C49219JTj(this), C49219JTj.class, "source_default_key");
        }
    }

    @Override // X.InterfaceC48888JGq
    public final void onDestroy() {
        C68182ly.LIZLLL(this.LJLIL, (LifeCycleEnableStatus) this.LJLJJL.getValue());
        C49235JTz c49235JTz = (C49235JTz) this.LJLJJI.getValue();
        Iterator<InterfaceC49220JTk> it = c49235JTz.LIZ().iterator();
        while (it.hasNext()) {
            MutableLiveData<Integer> LIZ = it.next().LIZ();
            if (LIZ != null) {
                LIZ.removeObserver(c49235JTz.LIZJ);
            }
        }
        c49235JTz.LIZ().clear();
        C49197JSn c49197JSn = this.LJLILLLLZI;
        if (c49197JSn != null) {
            c49197JSn.LIZJ();
            ((C49202JSs) c49197JSn.LIZJ.getValue()).LIZ().clear();
            ((Handler) c49197JSn.LIZIZ.getValue()).removeCallbacksAndMessages(null);
        }
        SparseArray<InterfaceC49224JTo> LJI = LJI();
        int size = LJI.size();
        for (int i = 0; i < size; i++) {
            LJI.keyAt(i);
            LJI.valueAt(i).LLLLLILLIL();
        }
        LJI().clear();
        ((SparseArray) this.LJLJL.getValue()).clear();
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if (lifecycleOwner instanceof ActivityC45651qj) {
            C55247LmF.LJ(C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null), C49219JTj.class, "source_default_key");
        } else {
            if (!(lifecycleOwner instanceof Fragment)) {
                return;
            }
            C55247LmF.LJ(C55230Lly.LIZJ((Fragment) lifecycleOwner, null), C49219JTj.class, "source_default_key");
        }
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
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

    public Taco(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
    }

    public final void LIZJ(InterfaceC49220JTk interfaceC49220JTk) {
        if (interfaceC49220JTk == null) {
            return;
        }
        C49235JTz c49235JTz = (C49235JTz) this.LJLJJI.getValue();
        c49235JTz.getClass();
        boolean contains = c49235JTz.LIZ().contains(interfaceC49220JTk);
        C16880lQ.LJLLJ(interfaceC49220JTk.getClass());
        if (!contains) {
            MutableLiveData<Integer> LIZ = interfaceC49220JTk.LIZ();
            if (LIZ != null) {
                LIZ.observeForever(c49235JTz.LIZJ);
            }
            c49235JTz.LIZ().add(interfaceC49220JTk);
        }
        if (interfaceC49220JTk instanceof AbstractC49223JTn) {
            ((AbstractC49223JTn) interfaceC49220JTk).LJLIL = LJ();
        }
    }

    public final JSL LJFF(int i) {
        return (JSL) ((SparseArray) this.LJLJL.getValue()).get(i);
    }

    public final boolean LJII(Class<?> targetCard) {
        o.LJIIIZ(targetCard, "targetCard");
        InterfaceC49148JQq LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current is ");
        LIZ.append(LIZLLL);
        LIZ.append(" and target is ");
        LIZ.append(targetCard);
        C49133JQb.LIZ("Taco", X1D.LIZIZ(LIZ));
        return o.LJ(LIZLLL.getClass(), targetCard);
    }

    public static /* synthetic */ void LIZIZ(Taco taco, InterfaceC49224JTo interfaceC49224JTo) {
        int i;
        if (interfaceC49224JTo != null) {
            i = interfaceC49224JTo.hashCode();
        } else {
            i = 0;
        }
        taco.LIZ(interfaceC49224JTo, i);
    }

    public final void LIZ(InterfaceC49224JTo interfaceC49224JTo, int i) {
        if (interfaceC49224JTo == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("this:");
        LIZ.append(hashCode());
        LIZ.append(" and provider");
        LIZ.append(interfaceC49224JTo);
        C49133JQb.LIZ("Taco", X1D.LIZIZ(LIZ));
        LJI().put(i, interfaceC49224JTo);
        interfaceC49224JTo.LLIIJI(LJ());
        C49133JQb.LIZ("Taco", "set emitter in base");
    }
}
