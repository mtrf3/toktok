package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import X.C1DJ;
import X.C38956FQq;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.servicimpl.CreativePageService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class OpenSchemaSingleTaskMethod extends BaseBridgeMethod {
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
    public OpenSchemaSingleTaskMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openSingletonSchema";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String schema = params.optString("schema");
        String optString = params.optString("page");
        int optInt = params.optInt("is_back");
        boolean z = false;
        if (o.LJ(optString, "AWEVideoNewPublishViewController")) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            o.LJIIIIZZ(activityStack, "getActivityStack()");
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Activity activity = activityStack[i];
                    ICreativePageService LIZ = CreativePageService.LIZ();
                    if (LIZ != null && LIZ.isPublishPage(activity)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    ECommerceAnchorService.LJJJJI().LJIIJ("No video publish activity in stack.", optString, 1, schema, params.toString());
                    C1DJ.LJJIL(params);
                    break;
                }
            }
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            SAAService.LIZ().openPublishPage(getContext(), intent);
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//bullet/single_task?intercept_page=show_window");
            Intent buildIntent = buildRoute.buildIntent();
            if (optInt == 1) {
                z = true;
            }
            buildIntent.putExtra("is_clear_top", z);
            buildRoute.withParam(buildIntent);
            o.LJIIIIZZ(schema, "schema");
            buildRoute.withParam(C38956FQq.LIZIZ(schema));
            buildRoute.addFlags(67108864);
            buildRoute.addFlags(268435456);
            buildRoute.open();
        }
        ECommerceAnchorService.LJJJJI().LJIIJ(null, optString, null, schema, params.toString());
        iReturn.onSuccess("Open singleton schema successful.");
    }
}
