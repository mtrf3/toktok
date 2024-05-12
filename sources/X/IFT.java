package X;

import Y.ACallableS111S0100000_8;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IFT {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static int LJ = -1;
    public static String LJFF = "";
    public static final AtomicBoolean LJI = new AtomicBoolean(false);

    public static final void LIZ() {
        if (LJI.getAndSet(true) || LJ < 0 || LIZ < 0 || LIZIZ < 0 || LIZJ < 0 || TextUtils.isEmpty(LJFF)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adver_first_show_duration", String.valueOf(LIZ));
        long j = LIZJ;
        long j2 = LIZIZ;
        if (j - j2 > 0) {
            jSONObject.put("adver_close_duration", String.valueOf(j - j2));
        }
        if (LJ == 2) {
            long j3 = LIZLLL;
            long j4 = LIZJ;
            if (j3 - j4 > 0 && j3 - j4 < 600000) {
                jSONObject.put("feed_first_show_duration", String.valueOf(j3 - j4));
            }
        }
        jSONObject.put("adv_status", LJFF);
        jSONObject.put("adver_type", String.valueOf(LJ));
        C10K.LIZJ(new ACallableS111S0100000_8(jSONObject, 23));
    }

    public static final void LIZIZ(long j, String str) {
        LIZJ = j;
        LJFF = str;
        if (LJ == 1) {
            LIZ();
        }
    }
}
