package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import ee1.m;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.Pa0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64680Pa0 extends AbstractC64682Pa2 {
    public final java.util.Map<String, String> LIZJ;

    @Override // X.AbstractC64682Pa2
    public final void LIZ(m mVar) {
    }

    @Override // X.AbstractC64682Pa2
    public final void LIZJ() {
    }

    static {
        C16880lQ.LJLLJ(C64680Pa0.class);
    }

    public C64680Pa0(JSONObject jSONObject) {
        super(EnumC64681Pa1.STATIC_DISPATCH_STRATEGY);
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
    public final String LIZIZ(android.net.Uri uri) {
        String host = uri.getHost();
        String uri2 = uri.toString();
        String str = (String) ((HashMap) this.LIZJ).get(host);
        if (!TextUtils.isEmpty(str)) {
            Logger.debug();
            return uri2.replaceFirst(host, str);
        }
        return uri2;
    }
}
