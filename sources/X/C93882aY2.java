package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import kotlin.jvm.internal.o;

/* renamed from: X.aY2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93882aY2 {
    public View LIZ;
    public View LIZIZ;
    public ValueAnimator LIZJ;
    public FrameLayout LIZLLL;
    public EffectHint LJ;

    public C93882aY2() {
        this(0);
    }

    public final void LIZ() {
        if (this.LJ == null) {
            return;
        }
        this.LIZJ.cancel();
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout != null) {
            View view = this.LIZ;
            if (view != null) {
                C16880lQ.LJLLLL(view, frameLayout);
                return;
            } else {
                o.LJIJI("guideLayout");
                throw null;
            }
        }
        o.LJIJI("hintLayoutContainer");
        throw null;
    }

    public C93882aY2(int i) {
        this.LJ = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 5500);
        o.LJIIIIZZ(ofInt, "ValueAnimator.ofInt(0, 5500)");
        this.LIZJ = ofInt;
    }
}
