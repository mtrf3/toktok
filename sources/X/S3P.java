package X;

import Y.AUListenerS99S0100000_12;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3P implements Runnable {
    public final /* synthetic */ S3N LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    public S3P(S3N s3n, int i, int i2, String str) {
        this.LJLIL = s3n;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
    }

    public final void LIZ() {
        int scrollX;
        if (C90193gN.LIZIZ(this.LJLIL.LIZJ)) {
            TuxTextView tuxTextView = this.LJLIL.LJIIL;
            if (tuxTextView != null) {
                scrollX = tuxTextView.getScrollX() - this.LJLILLLLZI;
            } else {
                o.LJIJI("topSaleTitle");
                throw null;
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLIL.LJIIL;
            if (tuxTextView2 != null) {
                scrollX = tuxTextView2.getScrollX() + this.LJLILLLLZI;
            } else {
                o.LJIJI("topSaleTitle");
                throw null;
            }
        }
        S3N s3n = this.LJLIL;
        int[] iArr = new int[2];
        TuxTextView tuxTextView3 = s3n.LJIIL;
        if (tuxTextView3 != null) {
            iArr[0] = tuxTextView3.getScrollX();
            iArr[1] = scrollX;
            s3n.LJIILL = ValueAnimator.ofInt(iArr);
            ValueAnimator valueAnimator = this.LJLIL.LJIILL;
            if (valueAnimator != null) {
                valueAnimator.setInterpolator(new LinearInterpolator());
            }
            ValueAnimator valueAnimator2 = this.LJLIL.LJIILL;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(((this.LJLILLLLZI * 1.0f) / this.LJLJI) * ((float) 1000));
            }
            S3N s3n2 = this.LJLIL;
            ValueAnimator valueAnimator3 = s3n2.LJIILL;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new AUListenerS99S0100000_12(s3n2, 29));
            }
            S3N s3n3 = this.LJLIL;
            ValueAnimator valueAnimator4 = s3n3.LJIILL;
            if (valueAnimator4 != null) {
                valueAnimator4.addListener(new S3Q(s3n3, this.LJLJJI));
                return;
            }
            return;
        }
        o.LJIJI("topSaleTitle");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
