package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.Vw7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81339Vw7 extends Animation {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C81334Vw2 LJLJI;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C81359VwR c81359VwR = this.LJLJI.LLFZ;
        c81359VwR.LJLILLLLZI.LJIJJ = (int) (((this.LJLILLLLZI - r2) * f) + this.LJLIL);
    }

    public C81339Vw7(C81334Vw2 c81334Vw2, int i, int i2) {
        this.LJLJI = c81334Vw2;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
