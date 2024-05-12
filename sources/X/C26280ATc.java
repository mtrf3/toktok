package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* renamed from: X.ATc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26280ATc extends AbstractC26257ASf {
    public final /* synthetic */ ATZ LIZ;
    public final /* synthetic */ BottomSheetBehavior<View> LIZIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View p0, float f) {
        o.LJIIIZ(p0, "p0");
    }

    public C26280ATc(ATZ atz, BottomSheetBehavior<View> bottomSheetBehavior) {
        this.LIZ = atz;
        this.LIZIZ = bottomSheetBehavior;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View p0) {
        NZR LIZ;
        View view;
        o.LJIIIZ(p0, "p0");
        NZQ nzq = this.LIZ.LJLLI;
        if (nzq != null && (LIZ = ((NXI) nzq.LJI(NXI.class)).LIZ()) != null && (view = LIZ.getView()) != null) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.LIZIZ;
            ATZ atz = this.LIZ;
            if (view.getScrollY() > 0 && i == 1) {
                bottomSheetBehavior.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                atz.dismiss();
            }
        }
    }
}
