package com.ss.android.ugc.aweme.fe.method;

import X.C0H1;
import X.C16880lQ;
import X.C247929oC;
import X.C38049EwX;
import X.C40925G4j;
import X.C40926G4k;
import X.C78450Uqc;
import X.C78451Uqd;
import X.HG3;
import X.InterfaceC36488ETs;
import X.InterfaceC65895Ptb;
import X.RBX;
import Y.IDeS96S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LoginMethod extends BaseCommonJavaMethod {
    public final boolean LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static void LIZJ(InterfaceC36488ETs interfaceC36488ETs) {
        JSONObject jSONObject = new JSONObject();
        try {
            C247929oC.LJIL(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject);
        }
    }

    public final void LIZIZ(InterfaceC36488ETs interfaceC36488ETs) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "loginCanceled");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject2.put("args", jSONObject3);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        sendEvent("H5_nativeEvent", jSONObject2, 3);
    }

    public LoginMethod(C38049EwX c38049EwX, boolean z) {
        super(c38049EwX);
        this.LJLJI = z;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity activity;
        Context actContext = getActContext();
        if (!(actContext instanceof Activity) || (activity = (Activity) actContext) == null || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("enter_from", "h5");
        String optString2 = jSONObject.optString("enter_method", "");
        if (!((RBX) HG3.LJIILL()).isLogin() || o.LJ("find_account", optString)) {
            String optString3 = jSONObject.optString("platform", "");
            o.LJIIIIZZ(optString3, "params.optString(PLATFORM, \"\")");
            if (!TextUtils.isEmpty(optString3)) {
                for (C40926G4k c40926G4k : HG3.LJIIIIZZ().getAllSupportedLoginPlatform()) {
                    if (TextUtils.equals(optString3, c40926G4k.LJLILLLLZI)) {
                        Bundle LIZ = C0H1.LIZ("setting_page", "feedback_faq_list_page");
                        LIZ.putBoolean("is_login", this.LJLJI);
                        LIZ.putString("jsb_parmas", jSONObject.toString());
                        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
                        C78450Uqc c78450Uqc = new C78450Uqc();
                        c78450Uqc.LIZ = activity;
                        c78450Uqc.LIZIZ = optString;
                        c78450Uqc.LIZJ = optString2;
                        c78450Uqc.LIZLLL = LIZ;
                        c78450Uqc.LJ = new IDeS96S0200000_6(this, interfaceC36488ETs, 2);
                        LJIIIIZZ.loginByPlatform(new C78451Uqd(c78450Uqc), c40926G4k);
                        return;
                    }
                }
            }
            InterfaceC65895Ptb LJIIIIZZ2 = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc2 = new C78450Uqc();
            c78450Uqc2.LIZ = activity;
            c78450Uqc2.LIZIZ = optString;
            c78450Uqc2.LJ = new IDeS96S0200000_6(this, interfaceC36488ETs, 3);
            C40925G4j.LIZ(c78450Uqc2, LJIIIIZZ2);
            return;
        }
        LIZJ(interfaceC36488ETs);
    }
}
