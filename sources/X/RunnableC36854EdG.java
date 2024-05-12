package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EdG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36854EdG implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public final void LIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("repoName", this.LJLIL);
            jSONObject.put("action", this.LJLILLLLZI);
            jSONObject.put("key", this.LJLJI);
            jSONObject.put("thread_name", this.LJLJJI);
            jSONObject.put("ctx_msg", this.LJLJJL);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_time", this.LJLJJLL);
            C09900aA.LJI("keva_async_write_ex", jSONObject, jSONObject2, null);
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

    public RunnableC36854EdG(String str, int i, Object obj, String str2, String str3, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = obj;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = j;
    }
}
