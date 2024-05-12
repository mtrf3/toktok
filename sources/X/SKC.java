package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class SKC extends SLJ {
    @Override // X.SLJ
    public final boolean LL() {
        if (C00F.LIZ(31744, 0, "anti_bullying_entrance", true) <= 0) {
            return false;
        }
        return true;
    }

    public SKC(Context context) {
        super(context);
        SK9 sk9 = new SK9();
        sk9.LJIIJJI = true;
        AbstractC71913SKf.LIZJ(sk9, R.string.edu);
        sk9.LJ = Integer.valueOf(R.string.ed8);
        sk9.LJIIIIZZ = new AqS178S0100000_12(context, 477);
        LJLLLLLL(sk9.LIZ());
    }
}
