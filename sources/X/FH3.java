package X;

import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;

/* loaded from: classes7.dex */
public final class FH3 {
    public static final FH3 LIZLLL = new FH3();
    public final FHP LIZ = C38731FHz.LIZIZ.LIZ.LIZLLL();
    public Gson LIZIZ;
    public volatile m LIZJ;

    public final m LIZ() {
        if (this.LIZJ == null) {
            synchronized (FH3.class) {
                if (this.LIZJ == null) {
                    try {
                        String string = this.LIZ.getString("key_unregistered_libra_config", "{}");
                        if (this.LIZIZ == null) {
                            this.LIZIZ = new Gson();
                        }
                        this.LIZJ = (m) this.LIZIZ.LJI(string, m.class);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        return this.LIZJ;
    }

    public final j LIZIZ(String str) {
        m LIZ = LIZ();
        if (LIZ != null) {
            j LJJIJ = LIZ.LJJIJ(str);
            if (LJJIJ instanceof m) {
                return ((m) LJJIJ).LJJIJ("val");
            }
            return null;
        }
        return null;
    }

    public final synchronized void LIZJ(m mVar) {
        try {
            this.LIZ.LIZIZ("key_unregistered_libra_config", mVar.toString());
            this.LIZJ = null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
