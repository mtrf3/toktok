package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.C09G;
import X.C265112h;
import X.C29306Beo;
import X.C73411SrX;
import X.C75559Tl5;
import X.InterfaceC74605TPt;
import X.InterfaceC92693kP;
import X.TMC;
import Y.AfS65S0100000_13;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedGuestABSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AudioOccupiedMonitor implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final DataChannel LJLIL;
    public final InterfaceC74605TPt LJLILLLLZI;
    public C73411SrX LJLJI;
    public C73411SrX LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

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

    public final void LIZIZ() {
        if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied()) {
            InterfaceC92693kP LJJJLIIL = C265112h.LIZ(TMC.LJIL(0L, 60L, TimeUnit.SECONDS)).LJJJLIIL(new AfS65S0100000_13(this, 59), new AfS65S0100000_13(this, 60));
            C73411SrX c73411SrX = this.LJLJJI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            this.LJLJJI = (C73411SrX) LJJJLIIL;
        }
    }

    public final void LIZ(boolean z) {
        this.LJLJJL = z;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder == null) {
            return;
        }
        multiGuestDataHolder.LJIL = !z;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZ(this, owner);
        if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied()) {
            InterfaceC92693kP LJJJLIIL = C265112h.LIZ(TMC.LJIL(0L, 5L, TimeUnit.SECONDS)).LJJJLIIL(new AfS65S0100000_13(this, 96), new AfS65S0100000_13(this, 97));
            C73411SrX c73411SrX = this.LJLJI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            this.LJLJI = (C73411SrX) LJJJLIIL;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJI = null;
        C73411SrX c73411SrX2 = this.LJLJJI;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        this.LJLJJI = null;
        LIZ(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZJ(this, owner);
        this.LJLJJLL = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Boolean bool;
        o.LJIIIZ(owner, "owner");
        C09G.LIZLLL(this, owner);
        this.LJLJJLL = false;
        InterfaceC74605TPt interfaceC74605TPt = this.LJLILLLLZI;
        if (interfaceC74605TPt != null) {
            bool = interfaceC74605TPt.LJ();
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LIZIZ();
        }
    }

    public AudioOccupiedMonitor(DataChannel dataChannel, InterfaceC74605TPt interfaceC74605TPt) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = interfaceC74605TPt;
    }
}
