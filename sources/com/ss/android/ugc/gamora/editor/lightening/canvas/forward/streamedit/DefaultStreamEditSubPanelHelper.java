package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit;

import X.AbstractC42221Ghd;
import X.C221108m2;
import X.C269113v;
import X.C42210GhS;
import X.C42218Gha;
import X.C5H3;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73674Svm;
import X.C73969T1h;
import X.C82622Wbi;
import X.InterfaceC135635Tz;
import X.InterfaceC42219Ghb;
import X.InterfaceC42220Ghc;
import Y.AfS26S0110000_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DefaultStreamEditSubPanelHelper implements GenericLifecycleObserver, InterfaceC135635Tz {
    public final LifecycleOwner LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC42220Ghc LJLJJI;
    public boolean LJLJJL;
    public final C5H3 LJLJJLL;
    public final C73318Sq2 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        this.LJLJL.dispose();
    }

    public final void LIZIZ() {
        C42210GhS c42210GhS = (C42210GhS) this.LJLJJLL.getValue();
        if (c42210GhS != null) {
            c42210GhS.Wo((AbstractC42221Ghd) this.LJLJLLL.getValue());
        }
    }

    public final void LIZJ() {
        C42210GhS c42210GhS = (C42210GhS) this.LJLJJLL.getValue();
        if (c42210GhS != null) {
            c42210GhS.NH((AbstractC42221Ghd) this.LJLJLLL.getValue());
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public final void LIZ(InterfaceC42219Ghb interfaceC42219Ghb) {
        C42210GhS c42210GhS = (C42210GhS) this.LJLJJLL.getValue();
        if (c42210GhS != null) {
            if (!this.LJLJJL) {
                this.LJLJJL = true;
                this.LJLIL.getLifecycle().addObserver(this);
            }
            this.LJLJL.LIZ(c42210GhS.A30().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS26S0110000_7(interfaceC42219Ghb, 0), C73674Svm.LIZLLL));
            return;
        }
        interfaceC42219Ghb.LIZJ();
    }

    public DefaultStreamEditSubPanelHelper(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, String streamEditScene, InterfaceC42220Ghc interfaceC42220Ghc) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(streamEditScene, "streamEditScene");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = streamEditScene;
        this.LJLJJI = interfaceC42220Ghc;
        this.LJLJJLL = C269113v.LIZIZ(this, C42210GhS.class);
        this.LJLJL = new C73318Sq2();
        this.LJLJLJ = C221108m2.LIZIZ(C42218Gha.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 341));
    }
}
