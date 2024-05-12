package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.Vry, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81082Vry extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LJLIL;
    public final /* synthetic */ C81078Vru LJLILLLLZI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        boolean z;
        o.LJIIIZ(animation, "animation");
        if (this.LJLILLLLZI.getPinchMode() == 1) {
            C81078Vru c81078Vru = this.LJLILLLLZI;
            float[] fArr = this.LJLIL;
            z = c81078Vru.LJIIIIZZ(fArr[0], fArr[1]);
        } else {
            z = false;
        }
        float[] fArr2 = this.LJLIL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (!z || C81081Vrx.LIZ(0.0f, 0.0f, f, f2) < 1.0f) {
            animation.cancel();
        }
    }

    public C81082Vry(C81078Vru c81078Vru, float f, float f2) {
        this.LJLILLLLZI = c81078Vru;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LJLIL = new float[]{f, f2};
    }
}
