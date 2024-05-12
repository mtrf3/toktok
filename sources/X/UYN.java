package X;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYN implements C0A5 {
    public final /* synthetic */ ObjectAnimator LJLIL;
    public final /* synthetic */ ObjectAnimator LJLILLLLZI;

    @Override // X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public UYN(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        this.LJLIL = objectAnimator;
        this.LJLILLLLZI = objectAnimator2;
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        if ((e.getAction() != 1 && e.getAction() != 3) || (rv.getAlpha() == 1.0f && !this.LJLIL.isRunning())) {
            return false;
        }
        if (this.LJLIL.isRunning()) {
            this.LJLIL.cancel();
        }
        this.LJLILLLLZI.start();
        return false;
    }
}
