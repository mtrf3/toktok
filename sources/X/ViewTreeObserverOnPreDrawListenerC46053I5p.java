package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.I5p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC46053I5p implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C46051I5n LJLIL;

    public ViewTreeObserverOnPreDrawListenerC46053I5p(C46051I5n c46051I5n) {
        this.LJLIL = c46051I5n;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ValueAnimator valueAnimator = this.LJLIL.LJI;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            C46051I5n c46051I5n = this.LJLIL;
            C46048I5k c46048I5k = c46051I5n.LJII;
            if (c46048I5k != null) {
                RecyclerView recyclerView = c46051I5n.LJIIIIZZ;
                if (recyclerView != null) {
                    int LJZI = c46048I5k.LJZI(c46048I5k.LJLILLLLZI, recyclerView);
                    if (LJZI == -1) {
                        View view = this.LJLIL.LJIIIZ;
                        if (view != null) {
                            view.setVisibility(4);
                        } else {
                            o.LJIJI("animTabDot");
                            throw null;
                        }
                    } else {
                        C46051I5n c46051I5n2 = this.LJLIL;
                        if (c46051I5n2.LJFF != 2) {
                            View view2 = c46051I5n2.LJIIIZ;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                View view3 = this.LJLIL.LJIIIZ;
                                if (view3 != null) {
                                    view3.setX(LJZI - (view3.getMeasuredWidth() / 2));
                                } else {
                                    o.LJIJI("animTabDot");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("animTabDot");
                                throw null;
                            }
                        }
                    }
                } else {
                    o.LJIJI("videoRecyclerView");
                    throw null;
                }
            } else {
                o.LJIJI("videoSegAdapter");
                throw null;
            }
        }
        return true;
    }
}
