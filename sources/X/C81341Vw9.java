package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.Vw9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81341Vw9 extends Animation {
    public final /* synthetic */ C81334Vw2 LJLIL;

    public C81341Vw9(C81334Vw2 c81334Vw2) {
        this.LJLIL = c81334Vw2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C81334Vw2 c81334Vw2 = this.LJLIL;
        float f2 = c81334Vw2.LLFF;
        c81334Vw2.setAnimationProgress(((-f2) * f) + f2);
        this.LJLIL.LIZLLL(f);
    }
}
