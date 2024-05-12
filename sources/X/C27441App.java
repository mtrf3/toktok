package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* renamed from: X.App, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27441App extends AbstractC26257ASf {
    public final /* synthetic */ BottomSheetBehavior<View> LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public C27441App(BottomSheetBehavior<View> bottomSheetBehavior) {
        this.LIZ = bottomSheetBehavior;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i == 1) {
            this.LIZ.setState(3);
        }
    }
}
