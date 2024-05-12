package com.ss.android.ugc.aweme.sticker.guide;

import X.C81600W0u;
import X.C81603W0x;
import X.InterfaceC81592W0m;
import X.InterfaceC81593W0n;
import X.InterfaceC81604W0y;
import X.TIP;
import X.W0V;
import X.W10;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TikTokDefaultStickerGuidePresenter implements GenericLifecycleObserver, InterfaceC81604W0y {
    public final FrameLayout LJLIL;
    public InterfaceC81592W0m LJLILLLLZI;
    public final InterfaceC81593W0n LJLJI;
    public final InterfaceC81593W0n LJLJJI;
    public Effect LJLJJL;

    @Override // X.InterfaceC81604W0y
    public final void fo() {
        this.LJLJJL = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            hideNotice();
        }
    }

    @Override // X.InterfaceC81604W0y
    public final void hide() {
        InterfaceC81592W0m interfaceC81592W0m = this.LJLILLLLZI;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // X.InterfaceC81604W0y
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hideNotice() {
        InterfaceC81592W0m interfaceC81592W0m = this.LJLILLLLZI;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // X.InterfaceC81604W0y
    public final void G8(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC81604W0y
    public final void i1(Effect effect) {
        InterfaceC81592W0m interfaceC81592W0m;
        InterfaceC81592W0m interfaceC81592W0m2;
        if (effect != null && o.LJ(effect, this.LJLJJL) && (interfaceC81592W0m2 = this.LJLILLLLZI) != null && true == interfaceC81592W0m2.isShowing()) {
            return;
        }
        InterfaceC81592W0m interfaceC81592W0m3 = this.LJLILLLLZI;
        if (interfaceC81592W0m3 != null) {
            interfaceC81592W0m3.LJJLIIIJL(false);
        }
        if (effect == null || (!TIP.LIZ(effect) && o.LJ(effect, this.LJLJJL))) {
            this.LJLJJL = effect;
            return;
        }
        this.LJLJJL = effect;
        InterfaceC81593W0n interfaceC81593W0n = this.LJLJI;
        if (interfaceC81593W0n != null) {
            interfaceC81592W0m = interfaceC81593W0n.LIZIZ(effect);
        } else {
            interfaceC81592W0m = null;
        }
        this.LJLILLLLZI = interfaceC81592W0m;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LIZ(this.LJLIL);
        }
    }

    public TikTokDefaultStickerGuidePresenter(W0V w0v, C81600W0u c81600W0u, FrameLayout frameLayout) {
        o.LJIIIZ(frameLayout, "frameLayout");
        this.LJLIL = frameLayout;
        this.LJLJI = w0v;
        this.LJLJJI = c81600W0u;
    }

    @Override // X.InterfaceC81604W0y
    public final void to(Effect effect, W10 w10, C81603W0x c81603W0x) {
        InterfaceC81592W0m interfaceC81592W0m;
        this.LJLJJL = effect;
        InterfaceC81593W0n interfaceC81593W0n = this.LJLJJI;
        if (interfaceC81593W0n != null) {
            interfaceC81592W0m = interfaceC81593W0n.LIZ(effect, w10, c81603W0x);
        } else {
            interfaceC81592W0m = null;
        }
        this.LJLILLLLZI = interfaceC81592W0m;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LIZ(this.LJLIL);
        }
    }
}
