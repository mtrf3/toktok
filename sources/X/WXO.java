package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WXO implements WXK {
    public final /* synthetic */ WXN LIZ;

    public WXO(WXN wxn) {
        this.LIZ = wxn;
    }

    @Override // X.WXK
    public final void LIZ(MotionEvent e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LLIIIZ.R0(e.getX(), e.getY());
    }
}
