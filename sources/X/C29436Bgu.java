package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bgu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29436Bgu {
    public static final /* synthetic */ int LJ = 0;
    public final View.OnClickListener LIZ;
    public final CVT LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    public C29436Bgu(Context context, ACListenerS25S0100000_5 aCListenerS25S0100000_5) {
        this.LIZ = aCListenerS25S0100000_5;
        this.LIZIZ = new CVT(context, null);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d_r, C16880lQ.LLZIL(context), null);
        if (LLLZIIL != null) {
            C16880lQ.LJIIJ(aCListenerS25S0100000_5, LLLZIIL);
        }
        this.LIZJ = LLLZIIL;
        View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.d_q, C16880lQ.LLZIL(context), null);
        if (LLLZIIL2 != null) {
            C16880lQ.LJIIJ(aCListenerS25S0100000_5, LLLZIIL2);
        }
        this.LIZLLL = LLLZIIL2;
    }
}
