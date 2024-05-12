package com.ss.android.ugc.aweme.bnpl.biz.checkout;

import X.AbstractC54341LUj;
import X.C16880lQ;
import X.C76800UCe;
import X.C91931a2Z;
import X.M5X;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CheckoutAction extends AbstractC54341LUj<C76800UCe> {
    public static final int $stable = 0;

    @Override // X.AbstractC54341LUj
    public String getTargetPageName() {
        return "hello";
    }

    @Override // X.AbstractC54344LUm, com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
        super.onSuccess(intent);
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buildInnerUrl ");
        LIZ.append(outerUrl);
        LIZ.append(' ');
        LIZ.append(originalQueryMap);
        C91931a2Z.LIZ(X1D.LIZIZ(LIZ));
        originalQueryMap.put("uri", outerUrl);
        return new OSZ<>("//pipopay/payin_checkout", originalQueryMap);
    }

    @Override // X.AbstractC54344LUm
    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("do real open ");
        LIZ.append(routePrefix);
        LIZ.append(' ');
        LIZ.append(params);
        LIZ.append(' ');
        LIZ.append(arrayList);
        C91931a2Z.LIZ(X1D.LIZIZ(LIZ));
        try {
            Intent intent = new Intent(context, (Class<?>) CheckoutActivity.class);
            intent.setFlags(268435456);
            intent.setData(UriProtector.parse((String) params.get("uri")));
            C16880lQ.LIZJ(context, intent);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }
}
