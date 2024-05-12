package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.VuY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81242VuY implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C81238VuU LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ Float LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ Float LJLJL;
    public final /* synthetic */ float LJLJLJ;
    public final /* synthetic */ Float LJLJLLL;

    public C81242VuY(C81238VuU c81238VuU, float f, float f2, float f3, Float f4, float f5, Float f6, float f7, Float f8) {
        this.LJLIL = c81238VuU;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = f5;
        this.LJLJL = f6;
        this.LJLJLJ = f7;
        this.LJLJLLL = f8;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        float f;
        float f2;
        o.LJIIIZ(it, "it");
        this.LJLIL.LJLILLLLZI.LJIIJJI = C81238VuU.LIZ(it, this.LJLILLLLZI, this.LJLJI);
        C81240VuW c81240VuW = this.LJLIL.LJLILLLLZI;
        float f3 = this.LJLJJI;
        Float f4 = this.LJLJJL;
        float f5 = 0.0f;
        if (f4 != null) {
            f = f4.floatValue();
        } else {
            f = 0.0f;
        }
        c81240VuW.LJFF = C81238VuU.LIZ(it, f3, f);
        C81240VuW c81240VuW2 = this.LJLIL.LJLILLLLZI;
        float f6 = this.LJLJJLL;
        Float f7 = this.LJLJL;
        if (f7 != null) {
            f2 = f7.floatValue();
        } else {
            f2 = 0.0f;
        }
        c81240VuW2.LJ = C81238VuU.LIZ(it, f6, f2);
        C81240VuW c81240VuW3 = this.LJLIL.LJLILLLLZI;
        float f8 = this.LJLJLJ;
        Float f9 = this.LJLJLLL;
        if (f9 != null) {
            f5 = f9.floatValue();
        }
        c81240VuW3.LJI = C81238VuU.LIZ(it, f8, f5);
        C81238VuU c81238VuU = this.LJLIL;
        c81238VuU.LJLLI = true;
        c81238VuU.invalidate();
    }
}
