package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.SIg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71862SIg extends SJ4 {
    public final C71863SIh LJLJI;

    public C71862SIg(C71863SIh c71863SIh) {
        super(c71863SIh);
        this.LJLJI = c71863SIh;
    }

    @Override // X.SJ4, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        if (this.LJLJI.LLII == 3) {
            return false;
        }
        super.onFling(e1, e2, f, f2);
        return false;
    }
}
