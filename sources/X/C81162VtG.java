package X;

import android.view.View;

/* renamed from: X.VtG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81162VtG extends AbstractC270614k {
    public final /* synthetic */ ViewOnClickListenerC81161VtF LIZ;

    @Override // X.AbstractC270614k
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        return i;
    }

    public C81162VtG(ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF) {
        this.LIZ = viewOnClickListenerC81161VtF;
    }

    @Override // X.AbstractC270614k
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View view, int i) {
        if (view == this.LIZ.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        if (Math.abs(f) > this.LIZ.LJLILLLLZI.getScaledMaximumFlingVelocity() / 5 || Math.abs(view.getLeft()) >= this.LIZ.getWidth() * 0.2f) {
            ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF = this.LIZ;
            C270714l c270714l = viewOnClickListenerC81161VtF.LJLIL;
            if (f > 0.0f) {
                i = viewOnClickListenerC81161VtF.getWidth();
            } else {
                i = -viewOnClickListenerC81161VtF.getWidth();
            }
            c270714l.LJIJJLI(i, 0, view);
            ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF2 = this.LIZ;
            new AnonymousClass078(viewOnClickListenerC81161VtF2.getContext()).LIZJ(C67230Qa2.getShortMsgID(viewOnClickListenerC81161VtF2.LJLJL), "app_notify_ame");
            ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF3 = this.LIZ;
            viewOnClickListenerC81161VtF3.LJLJJL.postDelayed(viewOnClickListenerC81161VtF3.LJZI, 300L);
        } else {
            this.LIZ.LJLIL.LJIJJLI(0, 0, view);
            ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF4 = this.LIZ;
            viewOnClickListenerC81161VtF4.LJLJJL.postDelayed(viewOnClickListenerC81161VtF4.LJZ, 5000L);
        }
        this.LIZ.postInvalidate();
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.LIZ.setAlpha(1.0f - (Math.abs(i) / this.LIZ.getWidth()));
    }
}
