package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCS extends LCY {
    @Override // X.LCY
    public final AbstractC53958LFq LIZJ() {
        return new C53956LFo();
    }

    @Override // X.LCY
    public final InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        View view = C16970lZ.LIZLLL(C45804HyK.LJIJJ(lcp.LIZ), R.layout.bwj);
        o.LJIIIIZZ(view, "view");
        return new LJ1(view, lcp.LIZJ);
    }
}
