package X;

import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24060x0 {
    public final Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method_id", this.LIZ);
            jSONObject.put("payment_method_token", this.LIZIZ);
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) this.LIZJ).iterator();
            while (it.hasNext()) {
                jSONArray.put(((C24040wy) it.next()).LIZ());
            }
            jSONObject.put("payment_elements", jSONArray);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public /* synthetic */ C24060x0(VideoViewComponent videoViewComponent, C85494Xgw onUIPlayListener) {
        o.LJIIIZ(onUIPlayListener, "onUIPlayListener");
        this.LIZ = videoViewComponent;
        this.LIZIZ = onUIPlayListener;
    }

    public /* synthetic */ C24060x0(String str, List list) {
        this.LIZ = str;
        this.LIZJ = list;
    }
}
