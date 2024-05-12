package X;

import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.7Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186577Tx {
    public static boolean LIZ = true;
    public static final C186587Ty LIZIZ = new C186587Ty();

    public static void LIZ() {
        LIZIZ.LIZJ = System.currentTimeMillis();
        C10K.LIZJ(new Callable() { // from class: X.7Tw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C186587Ty c186587Ty = C186577Tx.LIZIZ;
                long j = c186587Ty.LIZJ;
                if (j >= 0) {
                    long j2 = c186587Ty.LIZIZ;
                    if (j2 > 0 && j - j2 > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", c186587Ty.LIZJ - c186587Ty.LIZIZ);
                        long j3 = c186587Ty.LIZLLL;
                        if (j3 > 0) {
                            jSONObject.put("duration_with_a", j3 - c186587Ty.LIZIZ);
                        }
                        jSONObject.put("enter_from", c186587Ty.LJFF);
                        if (c186587Ty.LIZIZ > 0) {
                            long j4 = c186587Ty.LIZJ - c186587Ty.LIZ;
                            if (j4 > 0 && c186587Ty.LJI) {
                                jSONObject.put("auto_duration", j4);
                                long j5 = c186587Ty.LIZLLL;
                                if (j5 > 0) {
                                    jSONObject.put("auto_duration_with_a", j5 - c186587Ty.LIZ);
                                }
                            }
                        }
                        jSONObject.put("is_first_enter", C186577Tx.LIZ ? 1 : 0);
                        jSONObject.put("panel_type", c186587Ty.LJ);
                        FMX.LJIILJJIL("input_panel_load_time", jSONObject);
                    }
                }
                c186587Ty.LIZ = -1L;
                c186587Ty.LIZJ = -1L;
                c186587Ty.LIZIZ = -1L;
                c186587Ty.LJ = "";
                c186587Ty.LJFF = "";
                c186587Ty.LJI = false;
                C186577Tx.LIZ = false;
                return C76800UCe.LIZ;
            }
        });
    }

    public static void LIZIZ(String str, String str2) {
        if (!CommentSampleRateSetting.LIZ(0.15f, "input_panel_load_time")) {
            return;
        }
        C186587Ty c186587Ty = LIZIZ;
        c186587Ty.LJ = str;
        c186587Ty.LJFF = str2;
        c186587Ty.LIZIZ = System.currentTimeMillis();
    }
}
