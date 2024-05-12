package X;

import Y.IDComparatorS40S0000000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable;

/* renamed from: X.Szv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73931Szv implements T01 {
    public static final C42193GhB LIZJ = new C42193GhB();
    public final InterfaceC66512Q8m<Lifecycle.Event> LIZ;
    public final LifecycleEventsObservable LIZIZ;

    @Override // X.T01
    public final InterfaceC73445Ss5 LIZ() {
        Lifecycle.Event event;
        InterfaceC73592SuS interfaceC73592SuS;
        final IDComparatorS40S0000000_12 iDComparatorS40S0000000_12;
        LifecycleEventsObservable lifecycleEventsObservable = this.LIZIZ;
        lifecycleEventsObservable.getClass();
        int i = C31798Cdu.LIZ[lifecycleEventsObservable.LJLIL.getCurrentState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    event = Lifecycle.Event.ON_DESTROY;
                } else {
                    event = Lifecycle.Event.ON_RESUME;
                }
            } else {
                event = Lifecycle.Event.ON_START;
            }
        } else {
            event = Lifecycle.Event.ON_CREATE;
        }
        lifecycleEventsObservable.LJLILLLLZI.onNext(event);
        Lifecycle.Event LJJZZIII = this.LIZIZ.LJLILLLLZI.LJJZZIII();
        InterfaceC66512Q8m<Lifecycle.Event> interfaceC66512Q8m = this.LIZ;
        if (LJJZZIII != null) {
            try {
                final Lifecycle.Event apply = interfaceC66512Q8m.apply(LJJZZIII);
                LifecycleEventsObservable lifecycleEventsObservable2 = this.LIZIZ;
                if ((apply instanceof Comparable) && (iDComparatorS40S0000000_12 = T00.LIZ) != null) {
                    interfaceC73592SuS = new InterfaceC73592SuS() { // from class: X.Szy
                        @Override // X.InterfaceC73592SuS
                        public final boolean test(Object obj) {
                            if (iDComparatorS40S0000000_12.compare(obj, apply) >= 0) {
                                return true;
                            }
                            return false;
                        }
                    };
                } else {
                    interfaceC73592SuS = new InterfaceC73592SuS() { // from class: X.Szz
                        @Override // X.InterfaceC73592SuS
                        public final boolean test(Object obj) {
                            return obj.equals(apply);
                        }
                    };
                }
                lifecycleEventsObservable2.getClass();
                return new C73440Ss0(new C73598SuY(new C73421Srh(lifecycleEventsObservable2), interfaceC73592SuS));
            } catch (Exception e) {
                if (!(e instanceof C42194GhC)) {
                    return new C73669Svh(e);
                }
                throw e;
            }
        }
        throw new C42196GhE();
    }

    public C73931Szv(Lifecycle lifecycle, InterfaceC66512Q8m<Lifecycle.Event> interfaceC66512Q8m) {
        this.LIZIZ = new LifecycleEventsObservable(lifecycle);
        this.LIZ = interfaceC66512Q8m;
    }

    public static C73931Szv LIZIZ(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        return new C73931Szv(lifecycleOwner.getLifecycle(), new C73932Szw(event));
    }
}
