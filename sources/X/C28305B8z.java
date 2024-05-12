package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.B8z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28305B8z extends AbstractC65781Prl implements InterfaceC88472Yns<Object, String> {
    public static final C28305B8z LJLIL = new C28305B8z();

    public C28305B8z() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Object obj) {
        String str;
        if (obj != null) {
            if ((obj instanceof JSONObject) && ((JSONObject) obj).has("record_id")) {
                try {
                    str = JSONObjectProtectorUtils.getString((JSONObject) obj, "record_id");
                } catch (JSONException unused) {
                }
            }
            str = "";
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
