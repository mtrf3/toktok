package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* renamed from: X.Bq4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30004Bq4 implements InterfaceC81841WAb {
    public final /* synthetic */ C2A4 LJLIL;
    public final /* synthetic */ C30001Bq1 LJLILLLLZI;

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        C2A4 c2a4 = this.LJLIL;
        c2a4.LLIIJLIL = null;
        C30001Bq1 c30001Bq1 = this.LJLILLLLZI;
        c30001Bq1.getClass();
        c2a4.setVisibility(4);
        if (c30001Bq1.LIZIZ.size() >= 5) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS24S0200000_5(c30001Bq1.LIZJ, c2a4, 29));
        } else {
            c30001Bq1.LIZIZ.add(c2a4);
        }
    }

    public C30004Bq4(C2A4 c2a4, C30001Bq1 c30001Bq1) {
        this.LJLIL = c2a4;
        this.LJLILLLLZI = c30001Bq1;
    }
}
