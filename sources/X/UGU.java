package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGU extends C76894UFu {
    public final /* synthetic */ UGT LIZ;

    public UGU(UGT ugt) {
        this.LIZ = ugt;
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
            UGV ugv = this.LIZ.LJLJI;
            if (ugv != null) {
                ValueAnimator valueAnimator = ugv.LJLJI;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    ugv.LJLJI.cancel();
                }
                if (Math.abs(ugv.LJLJLLL - 0.5f) < Float.MIN_NORMAL) {
                    return;
                }
                ugv.LJLJLLL = 0.5f;
                ugv.setAlpha(0.5f);
                return;
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return;
        }
        UGT ugt = this.LIZ;
        if (ugt.LJLJJL == null) {
            UGV ugv2 = ugt.LJLJI;
            if (ugv2 != null) {
                ugt.LJLJJL = ugv2.getVisibleRect();
            } else {
                o.LJIJI("mCoverWindow");
                throw null;
            }
        }
        UGV ugv3 = this.LIZ.LJLJI;
        if (ugv3 != null) {
            ugv3.LIZ();
        } else {
            o.LJIJI("mCoverWindow");
            throw null;
        }
    }
}
