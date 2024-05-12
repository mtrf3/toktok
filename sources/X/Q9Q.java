package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Q9Q extends AbstractC38521fE {
    public Q9Q() {
        super(3);
    }

    @Override // X.AbstractC38521fE
    public final /* synthetic */ Object LJ(JSONObject jSONObject) {
        List asList;
        String string = JSONObjectProtectorUtils.getString(jSONObject, "token_type");
        if ("Bearer".equals(string)) {
            String optString = jSONObject.optString("scope");
            Q9P q9p = new Q9P(JSONObjectProtectorUtils.getString(jSONObject, "access_token"), JSONObjectProtectorUtils.getLong(jSONObject, "expires_in") * 1000, System.currentTimeMillis(), JSONObjectProtectorUtils.getString(jSONObject, "refresh_token"));
            if (TextUtils.isEmpty(optString)) {
                asList = Collections.emptyList();
            } else {
                asList = Arrays.asList(optString.split(" "));
            }
            return new Q9O(q9p, asList);
        }
        throw new JSONException("Illegal token type. token_type=" + string);
    }
}
