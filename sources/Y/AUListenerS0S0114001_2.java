package Y;

import X.AnonymousClass668;
import X.C140325f2;
import X.C141525gy;
import X.C158986Lu;
import X.C264612c;
import X.C5F3;
import X.C5F4;
import X.C5O6;
import X.C78841Uwv;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AUListenerS0S0114001_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f6;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public boolean z1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0114001_2 aUListenerS0S0114001_2, ValueAnimator valueAnimator) {
        float f;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (aUListenerS0S0114001_2.z1) {
            f = (1.0f - floatValue) * ((C158986Lu) aUListenerS0S0114001_2.l0).LJLLJ;
        } else {
            f = ((C158986Lu) aUListenerS0S0114001_2.l0).LJLLJ * floatValue;
        }
        int i = aUListenerS0S0114001_2.i2 + ((int) ((aUListenerS0S0114001_2.i3 - r3) * floatValue));
        C5F4 c5f4 = ((C158986Lu) aUListenerS0S0114001_2.l0).LJLJJLL;
        if (c5f4 != null) {
            c5f4.LJLIL = f;
            c5f4.LJLILLLLZI = i + f;
            c5f4.invalidate();
            C5F3 c5f3 = ((C158986Lu) aUListenerS0S0114001_2.l0).LJLJL;
            if (c5f3 != null) {
                int i2 = aUListenerS0S0114001_2.i4 + ((int) ((aUListenerS0S0114001_2.i5 - r1) * floatValue));
                c5f3.LJLIL = f;
                c5f3.LJLILLLLZI = i2 + ((int) f);
                c5f3.invalidate();
                if (aUListenerS0S0114001_2.z1) {
                    ((C158986Lu) aUListenerS0S0114001_2.l0).LLJILJIL().setScaleX(((aUListenerS0S0114001_2.f6 - 1.0f) * floatValue) + 1.0f);
                    ((C158986Lu) aUListenerS0S0114001_2.l0).LLJILJIL().setScaleY(((aUListenerS0S0114001_2.f6 - 1.0f) * floatValue) + 1.0f);
                    ((C158986Lu) aUListenerS0S0114001_2.l0).LLJILJIL().setTranslationY(((C158986Lu) aUListenerS0S0114001_2.l0).LJLLL * floatValue);
                    return;
                }
                return;
            }
            o.LJIJI("bottomMask");
            throw null;
        }
        o.LJIJI("topMask");
        throw null;
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0114001_2 aUListenerS0S0114001_2, ValueAnimator animation) {
        float[] fArr;
        o.LJIIIZ(animation, "animation");
        C140325f2 c140325f2 = (C140325f2) aUListenerS0S0114001_2.l0;
        float animatedFraction = animation.getAnimatedFraction();
        boolean z = aUListenerS0S0114001_2.z1;
        c140325f2.getClass();
        if (z) {
            animatedFraction = 1 - animatedFraction;
        }
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        C140325f2 c140325f22 = (C140325f2) aUListenerS0S0114001_2.l0;
        int i = aUListenerS0S0114001_2.i2;
        int i2 = aUListenerS0S0114001_2.i3;
        c140325f22.getClass();
        if (C141525gy.LIZ(i2, i)) {
            float f = aUListenerS0S0114001_2.f6 * floatValue;
            fArr = new float[]{f, (aUListenerS0S0114001_2.i4 - f) / 2, (aUListenerS0S0114001_2.i5 - AnonymousClass668.LIZIZ().LIZ()) * animatedFraction};
        } else {
            float f2 = aUListenerS0S0114001_2.f6 * floatValue;
            fArr = new float[]{f2, (aUListenerS0S0114001_2.i4 - f2) / 2, 0.0f};
        }
        float f3 = fArr[0];
        int i3 = (int) fArr[1];
        int i4 = (int) fArr[2];
        int i5 = (int) f3;
        int i6 = (int) floatValue;
        ((C140325f2) aUListenerS0S0114001_2.l0).LIZIZ.LIZ(i3, i4, i5, i6);
        ((C140325f2) aUListenerS0S0114001_2.l0).LJ.invoke(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        C140325f2 c140325f23 = (C140325f2) aUListenerS0S0114001_2.l0;
        float f4 = (floatValue * 1.0f) / aUListenerS0S0114001_2.i2;
        if (c140325f23.LJIIIZ == Integer.MAX_VALUE && C78841Uwv.LJIIIZ(f4, 1.0f, 1.0E-5f)) {
            c140325f23.LJIIIZ = i4;
        }
        c140325f23.LIZJ.invoke(Float.valueOf(f4), Float.valueOf(i3), Float.valueOf((i4 - c140325f23.LJIIIZ) + c140325f23.LJI));
        C5O6.LIZ = i3;
        C5O6.LIZIZ = i4;
        C5O6.LIZJ = i5;
        C5O6.LIZLLL = i6;
    }

    public AUListenerS0S0114001_2(Object obj, boolean z, int i, int i2, float f, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = obj;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
        this.f6 = f;
        this.i4 = i3;
        this.i5 = i4;
    }
}
