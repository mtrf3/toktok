package X;

import Y.ARunnableS10S0101000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.Fij, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39741Fij extends View {
    public static final /* synthetic */ int LJLJI = 0;
    public boolean LJLIL;
    public final /* synthetic */ C39739Fih LJLILLLLZI;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.LJLILLLLZI.LIZJ && !this.LJLIL) {
            boolean LIZLLL = FAJ.LIZLLL(C16880lQ.LLIIIJ(), new ARunnableS10S0101000_6(1, this, 11));
            this.LJLIL = LIZLLL;
            if (LIZLLL) {
                getViewTreeObserver().addOnPreDrawListener(this.LJLILLLLZI.LJFF);
                postDelayed(new ARunnableS10S0101000_6(1, this, 0), 2000L);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.LJLILLLLZI.LIZJ && this.LJLIL) {
            getViewTreeObserver().removeOnPreDrawListener(this.LJLILLLLZI.LJFF);
            HandlerC39740Fii handlerC39740Fii = this.LJLILLLLZI.LJI;
            handlerC39740Fii.getClass();
            try {
                ViewParent viewParent = handlerC39740Fii.LIZIZ.get();
                if (viewParent != null && C37684Eqe.LJFF(viewParent) == handlerC39740Fii) {
                    C37684Eqe.LIZJ(handlerC39740Fii.LIZ, viewParent);
                    C37684Eqe.LIZIZ(handlerC39740Fii, handlerC39740Fii.LIZ);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39741Fij(C39739Fih c39739Fih, Context context) {
        super(context);
        this.LJLILLLLZI = c39739Fih;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }
}
