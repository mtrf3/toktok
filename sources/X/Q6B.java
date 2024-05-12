package X;

import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class Q6B implements Q8K {
    public static final Q6A LIZIZ = new Q6A();
    public static final java.util.Map<Integer, Q6C> LIZJ = new HashMap();
    public final java.util.Map<Integer, Q6C> LIZ = new HashMap();

    @Override // X.Q8K
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Q6C q6c;
        Q6C q6c2 = (Q6C) ((HashMap) this.LIZ).get(Integer.valueOf(i));
        if (q6c2 == null) {
            synchronized (LIZIZ) {
                q6c = (Q6C) ((HashMap) LIZJ).get(Integer.valueOf(i));
            }
            if (q6c == null) {
                return false;
            }
            return q6c.LIZ(i2, intent);
        }
        return q6c2.LIZ(i2, intent);
    }
}
