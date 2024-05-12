package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.16R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16R extends Animation {
    public final /* synthetic */ SwipeRefreshLayout LJLIL;

    public C16R(SwipeRefreshLayout swipeRefreshLayout) {
        this.LJLIL = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LJLIL.setAnimationProgress(1.0f - f);
    }
}
