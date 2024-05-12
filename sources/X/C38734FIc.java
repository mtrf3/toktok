package X;

import android.os.SystemClock;
import com.bytedance.keva.KevaMonitor;
import com.bytedance.librarian.Librarian;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.FIc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38734FIc extends KevaMonitor {
    public final C38735FId LIZ = new C38735FId();

    @Override // com.bytedance.keva.KevaMonitor
    public final void loadLibrary(String str) {
        C56672Kh.LIZ().LIZLLL("application_init_keva_cso_duration");
        Librarian.LJ("c++_shared");
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "application_init_keva_cso_duration");
        C56672Kh.LIZ().LIZLLL("application_init_keva_kevaso_duration");
        Librarian.LJ(str);
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        LIZ2.LJFF(SystemClock.uptimeMillis(), "application_init_keva_kevaso_duration");
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void onLoadRepo(String str, int i) {
        super.onLoadRepo(str, i);
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        if (!C64235PIx.LIZ("aweme_keva_monitor_report")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("kv_perf_global_id", C38732FIa.LIZ);
            jSONObject.put("kv_perf_report_type", 0);
            jSONObject.put("kv_perf_value_type", String.valueOf(i));
            jSONObject.put("kv_perf_name", str);
            jSONObject.put("kv_perf_key", str2);
            jSONObject.put("kv_perf_value", obj);
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
            jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
        } catch (Throwable unused) {
        }
        C09900aA.LJ("aweme_keva_monitor_report", jSONObject);
        PJZ.LIZLLL("core_java_custom_exception_monitor", jSONObject.toString(), th);
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportWarning(int i, String str, String str2, Object obj, String str3) {
        if (i >= 6) {
            StringBuilder sb = this.LIZ.get();
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.setLength(0);
            sb.append("this repo is: ");
            sb.append(str);
            sb.append(" key is: ");
            sb.append(str2);
            sb.append(" value is: ");
            sb.append(obj);
            sb.append(" msg is: ");
            sb.append(str3);
            C36922EeM.LIZLLL(3, "AwemeKevaMonitor", sb.toString());
            long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
            C37179EiV.LIZJ(false).execute(new RunnableC36854EdG(str, i, obj, C16880lQ.LLLLIIIILLL().getName(), str3, currentTimeMillis));
            return;
        }
        if (!C64235PIx.LIZ("aweme_keva_monitor_report")) {
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("kv_global_id", C38732FIa.LIZ);
            hashMap.put("kv_report_type", String.valueOf(1));
            hashMap.put("kv_type", String.valueOf(i));
            hashMap.put("kv_name", str);
            if (str2 != null) {
                hashMap.put("kv_key", str2);
            }
            if (obj != null) {
                hashMap.put("kv_value", obj.toString());
            }
            hashMap.put("kv_msg", str3);
            PJZ.LIZJ(new Exception("keva exception"), str, hashMap);
        } catch (Throwable unused) {
        }
    }
}
