package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class LCN extends LCY {
    @Override // X.LCY
    public final AbstractC53958LFq LIZJ() {
        return new C53957LFp();
    }

    @Override // X.LCY
    public final InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        Context context = lcp.LIZ;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        View LIZLLL = C16970lZ.LIZLLL(C45804HyK.LJIJJ(context), R.layout.ayv);
        if (!LX1.LJIILIIL) {
            LX1.LJII = SystemClock.elapsedRealtime() - elapsedRealtime;
        }
        return new LCL((TextView) LIZLLL.findViewById(android.R.id.text1), lcp, LIZLLL);
    }
}
