package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C76800UCe;
import X.M5X;
import X.OSZ;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class QnAAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public String getTargetPageName() {
        return "question_detail";
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri parse = UriProtector.parse(outerUrl);
        HashMap hashMap = new HashMap();
        String lastPathSegment = parse.getLastPathSegment();
        String queryParameter = UriProtector.getQueryParameter(parse, "enter_from");
        String str = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        hashMap.put("enter_from", queryParameter);
        String queryParameter2 = UriProtector.getQueryParameter(parse, "enter_method");
        if (queryParameter2 != null) {
            str = queryParameter2;
        }
        hashMap.put("enter_method", str);
        if (lastPathSegment != null && lastPathSegment.length() != 0 && DeeplinkPrefetchImpl.LIZLLL().LIZIZ(lastPathSegment)) {
            hashMap.put("id", lastPathSegment);
        }
        return new OSZ<>("//qna/detail", hashMap);
    }
}
