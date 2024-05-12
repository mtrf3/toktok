package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.NoY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60486NoY extends AbstractC26257ASf {
    public final /* synthetic */ C60484NoW LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ BottomSheetBehavior<View> LIZJ;
    public final /* synthetic */ BottomSheetDialogFragment LIZLLL;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View p0, float f) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View p0) {
        View view;
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
            Object obj = this.LIZ.LJLJJL;
            if (!(obj instanceof View) || (view = (View) obj) == null) {
                return;
            }
            view.scrollBy(0, 1);
        }
    }

    public C60486NoY(C60484NoW c60484NoW, C76732zl c76732zl, BottomSheetBehavior<View> bottomSheetBehavior, BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.LIZ = c60484NoW;
        this.LIZIZ = c76732zl;
        this.LIZJ = bottomSheetBehavior;
        this.LIZLLL = bottomSheetDialogFragment;
    }
}
