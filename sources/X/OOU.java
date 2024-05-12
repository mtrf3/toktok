package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* loaded from: classes11.dex */
public class OOU extends AbstractC26257ASf {
    public final /* synthetic */ BottomSheetDialogFragment LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View view, float f) {
    }

    public OOU(BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.LIZ = bottomSheetDialogFragment;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            this.LIZ.dismissAfterAnimation();
        }
    }
}
