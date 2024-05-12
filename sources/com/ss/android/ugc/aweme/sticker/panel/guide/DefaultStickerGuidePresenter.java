package com.ss.android.ugc.aweme.sticker.panel.guide;

import X.C81603W0x;
import X.InterfaceC81592W0m;
import X.InterfaceC81593W0n;
import X.InterfaceC81604W0y;
import X.TIP;
import X.W0U;
import X.W10;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes15.dex */
public class DefaultStickerGuidePresenter implements InterfaceC81604W0y {
    public final FrameLayout LJLIL;
    public InterfaceC81592W0m LJLILLLLZI;
    public final InterfaceC81593W0n LJLJI;
    public InterfaceC81592W0m LJLJJI;
    public final InterfaceC81593W0n LJLJJL;
    public Effect LJLJJLL;

    @Override // X.InterfaceC81604W0y
    public final void fo() {
        this.LJLJJLL = null;
    }

    @Override // X.InterfaceC81604W0y
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hide() {
        InterfaceC81592W0m interfaceC81592W0m = this.LJLILLLLZI;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // X.InterfaceC81604W0y
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hideNotice() {
        InterfaceC81592W0m interfaceC81592W0m = this.LJLJJI;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // X.InterfaceC81604W0y
    public final void G8(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // X.InterfaceC81604W0y
    public final void i1(Effect effect) {
        InterfaceC81592W0m interfaceC81592W0m;
        if (effect != null && effect.equals(this.LJLJJLL) && (interfaceC81592W0m = this.LJLILLLLZI) != null && interfaceC81592W0m.isShowing()) {
            return;
        }
        InterfaceC81592W0m interfaceC81592W0m2 = this.LJLILLLLZI;
        if (interfaceC81592W0m2 != null) {
            interfaceC81592W0m2.LJJLIIIJL(false);
        }
        if (effect == null || (!TIP.LIZ(effect) && effect.equals(this.LJLJJLL))) {
            this.LJLJJLL = effect;
            return;
        }
        this.LJLJJLL = effect;
        InterfaceC81592W0m LIZIZ = this.LJLJI.LIZIZ(effect);
        this.LJLILLLLZI = LIZIZ;
        LIZIZ.LIZ(this.LJLIL);
    }

    public DefaultStickerGuidePresenter(W0U w0u, InterfaceC81593W0n interfaceC81593W0n, FrameLayout frameLayout) {
        this.LJLIL = frameLayout;
        this.LJLJI = w0u;
        this.LJLJJL = interfaceC81593W0n;
    }

    @Override // X.InterfaceC81604W0y
    public final void to(Effect effect, W10 w10, C81603W0x c81603W0x) {
        InterfaceC81592W0m interfaceC81592W0m = this.LJLJJI;
        if (interfaceC81592W0m != null) {
            interfaceC81592W0m.LJJLIIIJL(false);
        }
        this.LJLJJLL = effect;
        InterfaceC81592W0m LIZ = this.LJLJJL.LIZ(effect, w10, c81603W0x);
        this.LJLJJI = LIZ;
        LIZ.LIZ(this.LJLIL);
    }
}
