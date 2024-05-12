package X;

import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.EOw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36362EOw extends EYN {
    public final List<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    static {
        C16880lQ.LJLLJ(C36362EOw.class);
    }

    public C36362EOw(int i) {
        super(i);
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = false;
        this.LJIIJJI = false;
    }

    @Override // X.EYN
    public final void LIZLLL(JSONObject jSONObject) {
        boolean z;
        LJ(jSONObject);
        C38092ExE.LJI(this.LJIIIIZZ, jSONObject.optJSONArray("keep_list"));
        C38092ExE.LJI(this.LJIIIZ, jSONObject.optJSONArray("remove_list"));
        boolean z2 = false;
        if (jSONObject.optInt("protect_background_request", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = z;
        if (jSONObject.optInt("add_background_rm_mark", 0) > 0) {
            z2 = true;
        }
        this.LJIIJJI = z2;
        if (!((ArrayList) this.LJIIIIZZ).isEmpty() && !((ArrayList) this.LJIIIZ).isEmpty()) {
            this.LJIIJ = true;
        }
    }

    @Override // X.EYN
    public final boolean LIZ(Request request, java.util.Map<String, List<String>> map) {
        String str;
        if (this.LJIIJ || !LIZJ(request)) {
            return false;
        }
        if (!((ArrayList) this.LJIIIIZZ).isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map.containsKey("x-tt-encrypt-queries")) {
                linkedHashMap.put("x-tt-encrypt-queries", ((LinkedHashMap) map).get("x-tt-encrypt-queries"));
            }
            Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (map.containsKey(next)) {
                    linkedHashMap.put(next, ((LinkedHashMap) map).get(next));
                }
            }
            ((LinkedHashMap) map).clear();
            map.putAll(linkedHashMap);
            return true;
        }
        if (!((ArrayList) this.LJIIIZ).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
            while (it2.hasNext()) {
                map.remove(it2.next());
            }
            if (request.getUrl() != null) {
                str = request.getUrl();
            } else {
                str = "";
            }
            if (this.LJIIJJI && !str.contains("bgrm")) {
                Iterator it3 = ((ArrayList) this.LJIIIZ).iterator();
                while (it3.hasNext()) {
                    if (str.contains((String) it3.next())) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("1");
                        map.put("bgrm", arrayList);
                        return true;
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
