package X;

import android.content.Context;
import android.widget.OverScroller;

/* loaded from: classes15.dex */
public final class VTZ extends OverScroller {
    public VTZ(Context context, InterpolatorC79786VTa interpolatorC79786VTa) {
        super(context, interpolatorC79786VTa);
    }

    @Override // android.widget.OverScroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, Math.min(300, i5));
    }
}
