package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vo2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80838Vo2 {
    public final C152175y9 LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public ValueAnimator LIZJ;

    public final void LIZ() {
        C152175y9 c152175y9 = this.LIZ;
        if ((c152175y9 instanceof C152175y9) && c152175y9 != null) {
            c152175y9.setCanInterceptTouchEvent(true);
        }
        C152175y9 c152175y92 = this.LIZ;
        if (c152175y92.LLILL) {
            c152175y92.LJIIL();
        }
        this.LIZIZ.invoke();
    }

    public C80838Vo2(C152175y9 viewPager, AqS164S0100000_14 aqS164S0100000_14) {
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZ = viewPager;
        this.LIZIZ = aqS164S0100000_14;
    }
}
