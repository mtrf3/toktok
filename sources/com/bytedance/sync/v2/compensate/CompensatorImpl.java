package com.bytedance.sync.v2.compensate;

import X.C66629QCz;
import X.C67040QSu;
import X.C67074QUc;
import X.C67078QUg;
import X.C67079QUh;
import X.C87866Ye6;
import X.InterfaceC67072QUa;
import X.InterfaceC67081QUj;
import X.InterfaceC87871YeB;
import X.QUW;
import X.QVN;
import X.QVR;
import X.QVY;
import X.QW8;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.sync.settings.SettingsV2;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class CompensatorImpl implements GenericLifecycleObserver, InterfaceC67072QUa, InterfaceC87871YeB {
    public final Context LJLIL;
    public final QVY LJLJI;
    public final C67040QSu LJLJJI;
    public volatile SettingsV2 LJLJJL;
    public volatile InterfaceC67081QUj LJLJJLL;
    public boolean LJLJL;
    public final AtomicBoolean LJLJLJ = new AtomicBoolean(false);
    public final AtomicBoolean LJLJLLL = new AtomicBoolean(false);
    public final ARunnableS47S0100000_11 LJLL = new ARunnableS47S0100000_11(this, 30);
    public final C67078QUg LJLILLLLZI = new C67078QUg();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onAppBackground();
        } else if (event == Lifecycle.Event.ON_START) {
            onAppForeground();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onAppBackground() {
        C66629QCz.LIZ("[Compensator] startCompensate ON_STOP");
        ((Handler) this.LJLILLLLZI.LIZLLL(new Object[0])).post(new ARunnableS47S0100000_11(this, 31));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onAppForeground() {
        C66629QCz.LIZ("[Compensator] startCompensate ON_START");
        ((Handler) this.LJLILLLLZI.LIZLLL(new Object[0])).post(new ARunnableS47S0100000_11(this, 32));
    }

    @Override // X.InterfaceC87871YeB
    public final boolean isForeground() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC67072QUa
    public final void LIZ(C67074QUc c67074QUc) {
        ((Handler) this.LJLILLLLZI.LIZLLL(new Object[0])).post(new ARunnableS30S0200000_11(this, QUW.LIZJ(this.LJLIL).LIZIZ(), 11));
    }

    public final void LIZIZ(SettingsV2 settingsV2) {
        InterfaceC67081QUj c87866Ye6;
        InterfaceC67081QUj c87866Ye62;
        if (settingsV2 == null) {
            return;
        }
        SettingsV2 settingsV22 = this.LJLJJL;
        InterfaceC67081QUj interfaceC67081QUj = this.LJLJJLL;
        if (settingsV22 == null || interfaceC67081QUj == null) {
            if (settingsV2.LIZIZ()) {
                c87866Ye6 = new C67079QUh(this, this.LJLJI, this.LJLJJI);
            } else {
                c87866Ye6 = new C87866Ye6(this, this.LJLILLLLZI, this.LJLJI, false, true);
            }
            c87866Ye6.LJ(settingsV2, this.LJLJLJ.get());
            this.LJLJJLL = c87866Ye6;
        } else if ((this.LJLJJL.LIZIZ() && !settingsV2.LIZIZ()) || (!this.LJLJJL.LIZIZ() && settingsV2.LIZIZ())) {
            interfaceC67081QUj.destroy();
            if (settingsV2.LIZIZ()) {
                c87866Ye62 = new C67079QUh(this, this.LJLJI, this.LJLJJI);
            } else {
                c87866Ye62 = new C87866Ye6(this, this.LJLILLLLZI, this.LJLJI, false, true);
            }
            c87866Ye62.LJ(settingsV2, this.LJLJLJ.get());
            this.LJLJJLL = c87866Ye62;
        } else {
            interfaceC67081QUj.LIZJ(settingsV2);
        }
        this.LJLJJL = settingsV2;
        this.LJLJLLL.set(true);
    }

    public CompensatorImpl(Context context, C67040QSu c67040QSu, QW8 qw8) {
        this.LJLIL = context;
        this.LJLJJI = c67040QSu;
        this.LJLJI = new QVY(new QVR(this, new QVN(c67040QSu, qw8, null)));
    }
}
