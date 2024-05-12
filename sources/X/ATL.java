package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATL extends AbstractC26257ASf {
    public final /* synthetic */ ATB LIZ;
    public final /* synthetic */ BottomSheetBehavior<View> LIZIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View p0, float f) {
        o.LJIIIZ(p0, "p0");
    }

    public ATL(ATB atb, BottomSheetBehavior<View> bottomSheetBehavior) {
        this.LIZ = atb;
        this.LIZIZ = bottomSheetBehavior;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View p0) {
        o.LJIIIZ(p0, "p0");
        if (this.LIZ.LLD && i == 4) {
            this.LIZIZ.setState(3);
        }
    }
}
