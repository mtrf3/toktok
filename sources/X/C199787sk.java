package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.7sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199787sk implements C0A5 {
    public float LJLIL;
    public float LJLILLLLZI;

    @Override // X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        int action = e.getAction();
        if (action != 0) {
            if (action != 2) {
                return false;
            }
            float x = e.getX();
            float y = e.getY();
            float f = x - this.LJLIL;
            float f2 = y - this.LJLILLLLZI;
            if (Math.abs(f) >= Math.abs(f2) || f2 <= ViewConfiguration.get(rv.getContext()).getScaledTouchSlop()) {
                return false;
            }
            throw null;
        }
        this.LJLIL = e.getX();
        this.LJLILLLLZI = e.getY();
        throw null;
    }
}
