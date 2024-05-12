package X;

import Y.ARunnableS11S0101000_7;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;

/* renamed from: X.HyN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC45807HyN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference<View> LJLIL;
    public final ViewTreeObserver LJLILLLLZI;
    public int LJLJI;
    public final ViewGroup.LayoutParams LJLJJI;
    public final boolean LJLJJL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        View view = this.LJLIL.get();
        if (view == null) {
            if (this.LJLILLLLZI.isAlive()) {
                this.LJLILLLLZI.removeGlobalOnLayoutListener(this);
                return;
            }
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        if (view.getFitsSystemWindows() || (view.getParent() != null && ((View) view.getParent()).getFitsSystemWindows())) {
            i -= C60605NqT.LJI(view.getContext());
        }
        int i2 = 0;
        if (this.LJLJJL && (view.getRootView().getSystemUiVisibility() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (z) {
                i2 = rootWindowInsets.getStableInsetBottom();
            }
            i += i2;
            if (rootWindowInsets != null && rootWindowInsets.getStableInsetTop() != rect.top) {
                int stableInsetTop = rootWindowInsets.getStableInsetTop();
                int i3 = rect.top;
                if (stableInsetTop < i3) {
                    i -= i3 - rootWindowInsets.getStableInsetTop();
                }
            }
        }
        if (i != this.LJLJI) {
            ViewGroup.LayoutParams layoutParams = this.LJLJJI;
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
            view.post(new ARunnableS11S0101000_7(3, view, 13));
            this.LJLJI = i;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC45807HyN(View view, boolean z) {
        if (view != null) {
            this.LJLIL = new WeakReference<>(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.LJLILLLLZI = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(this);
            this.LJLJJI = view.getLayoutParams();
            this.LJLJJL = z;
        }
    }
}
