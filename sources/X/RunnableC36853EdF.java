package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EdF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36853EdF implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public final void LIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.LJLIL) {
                jSONObject.put("is_guard_success", "false");
            } else {
                jSONObject.put("is_guard_success", "true");
            }
            jSONObject.put("thread_name", this.LJLILLLLZI);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_time", this.LJLJI);
            C09900aA.LJI("wms_stackoverflow_guard", jSONObject, jSONObject2, null);
        } catch (JSONException unused) {
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

    public RunnableC36853EdF(boolean z, String str, long j) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }
}
