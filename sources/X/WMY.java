package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class WMY implements InterfaceC43357Gzx {
    public final /* synthetic */ ViewTreeObserver LIZ;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener LIZIZ;
    public final /* synthetic */ View LIZJ;
    public final /* synthetic */ AtomicBoolean LIZLLL;
    public final /* synthetic */ Runnable LJ;

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        if (this.LIZ.isAlive()) {
            this.LIZ.removeGlobalOnLayoutListener(this.LIZIZ);
        } else {
            this.LIZJ.getViewTreeObserver().removeGlobalOnLayoutListener(this.LIZIZ);
        }
        this.LIZLLL.set(false);
        this.LJ.run();
    }

    public WMY(ViewTreeObserver viewTreeObserver, WMZ wmz, View view, AtomicBoolean atomicBoolean, Runnable runnable) {
        this.LIZ = viewTreeObserver;
        this.LIZIZ = wmz;
        this.LIZJ = view;
        this.LIZLLL = atomicBoolean;
        this.LJ = runnable;
    }
}
