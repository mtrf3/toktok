package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.LV0;
import X.M5X;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MoneyGrowthAction extends AbstractC54341LUj<C76800UCe> {
    public String url;

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        this.url = outerUrl;
        Uri parse = UriProtector.parse(outerUrl);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(parse.getHost());
        LIZ.append(parse.getPath());
        return new OSZ<>(X1D.LIZIZ(LIZ), originalQueryMap);
    }

    @Override // X.AbstractC54344LUm
    public boolean doRealOpen(Context context, String routePrefix, HashMap<String, Object> params, ArrayList<Integer> arrayList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routePrefix, "routePrefix");
        o.LJIIIZ(params, "params");
        if (LV0.LJII.LIZ(this.url)) {
            return true;
        }
        return false;
    }
}
