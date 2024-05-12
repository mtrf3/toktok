package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.Q9m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66538Q9m {
    public String LIZ;
    public String LIZIZ;
    public Long LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public java.util.Map<String, String> LJI;

    public C66538Q9m(C65474Pmo c65474Pmo) {
        T2R.LJIILLIIL(c65474Pmo, "request cannot be null");
        this.LJI = Collections.emptyMap();
    }

    public final void LIZ(JSONObject jSONObject) {
        String LIZIZ = C66546Q9u.LIZIZ(jSONObject, "token_type");
        T2R.LJIILL("token type must not be empty if defined", LIZIZ);
        this.LIZ = LIZIZ;
        String LIZJ = C66546Q9u.LIZJ("access_token", jSONObject);
        if (LIZJ != null) {
            T2R.LJIILL("access token cannot be empty if specified", LIZJ);
        }
        this.LIZIZ = LIZJ;
        this.LIZJ = C66546Q9u.LIZ(jSONObject);
        if (jSONObject.has("expires_in")) {
            Long valueOf = Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "expires_in"));
            if (valueOf == null) {
                this.LIZJ = null;
            } else {
                this.LIZJ = Long.valueOf(TimeUnit.SECONDS.toMillis(valueOf.longValue()) + System.currentTimeMillis());
            }
        }
        String LIZJ2 = C66546Q9u.LIZJ("refresh_token", jSONObject);
        if (LIZJ2 != null) {
            T2R.LJIILL("refresh token must not be empty if defined", LIZJ2);
        }
        this.LJ = LIZJ2;
        String LIZJ3 = C66546Q9u.LIZJ("id_token", jSONObject);
        if (LIZJ3 != null) {
            T2R.LJIILL("id token must not be empty if defined", LIZJ3);
        }
        this.LIZLLL = LIZJ3;
        String LIZJ4 = C66546Q9u.LIZJ("scope", jSONObject);
        if (TextUtils.isEmpty(LIZJ4)) {
            this.LJFF = null;
        } else {
            String[] split = LIZJ4.split(" +");
            if (split == null) {
                split = new String[0];
            }
            this.LJFF = C78999UzT.LJIILJJIL(Arrays.asList(split));
        }
        java.util.Set<String> set = QA1.LJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!((HashSet) set).contains(next)) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        this.LJI = C67822lO.LIZ(linkedHashMap, QA1.LJII);
    }
}
