package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C38836FMa;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SendLogV3Method extends BaseBridgeMethod {
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
    public SendLogV3Method(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "sendLogV3";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String optString = params.optString("eventName");
        JSONObject optJSONObject = params.optJSONObject("params");
        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
            iReturn.LIZ(0, "");
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = optJSONObject.optString(key);
            keys.remove();
            o.LJIIIIZZ(key, "key");
            o.LJIIIIZZ(value, "value");
            hashMap.put(key, value);
        }
        C38836FMa.LIZLLL(optString, hashMap);
        iReturn.onSuccess(new JSONObject());
    }
}
