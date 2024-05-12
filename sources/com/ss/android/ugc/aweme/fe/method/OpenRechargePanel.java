package com.ss.android.ugc.aweme.fe.method;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C2U8;
import X.C38049EwX;
import X.C58660N0m;
import X.C59650Nb4;
import X.C59652Nb6;
import X.C59653Nb7;
import X.C77591Ucl;
import X.InterfaceC36488ETs;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenRechargePanel extends BaseCommonJavaMethod {
    public OpenRechargePanel() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenRechargePanel(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        long j;
        String str;
        JSONObject jSONObject2;
        WeakReference<Context> weakReference;
        Bundle bundle = new Bundle();
        int i = 0;
        if (jSONObject != null) {
            i = jSONObject.optInt("key_bundle_charge_source", 0);
        }
        long j2 = 0;
        if (jSONObject != null) {
            j = jSONObject.optLong("diamond_count", 0L);
            j2 = jSONObject.optLong("total_diamond_acount_needed", 0L);
        } else {
            j = 0;
        }
        if (jSONObject != null) {
            str = jSONObject.optString("charge_reason");
            jSONObject2 = jSONObject.optJSONObject("track_info");
        } else {
            str = null;
            jSONObject2 = null;
        }
        bundle.putInt("key_bundle_charge_source", i);
        bundle.putString("key_charge_reason", str);
        bundle.putLong("key_bundle_need_coins", j);
        bundle.putLong("key_bundle_total_coins", j2);
        if (i != 5 && (weakReference = this.mContextRef) != null) {
            Context context = weakReference.get();
            if (!(context instanceof ActivityC45651qj)) {
                return;
            }
            C77591Ucl c77591Ucl = new C77591Ucl();
            c77591Ucl.LIZIZ = C58660N0m.LIZ(jSONObject2);
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
            LiveOuterService.LJJJLL().LJJIJIL().createRechargeDialogFragment(activityC45651qj, new C59653Nb7(this), bundle, c77591Ucl).showNow(activityC45651qj.getSupportFragmentManager(), C16880lQ.LJLLJ(OpenRechargePanel.class));
        } else {
            C2U8.LIZ(new C59650Nb4(new C59652Nb6(this), bundle, C58660N0m.LIZ(jSONObject2)));
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess(null);
        }
    }
}
