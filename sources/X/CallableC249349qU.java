package X;

import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9qU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallableC249349qU implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Exception LJLJI;

    public /* synthetic */ CallableC249349qU(int i, Exception exc, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String th;
        String th2;
        int i = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        Exception exc = this.LJLJI;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("pageType", i);
            jSONObject.put("loadMore", z);
            if (exc instanceof C38333F2r) {
                th2 = ((C38333F2r) exc).getResponse();
            } else {
                th2 = exc.toString();
            }
            jSONObject.put("errorMsg", th2);
            jSONObject2.put("success", 0);
            jSONObject2.put("errorResponse", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZJ("aweme_favorite_list_data_log", jSONObject2);
        String str = "response:fail:" + C236949Rq.LIZ(i);
        C188727au c188727au = new C188727au();
        c188727au.LJFF(Boolean.valueOf(z), "loadMore");
        if (exc instanceof C38333F2r) {
            th = ((C38333F2r) exc).getResponse();
        } else {
            th = exc.toString();
        }
        c188727au.LJIIIZ("errorMsg", th);
        C36922EeM.LIZLLL(4, str, c188727au.LIZ.toString());
        return null;
    }
}
