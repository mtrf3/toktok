package X;

import android.view.View;
import com.ss.android.elearning.lingo.lynx.component.overlay.LynxOverlayViewNG;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class VRL extends VRK {
    public final /* synthetic */ LynxOverlayViewNG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VRL(VNU vnu, LynxOverlayViewNG lynxOverlayViewNG) {
        super(vnu);
        this.LJLIL = lynxOverlayViewNG;
        new LinkedHashMap();
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
