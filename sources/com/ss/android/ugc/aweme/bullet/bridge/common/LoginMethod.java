package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C0H1;
import X.C16880lQ;
import X.C247929oC;
import X.C27740Aue;
import X.C40926G4k;
import X.C78450Uqc;
import X.F0S;
import X.F3T;
import X.HG3;
import X.InterfaceC37146Ehy;
import X.InterfaceC65895Ptb;
import Y.IDeS96S0200000_6;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class LoginMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "login";
    }

    public final void LIZJ(InterfaceC37146Ehy interfaceC37146Ehy) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (getHybridType() == F0S.LYNX) {
            interfaceC37146Ehy.onSuccess(jSONObject);
        } else {
            interfaceC37146Ehy.LIZIZ(jSONObject);
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
        sendEvent("H5_nativeEvent", jSONObject2);
    }

    public final void LIZLLL(InterfaceC37146Ehy interfaceC37146Ehy) {
        JSONObject jSONObject = new JSONObject();
        try {
            C247929oC.LJIL(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (getHybridType() == F0S.LYNX) {
            interfaceC37146Ehy.onSuccess(jSONObject);
        } else {
            interfaceC37146Ehy.LIZIZ(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Activity LIZ = C27740Aue.LIZ(getContext());
        if (LIZ == null) {
            return;
        }
        String optString = params.optString("enter_from", "h5");
        if (!HG3.LJIILL().isLogin()) {
            String optString2 = params.optString("platform", "");
            o.LJIIIIZZ(optString2, "params.optString(PLATFORM, \"\")");
            if (!TextUtils.isEmpty(optString2)) {
                for (C40926G4k c40926G4k : HG3.LJIIIIZZ().getAllSupportedLoginPlatform()) {
                    if (TextUtils.equals(optString2, c40926G4k.LJLILLLLZI)) {
                        Bundle LIZ2 = C0H1.LIZ("setting_page", "feedback_faq_list_page");
                        LIZ2.putBoolean("is_login", TextUtils.equals(getName(), "loginWithPlatform"));
                        LIZ2.putString("jsb_parmas", params.toString());
                        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
                        C78450Uqc c78450Uqc = new C78450Uqc();
                        c78450Uqc.LIZ = LIZ;
                        c78450Uqc.LIZIZ = optString;
                        c78450Uqc.LIZLLL = LIZ2;
                        c78450Uqc.LJ = new IDeS96S0200000_6(this, iReturn, 0);
                        LJIIIIZZ.loginByPlatform(c78450Uqc.LIZ(), c40926G4k);
                        return;
                    }
                }
            }
            InterfaceC65895Ptb LJIIIIZZ2 = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc2 = new C78450Uqc();
            c78450Uqc2.LIZ = LIZ;
            c78450Uqc2.LIZIZ = optString;
            c78450Uqc2.LJ = new IDeS96S0200000_6(this, iReturn, 1);
            LJIIIIZZ2.showLoginAndRegisterView(c78450Uqc2.LIZ());
            return;
        }
        LIZLLL(iReturn);
    }
}
