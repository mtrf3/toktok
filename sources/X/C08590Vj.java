package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.pitaya.api.bean.PTYError;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08590Vj<A, B> {
    public final LiveState<OSZ<A, B>> LIZ;
    public final LiveState<A> LIZIZ;
    public final LiveState<B> LIZJ;

    public C08590Vj(LiveState<A> first, LiveState<B> liveState) {
        o.LJIIIZ(first, "first");
        this.LIZIZ = first;
        this.LIZJ = liveState;
        C1OY c1oy = new C1OY();
        this.LIZ = new LiveState<>(new IDqS420S0100000(this, 93));
        Lifecycle.Event event = Lifecycle.Event.ON_CREATE;
        o.LJIIIZ(event, "event");
        c1oy.LJLIL.handleLifecycleEvent(event);
        Lifecycle.State state = Lifecycle.State.CREATED;
        first.LJIIIIZZ(c1oy, state, new IDqS416S0100000(this, 175));
        liveState.LJIIIIZZ(c1oy, state, new IDqS416S0100000(this, 176));
    }

    public static void LIZ(C08590Vj c08590Vj, LifecycleOwner lifecycleOwner, InterfaceC88471Ynr interfaceC88471Ynr) {
        Lifecycle.State targetState = Lifecycle.State.STARTED;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(targetState, "targetState");
        c08590Vj.LIZ.LJIIIIZZ(lifecycleOwner, targetState, new IDqS416S0100000(interfaceC88471Ynr, (InterfaceC88471Ynr<? super Integer, ? super PTYError, C76800UCe>) 177));
    }
}
