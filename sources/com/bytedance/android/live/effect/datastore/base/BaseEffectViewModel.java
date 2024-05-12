package com.bytedance.android.live.effect.datastore.base;

import X.AbstractC14150h1;
import X.C0WN;
import X.C2EI;
import X.C76800UCe;
import X.C78934UyQ;
import X.C79853Bl;
import X.InterfaceC14130gz;
import X.InterfaceC88472Yns;
import X.XK4;
import X.XKX;
import X.XLL;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BaseEffectViewModel<T> extends ViewModel {
    public final AbstractC14150h1<T> LJLIL;
    public final XK4 LJLILLLLZI;
    public final XLL LJLJI;

    public final boolean iv0(T liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
        return this.LJLIL.LIZIZ(liveEffect);
    }

    public BaseEffectViewModel(InterfaceC14130gz repository, AbstractC14150h1 resourceRepository) {
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(resourceRepository, "resourceRepository");
        this.LJLIL = resourceRepository;
        this.LJLILLLLZI = C78934UyQ.LIZJ(Integer.MAX_VALUE, null, 6);
        this.LJLJI = C79853Bl.LIZ(0, 10, null, 4);
    }

    public final void gv0(T liveEffect, C0WN listener) {
        o.LJIIIZ(liveEffect, "liveEffect");
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ(liveEffect, new IDqS172S0200000((Object) liveEffect, listener, (C0WN) 9));
    }

    public final void hv0(T liveEffect, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(liveEffect, "liveEffect");
        this.LJLIL.LIZ(liveEffect, new IDqS28S0300000((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) this, (BaseEffectViewModel<int>) liveEffect, 6));
    }

    public final void jv0(int i, Object effect) {
        o.LJIIIZ(effect, "effect");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2EI(i, this, effect, null), 3);
    }
}
