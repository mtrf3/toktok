package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.client.Request;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EYP extends EYN {
    public final List<String> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    static {
        C16880lQ.LJLLJ(EYP.class);
    }

    public EYP(int i) {
        super(i);
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = false;
        this.LJIIJ = false;
    }

    @Override // X.EYN
    public final void LIZLLL(JSONObject jSONObject) {
        LJ(jSONObject);
        C38092ExE.LJI(this.LJIIIIZZ, jSONObject.optJSONArray("encrypt_query_list"));
        boolean z = false;
        if (jSONObject.optInt("encrypt_body_enabled", 0) > 0) {
            z = true;
        }
        this.LJIIJ = z;
        if (((ArrayList) this.LJIIIIZZ).isEmpty() && !this.LJIIJ) {
            this.LJIIIZ = true;
        }
    }

    @Override // X.EYN
    public final boolean LIZ(Request request, java.util.Map<String, List<String>> map) {
        byte[] bytes;
        boolean z = false;
        if (!this.LJIIIZ && LIZJ(request)) {
            if (this.LJIIJ) {
                request.setBodyEncryptEnabled(true);
                z = true;
            }
            if (!((ArrayList) this.LJIIIIZZ).isEmpty() && !map.containsKey("x-tt-encrypt-queries")) {
                LinkedList linkedList = new LinkedList();
                Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (map.containsKey(next)) {
                        linkedList.add(new Pair(next, ((LinkedHashMap) map).get(next)));
                    }
                }
                if (linkedList.isEmpty()) {
                    return z;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    String str = (String) pair.first;
                    List<String> list = (List) pair.second;
                    if (list != null && list.size() > 0) {
                        for (String str2 : list) {
                            if (sb.length() > 0) {
                                sb.append("&");
                            }
                            C1DI.LIZIZ(sb, str, "=", str2);
                        }
                    }
                }
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(sb2)) {
                    return z;
                }
                try {
                    bytes = sb2.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (bytes != null) {
                    byte[] LIZ = EncryptorUtil.LIZ(bytes.length, bytes);
                    if (LIZ == null) {
                        return z;
                    }
                    String encodeToString = Base64.encodeToString(LIZ, 2);
                    Logger.debug();
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(encodeToString);
                    request.setQueryEncryptEnabled(true);
                    map.put("x-tt-encrypt-queries", linkedList2);
                    Iterator it3 = ((ArrayList) this.LJIIIIZZ).iterator();
                    while (it3.hasNext()) {
                        map.remove(it3.next());
                    }
                    return true;
                }
                return z;
            }
        }
        return z;
    }
}
