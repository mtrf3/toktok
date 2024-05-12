package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGP extends C76894UFu {
    public final /* synthetic */ UGO LIZ;

    public UGP(UGO ugo) {
        this.LIZ = ugo;
    }

    @Override // X.UGX
    public final void LJJJJ(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            UGR ugr = this.LIZ.LJLJI;
            if (ugr != null) {
                ValueAnimator valueAnimator = ugr.LJLJI;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    ugr.LJLJI.cancel();
                }
                if (Math.abs(ugr.LJLJLLL - 0.5f) < Float.MIN_NORMAL) {
                    return;
                }
                ugr.LJLJLLL = 0.5f;
                ugr.setAlpha(0.5f);
                return;
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return;
        }
        UGO ugo = this.LIZ;
        if (ugo.LJLJJLL == null) {
            UGR ugr2 = ugo.LJLJI;
            if (ugr2 != null) {
                ugo.LJLJJLL = ugr2.getVisibleRect();
            } else {
                o.LJIJI("mCoverWindow");
                throw null;
            }
        }
        UGR ugr3 = this.LIZ.LJLJI;
        if (ugr3 != null) {
            ugr3.LIZ();
        } else {
            o.LJIJI("mCoverWindow");
            throw null;
        }
    }
}
