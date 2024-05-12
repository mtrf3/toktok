package com.ss.android.ugc.aweme.web.jsbridge;

import X.C38049EwX;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class EditPageMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public EditPageMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (jSONObject == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.mContextRef.get(), "//openVideoEdit");
        buildRoute.withParam("media_path", jSONObject.optString("media_path"));
        buildRoute.withParam("upload_type", jSONObject.optString("upload_type"));
        buildRoute.withParam("assets", jSONObject.optString("assets"));
        buildRoute.withParam("shoot_way", jSONObject.optString("shoot_way"));
        buildRoute.withParam("anchors", jSONObject.optString("anchors"));
        buildRoute.withParam("challenge_id", jSONObject.optString("challenge_id"));
        buildRoute.withParam("challenge_name", jSONObject.optString("challenge_name"));
        buildRoute.withParam("creation_id", jSONObject.optString("creation_id"));
        buildRoute.withParam("extra", jSONObject.optString("extra"));
        buildRoute.withParam("from_jsb", true);
        buildRoute.withParam("creative_initial_model", GsonProtectorUtils.toJson(new Gson(), new CreativeInitialModel(null, null, null, null, null, new ECommerceCreativeVideoParams(jSONObject.optString("oec_music_id")), null, null, null, null, null, null, null, null, 16351, null)));
        buildRoute.open();
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess(null);
        }
    }
}
