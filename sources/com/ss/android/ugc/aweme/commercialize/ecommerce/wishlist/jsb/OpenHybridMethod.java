package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb;

import X.C57415Mg7;
import X.C59209NLp;
import X.C59294NOw;
import X.F27;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenHybridMethod extends BaseBridgeMethod {
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
    public OpenHybridMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openHybrid";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        boolean z;
        String str;
        Uri.Builder buildUpon;
        String str2;
        String queryParameter;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String optString = params.optString("schema");
        if (params.optInt("is_ad") == 1) {
            z = true;
        } else {
            z = false;
        }
        String param = params.optString("param");
        int i = F27.LIZ[getHybridType().ordinal()];
        if (i != 1 && i != 2) {
            iReturn.LIZ(-1, "The container is not any of these three - Web/RN/Lynx");
            return;
        }
        o.LJIIIIZZ(param, "param");
        if (optString != null) {
            Context context = getContext();
            if (context instanceof Activity) {
                Bundle bundle = new Bundle();
                Uri parse = UriProtector.parse(optString);
                if (parse != null && (queryParameter = UriProtector.getQueryParameter(parse, "access_key")) != null && queryParameter.length() > 0) {
                    bundle.putString("access_key", queryParameter);
                }
                if (z) {
                    AdLandPagePreloadServiceImpl.LJJI().LJIIIIZZ();
                    bundle.putString("bundle_extra_param", param);
                    str = "ad_commerce";
                } else {
                    str = null;
                }
                if (C59294NOw.LIZ()) {
                    Uri parse2 = UriProtector.parse(optString);
                    if (parse2 != null && (buildUpon = parse2.buildUpon()) != null) {
                        if (z) {
                            IAdSparkUtils LJFF = AdSparkUtils.LJFF();
                            if (LJFF != null) {
                                String builder = buildUpon.toString();
                                o.LJIIIIZZ(builder, "urlBuilder.toString()");
                                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                                if (LJJI != null) {
                                    str2 = LJJI.LJIIL("lynx_feed");
                                } else {
                                    str2 = null;
                                }
                                LJFF.LIZLLL(context, builder, bundle, str2, C59209NLp.LIZIZ(), false);
                            }
                        } else {
                            SmartRoute buildRoute = SmartRouter.buildRoute(context, buildUpon.toString());
                            buildRoute.withParam(bundle);
                            buildRoute.open();
                        }
                    }
                } else {
                    C57415Mg7.LIZIZ(context, optString, str, bundle);
                }
            }
        }
        iReturn.LIZJ(1, null, null);
    }
}
