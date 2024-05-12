package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Imh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47631Imh {
    public final /* synthetic */ int LJLIL;
    public Object LJLILLLLZI;

    public final String toString() {
        switch (this.LJLIL) {
            case 2:
                if (((ArrayList) this.LJLILLLLZI).size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < ((ArrayList) this.LJLILLLLZI).size(); i++) {
                        JSONObject LJJIII = ((InterfaceC46930IbO) ListProtector.get((ArrayList) this.LJLILLLLZI, i)).LJJIII();
                        if (LJJIII != null && LJJIII.has("url") && LJJIII.has("language_id") && LJJIII.has("format") && LJJIII.has("sub_id")) {
                            jSONArray.put(LJJIII);
                        }
                    }
                    try {
                        jSONObject.putOpt("list", jSONArray);
                        return jSONObject.toString();
                    } catch (JSONException e) {
                        TTVideoEngineLog.d(e);
                    }
                }
                return null;
            default:
                return super.toString();
        }
    }

    public void LIZIZ() {
        C63521OwP LIZIZ = C63521OwP.LIZIZ();
        List<Long> list = (List) this.LJLILLLLZI;
        Iterator<InterfaceC63520OwO> it = LIZIZ.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ().LIZLLL(list);
        }
        ((List) this.LJLILLLLZI).clear();
    }

    public C47631Imh(JSONObject jSONObject) {
        JSONArray optJSONArray;
        this.LJLIL = 2;
        this.LJLILLLLZI = new ArrayList();
        if (!jSONObject.has("list") || (optJSONArray = jSONObject.optJSONArray("list")) == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.has("language_id") && optJSONObject.has("format") && optJSONObject.has("url") && optJSONObject.has("sub_id")) {
                ((ArrayList) this.LJLILLLLZI).add(new C46929IbN(optJSONObject));
            }
        }
    }

    public final String LIZ(int i) {
        Object obj = this.LJLILLLLZI;
        String str = null;
        if (obj != null && ((ArrayList) obj).size() > 0) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                JSONObject LJJIII = ((InterfaceC46930IbO) it.next()).LJJIII();
                if (LJJIII.optInt("sub_id") == i) {
                    str = LJJIII.optString("url");
                }
            }
        }
        return str;
    }

    public C47631Imh(int i) {
        this.LJLIL = i;
        if (i != 1) {
            this.LJLILLLLZI = new ArrayList();
        }
    }
}
