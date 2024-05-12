package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Sbe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72426Sbe extends Lifecycle {
    public final LifecycleRegistry LJLIL;
    public final List<LifecycleObserver> LJLILLLLZI = new ArrayList();

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.LJLIL.getCurrentState();
    }

    public C72426Sbe(LifecycleRegistry lifecycleRegistry) {
        this.LJLIL = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
        ((ArrayList) this.LJLILLLLZI).add(lifecycleObserver);
        this.LJLIL.addObserver(lifecycleObserver);
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        this.LJLIL.handleLifecycleEvent(event);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
        ((ArrayList) this.LJLILLLLZI).remove(lifecycleObserver);
        this.LJLIL.removeObserver(lifecycleObserver);
    }
}
