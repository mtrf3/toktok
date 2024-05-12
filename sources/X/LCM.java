package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCM extends LCY {
    public final String LIZJ;

    public LCM(String mob) {
        o.LJIIIZ(mob, "mob");
        this.LIZJ = mob;
    }

    @Override // X.LCY
    public final InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String str = this.LIZJ;
        Context context = lcp.LIZ;
        c56092Lzs.getClass();
        C56092Lzs.LJIJJ(context, str);
        View LIZLLL = C16970lZ.LIZLLL(C45804HyK.LJIJJ(lcp.LIZ), R.layout.a7a);
        return new LCK((TextView) LIZLLL.findViewById(android.R.id.text1), lcp, LIZLLL);
    }
}
