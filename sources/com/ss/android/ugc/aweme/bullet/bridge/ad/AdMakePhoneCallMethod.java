package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.AAX;
import X.AnonymousClass114;
import X.C113504cs;
import X.C16880lQ;
import X.C45804HyK;
import X.C58655N0h;
import X.C58704N2e;
import X.C59284NOm;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdMakePhoneCallMethod extends BaseBridgeMethod {
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
    public AdMakePhoneCallMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "adMakePhoneCall";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Aweme aweme;
        int intValue;
        Activity LJIJJ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (!params.has("phoneNumber")) {
            iReturn.LIZ(0, "phone number is empty");
            return;
        }
        String phoneNumber = params.optString("phoneNumber");
        String optString = params.optString("enterFrom");
        if (optString == null) {
            optString = "landing_page";
        }
        Context context = (Context) this.contextProviderFactory.LIZJ(Context.class);
        HashMap<String, Integer> hashMap = AAX.LIZ;
        Integer num = hashMap.get(phoneNumber);
        C59284NOm LIZ = C113504cs.LIZ();
        AwemeRawAd awemeRawAd = null;
        if (LIZ != null) {
            aweme = LIZ.LJIIL;
        } else {
            aweme = null;
        }
        if (num != null) {
            int intValue2 = num.intValue();
            int i = 8;
            try {
                SettingsManager.LIZLLL().getClass();
                i = SettingsManager.LJ("ad_phone_call_restrict_times", 8);
            } catch (Throwable unused) {
            }
            if (intValue2 >= i) {
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                    AnonymousClass114.LIZ(LJIJJ, R.string.cfp);
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    C58655N0h LIZLLL = C58704N2e.LIZLLL(optString, "othershow", awemeRawAd);
                    LIZLLL.LIZJ("tooltip", "refer");
                    LIZLLL.LJI();
                    iReturn.LIZ(0, "frequency control");
                    return;
                }
                return;
            }
        }
        o.LJIIIIZZ(phoneNumber, "phoneNumber");
        if (num == null) {
            intValue = 1;
        } else {
            intValue = num.intValue() + 1;
        }
        hashMap.put(phoneNumber, Integer.valueOf(intValue));
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", phoneNumber, null));
        intent.putExtra("pns.sandbox.dataflow_id", 1207964164);
        if (context == null) {
            iReturn.LIZ(0, "Context not provided in host");
            return;
        }
        AAX.LIZIZ = System.currentTimeMillis();
        AAX.LIZJ = optString;
        C16880lQ.LIZJ(context, intent);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C58704N2e.LIZLLL(optString, "leave_tt", awemeRawAd).LJI();
        iReturn.onSuccess(1);
    }
}
