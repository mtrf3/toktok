package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC243729hQ<V> implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public CallableC243729hQ(int i, int i2, int i3, int i4, long j, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = str;
        this.LJLJJLL = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("request_success", String.valueOf(this.LJLIL));
        linkedHashMap.put("request_type", String.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("request_cnt", String.valueOf(this.LJLJI));
        linkedHashMap.put("retry_cnt", String.valueOf(this.LJLJJI));
        linkedHashMap.put("touch_point_ids", this.LJLJJL);
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            str = abstractC247499nV.LJIIJ();
        } else {
            str = null;
        }
        linkedHashMap.put("region", str);
        linkedHashMap.put("cold_start_cnt", String.valueOf(C249979rV.LIZJ));
        if (C247509nW.LIZIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_login", str2);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("touch_points_request", linkedHashMap);
        }
        int i = this.LJLIL;
        long j = this.LJLJJLL;
        int i2 = this.LJLILLLLZI;
        int i3 = this.LJLJI;
        int i4 = this.LJLJJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV2 != null) {
                str3 = abstractC247499nV2.LJIIJ();
            } else {
                str3 = null;
            }
            jSONObject.put("region", str3);
            jSONObject.put("duration", j);
            jSONObject.put("request_type", i2);
            jSONObject.put("request_cnt", i3);
            jSONObject.put("retry_cnt", i4);
        } catch (JSONException unused) {
        }
        C09900aA.LJI("touchpoint_request_monitor", jSONObject, null, null);
        return C76800UCe.LIZ;
    }
}
