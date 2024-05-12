package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.VwG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81348VwG extends Animation {
    public final /* synthetic */ C81335Vw3 LJLIL;

    public C81348VwG(C81335Vw3 c81335Vw3) {
        this.LJLIL = c81335Vw3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LJLIL.setAnimationProgress(1.0f - f);
    }
}
