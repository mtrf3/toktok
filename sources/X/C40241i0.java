package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: X.1i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40241i0 extends C1CW {
    public C40241i0() {
    }

    public C40241i0(int i) {
        if ((i & (-4)) == 0) {
            this.LLFZ = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
        C1CW.LJJIJL(c03860De);
        java.util.Map<String, Object> map = c03860De.LIZ;
        HashMap hashMap = (HashMap) map;
        hashMap.put("android:fade:transitionAlpha", Float.valueOf(C03930Dl.LIZ.LJJJJZI(c03860De.LIZIZ)));
    }

    @Override // X.C1CW
    public final Animator LJJIZ(ViewGroup viewGroup, View view, C03860De c03860De) {
        float f;
        Float f2;
        C03930Dl.LIZ.getClass();
        if (c03860De != null && (f2 = (Float) ((HashMap) c03860De.LIZ).get("android:fade:transitionAlpha")) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        return LJJJ(f, 0.0f, view);
    }

    public final Animator LJJJ(float f, float f2, final View view) {
        if (f == f2) {
            return null;
        }
        C03930Dl.LIZ.LJJJLIIL(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C03930Dl.LIZIZ, f2);
        ofFloat.addListener(new AnimatorListenerAdapter(view) { // from class: X.0Bp
            public final View LJLIL;
            public boolean LJLILLLLZI;

            {
                this.LJLIL = view;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C03930Dl.LIZ.LJJJLIIL(this.LJLIL, 1.0f);
                if (this.LJLILLLLZI) {
                    this.LJLIL.setLayerType(0, null);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (C16300kU.LJII(this.LJLIL) && this.LJLIL.getLayerType() == 0) {
                    this.LJLILLLLZI = true;
                    this.LJLIL.setLayerType(2, null);
                }
            }
        });
        LIZ(new C1CS() { // from class: X.1hz
            @Override // X.C1CS, X.InterfaceC03480Bs
            public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
                View view2 = view;
                C46131rV c46131rV = C03930Dl.LIZ;
                c46131rV.LJJJLIIL(view2, 1.0f);
                c46131rV.getClass();
                abstractC03490Bt.LJIL(this);
            }
        });
        return ofFloat;
    }

    @Override // X.C1CW
    public final Animator LJJIL(ViewGroup viewGroup, View view, C03860De c03860De, C03860De c03860De2) {
        float f;
        Float f2;
        float f3 = 0.0f;
        if (c03860De != null && (f2 = (Float) ((HashMap) c03860De.LIZ).get("android:fade:transitionAlpha")) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        if (f != 1.0f) {
            f3 = f;
        }
        return LJJJ(f3, 1.0f, view);
    }
}
