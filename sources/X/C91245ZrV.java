package X;

import android.content.Context;
import android.widget.Scroller;

/* renamed from: X.ZrV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91245ZrV extends Scroller {
    public final InterpolatorC91243ZrT LIZ;
    public final int LIZIZ;
    public boolean LIZJ;

    public C91245ZrV(Context context, InterpolatorC91243ZrT interpolatorC91243ZrT) {
        super(context, interpolatorC91243ZrT);
        this.LIZIZ = 600;
        this.LIZ = interpolatorC91243ZrT;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        if (this.LIZJ) {
            i5 = this.LIZIZ;
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
