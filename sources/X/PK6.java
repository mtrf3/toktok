package X;

import com.bytedance.crash.CrashType;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PK6 implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ java.util.Map LJLJI;
    public final /* synthetic */ java.util.Map LJLJJI;

    public final void LIZ() {
        try {
            PKN LJIL = PKN.LJIL(PK0.LIZ, this.LJLIL, this.LJLILLLLZI);
            PKN LIZ = C64268PKe.LIZLLL().LIZ(CrashType.DART, LJIL);
            if (this.LJLJI != null) {
                JSONObject optJSONObject = LIZ.LIZ.optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                PKN.LJIILJJIL(this.LJLJI, optJSONObject);
                java.util.Map map = this.LJLJJI;
                if (map != null) {
                    PKN.LJIILJJIL(map, optJSONObject);
                }
                LJIL.LJIIJJI("custom", optJSONObject);
            }
            LIZ.LJIIJJI("logcat", C78897Uxp.LJIJJLI(C78596Usy.LJIJI(PK0.LIZ, PK0.LJIIIIZZ())));
            C64248PJk.LIZIZ().LJ(LIZ.LIZ);
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public PK6(long j, String str, java.util.Map map, java.util.Map map2) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = map;
        this.LJLJJI = map2;
    }
}
