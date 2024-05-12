package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aVk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC93740aVk implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ C93738aVi LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ View LJLJJI;

    public ViewTreeObserverOnGlobalFocusChangeListenerC93740aVk(C93738aVi c93738aVi, C34K c34k, View view, RecyclerView recyclerView) {
        this.LJLIL = c93738aVi;
        this.LJLILLLLZI = c34k;
        this.LJLJI = view;
        this.LJLJJI = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (this.LJLJI.hasFocus() && !this.LJLILLLLZI.element) {
            C93738aVi c93738aVi = this.LJLIL;
            C93735aVf c93735aVf = c93738aVi.LIZLLL;
            View visibleTarget = this.LJLJI;
            View scrollTarget = this.LJLJJI;
            o.LJIIIZ(visibleTarget, "visibleTarget");
            o.LJIIIZ(scrollTarget, "scrollTarget");
            if (c93735aVf != null) {
                if (Math.abs(c93735aVf.LIZLLL) < 0.01f) {
                    c93735aVf.LIZ();
                } else {
                    c93735aVf.LIZIZ = true;
                }
            }
            c93738aVi.LIZLLL = new C93735aVf(visibleTarget, scrollTarget, c93738aVi);
            this.LJLILLLLZI.element = true;
            return;
        }
        if (this.LJLJI.hasFocus() || !this.LJLILLLLZI.element) {
            return;
        }
        C93735aVf c93735aVf2 = this.LJLIL.LIZLLL;
        if (c93735aVf2 != null) {
            if (Math.abs(c93735aVf2.LIZLLL) < 0.01f) {
                c93735aVf2.LIZ();
            } else {
                c93735aVf2.LIZIZ = true;
            }
        }
        this.LJLILLLLZI.element = false;
    }
}
