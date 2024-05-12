package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PFE implements Runnable {
    public final /* synthetic */ long[] LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL = "";

    public final void LIZ() {
        try {
            String LIZJ = C25500zK.LIZJ(this.LJLILLLLZI, this.LJLIL);
            if (TextUtils.isEmpty(LIZJ)) {
                return;
            }
            long j = this.LJLJI - this.LJLJJI;
            JSONObject LIZ = C64125PEr.LIZLLL().LIZ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
            jSONObject.put("block_duration", j);
            jSONObject.put("stack", LIZJ);
            jSONObject.put("stack_key", "1048574\n");
            jSONObject.put(WM7.SCENE_SERVICE, "launchTrace");
            jSONObject.put("cost_time", j);
            jSONObject.put("method_time", j);
            jSONObject.put("message", "launchTrace");
            jSONObject.put("event_type", "lag_drop_frame");
            JSONObject LIZJ2 = PGQ.LIZ().LIZJ(true);
            LIZJ2.put("crash_section", C09970aH.LJI(System.currentTimeMillis()));
            LIZJ2.put("trace_type", "launchTrace");
            LIZJ2.put("launchMode", String.valueOf(this.LJLJJL));
            LIZJ2.put("customLaunchMode", this.LJLJJLL);
            jSONObject.put("custom", LIZ);
            jSONObject.put("filters", LIZJ2);
            C64089PDh.LJIIJ().LIZLLL(new PEE("drop_frame_stack", jSONObject));
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

    public PFE(long[] jArr, long j, long j2, long j3, int i) {
        this.LJLIL = jArr;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = i;
    }
}
