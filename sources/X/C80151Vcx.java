package X;

import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* renamed from: X.Vcx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80151Vcx extends Scroller {
    public C80151Vcx(Context context) {
        super(context, new DecelerateInterpolator());
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, 150);
    }
}
