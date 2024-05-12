package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C38049EwX;
import X.C38191Eyp;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AppInfoMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInfoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "appInfo";
        this.LJLILLLLZI = EnumC38014Evy.PUBLIC;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        JSONObject jSONObject = new JSONObject();
        String optString = params.optString("permissionGroup");
        this.contextProviderFactory.LIZJ(C38049EwX.class);
        for (Map.Entry entry : ((HashMap) C38191Eyp.LIZ(optString)).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("code", 1);
        iReturn.LIZIZ(jSONObject);
    }
}
