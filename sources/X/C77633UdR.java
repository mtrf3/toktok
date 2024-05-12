package X;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UdR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77633UdR {
    public Object LIZ;
    public Object LIZIZ;

    public /* synthetic */ C77633UdR(C68244QqO c68244QqO, String str) {
        this.LIZIZ = c68244QqO;
        this.LIZ = str;
    }

    public /* synthetic */ C77633UdR() {
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
    }

    public /* synthetic */ C77633UdR(C132355Hj c132355Hj, C132365Hk c132365Hk) {
        this.LIZ = c132355Hj;
        this.LIZIZ = c132365Hk;
    }

    public static void LIZIZ(List list, java.util.Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Diamond diamond = (Diamond) it.next();
            Diamond diamond2 = (Diamond) ((LinkedHashMap) map).get(diamond.iapId);
            if (diamond2 != null) {
                diamond.price = diamond2.price;
                diamond.LJLJI = diamond2.LJLJI;
                diamond.LJLILLLLZI = diamond2.LJLILLLLZI;
                diamond.LJLJJL = diamond2.LJLJJL;
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        try {
            ((JSONObject) this.LIZIZ).put(str, obj);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public /* synthetic */ C77633UdR(BaseListResponse baseListResponse, List list) {
        this.LIZ = baseListResponse;
        this.LIZIZ = list;
    }

    public C77633UdR(String str, AbstractC36715Eb1 abstractC36715Eb1) {
        this.LIZ = str;
        this.LIZIZ = abstractC36715Eb1;
    }
}
