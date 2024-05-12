package com.ss.android.ugc.aweme.live;

import X.AbstractC30473Bxd;
import X.ActivityC45651qj;
import X.C09G;
import X.C0NB;
import X.C1MZ;
import X.C2E1;
import X.C30721C3x;
import X.C32537Cpp;
import X.C32831Qp;
import X.C3Z;
import X.C47061t0;
import X.C76800UCe;
import X.C78857UxB;
import X.C86150XrW;
import X.C86151XrX;
import X.C86152XrY;
import X.CKO;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC12600eW;
import X.InterfaceC12610eX;
import X.InterfaceC12680ee;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class GoLiveManager implements GenericLifecycleObserver, InterfaceC12600eW, DefaultLifecycleObserver, InterfaceC12680ee {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final ActivityC45651qj LJLIL;
    public final C32831Qp LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<Bundle, C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<Float, C76800UCe> LJLJJLL;
    public CKO LJLJL;
    public InterfaceC12610eX LJLJLJ;
    public C30721C3x LJLJLLL;
    public C1MZ LJLL;
    public boolean LJLLI;

    @Override // X.InterfaceC12680ee
    public final void LJJIZ() {
        this.LJLILLLLZI.LJJIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJJJJL() {
        return this.LJLILLLLZI.LJLJJI;
    }

    @Override // X.InterfaceC12680ee
    public final SurfaceView LJJZZIII() {
        return this.LJLILLLLZI.LJLJI;
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJLIL() {
        return this.LJLILLLLZI.LJLILLLLZI;
    }

    @Override // X.InterfaceC12680ee
    public final ViewGroup LJLJJL() {
        return this.LJLILLLLZI.LJLIL;
    }

    @Override // X.InterfaceC12600eW
    public final InterfaceC12610eX LIZ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC12600eW
    public final boolean LIZIZ(ActivityC45651qj fragmentActivity) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        return o.LJ(fragmentActivity, this.LJLIL);
    }

    public final void LIZJ(boolean z) {
        if (z) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C2E1.class)).LIZ = null;
        }
        if (this.LJLLI) {
            return;
        }
        InterfaceC12610eX interfaceC12610eX = this.LJLJLJ;
        if (interfaceC12610eX != null) {
            ((AbstractC30473Bxd) interfaceC12610eX).LJ(C78857UxB.LJJIIJ(1476788484, "bpea-go_live_destroy_video"));
        }
        this.LJLJLJ = null;
        CKO cko = this.LJLJL;
        if (cko != null) {
            cko.LJIJJLI(C78857UxB.LJJIIJ(1476788484, "bpea-go_live_manager_release"));
        }
        this.LJLJL = null;
        C30721C3x c30721C3x = this.LJLJLLL;
        if (c30721C3x != null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(c30721C3x);
            c30721C3x.LJIIJJI = null;
            c30721C3x.LJIIL = null;
        }
        this.LJLJLLL = null;
        InterfaceC06390Mx LIZ = CN1.LIZ(IBroadcastService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((IBroadcastService) LIZ).getLiveCoreInitUtil();
        C3Z.LIZLLL();
        this.LJLLI = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        C0NB.LIZIZ("GoLiveManager", "on destroy");
        LIZJ(true);
    }

    public GoLiveManager(GoLiveActivity sharedGoLiveFragmentActivity, C32831Qp c32831Qp, C86151XrX c86151XrX, C86152XrY c86152XrY, C86150XrW c86150XrW, AqS181S0100000_15 aqS181S0100000_15) {
        o.LJIIIZ(sharedGoLiveFragmentActivity, "sharedGoLiveFragmentActivity");
        this.LJLIL = sharedGoLiveFragmentActivity;
        this.LJLILLLLZI = c32831Qp;
        this.LJLJI = c86151XrX;
        this.LJLJJI = c86152XrY;
        this.LJLJJL = c86150XrW;
        this.LJLJJLL = aqS181S0100000_15;
    }
}
