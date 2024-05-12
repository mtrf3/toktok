package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160126Qe extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C160106Qc LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!this.LJLIL) {
            this.LJLILLLLZI.setVisibility(8);
        }
        if (this.LJLIL) {
            int top = this.LJLJI.getTop();
            int left = this.LJLJI.getLeft();
            int width = this.LJLJI.getWidth();
            int height = this.LJLJI.getHeight();
            C1NS<C6QX> c1ns = this.LJLJI.LJLIL;
            if (c1ns != null) {
                c1ns.LJ(new C160136Qf(left, top, width, height));
            } else {
                o.LJIJI("stateContainer");
                throw null;
            }
        }
        super.onAnimationEnd(animation);
    }

    public C160126Qe(View view, C160106Qc c160106Qc, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = c160106Qc;
    }
}
