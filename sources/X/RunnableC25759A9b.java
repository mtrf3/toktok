package X;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import com.ss.android.ugc.aweme.relation.experiment.RecUserDialogOptimizationExp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS29S0001000_4;

/* renamed from: X.A9b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25759A9b implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C25765A9h LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    public RunnableC25759A9b(int i, int i2, View view, C25765A9h c25765A9h, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = i;
        this.LJLILLLLZI = view;
        this.LJLJI = c25765A9h;
        this.LJLJJI = i2;
        this.LJLJJL = interfaceC65784Pro;
    }

    public final void LIZ() {
        int i = this.LJLIL;
        if (i == -1) {
            i = this.LJLILLLLZI.getHeight();
        }
        if (LIZIZ(i, this.LJLJJI, this.LJLILLLLZI, this.LJLJI, this.LJLJJL)) {
            return;
        }
        View view = this.LJLILLLLZI;
        C27484AqW.LIZIZ(view, new C25762A9e(i, this.LJLJJI, view, this.LJLJI, this.LJLJJL));
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

    public static final boolean LIZIZ(int i, int i2, View view, C25765A9h c25765A9h, InterfaceC65784Pro interfaceC65784Pro) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        Dialog dialog;
        Window window;
        WindowManager.LayoutParams attributes;
        Window window2;
        WindowManager.LayoutParams attributes2;
        C221018lt.LIZ("RecUserDialogController", "measureView");
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(i, LiveLayoutPreloadThreadPriority.DEFAULT));
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight <= 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("measuredHeight: ");
                LIZ.append(measuredHeight);
                C221018lt.LIZIZ("RecUserDialogController", X1D.LIZIZ(LIZ));
                return false;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("doAdjust: ");
            LIZ2.append(measuredHeight);
            C221018lt.LIZ("RecUserDialogController", X1D.LIZIZ(LIZ2));
            CustomDialogFragment customDialogFragment = c25765A9h.LJLLILLLL;
            if (customDialogFragment != null) {
                Dialog dialog2 = customDialogFragment.getDialog();
                if (dialog2 != null && (window2 = dialog2.getWindow()) != null && (attributes2 = window2.getAttributes()) != null) {
                    i3 = attributes2.height;
                }
                view.requestLayout();
                return true;
            }
            i3 = c25765A9h.LJLLLL;
            int LIZIZ = i3 - ((measuredHeight + i2) + C7MY.LIZIZ(60));
            if (LIZIZ < 0) {
                z = true;
            } else {
                z = false;
            }
            if (customDialogFragment != null) {
                C221018lt.LIZ("RecUserDialogController", "adjustDialogHeightByAnimation");
                if (z ? (i6 = i3 - LIZIZ) > (i7 = c25765A9h.LJLLLL) : (i6 = i3 - LIZIZ) < (i7 = C7MY.LIZIZ(204))) {
                    i6 = i7;
                }
                CustomDialogFragment customDialogFragment2 = c25765A9h.LJLLILLLL;
                if (customDialogFragment2 != null && (dialog = customDialogFragment2.getDialog()) != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null && i6 == attributes.height && ((RecUserDialogOptimizationExp.RecUserDialogOptimizationConfig) RecUserDialogOptimizationExp.LIZJ.getValue()).enableUIOptimizations) {
                    C221018lt.LIZ("RecUserDialogController", "no need to adjust height");
                } else {
                    C76732zl c76732zl = new C76732zl();
                    int i8 = 60 / ((RecUserDialogOptimizationExp.RecUserDialogOptimizationConfig) RecUserDialogOptimizationExp.LIZJ.getValue()).recUserDialogResizeFrequency;
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, LIZIZ);
                    ofInt.setInterpolator(C55953Lxd.LJ());
                    ofInt.setDuration(400L);
                    ofInt.addUpdateListener(new C25761A9d(c76732zl, i8, c25765A9h, z, i3));
                    ofInt.addListener(new C25760A9c(c25765A9h, interfaceC65784Pro, i6));
                    ofInt.start();
                }
            } else {
                if (z ? (i4 = i3 - LIZIZ) > (i5 = c25765A9h.LJLLLL) : (i4 = i3 - LIZIZ) < (i5 = C7MY.LIZIZ(204))) {
                    i4 = i5;
                }
                List<InterfaceC88472Yns<CustomDialogFragment, C76800UCe>> list = c25765A9h.LJLLLLLL;
                if (list != null) {
                    ((ArrayList) list).add(new AqS29S0001000_4(i4, 20));
                }
            }
            view.requestLayout();
            return true;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("error on measureView: ");
            LIZ3.append(e);
            C221018lt.LIZIZ("RecUserDialogController", X1D.LIZIZ(LIZ3));
            return false;
        }
    }
}
