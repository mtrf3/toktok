package X;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q6P {
    public static final JSONObject LIZ(ShareOpenGraphAction shareOpenGraphAction, Q6N q6n) {
        if (shareOpenGraphAction == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.LJ()) {
            jSONObject.put(str, LIZIZ(shareOpenGraphAction.LIZ(str), q6n));
        }
        return jSONObject;
    }

    public static final Object LIZIZ(Object obj, Q6N q6n) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            return q6n.LIZ((SharePhoto) obj);
        }
        if (obj instanceof ShareOpenGraphObject) {
            ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.LJ()) {
                jSONObject.put(str, LIZIZ(shareOpenGraphObject.LIZ(str), q6n));
            }
            return jSONObject;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(LIZIZ(it.next(), q6n));
            }
            return jSONArray;
        }
        return null;
    }
}
