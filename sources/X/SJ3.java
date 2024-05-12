package X;

import Y.ALAdapterS9S0200000_12;
import Y.ARunnableS18S0101000_14;
import Y.AUListenerS101S0200000_12;
import Y.AUListenerS99S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* loaded from: classes13.dex */
public class SJ3 extends SJ6 {
    public final float[] LJLLL;
    public final float[] LJLLLL;
    public final float[] LJLLLLLL;
    public final Matrix LJLZ;
    public final Matrix LJZ;
    public final Matrix LJZI;
    public SJG LJZL;
    public boolean LL;
    public final ValueAnimator LLD;
    public long LLF;
    public final ARunnableS18S0101000_14 LLFF;
    public final Scroller LLFFF;
    public final RectF LLFII;
    public boolean LLFZ;

    @Override // X.SJ8
    /* renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public void LIZ(SJ5 sj5) {
    }

    public final boolean LJIIIZ() {
        if (this.LLD.isRunning() || this.LLFFF.computeScrollOffset()) {
            return true;
        }
        return false;
    }

    public final void LJIJ() {
        if (this.LLD.isRunning()) {
            this.LLD.cancel();
            this.LLD.removeAllUpdateListeners();
            C16880lQ.LJLJL(this.LLD);
        }
    }

    public final boolean LJIIJ() {
        if (LJIIIZ()) {
            return false;
        }
        this.LJLLI.getValues(this.LJLLJ);
        float[] fArr = this.LJLLJ;
        fArr[0] = fArr[0] - 1.0f;
        fArr[4] = fArr[4] - 1.0f;
        fArr[8] = fArr[8] - 1.0f;
        int i = 0;
        while (Math.abs(this.LJLLJ[i]) <= 0.001f) {
            i++;
            if (i >= 9) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIL(Matrix matrix) {
        RectF rectF = this.LLFII;
        RectF rectF2 = this.LJLJLLL;
        RectF rectF3 = this.LJLJLJ;
        rectF.set(rectF2);
        matrix.mapRect(rectF);
        float LJIIIIZZ = LJIIIIZZ(rectF.left, rectF.right, rectF3.left, rectF3.right, rectF2.centerX());
        float LJIIIIZZ2 = LJIIIIZZ(rectF.top, rectF.bottom, rectF3.top, rectF3.bottom, rectF2.centerY());
        if (LJIIIIZZ != 0.0f || LJIIIIZZ2 != 0.0f) {
            matrix.postTranslate(LJIIIIZZ, LJIIIIZZ2);
            return true;
        }
        return false;
    }

    @Override // X.SJ8
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public void LJ(SJ5 sj5) {
        if (this.LLFZ) {
            return;
        }
        LJIJ();
        if (this.LLFFF.computeScrollOffset()) {
            this.LLFFF.forceFinished(true);
        }
    }

    @Override // X.SJ8
    /* renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public void LIZIZ(SJ5 sj5) {
        if (this.LLFZ || LJIIIZ()) {
            return;
        }
        SJ7 sj7 = sj5.LJLILLLLZI;
        int i = sj7.LIZ;
        if (i != sj7.LIZIZ && i == 1) {
            this.LJLZ.set(this.LJLLI);
            RectF rectF = this.LJLJLJ;
            if (LJIIJJI(this.LJLZ, rectF.centerX(), rectF.centerY()) | LJIIL(this.LJLZ)) {
                this.LLFZ = true;
                LJIIZILJ(this.LJLZ, this.LLF, this.LLFF, null);
                return;
            }
            return;
        }
        Matrix matrix = this.LJLLI;
        SJ5 sj52 = this.LJLIL;
        matrix.set(matrix);
        if (this.LJLJJL) {
            matrix.postTranslate(sj52.LJLJLLL, sj52.LJLL);
        }
        if (this.LJLJJI && sj52.LJLILLLLZI.LIZ > 1) {
            float f = sj52.LJLLI;
            matrix.postScale(f, f, sj52.LJLJL, sj52.LJLJLJ);
        }
        if (sj52.LJLILLLLZI.LIZ == 1) {
            LJIIL(matrix);
        }
        LJFF();
    }

    public final boolean LJIILLIIL(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3) {
            if (this.LJLJI) {
                this.LJLIL.LIZLLL(motionEvent);
                return true;
            }
            return false;
        }
        if (this.LL) {
            SJ5 sj5 = this.LJLIL;
            if (((Math.abs(this.LJLL.left - this.LJLJLJ.left) < 0.001f || LJIIJ()) && sj5.LJLLILLLL == 3) || ((Math.abs(this.LJLL.right - this.LJLJLJ.right) < 0.001f || LJIIJ()) && sj5.LJLLILLLL == 1)) {
                return false;
            }
        }
        if (this.LJLJI) {
            this.LJLIL.LIZLLL(motionEvent);
            return true;
        }
        return false;
    }

    public SJ3(SJ5 sj5, Context context) {
        super(sj5);
        this.LJLLL = new float[9];
        this.LJLLLL = new float[9];
        this.LJLLLLLL = new float[9];
        this.LJLZ = new Matrix();
        this.LJZ = new Matrix();
        this.LJZI = new Matrix();
        this.LL = false;
        this.LLF = 400L;
        this.LLFF = new ARunnableS18S0101000_14(4, this, 23);
        this.LLFII = new RectF();
        this.LLFZ = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLD = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator(1.2f));
        this.LLFFF = new Scroller(context);
    }

    public final boolean LJIIJJI(Matrix matrix, float f, float f2) {
        matrix.getValues(this.LJLLJ);
        float f3 = this.LJLLJ[0];
        float max = Math.max(1.0f, f3);
        float f4 = this.LJLJJLL;
        if (f4 == 0.0f) {
            f4 = this.LJLJL;
        }
        float min = Math.min(max, f4);
        if (min == f3) {
            return false;
        }
        float f5 = min / f3;
        matrix.postScale(f5, f5, f, f2);
        return true;
    }

    public final void LJIIZILJ(Matrix matrix, long j, Runnable runnable, AUListenerS99S0100000_12 aUListenerS99S0100000_12) {
        if (this.LLD.isRunning()) {
            LJIJ();
        }
        this.LLD.setDuration(j);
        this.LJLLI.getValues(this.LJLLL);
        matrix.getValues(this.LJLLLL);
        this.LLD.addUpdateListener(new AUListenerS101S0200000_12(this, aUListenerS99S0100000_12, 2));
        this.LLD.addListener(new ALAdapterS9S0200000_12(runnable, this, 2));
        this.LLD.start();
    }

    public static float LJIIIIZZ(float f, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f;
        float f7 = f4 - f3;
        if (f6 < Math.min(f5 - f3, f4 - f5) * 2.0f) {
            return f5 - ((f2 + f) / 2.0f);
        }
        if (f6 < f7) {
            if (f5 < (f3 + f4) / 2.0f) {
                return f3 - f;
            }
            return f4 - f2;
        }
        if (f > f3) {
            return f3 - f;
        }
        if (f2 < f4) {
            return f4 - f2;
        }
        return 0.0f;
    }
}
