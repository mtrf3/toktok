package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.Vw8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81340Vw8 extends Animation {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C81335Vw3 LJLJI;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C81360VwS c81360VwS = this.LJLJI.LLIFFJFJJ;
        c81360VwS.LJLILLLLZI.LJIJJ = (int) (((this.LJLILLLLZI - r2) * f) + this.LJLIL);
    }

    public C81340Vw8(C81335Vw3 c81335Vw3, int i, int i2) {
        this.LJLJI = c81335Vw3;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
