package X;

import Y.ARunnableS50S0100000_14;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: X.VtH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC81163VtH implements Runnable {
    public final /* synthetic */ ViewOnClickListenerC81161VtF LJLIL;

    public final void LIZ() {
        ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF = this.LJLIL;
        if (viewOnClickListenerC81161VtF.LJLL && viewOnClickListenerC81161VtF.LJLLILLLL) {
            ViewGroup.LayoutParams layoutParams = viewOnClickListenerC81161VtF.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                try {
                    ((WindowManager.LayoutParams) layoutParams).flags = 128;
                    ((WindowManager) C16880lQ.LLILL(this.LJLIL.getContext(), "window")).updateViewLayout(this.LJLIL, layoutParams);
                    this.LJLIL.LJLJJL.post(new ARunnableS50S0100000_14(this, 162));
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        viewOnClickListenerC81161VtF.performClick();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC81163VtH(ViewOnClickListenerC81161VtF viewOnClickListenerC81161VtF) {
        this.LJLIL = viewOnClickListenerC81161VtF;
    }
}
