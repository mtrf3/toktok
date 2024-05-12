package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F0q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38280F0q {
    public final WeakReference<Context> LJLIL;

    public C38280F0q(WeakReference<Context> weakReference) {
        this.LJLIL = weakReference;
    }

    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            return LJIJJ;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public final void LIZJ(JSONObject jSONObject) {
        Activity LIZ;
        try {
            WeakReference<Context> weakReference = this.LJLIL;
            Context context = null;
            if (weakReference != null) {
                context = weakReference.get();
            }
            if (((!(context instanceof Activity) || (LIZ = C45804HyK.LJIJJ(context)) == null) && (LIZ = LIZ(context)) == null) || !V1B.LJJZZI(LIZ, true)) {
                return;
            }
            String optString = jSONObject.optString("type");
            if (C38354F3m.LJ(optString) || optString.indexOf(58) >= 0) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C47766Ios.LIZ().getSSLocalScheme());
            LIZ2.append("://");
            LIZ2.append(optString);
            C38281F0r c38281F0r = new C38281F0r(X1D.LIZIZ(LIZ2));
            LIZIZ(jSONObject.optJSONObject("args"), c38281F0r);
            C47766Ios.LIZ().startAdsAppActivity(LIZ, c38281F0r.LJ());
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(JSONObject jSONObject, C38281F0r c38281F0r) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    c38281F0r.LIZ(((Integer) obj).intValue(), next);
                } else if (obj instanceof Long) {
                    c38281F0r.LIZIZ(((Long) obj).longValue(), next);
                } else if (obj instanceof Double) {
                    c38281F0r.LIZJ(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    c38281F0r.LIZLLL(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    c38281F0r.LIZLLL(next, obj.toString());
                } else if (obj instanceof JSONArray) {
                    c38281F0r.LIZLLL(next, ((JSONArray) obj).toString());
                } else if (obj instanceof JSONObject) {
                    LIZIZ((JSONObject) obj, c38281F0r);
                }
            }
        }
    }
}
