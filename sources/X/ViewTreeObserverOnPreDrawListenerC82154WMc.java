package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.WMc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewTreeObserverOnPreDrawListenerC82154WMc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ ViewTreeObserver LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.LJLIL.get()) {
            if (this.LJLILLLLZI.isAlive()) {
                this.LJLILLLLZI.removeOnPreDrawListener(this);
                return true;
            }
            this.LJLJI.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC82154WMc(AtomicBoolean atomicBoolean, ViewTreeObserver viewTreeObserver, View view) {
        this.LJLIL = atomicBoolean;
        this.LJLILLLLZI = viewTreeObserver;
        this.LJLJI = view;
    }
}
