package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QHc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66736QHc implements QHZ {
    public final HashSet<String> LIZ;
    public final HashMap<String, HashSet<String>> LIZIZ;
    public final QI3 LIZJ;

    public abstract boolean LIZIZ(String str);

    public abstract boolean LIZJ(HashSet<String> hashSet, String str);

    public AbstractC66736QHc(QI3 qi3, HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        this.LIZJ = qi3;
        this.LIZ = hashSet;
        this.LIZIZ = hashMap;
    }

    @Override // X.QHZ
    public final boolean LIZ(QIQ qiq, String str, String str2) {
        HashSet<String> hashSet;
        boolean z = false;
        if (!QIQ.event_v3.equals(qiq)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            HashSet<String> hashSet2 = this.LIZ;
            if (hashSet2 != null && hashSet2.size() > 0) {
                if (!LIZIZ(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            HashMap<String, HashSet<String>> hashMap = this.LIZIZ;
                            if (hashMap != null && hashMap.size() > 0 && this.LIZIZ.containsKey(str) && (hashSet = this.LIZIZ.get(str)) != null && hashSet.size() > 0) {
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    if (LIZJ(hashSet, keys.next())) {
                                        try {
                                            keys.remove();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
            z = true;
        }
        boolean z2 = !z;
        if (z2) {
            this.LIZJ.LIZLLL.LJ(qiq, QIK.f_filter);
            this.LIZJ.LIZLLL.LJIIIIZZ(QIQ.filtered_event, str);
        }
        return z2;
    }
}
