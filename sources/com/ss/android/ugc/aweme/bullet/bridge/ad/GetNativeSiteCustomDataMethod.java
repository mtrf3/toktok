package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C78983UzD;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import X.NOV;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetNativeSiteCustomDataMethod extends BaseBridgeMethod {
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
    public GetNativeSiteCustomDataMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "getNativeSiteCustomData";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        NOV nov;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            JSONObject jSONObject = new JSONObject();
            InterfaceC40516FvE kitContainerApi = getKitContainerApi();
            if (kitContainerApi != null) {
                nov = (NOV) kitContainerApi.tf(NOV.class);
            } else {
                nov = null;
            }
            String str = "";
            if (nov == null) {
                if (this.contextProviderFactory.LIZJ(Bundle.class) != null) {
                    Bundle bundle = (Bundle) this.contextProviderFactory.LIZJ(Bundle.class);
                    if (bundle == null) {
                        return;
                    }
                    String string = bundle.getString("bundle_native_site_custom_data");
                    if (string != null) {
                        str = string;
                    }
                    jSONObject.put("customData", str);
                }
            } else {
                String str2 = (String) nov.LJJZ.getValue();
                if (str2 != null) {
                    str = str2;
                }
                jSONObject.put("customData", str);
            }
            iReturn.onSuccess(jSONObject);
        } catch (Throwable th) {
            iReturn.LIZ(-1, th.getMessage());
            C78983UzD.LJIIZILJ(th);
        }
    }
}
