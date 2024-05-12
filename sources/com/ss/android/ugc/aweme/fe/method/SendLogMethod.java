package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C247839o3;
import X.C38049EwX;
import X.C38836FMa;
import X.C58530My6;
import X.C58655N0h;
import X.C58657N0j;
import X.C58704N2e;
import X.C9X3;
import X.InterfaceC36488ETs;
import X.InterfaceC38277F0n;
import X.InterfaceC58538MyE;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SendLogMethod extends BaseCommonJavaMethod {
    public final InterfaceC38277F0n LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendLogMethod(C38049EwX c38049EwX, InterfaceC38277F0n adInfo) {
        super(c38049EwX);
        o.LJIIIZ(adInfo, "adInfo");
        this.LJLJI = adInfo;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        long j;
        boolean z;
        SessionInfo LIZ;
        if (jSONObject == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "");
                return;
            }
            return;
        }
        String event = jSONObject.optString("eventName");
        String label = jSONObject.optString("labelName");
        String valueString = jSONObject.optString("value");
        String optString = jSONObject.optString("extValue");
        JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
        long j2 = 0;
        if (!TextUtils.isEmpty(valueString)) {
            j = CastLongProtector.parseLong(valueString);
        } else {
            j = 0;
        }
        if (!TextUtils.isEmpty(optString)) {
            j2 = CastLongProtector.parseLong(optString);
        }
        if (TextUtils.equals(label, "insight_log")) {
            JSONObject jSONObject2 = new JSONObject();
            this.LJLJI.putAdInfo(jSONObject2);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString2 = jSONObject2.optString(next);
                keys.remove();
                if (optJSONObject != null) {
                    optJSONObject.put(next, optString2);
                }
            }
            o.LJIIIIZZ(valueString, "valueString");
            SessionInfo LIZIZ = ((InterfaceC58538MyE) C58530My6.LIZ.getValue()).LIZIZ(valueString);
            if (LIZIZ != null && (LIZ = SessionInfo.LIZ(LIZIZ, null, 15)) != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("session_info", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZ));
                    if (optJSONObject != null) {
                        optJSONObject.put("ad_extra_data", jSONObject3);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        if (optJSONObject != null && optJSONObject.has("is_ad_event") && (TextUtils.equals("1", optJSONObject.optString("is_ad_event")) || optJSONObject.optInt("is_ad_event") == 1 || optJSONObject.optBoolean("is_ad_event"))) {
            z = true;
        } else {
            z = false;
        }
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            if (z) {
                if (TextUtils.equals("click", label)) {
                    C58657N0j.LIZIZ(event, valueString, optJSONObject, j2);
                    optJSONObject.put("has_v3", 1);
                    C38836FMa.LIZIZ(this.mContextRef.get(), event, label, j, j2, optJSONObject);
                } else {
                    o.LJIIIIZZ(event, "event");
                    o.LJIIIIZZ(label, "label");
                    C58655N0h LJ = C58704N2e.LJ(event, label, String.valueOf(j), "", String.valueOf(j2));
                    if (optJSONObject != null) {
                        Iterator<String> keys2 = optJSONObject.keys();
                        o.LJIIIIZZ(keys2, "extJson.keys()");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            LJ.LIZJ(optJSONObject.opt(next2), next2);
                        }
                    }
                    if (TextUtils.equals("report", label)) {
                        C247839o3 c247839o3 = C9X3.LIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("commerce_report_uri_key_");
                        LIZ2.append(AppLog.getServerDeviceId());
                        String LIZIZ2 = c247839o3.LIZIZ(X1D.LIZIZ(LIZ2), "");
                        if (!TextUtils.isEmpty(LIZIZ2)) {
                            LJ.LIZIZ(LIZIZ2, "request_url");
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("commerce_report_uri_key_");
                            LIZ3.append(AppLog.getServerDeviceId());
                            c247839o3.LIZ.erase(X1D.LIZIZ(LIZ3));
                        }
                    }
                    LJ.LJII();
                    if (C58704N2e.LIZJ()) {
                        C38836FMa.LIZIZ(this.mContextRef.get(), event, label, j, j2, optJSONObject);
                    } else if (C58704N2e.LIZIZ()) {
                        if (optJSONObject != null) {
                            try {
                                optJSONObject.put("_ad_staging_flag", "1");
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        C38836FMa.LIZIZ(this.mContextRef.get(), event, label, j, j2, optJSONObject);
                    }
                }
            } else {
                C38836FMa.LIZIZ(weakReference.get(), event, label, j, j2, optJSONObject);
            }
            if (interfaceC36488ETs == null) {
                return;
            }
            interfaceC36488ETs.onSuccess(new JSONObject());
            return;
        }
        if (interfaceC36488ETs == null) {
            return;
        }
        interfaceC36488ETs.LIZ(0, "");
    }
}
