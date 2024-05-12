package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: X.aW7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93763aW7 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Bitmap LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ViewGroupOverlay overlay = this.LJLIL.getOverlay();
        if (overlay != null) {
            overlay.remove(this.LJLILLLLZI);
        }
        this.LJLJI.recycle();
    }

    public C93763aW7(ViewGroup viewGroup, View view, Bitmap bitmap) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = view;
        this.LJLJI = bitmap;
    }
}
