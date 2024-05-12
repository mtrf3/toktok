package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C38350F3i;
import X.C58909NAb;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.NH3;
import X.NTF;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AdThirdTrackMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdThirdTrackMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "sendThirdTrack";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        JSONArray optJSONArray = params.optJSONArray("track_url_list");
        String trackLabel = params.optString("track_label");
        String creativeId = params.optString("creative_id");
        String optString = params.optString("log_extra");
        String optString2 = params.optString("ad_id");
        String optString3 = params.optString("group_id");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            iReturn.LIZ(-1, "empty track_url_list");
            return;
        }
        if (TextUtils.isEmpty(trackLabel) || TextUtils.isEmpty(creativeId)) {
            iReturn.LIZ(-1, "empty trackLabel or creativeId");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString4 = optJSONArray.optString(i);
            o.LJIIIIZZ(optString4, "trackUrlListArr.optString(i)");
            arrayList.add(optString4);
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            o.LJIIIIZZ(trackLabel, "trackLabel");
            o.LJIIIIZZ(creativeId, "creativeId");
            NTF.LJJIIJ(trackLabel, arrayList, C38350F3i.LJJIZ(creativeId), optString, optString3, optString2);
        }
        iReturn.onSuccess(null);
    }
}
