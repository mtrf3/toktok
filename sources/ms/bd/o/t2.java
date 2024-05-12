package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class t2 {
    public static volatile t2 LIZJ;
    public final Context LIZ;
    public List<Integer> LIZIZ = new ArrayList();

    public t2(Context context) {
        this.LIZ = null;
        this.LIZ = context;
    }

    public static t2 LIZ(Context context) {
        if (LIZJ == null) {
            synchronized (t2.class) {
                if (LIZJ == null) {
                    LIZJ = new t2(context);
                }
            }
        }
        return LIZJ;
    }

    public final int LIZIZ() {
        if (C16880lQ.LJJLIIIJILLIZJL(null, this.LIZ, new IntentFilter((String) k.a(16777217, 0, 0L, "0a0afc", new byte[]{32, 109, 71, 7, 86, 125, 55, 14, 104, 63, 53, 102, 77, 1, 23, 117, 48, 84, 104, 62, 47, 45, 97, 52, 109, 64, 22, 114, 88, 14, 2, 75, 98, 59, 126, 81, 23}))) == null) {
            return -1;
        }
        return Math.round(((r2.getIntExtra((String) k.a(16777217, 0, 0L, "1caa93", new byte[]{44, 100, 4, 16, 10}), -1) / r2.getIntExtra((String) k.a(16777217, 0, 0L, "13e252", new byte[]{51, 50, 23, 74, 15}), -1)) * 100.0f) * 10.0f) / 10;
    }

    public final int LIZJ() {
        Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, this.LIZ, new IntentFilter((String) k.a(16777217, 0, 0L, "2a39ee", new byte[]{34, 109, 68, 95, 85, 123, 53, 14, 107, 103, 55, 102, 78, 89, 20, 115, 50, 84, 107, 102, 45, 45, 98, 108, 110, 70, 20, 114, 91, 86, 0, 75, 97, 99, 125, 87, 21})));
        if (LJJLIIIJILLIZJL == null) {
            return -1;
        }
        return LJJLIIIJILLIZJL.getIntExtra((String) k.a(16777217, 0, 0L, "5e97ca", new byte[]{52, 107, 95, 68, 91, 115, 50}), -1);
    }
}
