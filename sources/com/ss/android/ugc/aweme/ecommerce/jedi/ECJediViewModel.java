package com.ss.android.ugc.aweme.ecommerce.jedi;

import X.InterfaceC61312at;
import X.InterfaceC88472Yns;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class ECJediViewModel<S extends InterfaceC61312at> extends JediViewModel<S> {
    public final void Hv0(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIIZ(reducer, "reducer");
        setState(reducer);
    }
}
