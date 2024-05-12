package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.47N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47N {
    public static final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C47T.LJLIL);
    public static final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(C47S.LJLIL);
    public static final C62822Ol8 LJIILL = C221108m2.LIZIZ(C47P.LJLIL);
    public C109544Rq LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public View LJFF;
    public View LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public InterfaceC93803mC LJIIJJI;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C47U.LJLIL);
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C47V.LJLIL);
    public boolean LJIIL = true;

    public final void LIZ() {
        Iterator it = ((List) this.LJIIIIZZ.getValue()).iterator();
        while (it.hasNext()) {
            ((ViewPropertyAnimator) it.next()).cancel();
        }
        ((List) this.LJIIIIZZ.getValue()).clear();
    }

    public C47N() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("swipe gesture threshold: ");
        LIZ.append(C47O.LIZ());
        C34B.LIZIZ("WipeForReplyGestureHelper", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("triggerReplyThreshold: ");
        LIZ2.append(C47O.LIZIZ());
        C34B.LIZIZ("WipeForReplyGestureHelper", X1D.LIZIZ(LIZ2));
    }

    public final void LIZIZ(View view, float f) {
        Object LIZ;
        float f2;
        float f3 = 0.25f * f;
        Iterator it = ((java.util.Set) this.LJI.getValue()).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationX(f3);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("translateRespondingAnimatorViews -> translationX: ");
        LIZ2.append(f);
        LIZ2.append("; finalTranslationX: ");
        LIZ2.append(f3);
        LIZ2.append("; preFinalTranslationX: ");
        LIZ2.append(this.LJ);
        C34B.LIZIZ("WipeForReplyGestureHelper", X1D.LIZIZ(LIZ2));
        int i = 0;
        if (Math.abs(this.LJ) < C47O.LIZIZ() && Math.abs(f3) >= C47O.LIZIZ()) {
            C34B.LIZIZ("WipeForReplyGestureHelper", "invoke vibrator");
            if (view != null) {
                view.performHapticFeedback(0);
            }
        }
        this.LJ = f3;
        View view2 = this.LJII;
        if (view2 == null) {
            return;
        }
        try {
            float abs = Math.abs(f3);
            C62822Ol8 c62822Ol8 = LJIILJJIL;
            LIZ = Float.valueOf(Math.min(abs, ((Number) c62822Ol8.getValue()).floatValue()) / ((Number) c62822Ol8.getValue()).floatValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Float f4 = (Float) LIZ;
        if (f4 != null) {
            f2 = f4.floatValue();
        } else {
            f2 = 0.0f;
        }
        if (f3 == 0.0f) {
            i = 8;
        }
        view2.setVisibility(i);
        view2.setScaleX(f2);
        view2.setScaleY(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r11 != 3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.View r16, X.C47R r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47N.LIZJ(android.view.View, X.47R, android.view.MotionEvent):boolean");
    }
}
