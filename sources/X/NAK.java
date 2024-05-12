package X;

import X.C188817b3;
import X.NAK;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NAK implements NAT {
    public LifecycleOwner LIZIZ;
    public ViewModelStoreOwner LIZJ;
    public final NAJ LIZ = new NAJ();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    @Override // X.NAT
    public final NAJ LIZIZ() {
        return this.LIZ;
    }

    public final void LJI(Fragment fragment, AqS141S0200000_10 aqS141S0200000_10) {
        new C5WJ(fragment);
        if (this.LIZLLL.getAndSet(true)) {
            return;
        }
        this.LIZIZ = fragment;
        this.LIZJ = fragment;
        aqS141S0200000_10.invoke(LIZIZ());
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commercialize.subpagemodule.SubPageModule$initialize$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                switch (C188817b3.LIZ[event.ordinal()]) {
                    case 1:
                        NAK.this.LJII();
                        return;
                    case 2:
                        NAK.this.getClass();
                        return;
                    case 3:
                        NAK.this.getClass();
                        return;
                    case 4:
                        NAK.this.LJIIIZ();
                        return;
                    case 5:
                        NAK.this.getClass();
                        return;
                    case 6:
                        NAK.this.LJIIIIZZ();
                        return;
                    default:
                        return;
                }
            }
        });
    }
}
