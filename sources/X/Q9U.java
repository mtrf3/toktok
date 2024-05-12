package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.linecorp.linesdk.LineProfile;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Q9U extends AbstractC38521fE {
    public Q9U() {
        super(3);
    }

    @Override // X.AbstractC38521fE
    public final /* synthetic */ Object LJ(JSONObject jSONObject) {
        android.net.Uri parse;
        String optString = jSONObject.optString("pictureUrl", null);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "userId");
        String string2 = JSONObjectProtectorUtils.getString(jSONObject, "displayName");
        if (optString == null) {
            parse = null;
        } else {
            parse = UriProtector.parse(optString);
        }
        return new LineProfile(parse, string, string2, jSONObject.optString("statusMessage", null));
    }
}
