package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.I5o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46052I5o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C46051I5n LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C46052I5o(C46051I5n c46051I5n, int i, int i2) {
        this.LJLIL = c46051I5n;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        float f;
        o.LJIIIZ(animation, "animation");
        C46051I5n c46051I5n = this.LJLIL;
        C46048I5k c46048I5k = c46051I5n.LJII;
        if (c46048I5k != null) {
            RecyclerView recyclerView = c46051I5n.LJIIIIZZ;
            if (recyclerView != null) {
                int LJZI = c46048I5k.LJZI(this.LJLILLLLZI, recyclerView);
                C46051I5n c46051I5n2 = this.LJLIL;
                C46048I5k c46048I5k2 = c46051I5n2.LJII;
                if (c46048I5k2 != null) {
                    RecyclerView recyclerView2 = c46051I5n2.LJIIIIZZ;
                    if (recyclerView2 != null) {
                        int LJZI2 = c46048I5k2.LJZI(this.LJLJI, recyclerView2);
                        if (LJZI == -1 && LJZI2 == -1) {
                            View view = this.LJLIL.LJIIIZ;
                            if (view != null) {
                                view.setTranslationX(0.0f);
                                View view2 = this.LJLIL.LJIIIZ;
                                if (view2 != null) {
                                    view2.setVisibility(4);
                                    return;
                                } else {
                                    o.LJIJI("animTabDot");
                                    throw null;
                                }
                            }
                            o.LJIJI("animTabDot");
                            throw null;
                        }
                        if (LJZI >= 0 && LJZI2 >= 0) {
                            View view3 = this.LJLIL.LJIIIZ;
                            if (view3 != null) {
                                view3.setVisibility(0);
                                Object animatedValue = animation.getAnimatedValue();
                                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                float floatValue = (((Float) animatedValue).floatValue() * (LJZI2 - LJZI)) + LJZI;
                                View view4 = this.LJLIL.LJIIIZ;
                                if (view4 != null) {
                                    view4.setX(floatValue - (view4.getMeasuredWidth() / 2));
                                    return;
                                } else {
                                    o.LJIJI("animTabDot");
                                    throw null;
                                }
                            }
                            o.LJIJI("animTabDot");
                            throw null;
                        }
                        View view5 = this.LJLIL.LJIIIZ;
                        if (view5 != null) {
                            view5.setVisibility(0);
                            View view6 = this.LJLIL.LJIIIZ;
                            if (view6 != null) {
                                if (LJZI2 == -1) {
                                    f = LJZI;
                                } else {
                                    f = LJZI2;
                                }
                                view6.setX(f - (view6.getMeasuredWidth() / 2));
                                return;
                            }
                            o.LJIJI("animTabDot");
                            throw null;
                        }
                        o.LJIJI("animTabDot");
                        throw null;
                    }
                    o.LJIJI("videoRecyclerView");
                    throw null;
                }
                o.LJIJI("videoSegAdapter");
                throw null;
            }
            o.LJIJI("videoRecyclerView");
            throw null;
        }
        o.LJIJI("videoSegAdapter");
        throw null;
    }
}
