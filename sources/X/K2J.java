package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K2J extends C1BY {
    @Override // X.C0A5
    public final boolean LIZJ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
        if (e.getAction() == 0) {
            C2U8.LIZ(new IKO());
            return false;
        }
        return false;
    }
}
