package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.SIi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71864SIi extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C51553KLd LJLILLLLZI;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (this.LJLIL) {
            C71863SIh c71863SIh = this.LJLILLLLZI.LJLIL.LJLJLJ;
            if (c71863SIh != null) {
                c71863SIh.LLIIIJ.set(c71863SIh.LJLLI);
                c71863SIh.LJIJI(true);
            } else {
                o.LJIJI("controllerImp");
                throw null;
            }
        }
        return super.onSingleTapConfirmed(e);
    }

    public C71864SIi(boolean z, C51553KLd c51553KLd) {
        this.LJLIL = z;
        this.LJLILLLLZI = c51553KLd;
    }
}
