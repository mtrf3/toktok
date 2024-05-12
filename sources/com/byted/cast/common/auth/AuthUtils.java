package com.byted.cast.common.auth;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public class AuthUtils {
    public static List<String> getProtocols(AuthService authService, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (authService != null) {
            if (TextUtils.equals(str, "source")) {
                str2 = "source_";
            } else {
                str2 = "sink_";
            }
            List<String> contentList = authService.getContentList();
            if (contentList != null && contentList.size() > 0) {
                for (String str3 : contentList) {
                    if (!TextUtils.isEmpty(str3) && str3.startsWith(str2)) {
                        arrayList.add(str3.substring(str2.length()));
                    }
                }
            }
        }
        return arrayList;
    }
}
