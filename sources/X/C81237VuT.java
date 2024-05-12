package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.VuT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81237VuT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C81238VuU LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ Float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ Float LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ float LJLJL;

    public C81237VuT(C81238VuU c81238VuU, float f, Float f2, float f3, Float f4, float f5, float f6) {
        this.LJLIL = c81238VuU;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = f5;
        this.LJLJL = f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        float f;
        o.LJIIIZ(it, "it");
        C81236VuS c81236VuS = this.LJLIL.LJLJI;
        float f2 = this.LJLILLLLZI;
        Float f3 = this.LJLJI;
        float f4 = 0.0f;
        if (f3 != null) {
            f = f3.floatValue();
        } else {
            f = 0.0f;
        }
        c81236VuS.LJFF = C81238VuU.LIZ(it, f2, f);
        C81236VuS c81236VuS2 = this.LJLIL.LJLJI;
        float f5 = this.LJLJJI;
        Float f6 = this.LJLJJL;
        if (f6 != null) {
            f4 = f6.floatValue();
        }
        c81236VuS2.LJ = C81238VuU.LIZ(it, f5, f4);
        this.LJLIL.LJLJI.LJI = C81238VuU.LIZ(it, this.LJLJJLL, this.LJLJL);
        C81238VuU c81238VuU = this.LJLIL;
        c81238VuU.LJLLI = true;
        c81238VuU.invalidate();
    }
}
