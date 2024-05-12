package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.method.RoutePushMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Frt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40309Frt implements InterfaceC27436Apk {
    public final /* synthetic */ RoutePushMethod LJLIL;
    public final /* synthetic */ AbsActivityContainer LJLILLLLZI;

    public C40309Frt(RoutePushMethod routePushMethod, AbsActivityContainer absActivityContainer) {
        this.LJLIL = routePushMethod;
        this.LJLILLLLZI = absActivityContainer;
    }

    @Override // X.InterfaceC27436Apk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Bundle LLJJIJI;
        String string;
        if (i2 == 50000) {
            InterfaceC36488ETs remove = this.LJLIL.LJLJI.remove(Integer.valueOf(i));
            if (remove != null) {
                JSONObject jSONObject = new JSONObject();
                if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null && (string = LLJJIJI.getString("serialized_data")) != null) {
                    try {
                        JSONObject optJSONObject = new JSONObject(string).optJSONObject("data");
                        if (optJSONObject != null) {
                            C78983UzD.LJJLIIIJLLLLLLLZ(jSONObject, optJSONObject);
                        }
                    } catch (JSONException unused) {
                    }
                }
                remove.LIZJ(1, "push callback succeed", jSONObject);
            }
        } else {
            InterfaceC36488ETs remove2 = this.LJLIL.LJLJI.remove(Integer.valueOf(i));
            if (remove2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("resultCode = ");
                LIZ.append(i2);
                remove2.LIZ(-1, X1D.LIZIZ(LIZ));
            }
        }
        this.LJLILLLLZI.LJIILJJIL(this);
        return false;
    }
}
