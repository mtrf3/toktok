package X;

import android.content.Context;
import com.google.gson.j;
import com.google.gson.m;

/* renamed from: X.Bne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29854Bne {
    public static final String LIZ(String str) {
        Object obj;
        String str2;
        m LJ;
        j LJJIJ;
        String LJJIFFI;
        String LJJIFFI2;
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        try {
            boolean z = false;
            java.util.Map map = (java.util.Map) C09650Zl.LIZIZ.LJI(F9J.LIZIZ(LIZLLL, 0, "xbridge-storage").getString("live_mt_stream_goal_fe_info_storage", "{}"), java.util.Map.class);
            if (map != null) {
                obj = map.get("value");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            if (str2 == null || (LJ = C38393F4z.LJ(str2)) == null || (LJJIJ = LJ.LJJIJ(str)) == null || (LJJIFFI = LJJIJ.LJJIFFI()) == null) {
                return null;
            }
            j LJJIJ2 = LJ.LJJIJ(str);
            if (LJJIJ2 != null && (LJJIFFI2 = LJJIJ2.LJJIFFI()) != null) {
                if (LJJIFFI2.length() > 0) {
                    z = true;
                }
            }
            if (!z) {
                return null;
            }
            return LJJIFFI;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
