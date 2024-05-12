package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.Vw4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81336Vw4 extends Animation {
    public final /* synthetic */ C81334Vw2 LJLIL;

    public C81336Vw4(C81334Vw2 c81334Vw2) {
        this.LJLIL = c81334Vw2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        C81334Vw2 c81334Vw2 = this.LJLIL;
        if (!c81334Vw2.LLIIIZ) {
            i = c81334Vw2.LLFII - Math.abs(c81334Vw2.LLFFF);
        } else {
            i = c81334Vw2.LLFII;
        }
        C81334Vw2 c81334Vw22 = this.LJLIL;
        this.LJLIL.LJI((c81334Vw22.LLF + ((int) ((i - r1) * f))) - c81334Vw22.LL.getTop());
        float f2 = 1.0f - f;
        C81361VwT c81361VwT = this.LJLIL.LLFZ.LJLILLLLZI;
        if (f2 != c81361VwT.LJIILLIIL) {
            c81361VwT.LJIILLIIL = f2;
            c81361VwT.LIZ();
        }
    }
}
