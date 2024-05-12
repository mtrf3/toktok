package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C221108m2;
import X.C62822Ol8;
import X.C68972R5c;
import X.C73318Sq2;
import X.C73426Srm;
import X.C73969T1h;
import X.EnumC71789SFl;
import X.InterfaceC68974R5e;
import X.RA7;
import X.RB2;
import X.RBF;
import X.T0J;
import X.T0K;
import X.T16;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SetPasswordMobHelper implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLILLLLZI.LIZLLL();
        this.LJLIL.getLifecycle().removeObserver(this);
    }

    public SetPasswordMobHelper(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = new C73318Sq2();
        this.LJLJI = C221108m2.LIZIZ(RBF.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(RA7.LJLIL);
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public static /* synthetic */ void LIZIZ(SetPasswordMobHelper setPasswordMobHelper, String str, String str2, String str3, String str4, InterfaceC68974R5e interfaceC68974R5e, String str5) {
        setPasswordMobHelper.LIZ(true, str, str2, str3, str4, 0, interfaceC68974R5e, str5);
    }

    public final void LIZ(boolean z, String platform, String enterFrom, String enterMethod, String loginPanelType, int i, InterfaceC68974R5e interfaceC68974R5e, String pwd) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(loginPanelType, "loginPanelType");
        o.LJIIIZ(pwd, "pwd");
        if (!((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            C68972R5c.LJIIJJI(z, platform, enterFrom, enterMethod, loginPanelType, i, interfaceC68974R5e, null);
            return;
        }
        this.LJLIL.getLifecycle().addObserver(this);
        ((T0K) this.LJLJI.getValue()).LIZ(pwd);
        T0J<EnumC71789SFl> t0j = ((T0K) this.LJLJI.getValue()).LIZIZ;
        t0j.getClass();
        new C73426Srm(t0j).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new RB2(this, z, platform, enterFrom, enterMethod, loginPanelType, i, interfaceC68974R5e));
    }
}
