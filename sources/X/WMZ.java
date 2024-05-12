package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class WMZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ AtomicBoolean LJLJI;
    public final /* synthetic */ Runnable LJLJJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LJLIL.isAlive()) {
            this.LJLIL.removeGlobalOnLayoutListener(this);
        } else {
            this.LJLILLLLZI.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        this.LJLJI.set(false);
        this.LJLJJI.run();
    }

    public WMZ(ViewTreeObserver viewTreeObserver, View view, AtomicBoolean atomicBoolean, Runnable runnable) {
        this.LJLIL = viewTreeObserver;
        this.LJLILLLLZI = view;
        this.LJLJI = atomicBoolean;
        this.LJLJJI = runnable;
    }
}
