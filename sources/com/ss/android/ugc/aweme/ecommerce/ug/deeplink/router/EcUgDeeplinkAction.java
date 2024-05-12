package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router;

import X.AbstractC54341LUj;
import X.C16880lQ;
import X.C51029K0z;
import X.C55860Lw8;
import X.C76800UCe;
import X.FCY;
import X.M5X;
import X.OSZ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EcUgDeeplinkAction extends AbstractC54341LUj<C76800UCe> {
    public static final C55860Lw8 Companion = new C55860Lw8();

    private final void ensureMainActivityCreated(Context context) {
        IAwemeApplicationService LIZ = AwemeApplicationServiceImpl.LIZ();
        if (LIZ != null && LIZ.isAppHot()) {
            return;
        }
        try {
            Intent LJIJI = C51029K0z.LJIJI(context);
            LJIJI.putExtra("extra_from_deeplink", true);
            C16880lQ.LIZJ(context, LJIJI);
        } catch (Throwable unused) {
        }
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        boolean z;
        Boolean bool;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        try {
            Object obj = deepLinkData.LJLJJL.get("is_from_notification");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            originalQueryMap.put("local_param_is_from_notification", Boolean.valueOf(z));
        } catch (Throwable unused) {
        }
        return new OSZ<>(outerUrl, originalQueryMap);
    }

    @Override // X.AbstractC54344LUm
    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        boolean z;
        Boolean bool;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        Uri uri = null;
        try {
            uri = UriProtector.parse(routePrefix);
        } catch (Throwable unused) {
        }
        if (uri != null && (FCY.LIZIZ(uri) || FCY.LIZJ(uri))) {
            Object obj = params.get("local_param_is_from_notification");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Uri LIZ = FCY.LIZ(uri, true, z);
            ensureMainActivityCreated(context);
            if (LIZ != null) {
                FCY.LIZLLL(context, LIZ);
                return true;
            }
        }
        return false;
    }
}
