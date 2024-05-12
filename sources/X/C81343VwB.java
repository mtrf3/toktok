package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.VwB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81343VwB extends Animation {
    public final /* synthetic */ C81335Vw3 LJLIL;

    public C81343VwB(C81335Vw3 c81335Vw3) {
        this.LJLIL = c81335Vw3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C81335Vw3 c81335Vw3 = this.LJLIL;
        c81335Vw3.scrollTo(0, (int) (c81335Vw3.LJLJI * f));
    }
}
