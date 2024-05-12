package X;

import Y.ARunnableS45S0100000_9;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ2 implements F67 {
    public final /* synthetic */ C54041LIv LJLIL;

    public LJ2(C54041LIv c54041LIv) {
        this.LJLIL = c54041LIv;
    }

    @Override // X.F67
    public final void onChanged() {
        if (!o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
            C37179EiV.LIZ().post(new ARunnableS45S0100000_9(this.LJLIL, 186));
            return;
        }
        C54041LIv c54041LIv = this.LJLIL;
        View view = c54041LIv.LJLJJL;
        if (view != null) {
            view.post(new ARunnableS45S0100000_9(c54041LIv, 187));
        } else {
            o.LJIJI("tabView");
            throw null;
        }
    }
}
