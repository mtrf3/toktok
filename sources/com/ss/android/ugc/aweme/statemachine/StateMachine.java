package com.ss.android.ugc.aweme.statemachine;

import X.C76800UCe;
import X.InterfaceC65350Pko;
import X.InterfaceC78686UuQ;
import X.InterfaceC86711Y1j;
import X.InterfaceC88471Ynr;
import X.Y23;
import X.Y3D;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class StateMachine<T extends InterfaceC86711Y1j, S extends Y3D<T>, E extends InterfaceC78686UuQ> extends FeedBaseViewModel<S> {
    public final Map<InterfaceC65350Pko<? extends T>, Set<Y23<T, E>>> LJLJLLL = new LinkedHashMap();
    public InterfaceC88471Ynr<? super T, ? super E, C76800UCe> LJLL;

    public abstract void kv0(T t, InterfaceC65350Pko<? extends T> interfaceC65350Pko, E e);

    public final void onEvent(E event) {
        o.LJIIIZ(event, "event");
        withState(new AqS146S0200000_15(this, (StateMachine<T, S, int>) event, 25));
    }
}
