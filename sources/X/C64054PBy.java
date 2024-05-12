package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PBy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64054PBy extends AbstractRunnableC64070PCo {
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Throwable LJLJJLL;

    public final void LIZ() {
        String str = this.LJLJJI;
        String str2 = this.LJLJJL;
        C48152Iv6 c48152Iv6 = new C48152Iv6(C0ON.LIZJ("tag=", str, " message=", str2), this.LJLJJLL);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "exception");
            jSONObject.put("timestamp", System.currentTimeMillis());
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            c48152Iv6.printStackTrace(printWriter);
            Throwable cause = c48152Iv6.getCause();
            if (cause != null) {
                cause.printStackTrace(printWriter);
                Throwable cause2 = cause.getCause();
                if (cause2 != null) {
                    cause2.printStackTrace(printWriter);
                }
            }
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            jSONObject.put("stack", stringWriter2);
            jSONObject.put("exception_type", 1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("_");
            LIZ.append(str2);
            jSONObject.put("message", X1D.LIZIZ(LIZ));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apm_sdk", "apm6_error");
            jSONObject2.put("host_aid", String.valueOf(PC5.LJIIZILJ()));
            jSONObject.put("filters", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject3.put("data", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            C64055PBz.LIZ(jSONObject4, PC5.LJJIFFI());
            QXX qxx = PC5.LJLJJL;
            if (qxx != null) {
                qxx.LLIIJLIL();
                C64055PBz.LIZ(jSONObject4, null);
            }
            jSONObject4.put("os", "Android");
            jSONObject4.put("aid", 2085);
            jSONObject4.put("device_id", PC5.LJIJJLI());
            jSONObject4.put("channel", PC5.LJIJI());
            jSONObject4.put("version_code", PC5.LJJIIJZLJL());
            jSONObject4.put("update_version_code", PC5.LJJIII());
            jSONObject4.put("device_id", PC5.LJIJJLI());
            jSONObject4.put("uid", PC5.LJLJJL.LLJILJILJ());
            jSONObject4.put("process_name", PC5.LJIJJ());
            jSONObject3.put("header", jSONObject4);
            PBT.LIZJ(PBT.LIZJ, jSONObject3.toString().getBytes());
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

    public C64054PBy(String str, String str2, Throwable th) {
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = th;
    }
}
