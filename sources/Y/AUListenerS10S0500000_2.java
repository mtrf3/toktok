package Y;

import X.C0EH;
import X.C1297357h;
import X.C1297757l;
import X.C1300758p;
import X.C47261Igj;
import X.C59L;
import X.C5T8;
import X.C5T9;
import X.C5TF;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AUListenerS10S0500000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS10S0500000_2 aUListenerS10S0500000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C5T9 c5t9 = (C5T9) aUListenerS10S0500000_2.l0;
        InterfaceC153045zY interfaceC153045zY = c5t9.LIZLLL;
        if (interfaceC153045zY == null) {
            return;
        }
        c5t9.LIZIZ().setValue(Long.valueOf(interfaceC153045zY.LJZL()));
        float LJZL = interfaceC153045zY.LJZL() / interfaceC153045zY.getDuration();
        C5T8 c5t8 = ((C5T9) aUListenerS10S0500000_2.l0).LJIIIZ;
        if (c5t8 != null) {
            c5t8.LJJIIJ(LJZL);
        }
        C5TF c5tf = ((C5T9) aUListenerS10S0500000_2.l0).LJIIJ;
        if (c5tf != null) {
            c5tf.LJJIIJ(LJZL);
        }
        if (((Boolean) ((InterfaceC65784Pro) aUListenerS10S0500000_2.l1).invoke()).booleanValue()) {
            C5T8 c5t82 = ((C5T9) aUListenerS10S0500000_2.l0).LJIIIZ;
            if (c5t82 != null) {
                int LIZ = c5t82.LIZ(interfaceC153045zY.LJZL(), ((C5T9) aUListenerS10S0500000_2.l0).LJII);
                C5T8 c5t83 = ((C5T9) aUListenerS10S0500000_2.l0).LJIIIZ;
                if (c5t83 != null) {
                    c5t83.LIZIZ();
                }
                if (LIZ == -1) {
                    Point point = ((C5T9) aUListenerS10S0500000_2.l0).LJII;
                    if (point != null) {
                        point.setY(interfaceC153045zY.LJZL());
                    }
                    C5T8 c5t84 = ((C5T9) aUListenerS10S0500000_2.l0).LJIIIZ;
                    if (c5t84 != null) {
                        c5t84.LIZIZ();
                    }
                } else {
                    Point point2 = ((C5T9) aUListenerS10S0500000_2.l0).LJII;
                    if (point2 != null) {
                        point2.setY(LIZ);
                    }
                    C5T8 c5t85 = ((C5T9) aUListenerS10S0500000_2.l0).LJIIIZ;
                    if (c5t85 != null) {
                        c5t85.LIZIZ();
                    }
                    ((InterfaceC88472Yns) aUListenerS10S0500000_2.l2).invoke(Integer.valueOf(LIZ));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            ((C5T9) aUListenerS10S0500000_2.l0).LJII = null;
        }
        if (interfaceC153045zY.LJZL() >= ((C5T9) aUListenerS10S0500000_2.l0).LJ) {
            if (((Boolean) ((InterfaceC65784Pro) aUListenerS10S0500000_2.l1).invoke()).booleanValue()) {
                ((InterfaceC65784Pro) aUListenerS10S0500000_2.l3).invoke();
                return;
            }
            ((C5T9) aUListenerS10S0500000_2.l0).LIZIZ.cancel();
            ((C5T9) aUListenerS10S0500000_2.l0).LJ();
            ((InterfaceC65784Pro) aUListenerS10S0500000_2.l4).invoke();
            if (!((C5T9) aUListenerS10S0500000_2.l0).LIZJ || interfaceC153045zY.LJZL() != 0) {
                return;
            }
            C5T9 c5t92 = (C5T9) aUListenerS10S0500000_2.l0;
            if (c5t92.LJ == 0) {
                return;
            }
            c5t92.LJI();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS10S0500000_2 aUListenerS10S0500000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C1297757l c1297757l = (C1297757l) aUListenerS10S0500000_2.l0;
        List<C59L> list = c1297757l.LJLIL;
        int[] iArr = (int[]) aUListenerS10S0500000_2.l1;
        C76732zl c76732zl = (C76732zl) aUListenerS10S0500000_2.l2;
        int[] iArr2 = (int[]) aUListenerS10S0500000_2.l3;
        int[] iArr3 = (int[]) aUListenerS10S0500000_2.l4;
        int i = 0;
        for (C59L c59l : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C59L c59l2 = c59l;
                float f = (c1297757l.LLD * 2) + C1300758p.LIZJ;
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c59l2.setLayoutParams(new RelativeLayout.LayoutParams((int) (((1.0f - ((Float) animatedValue).floatValue()) * iArr[i]) + f), c76732zl.element));
                float f2 = iArr2[i];
                Object animatedValue2 = it.getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                c59l2.setTranslationX((((Float) animatedValue2).floatValue() * iArr3[i]) + f2);
                if (o.LJ(it.getAnimatedValue(), Float.valueOf(1.0f))) {
                    c59l2.LIZIZ();
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS10S0500000_2 aUListenerS10S0500000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C1297357h c1297357h = (C1297357h) aUListenerS10S0500000_2.l0;
        List<C59L> list = c1297357h.LJLILLLLZI;
        int[] iArr = (int[]) aUListenerS10S0500000_2.l1;
        C76732zl c76732zl = (C76732zl) aUListenerS10S0500000_2.l2;
        int[] iArr2 = (int[]) aUListenerS10S0500000_2.l3;
        int[] iArr3 = (int[]) aUListenerS10S0500000_2.l4;
        int i = 0;
        for (C59L c59l : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C59L c59l2 = c59l;
                float LIZ = C0EH.LIZ(c1297357h.LLIFFJFJJ, c1297357h.LLFZ, 2, C1300758p.LIZJ);
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c59l2.setLayoutParams(new RelativeLayout.LayoutParams((int) (((1.0f - ((Float) animatedValue).floatValue()) * iArr[i]) + LIZ), c76732zl.element));
                float f = iArr2[i];
                Object animatedValue2 = it.getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = (((Float) animatedValue2).floatValue() * iArr3[i]) + f;
                if (c1297357h.LIZLLL()) {
                    floatValue = -floatValue;
                }
                c59l2.setTranslationX(floatValue);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS10S0500000_2(Object obj, C5T9 c5t9, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        this.$t = interfaceC65784Pro3;
        this.l0 = obj;
        this.l1 = c5t9;
        this.l2 = interfaceC65784Pro;
        this.l3 = interfaceC88472Yns;
        this.l4 = interfaceC65784Pro2;
    }
}
