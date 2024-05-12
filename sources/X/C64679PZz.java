package X;

import android.text.TextUtils;
import ee1.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.PZz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64679PZz extends AbstractC64682Pa2 {
    public final java.util.Map<String, String> LIZJ;

    @Override // X.AbstractC64682Pa2
    public final void LIZJ() {
    }

    static {
        C16880lQ.LJLLJ(C64679PZz.class);
    }

    public C64679PZz(JSONObject jSONObject) {
        super(EnumC64681Pa1.REQUEST_HEADER_DISPATCH_STRATEGY);
        this.LIZJ = new HashMap();
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                this.LIZJ.put(next, optString);
            }
        }
    }

    @Override // X.AbstractC64682Pa2
    public final void LIZ(m mVar) {
        if (mVar.LIZLLL != null) {
            for (Map.Entry entry : ((HashMap) this.LIZJ).entrySet()) {
                mVar.LIZLLL.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    @Override // X.AbstractC64682Pa2
    public final String LIZIZ(android.net.Uri uri) {
        return uri.toString();
    }
}
