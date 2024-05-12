package com.ss.android.ugc.aweme.prefab;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C252569vg;
import X.C2NU;
import X.C73305Spp;
import X.C73969T1h;
import X.C76800UCe;
import X.C7XP;
import X.InterfaceC65784Pro;
import X.InterfaceC69602oG;
import X.InterfaceC92693kP;
import Y.IDxS24S0300000_3;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NetworkHelper implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLLJ = 0;
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final Activity LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final long LJLJLJ;
    public final LifecycleOwner LJLJLLL;
    public C7XP LJLL;
    public InterfaceC92693kP LJLLI;
    public long LJLLILLLL;

    public NetworkHelper() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onFragmentDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onFragmentDestroy() {
        Lifecycle lifecycle;
        InterfaceC92693kP interfaceC92693kP = this.LJLLI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        LifecycleOwner lifecycleOwner = this.LJLJLLL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    public final void LIZIZ(C73305Spp c73305Spp) {
        if (this.LJLJL == 0 && c73305Spp != null && c73305Spp.getVisibility() == 0) {
            C252569vg.LIZ(c73305Spp, this.LJLJJLL, null, new AqS153S0100000_3(this, 1656));
            c73305Spp.setVisibility(0);
        }
    }

    public final void LIZJ(C73305Spp c73305Spp) {
        C7XP c7xp = this.LJLL;
        if (c7xp != null) {
            C2NU.LIZ.LIZLLL(c7xp);
        }
        InterfaceC92693kP interfaceC92693kP = this.LJLLI;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            InterfaceC92693kP interfaceC92693kP2 = this.LJLLI;
            o.LJI(interfaceC92693kP2);
            interfaceC92693kP2.dispose();
        }
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LIZLLL(C73305Spp c73305Spp) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (this.LJLJL == 0 && c73305Spp != null) {
            c73305Spp.LJFF();
        }
        if (this.LJLJL == 1 && (interfaceC65784Pro = this.LJLJI) != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLLILLLL = System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7XP] */
    public final void LIZ(Throwable th, C73305Spp c73305Spp) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLLILLLL;
        this.LJLL = new InterfaceC69602oG() { // from class: X.7XP
            @Override // X.InterfaceC69602oG
            public final void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt currentType) {
                o.LJIIIZ(currentType, "currentType");
                if (currentType == EnumC111394Yt.AVAILABLE) {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = NetworkHelper.this.LJLIL;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                    InterfaceC92693kP interfaceC92693kP = NetworkHelper.this.LJLLI;
                    if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
                        interfaceC92693kP.dispose();
                    }
                    C2NU.LIZ.LIZLLL(NetworkHelper.this.LJLL);
                }
            }
        };
        long j = this.LJLJLJ;
        Exception exc = null;
        if (currentTimeMillis >= j) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            }
            LJ(c73305Spp, exc, 0L);
        } else {
            if (th instanceof Exception) {
                exc = (Exception) th;
            }
            LJ(c73305Spp, exc, j - currentTimeMillis);
            C2NU.LIZ.LIZ(this.LJLL);
        }
    }

    public final void LJ(C73305Spp c73305Spp, Exception exc, long j) {
        AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJL(C73969T1h.LIZIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS24S0300000_3(this, c73305Spp, exc, 0));
    }

    public NetworkHelper(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, AqS153S0100000_3 aqS153S0100000_3, AqS153S0100000_3 aqS153S0100000_32, ActivityC45651qj activityC45651qj, String scene, int i, LifecycleOwner lifecycleOwner, int i2) {
        long j;
        Lifecycle lifecycle;
        interfaceC65784Pro = (i2 & 1) != 0 ? null : interfaceC65784Pro;
        interfaceC65784Pro2 = (i2 & 2) != 0 ? null : interfaceC65784Pro2;
        aqS153S0100000_3 = (i2 & 4) != 0 ? null : aqS153S0100000_3;
        aqS153S0100000_32 = (i2 & 8) != 0 ? null : aqS153S0100000_32;
        activityC45651qj = (i2 & 16) != 0 ? null : activityC45651qj;
        scene = (i2 & 32) != 0 ? "" : scene;
        i = (i2 & 64) != 0 ? 0 : i;
        if ((i2 & 128) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        o.LJIIIZ(scene, "scene");
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC65784Pro2;
        this.LJLJI = aqS153S0100000_3;
        this.LJLJJI = aqS153S0100000_32;
        this.LJLJJL = activityC45651qj;
        this.LJLJJLL = scene;
        this.LJLJL = i;
        this.LJLJLJ = j;
        this.LJLJLLL = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
