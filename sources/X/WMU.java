package X;

import Y.ARunnableS26S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public abstract class WMU {
    public ViewGroup LIZ;
    public ARunnableS26S0200000_7 LIZIZ;

    public abstract void LIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw);

    public abstract void LIZIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw);

    public abstract void LIZJ(Class cls, Class cls2);

    public static void LIZLLL(View view, C43356Gzw c43356Gzw, Runnable runnable) {
        if (view == view.getRootView()) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC82154WMc(atomicBoolean, viewTreeObserver, view));
            WMZ wmz = new WMZ(viewTreeObserver, view, atomicBoolean, runnable);
            c43356Gzw.LIZIZ(new WMY(viewTreeObserver, wmz, view, atomicBoolean, runnable));
            viewTreeObserver.addOnGlobalLayoutListener(wmz);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }
}
