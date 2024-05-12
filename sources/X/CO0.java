package X;

import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CO0 {
    public long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public CO0(String str, String str2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    public final void LIZ(int i, int i2, String str) {
        long j = 0;
        if (i == 0) {
            this.LIZ = SystemClock.uptimeMillis();
        } else {
            long j2 = this.LIZ;
            if (j2 <= 0) {
                return;
            }
            this.LIZ = 0L;
            j = SystemClock.uptimeMillis() - j2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("webview_scene", this.LIZIZ);
        hashMap.put("url", this.LIZJ);
        if (i2 != 0) {
            hashMap.put("error_code", Integer.valueOf(i2));
            hashMap.put("error_msg", str);
        }
        C0K2.LJIIL(j, i, O5Y.LJJL("ttlive_webview_load_status"), hashMap);
        if (i == 2) {
            C0K2.LJII(i, O5Y.LJJLI("ttlive_webview_load_status"), hashMap);
        }
    }
}
