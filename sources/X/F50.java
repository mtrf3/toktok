package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class F50 extends AbstractC38521fE {
    public F50() {
        super(3);
    }

    @Override // X.AbstractC38521fE
    public final /* synthetic */ Object LJ(JSONObject jSONObject) {
        List asList;
        String optString = jSONObject.optString("scope");
        String string = JSONObjectProtectorUtils.getString(jSONObject, "client_id");
        long j = JSONObjectProtectorUtils.getLong(jSONObject, "expires_in") * 1000;
        if (TextUtils.isEmpty(optString)) {
            asList = Collections.emptyList();
        } else {
            asList = Arrays.asList(optString.split(" "));
        }
        return new C36909Ee9(j, string, asList);
    }
}
