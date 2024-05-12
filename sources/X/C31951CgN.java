package X;

import Y.AfS20S1100000_5;
import Y.IDhS98S0100000_5;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: X.CgN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31951CgN {
    public static volatile C31951CgN LIZJ;
    public final C0EG LIZ;
    public final java.util.Map<String, Object> LIZIZ;

    public C31951CgN(Context context) {
        try {
            C0EG c0eg = this.LIZ;
            if (c0eg != null) {
                c0eg.close();
                this.LIZ = null;
            }
            C0EG LJFF = C0EG.LJFF(LIZ(context));
            this.LIZ = LJFF;
            java.util.Map<String, Object> map = (java.util.Map) C36538EVq.LIZJ(LJFF, "lruEntries");
            this.LIZIZ = map;
            if (map != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("entries: ");
                LIZ.append(map.size());
                C0NB.LJ("yyy", X1D.LIZIZ(LIZ));
            }
        } catch (IOException unused) {
        }
    }

    public static File LIZ(Context context) {
        String path;
        if (("mounted".equals(C16880lQ.LLLLLLLZIL()) || !Environment.isExternalStorageRemovable()) && C16880lQ.LLIIIZ(context) != null) {
            path = C16880lQ.LLIIIZ(context).getPath();
        } else {
            path = C16880lQ.LLIIIL(context).getPath();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(path);
        return new File(JBR.LJFF(LIZ, File.separator, "shareClikedCache", LIZ));
    }

    public static C31951CgN LIZIZ(Context context) {
        if (LIZJ == null) {
            synchronized (C31951CgN.class) {
                if (LIZJ == null) {
                    LIZJ = new C31951CgN(context);
                }
            }
        }
        return LIZJ;
    }

    public final void LIZJ(long j, String str) {
        AbstractC73672Svk.LJJIJIL(Long.valueOf(j)).LJJIII(new IDhS98S0100000_5(this, 3), false).LJIJJLI(new AfS20S1100000_5(this, str, 5)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new C31952CgO(str, j));
    }
}
