package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes13.dex */
public abstract class SJ6 implements SJ8<SJ5> {
    public final SJ5 LJLIL;
    public SJF LJLILLLLZI;
    public boolean LJLJI;
    public float LJLJJLL;
    public float LJLJL;
    public boolean LJLJJI = true;
    public boolean LJLJJL = true;
    public final RectF LJLJLJ = new RectF();
    public final RectF LJLJLLL = new RectF();
    public final RectF LJLL = new RectF();
    public final Matrix LJLLI = new Matrix();
    public final Matrix LJLLILLLL = new Matrix();
    public final float[] LJLLJ = new float[9];

    public final void LJFF() {
        this.LJLLI.mapRect(this.LJLL, this.LJLJLLL);
        SJF sjf = this.LJLILLLLZI;
        if (sjf != null && this.LJLJI) {
            sjf.LIZ();
        }
    }

    public final void LJII() {
        RectF rectF = this.LJLJLJ;
        RectF rectF2 = this.LJLJLLL;
        if (rectF2.width() > rectF.width() || rectF2.height() > rectF.height()) {
            this.LJLJL = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
        } else {
            this.LJLJL = Math.max(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        }
    }

    public SJ6(SJ5 sj5) {
        this.LJLIL = sj5;
        sj5.LJLIL = this;
    }

    public final void LJI(boolean z) {
        this.LJLJI = z;
        if (!z) {
            SJ3 sj3 = (SJ3) this;
            sj3.LJIJ();
            if (sj3.LLFFF.computeScrollOffset()) {
                sj3.LLFFF.forceFinished(true);
            }
            sj3.LJZ.reset();
            sj3.LJLZ.reset();
            sj3.LJLLI.reset();
            sj3.LJFF();
        }
    }
}
