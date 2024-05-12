package com.ss.android.ugc.aweme.fe.method;

import X.AV1;
import X.C36489ETt;
import X.C36490ETu;
import X.C38049EwX;
import X.C38191Eyp;
import X.C65928Pu8;
import X.EF7;
import X.InterfaceC36488ETs;
import android.content.ContentResolver;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AppInfoMethod extends BaseCommonJavaMethod {
    public AppInfoMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AppInfoMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            str = jSONObject.optString("permissionGroup");
        } else {
            str = null;
        }
        for (Map.Entry entry : ((HashMap) C38191Eyp.LIZ(str)).entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        ContentResolver contentResolver = EF7.LIZIZ().getContentResolver();
        if (contentResolver != null) {
            if (TextUtils.equals("time_12_24", "android_id")) {
                if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102003)) {
                    str2 = "";
                } else {
                    if (TextUtils.isEmpty(C36490ETu.LIZ)) {
                        C36490ETu.LIZ = C36489ETt.LIZ(contentResolver);
                    }
                    str2 = C36490ETu.LIZ;
                }
            } else {
                str2 = C36489ETt.LIZ(contentResolver);
            }
        } else if (DateFormat.is24HourFormat(EF7.LIZIZ())) {
            str2 = "24";
        } else {
            str2 = "12";
        }
        jSONObject2.put("time_system", str2);
        jSONObject2.put("code", 1);
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject2);
        }
    }
}
