package X;

import Y.ARunnableS17S0300000_6;
import android.os.Handler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* renamed from: X.ETr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36487ETr {
    public static void LIZ(InterfaceC37146Ehy interfaceC37146Ehy, InterfaceC36488ETs interfaceC36488ETs, JSONObject jSONObject) {
        if (jSONObject != null) {
            C22780uw.LIZ.LJFF(JSONObjectProtectorUtils.getString(jSONObject, "nonce"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("message", "success");
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS17S0300000_6(interfaceC36488ETs, jSONObject2, interfaceC37146Ehy, 5));
        }
    }
}
