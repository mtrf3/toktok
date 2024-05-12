package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCO extends LCY {
    @Override // X.LCY
    public final AbstractC53958LFq LIZJ() {
        return new FollowTabViewLifecycleObserver();
    }

    @Override // X.LCY
    public final InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        View view;
        if (C35138Dqg.LIZ()) {
            view = C16970lZ.LIZLLL(C45804HyK.LJIJJ(lcp.LIZ), R.layout.b04);
        } else {
            view = C16970lZ.LIZLLL(C45804HyK.LJIJJ(lcp.LIZ), R.layout.b03);
        }
        o.LJIIIIZZ(view, "view");
        return new LCJ(view, lcp.LIZJ);
    }
}
