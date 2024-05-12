package X;

import android.content.Context;
import android.widget.Scroller;
import e32.c;

/* loaded from: classes15.dex */
public class VZ8 extends Scroller {
    public final /* synthetic */ c LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VZ8(c cVar, Context context) {
        super(context);
        this.LIZ = cVar;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.LIZ.LJLJJLL);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.LIZ.LJLJJLL);
    }
}
