package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.AbstractC253439x5;
import X.C113554cx;
import X.C253419x3;
import X.C253449x6;
import X.C253469x8;
import X.C253489xA;
import X.C253509xC;
import X.OSZ;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PresentationManager implements IRouteAction {
    public static final C253469x8 Companion = new Object() { // from class: X.9x8
    };
    public static final Map<String, Class<? extends AbstractC253439x5>> handlerMap = C113554cx.LJJL(new OSZ("logout", C253419x3.class), new OSZ("dialog", C253509xC.class), new OSZ("toast", C253449x6.class), new OSZ("bottom_sheet", C253489xA.class));

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        AbstractC253439x5 newInstance;
        Uri uri = UriProtector.parse(str);
        String queryParameter = UriProtector.getQueryParameter(uri, "type");
        if (queryParameter != null) {
            Map<String, Class<? extends AbstractC253439x5>> map = handlerMap;
            if (map.containsKey(queryParameter)) {
                Class<? extends AbstractC253439x5> cls = map.get(queryParameter);
                if (cls != null && (newInstance = cls.newInstance()) != null) {
                    o.LJIIIIZZ(uri, "uri");
                    newInstance.LIZ(uri);
                }
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
