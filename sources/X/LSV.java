package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes10.dex */
public final class LSV implements LifecycleOwner {
    public final /* synthetic */ LPI LJLIL;

    public LSV(LPI lpi) {
        this.LJLIL = lpi;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.LJLIL;
    }
}