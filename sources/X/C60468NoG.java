package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.NoG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60468NoG extends AbstractC26257ASf {
    public final /* synthetic */ C60466NoE LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ BottomSheetBehavior<View> LIZJ;
    public final /* synthetic */ BottomSheetDialogFragment LIZLLL;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View p0, float f) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View p0) {
        o.LJIIIZ(p0, "p0");
        if (i != 1) {
            if (i != 5) {
                return;
            }
            this.LIZLLL.dismiss();
        } else {
            if (!this.LIZ.getDraggable() || this.LIZIZ.element > 0) {
                this.LIZJ.setState(3);
                return;
            }
            C59614NaU c59614NaU = this.LIZ.LJLJJL;
            if (c59614NaU == null) {
                return;
            }
            c59614NaU.scrollBy(0, 1);
        }
    }

    public C60468NoG(C60466NoE c60466NoE, C76732zl c76732zl, BottomSheetBehavior<View> bottomSheetBehavior, BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.LIZ = c60466NoE;
        this.LIZIZ = c76732zl;
        this.LIZJ = bottomSheetBehavior;
        this.LIZLLL = bottomSheetDialogFragment;
    }
}
