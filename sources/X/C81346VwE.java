package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.VwE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81346VwE extends Animation {
    public final /* synthetic */ C81334Vw2 LJLIL;

    public C81346VwE(C81334Vw2 c81334Vw2) {
        this.LJLIL = c81334Vw2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LJLIL.setAnimationProgress(1.0f - f);
    }
}
