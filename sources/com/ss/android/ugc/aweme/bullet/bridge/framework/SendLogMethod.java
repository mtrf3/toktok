package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C16880lQ;
import X.C38836FMa;
import X.C40299Frj;
import X.C40300Frk;
import X.C58655N0h;
import X.C58657N0j;
import X.C58704N2e;
import X.C60737Nsb;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SendLogMethod extends BaseBridgeMethod {
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
    public SendLogMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "sendLog";
        setAccess(C40299Frj.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        long j;
        boolean z;
        C40300Frk c40300Frk;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        getContext();
        String event = params.optString("eventName");
        String label = params.optString("labelName");
        String optString = params.optString("value");
        String optString2 = params.optString("extValue");
        JSONObject optJSONObject = params.optJSONObject("extJson");
        C60737Nsb c60737Nsb = this.contextProviderFactory.LIZIZ;
        if (c60737Nsb != null && (c40300Frk = (C40300Frk) c60737Nsb.LIZIZ(C40300Frk.class)) != null && TextUtils.equals(label, "insight_log") && optJSONObject != null) {
            optJSONObject.put("item_id", String.valueOf(c40300Frk.LIZ));
            optJSONObject.put("author_id", String.valueOf(c40300Frk.LIZIZ));
        }
        long j2 = 0;
        if (!TextUtils.isEmpty(optString)) {
            j = CastLongProtector.parseLong(optString);
        } else {
            j = 0;
        }
        if (!TextUtils.isEmpty(optString2)) {
            j2 = CastLongProtector.parseLong(optString2);
        }
        if (optJSONObject != null && optJSONObject.has("is_ad_event") && (TextUtils.equals("1", optJSONObject.optString("is_ad_event")) || optJSONObject.optInt("is_ad_event") == 1 || optJSONObject.optBoolean("is_ad_event"))) {
            z = true;
        } else {
            z = false;
        }
        if (getContext() != null) {
            if (z) {
                if (TextUtils.equals("click", label)) {
                    C58657N0j.LIZIZ(event, optString, optJSONObject, j2);
                    optJSONObject.put("has_v3", 1);
                    C38836FMa.LIZIZ(getContext(), event, label, j, j2, optJSONObject);
                } else {
                    o.LJIIIIZZ(event, "event");
                    o.LJIIIIZZ(label, "label");
                    C58655N0h LJ = C58704N2e.LJ(event, label, String.valueOf(j), "", String.valueOf(j2));
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        o.LJIIIIZZ(keys, "extJson.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            LJ.LIZJ(optJSONObject.opt(next), next);
                        }
                    }
                    LJ.LJII();
                    if (C58704N2e.LIZJ()) {
                        C38836FMa.LIZIZ(getContext(), event, label, j, j2, optJSONObject);
                    } else if (C58704N2e.LIZIZ()) {
                        if (optJSONObject != null) {
                            try {
                                optJSONObject.put("_ad_staging_flag", "1");
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        C38836FMa.LIZIZ(getContext(), event, label, j, j2, optJSONObject);
                    }
                }
            } else {
                C38836FMa.LIZIZ(getContext(), event, label, j, j2, optJSONObject);
            }
            iReturn.onSuccess(new JSONObject());
            return;
        }
        iReturn.LIZ(0, "");
    }
}
