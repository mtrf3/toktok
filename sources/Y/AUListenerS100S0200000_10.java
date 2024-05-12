package Y;

import X.InterfaceC59366NRq;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AUListenerS100S0200000_10 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS100S0200000_10 aUListenerS100S0200000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            InterfaceC59366NRq[] interfaceC59366NRqArr = (InterfaceC59366NRq[]) aUListenerS100S0200000_10.l0;
            int[] iArr = (int[]) aUListenerS100S0200000_10.l1;
            int length = interfaceC59366NRqArr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (i3 + i5 > intValue) {
                    interfaceC59366NRqArr[i2].LLZZZIL((intValue - i3) - i5);
                    Integer valueOf = Integer.valueOf(i2 - 1);
                    if (valueOf.intValue() >= 0) {
                        interfaceC59366NRqArr[valueOf.intValue()].LLZZZIL(0);
                        return;
                    }
                    return;
                }
                i3 += i5;
                i++;
                i2 = i4;
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS100S0200000_10 aUListenerS100S0200000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            InterfaceC59366NRq[] interfaceC59366NRqArr = (InterfaceC59366NRq[]) aUListenerS100S0200000_10.l0;
            int[] iArr = (int[]) aUListenerS100S0200000_10.l1;
            int length = interfaceC59366NRqArr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (i3 + i5 > intValue) {
                    interfaceC59366NRqArr[i2].LLZZZIL(i3 - intValue);
                    Integer valueOf = Integer.valueOf(i2 - 1);
                    if (valueOf.intValue() >= 0) {
                        int intValue2 = valueOf.intValue();
                        interfaceC59366NRqArr[intValue2].LLZZZIL(-iArr[intValue2]);
                        return;
                    }
                    return;
                }
                i3 += i5;
                i++;
                i2 = i4;
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS100S0200000_10 aUListenerS100S0200000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            InterfaceC59366NRq[] interfaceC59366NRqArr = (InterfaceC59366NRq[]) aUListenerS100S0200000_10.l0;
            int[] iArr = (int[]) aUListenerS100S0200000_10.l1;
            int length = interfaceC59366NRqArr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (i3 + i5 > intValue) {
                    interfaceC59366NRqArr[i2].LLZZZIL((intValue - i3) - i5);
                    Integer valueOf = Integer.valueOf(i2 - 1);
                    if (valueOf.intValue() >= 0) {
                        interfaceC59366NRqArr[valueOf.intValue()].LLZZZIL(0);
                        return;
                    }
                    return;
                }
                i3 += i5;
                i++;
                i2 = i4;
            }
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS100S0200000_10 aUListenerS100S0200000_10, ValueAnimator animator) {
        Integer num;
        o.LJIIIZ(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            InterfaceC59366NRq[] interfaceC59366NRqArr = (InterfaceC59366NRq[]) aUListenerS100S0200000_10.l0;
            int[] iArr = (int[]) aUListenerS100S0200000_10.l1;
            int length = interfaceC59366NRqArr.length;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (i3 + i5 > intValue) {
                    interfaceC59366NRqArr[i2].LLZZZIL(i3 - intValue);
                    Integer valueOf = Integer.valueOf(i2 - 1);
                    if (valueOf.intValue() >= 0) {
                        int intValue2 = valueOf.intValue();
                        interfaceC59366NRqArr[intValue2].LLZZZIL(-iArr[intValue2]);
                        return;
                    }
                    return;
                }
                i3 += i5;
                i++;
                i2 = i4;
            }
        }
    }

    public AUListenerS100S0200000_10(InterfaceC59366NRq[] interfaceC59366NRqArr, int[] iArr, int i) {
        this.$t = i;
        this.l0 = interfaceC59366NRqArr;
        this.l1 = iArr;
    }
}
