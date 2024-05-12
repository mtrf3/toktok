package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import defpackage.i0;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class O7C implements InterfaceC61377O6z {
    public static O80 LIZIZ(String str, JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        JSONObject jSONObject2 = new JSONObject(C61367O6p.LIZ().executePost(0, JBR.LJFF(LIZ, C42952GtQ.LIZ, str, LIZ), new TypedByteArray("application/json", jSONObject.toString().getBytes("UTF-8"), new String[0])).execute().LIZIZ);
        O88 o88 = new O88();
        o88.LIZIZ = true;
        o88.LIZ = jSONObject2;
        return new O80(o88);
    }

    public final boolean LIZ(O81 o81, String str, String str2) {
        if (C78983UzD.LJJJI(str) || C78983UzD.LJJJI(str2)) {
            return false;
        }
        if (C1B6.LIZIZ(str2)) {
            return true;
        }
        File file = new File(str2);
        String LJFF = i0.LJFF(str2, ".tmp");
        try {
            if (!C61358O6g.LIZ(str, LJFF)) {
                return false;
            }
            File file2 = new File(LJFF);
            if (file2.renameTo(file)) {
                NPW.LIZJ(Long.valueOf(o81.LIZ), o81.LIZIZ, null, true);
                return true;
            }
            if (file2.exists()) {
                C16880lQ.LLLZZIL(file2);
            }
            NPW.LIZJ(Long.valueOf(o81.LIZ), o81.LIZIZ, null, false);
            return false;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            NPW.LIZJ(Long.valueOf(o81.LIZ), o81.LIZIZ, th.getMessage(), false);
            return false;
        }
    }
}
