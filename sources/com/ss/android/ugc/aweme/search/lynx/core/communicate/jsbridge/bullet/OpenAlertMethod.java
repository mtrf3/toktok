package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C16880lQ;
import X.C26227ARb;
import X.C50345JpN;
import X.C50595JtP;
import X.C51051K1v;
import X.C84763XOl;
import X.F3T;
import X.IGF;
import X.InterfaceC37120EhY;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import X.UC0;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.AqS50S1200000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenAlertMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public InterfaceC37120EhY LJLILLLLZI;
    public final C50345JpN LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAlertMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openAlert";
        this.LJLJI = new C50345JpN(contextProviderFactory, "openAlert");
    }

    public final void LIZJ(String str, String str2) {
        try {
            C50595JtP c50595JtP = new C50595JtP(str, str2);
            InterfaceC40516FvE kitContainerApi = getKitContainerApi();
            if (kitContainerApi != null) {
                kitContainerApi.onEvent(c50595JtP);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        JSONObject jSONObject;
        String str;
        String str2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLJI.LIZ(params, iReturn)) {
            return;
        }
        try {
            String optString = params.optString("title");
            String optString2 = params.optString("content");
            boolean optBoolean = params.optBoolean("cancelable");
            JSONObject optJSONObject3 = params.optJSONObject("buttons");
            String optString3 = params.optString("id");
            String str3 = null;
            if (optJSONObject3 != null) {
                jSONObject = optJSONObject3.optJSONObject("cancel");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                str = jSONObject.optString("text");
            } else {
                str = null;
            }
            if (optJSONObject3 != null && (optJSONObject2 = optJSONObject3.optJSONObject("center")) != null) {
                str2 = optJSONObject2.optString("text");
            } else {
                str2 = null;
            }
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("confirm")) != null) {
                str3 = optJSONObject.optString("text");
            }
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                C26227ARb c26227ARb = new C26227ARb(LJIIIIZZ);
                if (!TextUtils.isEmpty(optString)) {
                    c26227ARb.LJFF(optString);
                }
                if (!TextUtils.isEmpty(optString2)) {
                    c26227ARb.LIZIZ(optString2);
                }
                c26227ARb.LJII = optBoolean;
                UC0.LIZJ(c26227ARb, new C51051K1v(str3, str2, str, this, optString3));
                c26227ARb.LIZJ(new AqS50S1200000_8(this, LJIIIIZZ, optString3, 0));
                c26227ARb.LJI().LIZLLL();
            }
        } catch (Exception e) {
            IGF.LIZ(e, "GetSearchHistoryMethod");
            iReturn.LIZ(0, e.getMessage());
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        super.handle(params, callback);
        this.LJLILLLLZI = callback;
    }
}
