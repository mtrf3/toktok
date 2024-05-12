package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Q9W extends AbstractC38521fE {
    public Q9W() {
        super(3);
    }

    @Override // X.AbstractC38521fE
    public final /* synthetic */ Object LJ(JSONObject jSONObject) {
        return new C66530Q9e(JSONObjectProtectorUtils.getString(jSONObject, "otpId"), JSONObjectProtectorUtils.getString(jSONObject, "otp"));
    }
}
