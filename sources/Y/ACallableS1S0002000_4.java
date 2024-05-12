package Y;

import X.AbstractC247499nV;
import X.C09900aA;
import X.C10I;
import X.C10K;
import X.C247509nW;
import X.C249979rV;
import X.C76800UCe;
import X.C95J;
import X.InterfaceC247459nR;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ACallableS1S0002000_4 implements Callable {
    public final int $t;
    public int i0;
    public int i1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS1S0002000_4 aCallableS1S0002000_4) {
        String str;
        String str2;
        String str3;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("request_type", String.valueOf(aCallableS1S0002000_4.i0));
            linkedHashMap.put("request_cnt", String.valueOf(aCallableS1S0002000_4.i1));
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str2 = abstractC247499nV.LJIIJ();
            } else {
                str2 = null;
            }
            linkedHashMap.put("region", str2);
            if (C247509nW.LIZIZ()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", str3);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C249979rV.LIZJ));
            interfaceC247459nR.LIZIZ("touch_point_start_request", linkedHashMap);
        }
        int i = aCallableS1S0002000_4.i0;
        int i2 = aCallableS1S0002000_4.i1;
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV2 != null) {
                str = abstractC247499nV2.LJIIJ();
            } else {
                str = null;
            }
            jSONObject.put("region", str);
            jSONObject.put("request_type", i);
            jSONObject.put("request_cnt", i2);
        } catch (JSONException unused) {
        }
        C09900aA.LJI("touchpoint_start_request_monitor", jSONObject, null, null);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS1S0002000_4 aCallableS1S0002000_4) {
        INetworkApi LJFF;
        C10K<String> requestTouchPointClick;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null || (LJFF = interfaceC247459nR.LJFF()) == null || (requestTouchPointClick = LJFF.requestTouchPointClick(aCallableS1S0002000_4.i0, 2, aCallableS1S0002000_4.i1)) == null) {
            return null;
        }
        return requestTouchPointClick.LJ(new C10I() { // from class: X.9nS
            @Override // X.C10I
            public final Object then(C10K c10k) {
                return c10k;
            }
        }, C10K.LJI, null);
    }

    public static final Object call$2(ACallableS1S0002000_4 aCallableS1S0002000_4) {
        INetworkApi LJFF;
        C10K<String> requestTouchPointShow;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null || (LJFF = interfaceC247459nR.LJFF()) == null || (requestTouchPointShow = LJFF.requestTouchPointShow(aCallableS1S0002000_4.i0, aCallableS1S0002000_4.i1)) == null) {
            return null;
        }
        return requestTouchPointShow.LJ(new C10I() { // from class: X.9iJ
            @Override // X.C10I
            public final Object then(C10K c10k) {
                return c10k;
            }
        }, C10K.LJI, null);
    }

    public ACallableS1S0002000_4(int i, int i2, int i3) {
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
