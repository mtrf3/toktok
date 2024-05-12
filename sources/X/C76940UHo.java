package X;

import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* renamed from: X.UHo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76940UHo implements LifecycleOwner {
    public LifecycleRegistry LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());

    public final synchronized void LIZ() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LifecycleRegistry lifecycleRegistry = this.LJLIL;
            if (lifecycleRegistry != null) {
                lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
            }
        } else {
            this.LJLILLLLZI.post(new ARunnableS49S0100000_13(this, 96));
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final synchronized Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry;
        if (this.LJLIL == null) {
            this.LJLIL = new LifecycleRegistry(this);
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                LifecycleRegistry lifecycleRegistry2 = this.LJLIL;
                if (lifecycleRegistry2 != null) {
                    lifecycleRegistry2.setCurrentState(Lifecycle.State.STARTED);
                }
            } else {
                this.LJLILLLLZI.post(new ARunnableS49S0100000_13(this, 97));
            }
        }
        lifecycleRegistry = this.LJLIL;
        o.LJI(lifecycleRegistry);
        return lifecycleRegistry;
    }
}
