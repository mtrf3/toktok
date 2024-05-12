package com.ss.android.ugc.tiktok.tpsc;

import X.C71909SKb;
import X.EnumC69896Rbw;
import X.InterfaceC65784Pro;
import X.SKM;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPSCPagesRouter implements IRouteAction {
    public static final SKM Companion = new SKM();

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String string;
        TPSCPageBuildConfigs tPSCPageBuildConfigs;
        String str2;
        o.LJIIIZ(context, "context");
        if (bundle != null && (string = bundle.getString("target")) != null) {
            C71909SKb.LIZ.getClass();
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((LinkedHashMap) C71909SKb.LIZLLL).get(string);
            if (interfaceC65784Pro != null && (tPSCPageBuildConfigs = (TPSCPageBuildConfigs) interfaceC65784Pro.invoke()) != null) {
                EnumC69896Rbw enumC69896Rbw = tPSCPageBuildConfigs.style;
                if (enumC69896Rbw == EnumC69896Rbw.SHEET || enumC69896Rbw == EnumC69896Rbw.FIXED_HEIGHT_SHEET) {
                    C71909SKb.LIZLLL().LJI(context, tPSCPageBuildConfigs);
                } else {
                    int hashCode = string.hashCode();
                    if (hashCode != -681342931) {
                        str2 = hashCode != -283895696 ? "//privacy/setting/page/main" : "//privacy/setting/page/main";
                        SmartRoute buildRoute = SmartRouter.buildRoute(context, str2);
                        buildRoute.withParam("buildConfigs", tPSCPageBuildConfigs);
                        buildRoute.withParam("target", string);
                        buildRoute.withParam(bundle);
                        buildRoute.open();
                        return null;
                    }
                    if (string.equals("sug_to_others")) {
                        str2 = "//privacy/setting/page/general/sug";
                        SmartRoute buildRoute2 = SmartRouter.buildRoute(context, str2);
                        buildRoute2.withParam("buildConfigs", tPSCPageBuildConfigs);
                        buildRoute2.withParam("target", string);
                        buildRoute2.withParam(bundle);
                        buildRoute2.open();
                        return null;
                    }
                    str2 = "//privacy/setting/page/general";
                    SmartRoute buildRoute22 = SmartRouter.buildRoute(context, str2);
                    buildRoute22.withParam("buildConfigs", tPSCPageBuildConfigs);
                    buildRoute22.withParam("target", string);
                    buildRoute22.withParam(bundle);
                    buildRoute22.open();
                    return null;
                }
            }
        }
        return null;
    }
}
