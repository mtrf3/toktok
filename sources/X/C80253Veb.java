package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Veb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80253Veb implements InterfaceC80252Vea {
    public final /* synthetic */ BottomSheetBehavior LIZ;

    public C80253Veb(BottomSheetBehavior bottomSheetBehavior) {
        this.LIZ = bottomSheetBehavior;
    }

    @Override // X.InterfaceC80252Vea
    public final C16800lI LIZ(View view, C16800lI c16800lI, C80254Vec c80254Vec) {
        this.LIZ.gestureInsetBottom = c16800lI.LIZ.LJII().LIZLLL;
        this.LIZ.updatePeekHeight(false);
        return c16800lI;
    }
}
