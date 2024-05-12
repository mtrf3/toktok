package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.Vw5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81337Vw5 extends Animation {
    public final /* synthetic */ C81335Vw3 LJLIL;

    public C81337Vw5(C81335Vw3 c81335Vw3) {
        this.LJLIL = c81335Vw3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C81335Vw3 c81335Vw3 = this.LJLIL;
        if (!c81335Vw3.LLII) {
            Math.abs(c81335Vw3.LLFF);
        }
        float f2 = 1.0f - f;
        C81362VwU c81362VwU = this.LJLIL.LLIFFJFJJ.LJLILLLLZI;
        if (f2 != c81362VwU.LJIILLIIL) {
            c81362VwU.LJIILLIIL = f2;
            c81362VwU.LIZ();
        }
    }
}
