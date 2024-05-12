package com.ss.android.ugc.aweme.feed.model;

import X.C00F;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.utils.GsonHolder;

/* loaded from: classes10.dex */
public final class InsertItemParamsKt {
    public static final String concatStringsWithComma(String str, String str2) {
        if (str == null || str.length() == 0) {
            return str2;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return C00F.LIZIZ(str, ',', str2);
    }

    public static final String getPushInsertItems(String str, String str2, String str3, String str4) {
        return GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new InsertItemParams[]{new InsertItemParams(concatStringsWithComma(str, str2), new InfoParams(new SurveyInfo("push", new PushParams(str3, str4))))});
    }
}
