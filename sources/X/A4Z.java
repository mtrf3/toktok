package X;

import com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4Z implements T29 {
    public final /* synthetic */ RatingFragment LIZ;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LIZIZ;
    public final /* synthetic */ InterfaceC35811ar<Integer> LIZJ;

    @Override // X.T29
    public final void LIZ() {
        this.LIZ.q0();
    }

    @Override // X.T29
    public final void LIZJ(String reviewText) {
        o.LJIIIZ(reviewText, "reviewText");
        this.LIZ.LJLLI = reviewText;
    }

    @Override // X.V53
    public final void LIZIZ(int i, boolean z) {
        if (new C40517FvF(0, 5).LJIILJJIL(i)) {
            this.LIZIZ.setValue(Boolean.TRUE);
        }
        this.LIZ.LJLLILLLL = i;
        this.LIZJ.setValue(Integer.valueOf(i));
    }

    public A4Z(RatingFragment ratingFragment, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC35811ar<Integer> interfaceC35811ar2) {
        this.LIZ = ratingFragment;
        this.LIZIZ = interfaceC35811ar;
        this.LIZJ = interfaceC35811ar2;
    }
}
