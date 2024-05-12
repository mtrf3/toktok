package com.ss.android.ugc.aweme.bullet.bridge.commerce;

import X.C16880lQ;
import X.F0S;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC40516FvE;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AdInfoMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInfoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "adInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Uri rk;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        InterfaceC40516FvE kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null && kitContainerApi.LLLIZZ() == F0S.WEB && (rk = kitContainerApi.rk()) != null) {
            this.LJLJI = UriProtector.getQueryParameter(rk, "adinfojson");
            this.LJLILLLLZI = UriProtector.getQueryParameter(rk, "has_adinfojson");
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.equals(this.LJLILLLLZI, "1") && !TextUtils.isEmpty(this.LJLJI)) {
            JSONObject jSONObject2 = new JSONObject(this.LJLJI);
            Iterator<String> keys = jSONObject2.keys();
            o.LJIIIIZZ(keys, "adInfo.keys()");
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } else {
            jSONObject.put("code", 0);
        }
        iReturn.LIZIZ(jSONObject);
    }
}
