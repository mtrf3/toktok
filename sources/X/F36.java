package X;

import Y.ARunnableS42S0100000_6;
import android.os.Looper;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F36 {
    public K1E LIZ = new F34();

    public static void LIZIZ(F38 f38) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            ((AbstractExecutorService) C38160EyK.LIZ()).submit(new ARunnableS42S0100000_6(f38, 80));
            return;
        }
        C51029K0z.LJJIJ(f38);
    }

    public static void LIZ(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, K1E k1e) {
        F37 f37 = new F37(str3);
        f37.LIZ = str;
        f37.LIZIZ = str2;
        f37.LIZLLL = jSONObject;
        f37.LJ = jSONObject2;
        f37.LJFF = jSONObject3;
        f37.LJI = jSONObject4;
        f37.LJII = z;
        f37.LJIIIIZZ = k1e;
        LIZIZ(f37.LIZ());
    }
}
