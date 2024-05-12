package X;

import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* renamed from: X.OOb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61821OOb extends AbstractC26257ASf {
    public final /* synthetic */ Dialog LIZ;
    public final /* synthetic */ BottomSheetBehavior LIZIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public C61821OOb(Dialog dialog, BottomSheetBehavior bottomSheetBehavior) {
        this.LIZ = dialog;
        this.LIZIZ = bottomSheetBehavior;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i != 4) {
            if (i != 5) {
                return;
            }
            this.LIZ.cancel();
            this.LIZIZ.setState(4);
            return;
        }
        this.LIZ.cancel();
    }
}
