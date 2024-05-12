package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.F3T;
import X.InterfaceC37120EhY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class EditPageMethod extends BaseBridgeMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "openVideoEdit";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPageMethod(F3T providerFactory) {
        super(providerFactory);
        o.LJIIIZ(providerFactory, "providerFactory");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//openVideoEdit");
        buildRoute.withParam("media_path", params.optString("media_path"));
        buildRoute.withParam("upload_type", params.optString("upload_type"));
        buildRoute.withParam("assets", params.optString("assets"));
        buildRoute.withParam("shoot_way", params.optString("shoot_way"));
        buildRoute.withParam("anchors", params.optString("anchors"));
        buildRoute.withParam("challenge_id", params.optString("challenge_id"));
        buildRoute.withParam("challenge_name", params.optString("challenge_name"));
        buildRoute.withParam("creation_id", params.optString("creation_id"));
        buildRoute.withParam("extra", params.optString("extra"));
        buildRoute.withParam("from_jsb", true);
        buildRoute.withParam("creative_initial_model", GsonProtectorUtils.toJson(new Gson(), new CreativeInitialModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new ECommerceCreativeVideoParams(params.optString("oec_music_id")), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16351, 0 == true ? 1 : 0)));
        buildRoute.open();
    }
}
