package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class VJW implements Runnable {
    public final WeakReference<VJR> LJLIL;
    public final VJO LJLILLLLZI;

    public VJW(VJR executor, VJO task) {
        o.LJIIJ(executor, "executor");
        o.LJIIJ(task, "task");
        this.LJLILLLLZI = task;
        this.LJLIL = new WeakReference<>(executor);
    }
}
