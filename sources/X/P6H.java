package X;

import com.lynx.canvas.KryptonApp;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class P6H {
    public final HashMap<Long, KryptonApp> LIZ = new HashMap<>();

    public final synchronized KryptonApp LIZ(long j) {
        KryptonApp kryptonApp;
        if (j != 0) {
            kryptonApp = this.LIZ.get(new Long(j));
        } else {
            kryptonApp = null;
        }
        return kryptonApp;
    }
}
