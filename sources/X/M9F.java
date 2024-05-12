package X;

import X.C34B;
import X.M9F;
import X.X1D;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M9F implements LifecycleOwner {
    public final LifecycleOwner LJLIL;
    public boolean LJLILLLLZI = false;
    public final LifecycleRegistry LJLJI = new LifecycleRegistry(this);

    public final void LIZ() {
        if (this.LJLJI.getCurrentState() == Lifecycle.State.INITIALIZED) {
            if (this.LJLILLLLZI) {
                Lifecycle.State currentState = this.LJLIL.getLifecycle().getCurrentState();
                o.LJIIIIZZ(currentState, "originalLifecycleOwner.lifecycle.currentState");
                if (currentState == Lifecycle.State.DESTROYED) {
                    return;
                }
            } else {
                return;
            }
        }
        if (!this.LJLILLLLZI) {
            this.LJLJI.setCurrentState(Lifecycle.State.DESTROYED);
            return;
        }
        LifecycleRegistry lifecycleRegistry = this.LJLJI;
        Lifecycle.State currentState2 = this.LJLIL.getLifecycle().getCurrentState();
        o.LJIIIIZZ(currentState2, "originalLifecycleOwner.lifecycle.currentState");
        lifecycleRegistry.setCurrentState(currentState2);
    }

    public final void LIZIZ() {
        C34B.LIZIZ("ActivityStatusProfileLifecycleOwner", "turnPageInvisible");
        this.LJLILLLLZI = false;
        LIZ();
    }

    public final void LIZJ() {
        C34B.LIZIZ("ActivityStatusProfileLifecycleOwner", "turnPageVisible");
        this.LJLILLLLZI = true;
        LIZ();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJI;
    }

    public M9F(Fragment fragment) {
        this.LJLIL = fragment;
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.service.activitystatus.ActivityStatusProfileLifecycleOwner$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onStateChanged ");
                LIZ.append(event);
                C34B.LIZIZ("ActivityStatusProfileLifecycleOwner", X1D.LIZIZ(LIZ));
                M9F.this.LIZ();
            }
        });
    }
}
