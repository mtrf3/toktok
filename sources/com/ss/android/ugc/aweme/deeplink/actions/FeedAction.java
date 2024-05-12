package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C16880lQ;
import X.C47261Igj;
import X.C76800UCe;
import X.M5X;
import X.M62;
import X.OSZ;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public ArrayList<Integer> getFlags() {
        return C47261Igj.LJII(67108864, 268435456);
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        boolean z;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        HashMap hashMap = new HashMap();
        Uri parse = UriProtector.parse(outerUrl);
        Object queryParameter = UriProtector.getQueryParameter(parse, "is_from_notification");
        if (queryParameter != null) {
            z = ((Boolean) queryParameter).booleanValue();
        } else {
            z = false;
        }
        String queryParameter2 = UriProtector.getQueryParameter(parse, "tab");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        try {
            int parseInt = CastIntegerProtector.parseInt(queryParameter2);
            hashMap.put("tab", Integer.valueOf(parseInt));
            if (parseInt != 1) {
                if (parseInt == 2) {
                    M62.LIZIZ.LIZIZ(parse, "homepage_fresh", z);
                }
            } else {
                M62.LIZIZ.LIZIZ(parse, "homepage_hot", z);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        return new OSZ<>("aweme://main", hashMap);
    }
}
