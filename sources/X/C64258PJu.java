package X;

import android.os.Handler;
import org.json.JSONArray;

/* renamed from: X.PJu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64258PJu extends AbstractRunnableC64261PJx {
    public static C64258PJu LJLJI;

    public static void LIZ() {
        C64284PKu LIZ = C64214PIc.LIZ();
        if (LJLJI == null) {
            LJLJI = new C64258PJu(C64214PIc.LIZ().LIZLLL);
        }
        LIZ.LIZJ(LJLJI, 100L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        java.util.Map<String, Object> map;
        try {
            C64214PIc.LIZ().LIZLLL.removeCallbacks(this);
            try {
                map = PK0.LIZIZ().LJ();
            } catch (Throwable unused) {
                map = null;
            }
            if (map != null) {
                try {
                    if (C64257PJt.LJFF(map)) {
                        long j = this.LJLILLLLZI;
                        if (j > 0) {
                            this.LJLIL.postDelayed(this, j);
                        } else {
                            this.LJLIL.post(this);
                        }
                    }
                } catch (Throwable unused2) {
                    return;
                }
            }
            C64256PJs.LIZIZ().LJ(map, new JSONArray());
        } finally {
            if (LIZ) {
            }
        }
    }

    public C64258PJu(Handler handler) {
        super(handler, 30000L);
    }
}
