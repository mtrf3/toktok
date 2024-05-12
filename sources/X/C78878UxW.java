package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: X.UxW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78878UxW extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LJLIL;
    public final float[] LJLILLLLZI;
    public final float[] LJLJI;
    public final /* synthetic */ C81091Vs7 LJLJJI;

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
        this.LJLJJI.LJLJLJ.setValues(this.LJLJI);
        this.LJLJJI.LIZIZ();
        this.LJLJJI.invalidate();
    }

    public C78878UxW(C81091Vs7 c81091Vs7, Matrix matrix, Matrix matrix2) {
        this(c81091Vs7, matrix, matrix2, 200L);
    }

    public C78878UxW(C81091Vs7 c81091Vs7, Matrix matrix, Matrix matrix2, long j) {
        this.LJLJJI = c81091Vs7;
        float[] fArr = new float[9];
        this.LJLIL = fArr;
        float[] fArr2 = new float[9];
        this.LJLILLLLZI = fArr2;
        this.LJLJI = new float[9];
        setFloatValues(0.0f, 1.0f);
        setDuration(j);
        addUpdateListener(this);
        matrix.getValues(fArr);
        matrix2.getValues(fArr2);
    }
}
