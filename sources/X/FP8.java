package X;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FP8 implements Callable<JSONObject> {
    public final String LJLIL;
    public final /* synthetic */ FPC LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b9, code lost:
    
        if (r6 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject call() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP8.call():java.lang.Object");
    }

    public static JSONObject LIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put("message", "ok");
            jSONObject.put("scc_reason", str);
            jSONObject.put("scc_passed_time", 0);
            jSONObject.put("scc_logid", "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("label", "allow");
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public FP8(FPC fpc, String str) {
        this.LJLILLLLZI = fpc;
        this.LJLIL = str;
    }
}
