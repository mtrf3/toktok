package X;

import Y.ARunnableS28S0200000_9;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* renamed from: X.Mdg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57264Mdg extends LifecycleRegistry {
    public final Handler LJLIL;

    @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        Lifecycle.State currentState = super.getCurrentState();
        o.LJIIIIZZ(currentState, "super.getCurrentState()");
        return currentState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57264Mdg(LifecycleOwner provider) {
        super(provider);
        o.LJIIIZ(provider, "provider");
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
    }

    public final void LIZJ(Runnable runnable) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            runnable.run();
        } else {
            this.LJLIL.post(runnable);
            PEH.LIZLLL(new IllegalAccessError("should be in main thread"), "should call in main thread");
        }
    }

    @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        LIZJ(new ARunnableS28S0200000_9(observer, this, 18));
    }

    @Override // androidx.lifecycle.LifecycleRegistry, androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        LIZJ(new ARunnableS28S0200000_9(observer, this, 19));
    }

    public static final /* synthetic */ void LIZ(C57264Mdg c57264Mdg, LifecycleObserver lifecycleObserver) {
        super.addObserver(lifecycleObserver);
    }

    public static final /* synthetic */ void LIZIZ(C57264Mdg c57264Mdg, LifecycleObserver lifecycleObserver) {
        super.removeObserver(lifecycleObserver);
    }
}
