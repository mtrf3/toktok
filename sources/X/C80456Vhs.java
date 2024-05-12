package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Vhs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80456Vhs implements InterfaceC17830mx {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ BottomSheetBehavior LIZIZ;

    @Override // X.InterfaceC17830mx
    public final boolean LIZ(View view) {
        this.LIZIZ.setState(this.LIZ);
        return true;
    }

    public C80456Vhs(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.LIZIZ = bottomSheetBehavior;
        this.LIZ = i;
    }
}
