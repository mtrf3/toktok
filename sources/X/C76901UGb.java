package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.UGb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76901UGb extends C76902UGc {
    public final /* synthetic */ CropActivity LIZ;

    public C76901UGb(CropActivity cropActivity) {
        this.LIZ = cropActivity;
    }

    @Override // X.InterfaceC76904UGe
    public final void LJJJJ(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C76900UGa c76900UGa = this.LIZ.LJLJI;
            if (c76900UGa != null) {
                ValueAnimator valueAnimator = c76900UGa.LJLJI;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    c76900UGa.LJLJI.cancel();
                }
                if (Math.abs(c76900UGa.LJLJLLL - 0.5f) < Float.MIN_NORMAL) {
                    return;
                }
                c76900UGa.LJLJLLL = 0.5f;
                c76900UGa.setAlpha(0.5f);
                return;
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return;
        }
        CropActivity cropActivity = this.LIZ;
        if (cropActivity.LLFF == null) {
            C76900UGa c76900UGa2 = cropActivity.LJLJI;
            if (c76900UGa2 != null) {
                cropActivity.LLFF = c76900UGa2.getVisibleRect();
            } else {
                o.LJIJI("mCoverWindow");
                throw null;
            }
        }
        C76900UGa c76900UGa3 = this.LIZ.LJLJI;
        if (c76900UGa3 != null) {
            c76900UGa3.LIZ();
        } else {
            o.LJIJI("mCoverWindow");
            throw null;
        }
    }
}
