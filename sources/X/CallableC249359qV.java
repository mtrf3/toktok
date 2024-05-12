package X;

import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9qV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallableC249359qV implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public /* synthetic */ CallableC249359qV(int i, boolean z, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("request", "request");
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            jSONObject.put("curCount", i2);
            jSONObject2.put("success", 1);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZJ("aweme_favorite_list_data_log", jSONObject2);
        return null;
    }
}
