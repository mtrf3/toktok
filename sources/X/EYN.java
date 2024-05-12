package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class EYN {
    public static final /* synthetic */ int LJII = 0;
    public final int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final java.util.Set<String> LIZLLL = new HashSet();
    public final java.util.Set<String> LJ = new HashSet();
    public final java.util.Set<String> LJFF = new HashSet();
    public final java.util.Set<Pattern> LJI = new HashSet();

    public abstract boolean LIZ(Request request, java.util.Map<String, List<String>> map);

    public abstract void LIZLLL(JSONObject jSONObject);

    static {
        C16880lQ.LJLLJ(EYN.class);
    }

    public EYN(int i) {
        this.LIZ = i;
        this.LIZIZ = i;
    }

    public static boolean LIZIZ(java.util.Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(Request request) {
        if (this.LIZJ && !EYO.LIZJ().LIZJ.get()) {
            return false;
        }
        if (!LIZIZ(this.LIZLLL)) {
            String host = request.getHost();
            if (!TextUtils.isEmpty(host)) {
                Iterator it = ((HashSet) this.LIZLLL).iterator();
                while (it.hasNext()) {
                    if (EZX.LIZIZ(host, (String) it.next())) {
                    }
                }
            }
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            Logger.debug();
            return false;
        }
        int length = path.length();
        if (length > 1) {
            int i = length - 1;
            if (path.substring(i).equals("/")) {
                path = path.substring(0, i);
            }
        }
        if (!LIZIZ(this.LJ) && ((HashSet) this.LJ).contains(path)) {
            return true;
        }
        if (!LIZIZ(this.LJFF)) {
            Iterator it2 = ((HashSet) this.LJFF).iterator();
            while (it2.hasNext()) {
                if (path.startsWith((String) it2.next())) {
                    return true;
                }
            }
        }
        if (!LIZIZ(this.LJI)) {
            Iterator it3 = ((HashSet) this.LJI).iterator();
            while (it3.hasNext()) {
                Pattern pattern = (Pattern) it3.next();
                if (pattern != null && pattern.matcher(path).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJ(JSONObject jSONObject) {
        LJFF(jSONObject.optJSONArray("host_group"), this.LIZLLL);
        LJFF(jSONObject.optJSONArray("equal_group"), this.LJ);
        LJFF(jSONObject.optJSONArray("prefix_group"), this.LJFF);
        JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
        java.util.Set<Pattern> set = this.LJI;
        if (optJSONArray == null || set == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                String string = JSONArrayProtectorUtils.getString(optJSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        ((HashSet) set).add(PatternProtector.compile(string, 2));
                    } catch (Throwable unused) {
                    }
                }
            } catch (JSONException unused2) {
                return;
            }
        }
    }

    public static void LJFF(JSONArray jSONArray, java.util.Set set) {
        if (jSONArray == null || set == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    ((HashSet) set).add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }
}
