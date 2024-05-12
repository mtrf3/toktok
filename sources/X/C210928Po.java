package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.8Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210928Po {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C8Q4.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C211008Pw.LJLIL);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public LifecycleOwner LIZLLL;

    public final CopyOnWriteArrayList<RunnableC210938Pp> LIZ() {
        return (CopyOnWriteArrayList) this.LIZIZ.getValue();
    }

    public final AbstractC48820JEa LIZIZ() {
        return (AbstractC48820JEa) this.LIZ.getValue();
    }

    public final boolean LIZJ() {
        LifecycleOwner lifecycleOwner = this.LIZLLL;
        if (lifecycleOwner != null) {
            if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                return true;
            }
            return false;
        }
        o.LJIJI("lifecycleOwner");
        throw null;
    }
}
