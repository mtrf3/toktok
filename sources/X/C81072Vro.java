package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.Vro, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81072Vro extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LJLIL;
    public final float[] LJLILLLLZI;
    public final float[] LJLJI;
    public final /* synthetic */ C81078Vru LJLJJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        int i = 0;
        do {
            float[] fArr = this.LJLJI;
            float f = this.LJLIL[i];
            fArr[i] = C06420Na.LIZIZ(this.LJLILLLLZI[i], f, floatValue, f);
            i++;
        } while (i < 9);
        this.LJLJJI.LJLLI.setValues(this.LJLJI);
        this.LJLJJI.LIZIZ();
        this.LJLJJI.invalidate();
    }

    public /* synthetic */ C81072Vro(C81078Vru c81078Vru, Matrix matrix, Matrix matrix2) {
        this(c81078Vru, matrix, matrix2, 200L);
    }

    public C81072Vro(C81078Vru c81078Vru, Matrix start, Matrix matrix, long j) {
        o.LJIIIZ(start, "start");
        this.LJLJJI = c81078Vru;
        float[] fArr = new float[9];
        this.LJLIL = fArr;
        float[] fArr2 = new float[9];
        this.LJLILLLLZI = fArr2;
        this.LJLJI = new float[9];
        setFloatValues(0.0f, 1.0f);
        setDuration(j);
        addUpdateListener(this);
        start.getValues(fArr);
        matrix.getValues(fArr2);
    }
}
