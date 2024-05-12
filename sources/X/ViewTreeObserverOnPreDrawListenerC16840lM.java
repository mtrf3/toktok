package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0lM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC16840lM implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View LJLIL;
    public ViewTreeObserver LJLILLLLZI;
    public final Runnable LJLJI;

    public final void LIZIZ() {
        if (this.LJLILLLLZI.isAlive()) {
            this.LJLILLLLZI.removeOnPreDrawListener(this);
        } else {
            this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.LJLIL.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LIZIZ();
        this.LJLJI.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LJLILLLLZI = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZIZ();
    }

    public ViewTreeObserverOnPreDrawListenerC16840lM(View view, Runnable runnable) {
        this.LJLIL = view;
        this.LJLILLLLZI = view.getViewTreeObserver();
        this.LJLJI = runnable;
    }

    public static void LIZ(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserverOnPreDrawListenerC16840lM viewTreeObserverOnPreDrawListenerC16840lM = new ViewTreeObserverOnPreDrawListenerC16840lM(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC16840lM);
                view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC16840lM);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }
}
