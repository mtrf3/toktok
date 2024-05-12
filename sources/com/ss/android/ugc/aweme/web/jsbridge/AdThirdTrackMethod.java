package com.ss.android.ugc.aweme.web.jsbridge;

import X.C38049EwX;
import X.C38350F3i;
import X.InterfaceC36488ETs;
import X.O8Z;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS16S2000000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AdThirdTrackMethod extends BaseCommonJavaMethod {
    public AdThirdTrackMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AdThirdTrackMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (jSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        String trackLabel = jSONObject.optString("track_label");
        String creativeId = jSONObject.optString("creative_id");
        String optString = jSONObject.optString("log_extra");
        String optString2 = jSONObject.optString("ad_id");
        String optString3 = jSONObject.optString("group_id");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "empty track_url_list");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(trackLabel) || TextUtils.isEmpty(creativeId)) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "empty trackLabel or creativeId");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString4 = optJSONArray.optString(i);
            o.LJIIIIZZ(optString4, "trackUrlListArr.optString(i)");
            arrayList.add(optString4);
        }
        o.LJIIIIZZ(trackLabel, "trackLabel");
        o.LJIIIIZZ(creativeId, "creativeId");
        Long LJJIZ = C38350F3i.LJJIZ(creativeId);
        new AqS16S2000000_10(optString3, optString2, 0);
        O8Z.LIZIZ(trackLabel, arrayList, LJJIZ, optString, null);
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess(null);
        }
    }
}
