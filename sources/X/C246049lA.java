package X;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* renamed from: X.9lA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246049lA implements LifecycleOwner {
    public static final C62822Ol8 LJLIL;
    public static final C246049lA LJLILLLLZI;

    public final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) LJLIL.getValue();
    }

    static {
        C246049lA c246049lA = new C246049lA();
        LJLILLLLZI = c246049lA;
        LJLIL = C221108m2.LIZIZ(C246069lC.LJLIL);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            c246049lA.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: X.9lB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C246049lA.LJLILLLLZI.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }
}
