package com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics;

import X.C107724Kq;
import X.C112294av;
import X.C112304aw;
import X.C112324ay;
import X.C112334az;
import X.C3B3;
import X.C3BA;
import X.InterfaceC112314ax;
import X.InterfaceC75532xp;
import Y.AObserverS69S0100000_1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActivityStatusDelegate implements GenericLifecycleObserver, InterfaceC112314ax, LifecycleOwner {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final Set<String> LJLILLLLZI;
    public final Map<String, C107724Kq> LJLJI;
    public C112324ay LJLJJI;
    public final AObserverS69S0100000_1 LJLJJL;

    static {
        new C112304aw();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.getLifecycle();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC112314ax
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLILLLLZI.clear();
        ((LinkedHashMap) this.LJLJI).clear();
        C112324ay c112324ay = this.LJLJJI;
        if (c112324ay != null) {
            c112324ay.LIZ.invoke();
        }
    }

    public ActivityStatusDelegate(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLILLLLZI = new LinkedHashSet();
        this.LJLJI = new LinkedHashMap();
        this.LJLJJL = new AObserverS69S0100000_1(this, 19);
    }

    @Override // X.InterfaceC112314ax
    public final void LIZ(C107724Kq builder) {
        LiveData LJIIJJI;
        o.LJIIIZ(builder, "builder");
        String str = builder.LIZJ;
        if (str == null) {
            return;
        }
        this.LJLJI.put(str, builder);
        if (((Number) C112334az.LIZ.getValue()).intValue() != 1) {
            C3B3.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel(), str, null, null, 14).observe(this, this.LJLJJL);
        } else {
            LJIIJJI = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().LJIIJJI(str, true, C3BA.OTHERS);
            LJIIJJI.observe(this, this.LJLJJL);
        }
    }

    @Override // X.InterfaceC112314ax
    public final void LIZIZ(AqS151S0100000_1 aqS151S0100000_1) {
        this.LJLJJI = new C112324ay(aqS151S0100000_1);
    }

    @Override // X.InterfaceC112314ax
    public final void LIZJ(C107724Kq c107724Kq) {
        String str;
        if (c107724Kq == null || (str = c107724Kq.LIZJ) == null) {
            return;
        }
        this.LJLJI.put(str, c107724Kq);
        if (this.LJLILLLLZI.contains(str)) {
            return;
        }
        C112304aw.LIZ(c107724Kq);
        this.LJLILLLLZI.add(str);
    }

    @Override // X.InterfaceC112314ax
    public final void LIZLLL(C107724Kq c107724Kq, InterfaceC75532xp onEventV3) {
        o.LJIIIZ(onEventV3, "onEventV3");
        if (c107724Kq == null) {
            return;
        }
        onEventV3.LIZIZ("activity_status_click", new C112294av(c107724Kq).LIZ());
    }
}
