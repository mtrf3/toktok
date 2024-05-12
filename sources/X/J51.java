package X;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J51 {
    public static boolean LIZ = false;
    public static float LIZIZ;
    public static J52 LIZJ;

    public static void LIZ(float f, int i, int i2, long j) {
        J52 j52;
        J52 j522;
        if (!LIZ || (j52 = LIZJ) == null) {
            return;
        }
        j52.LJ = i;
        j52.LJIIIIZZ = j;
        j52.LJI = i2;
        j52.LJII = f;
        V0R v0r = V0Q.Default;
        if (v0r.nextFloat() < J53.LIZLLL && v0r.nextFloat() < LIZIZ && (j522 = LIZJ) != null) {
            JSONObject LIZJ2 = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "ohr_android");
            LIZJ2.put("duration", j522.LJIIIIZZ - j522.LIZ);
            LIZJ2.put("data_cost", j522.LIZIZ);
            LIZJ2.put("pre_cost", j522.LIZJ);
            LIZJ2.put("infer_cost", j522.LIZLLL);
            LIZJ2.put("success", j522.LJ);
            LIZJ2.put("sdk_success", j522.LJFF);
            LIZJ2.put("s_result", String.valueOf(j522.LJI));
            LIZJ2.put("f_result", Float.valueOf(j522.LJII));
            FMX.LJIILJJIL("ml_scene_run", LIZJ2);
        }
        LIZJ = null;
    }
}
