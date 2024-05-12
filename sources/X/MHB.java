package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHB extends AbstractC44201HWj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHB(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        o.LJIIIIZZ(activityC45651qj, "requireActivity()");
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (i == 4) {
            C48027It5.LIZLLL("music", "list");
            return false;
        }
        return false;
    }
}
