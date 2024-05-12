package X;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.aeg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94294aeg extends C93719aVP {
    public final /* synthetic */ C94855anj LJLIL;

    public C94294aeg(C94855anj c94855anj) {
        this.LJLIL = c94855anj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RecyclerView recyclerView = this.LJLIL.LJZL().get();
        if (recyclerView != null) {
            recyclerView.setBackground(null);
        }
    }
}
