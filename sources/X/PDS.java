package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PDS implements InterfaceC10050aP {
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public final void LIZ(String str, Throwable th) {
        String str2;
        PDU LIZJ = PDU.LIZJ();
        LIZJ.getClass();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            String className = stackTrace[0].getClassName();
            String methodName = stackTrace[0].getMethodName();
            int lineNumber = stackTrace[0].getLineNumber();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                C64283PKt.LIZIZ(th, printWriter);
                str2 = stringWriter.toString();
            } catch (Throwable unused) {
                str2 = "";
            }
            printWriter.close();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "exception");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("class_ref", className);
            jSONObject.put("method", methodName);
            jSONObject.put("line_num", lineNumber);
            jSONObject.put("stack", str2);
            jSONObject.put("exception_type", 1);
            jSONObject.put("is_core", 1);
            jSONObject.put("message", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("data", jSONArray);
            if (LIZJ.LJLJJL == null) {
                LIZJ.LJLJJL = C09970aH.LJFF;
            }
            jSONObject2.put("header", LIZJ.LJLJJL);
            P9Z.LIZJ(EZS.LIZ(PDU.LJLJLJ, C09970aH.LJ()), jSONObject2.toString().getBytes(), EnumC63978P9a.GZIP);
        } catch (Throwable unused2) {
        }
    }
}
