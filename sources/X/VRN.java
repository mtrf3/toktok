package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewNG;

/* loaded from: classes15.dex */
public final class VRN extends VRK {
    public final /* synthetic */ LynxOverlayViewNG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VRN(LynxOverlayViewNG lynxOverlayViewNG, Context context) {
        super(context);
        this.LJLIL = lynxOverlayViewNG;
    }

    @Override // X.VRK, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.LJLIL.measureChildren();
    }

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LJLIL.layout();
    }
}
