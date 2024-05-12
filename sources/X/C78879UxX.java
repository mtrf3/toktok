package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: X.UxX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78879UxX extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LJLIL;
    public final float[] LJLILLLLZI;
    public final float[] LJLJI = new float[9];
    public final /* synthetic */ C81098VsE LJLJJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        do {
            float[] fArr = this.LJLJI;
            float f = this.LJLIL[i];
            fArr[i] = C06420Na.LIZIZ(this.LJLILLLLZI[i], f, floatValue, f);
            i++;
        } while (i < 9);
        this.LJLJJI.LJLJJL.setValues(this.LJLJI);
        this.LJLJJI.LIZIZ();
        this.LJLJJI.invalidate();
    }

    public C78879UxX(C81098VsE c81098VsE, Matrix matrix, Matrix matrix2) {
        this.LJLJJI = c81098VsE;
        float[] fArr = new float[9];
        this.LJLIL = fArr;
        float[] fArr2 = new float[9];
        this.LJLILLLLZI = fArr2;
        setFloatValues(0.0f, 1.0f);
        setDuration(200L);
        addUpdateListener(this);
        matrix.getValues(fArr);
        matrix2.getValues(fArr2);
    }
}
