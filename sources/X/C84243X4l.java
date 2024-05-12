package X;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.X4l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84243X4l {
    public final java.util.Map<String, C84242X4k> LIZ = new HashMap();
    public final java.util.Map<String, C84241X4j> LIZIZ = new LinkedHashMap(3);
    public int LIZJ = 3;

    public final boolean LIZIZ(String str) {
        C84242X4k c84242X4k = (C84242X4k) ((HashMap) this.LIZ).get(str);
        if (c84242X4k == null) {
            return false;
        }
        if (c84242X4k.LJII) {
            return true;
        }
        if (System.currentTimeMillis() - c84242X4k.LJ >= X4X.LJ || !c84242X4k.LJI) {
            return false;
        }
        return true;
    }

    public final C84242X4k LIZ(String str, List<HttpHeader> list) {
        C84242X4k c84242X4k;
        synchronized (this.LIZ) {
            c84242X4k = (C84242X4k) ((HashMap) this.LIZ).remove(str);
        }
        if (c84242X4k != null) {
            if (X4P.LJIILIIL(c84242X4k.LIZIZ, list)) {
                try {
                    c84242X4k.LJ();
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (System.currentTimeMillis() - c84242X4k.LJ < X4X.LJ && c84242X4k.LJI) {
                    return c84242X4k;
                }
            }
            try {
                c84242X4k.cancel();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
