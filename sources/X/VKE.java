package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;

/* loaded from: classes15.dex */
public final class VKE {
    public int LIZ = 9;
    public final OJM<VKF> LIZIZ = new OJM<>();
    public final VKD LIZJ;
    public final Context LIZLLL;
    public boolean LJ;

    public VKE(Context context) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZLLL = LLLLL;
        try {
            this.LIZJ = new VKD(this, LLLLL);
        } catch (Exception e) {
            Logger.throwException(e);
        }
    }
}
