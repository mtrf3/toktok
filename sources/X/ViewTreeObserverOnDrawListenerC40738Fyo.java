package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* renamed from: X.Fyo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnDrawListenerC40738Fyo extends W8S implements Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    public Field LJLJI;
    public long LJLJJI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        LJI("onDraw");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        LJI("onGlobalLayout");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LJI("onPreDraw");
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        LJI("onScrollChanged");
    }

    public final void LJI(String str) {
        if (this.LJLILLLLZI != null && System.currentTimeMillis() - this.LJLJJI > 1000) {
            this.LJLILLLLZI.getClass();
            C77119UOl.LJIJI();
            this.LJLJJI = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyCallback form method = ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            C39749Fir.LIZ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        LJI("onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        LJI("onActivityPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        LJI("onActivityResumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LJLJI == null) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(this);
            viewTreeObserver.addOnGlobalFocusChangeListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
            viewTreeObserver.addOnPreDrawListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnTouchModeChangeListener(this);
            decorView.addOnAttachStateChangeListener(this);
            decorView.addOnLayoutChangeListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        LJI("onActivityStopped");
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        LJI("onTouchModeChanged");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LJI("onViewAttachedToWindow");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LJI("onViewDetachedFromWindow");
    }

    public ViewTreeObserverOnDrawListenerC40738Fyo(Application application, C77119UOl c77119UOl) {
        super("PerformTraversalsHook", c77119UOl);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LJI("onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        LJI("onActivitySaveInstanceState");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        LJI("onGlobalFocusChanged");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LJI("onLayoutChange");
    }
}
