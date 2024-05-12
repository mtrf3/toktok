package com.ss.android.ugc.aweme.locale;

import X.C39386Fd0;
import X.C58096Mr6;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes14.dex */
public class LocalServiceImpl implements ILocalService {
    public static ILocalService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ILocalService.class, false);
        if (LIZ != null) {
            return (ILocalService) LIZ;
        }
        if (C58096Mr6.x2 == null) {
            synchronized (ILocalService.class) {
                if (C58096Mr6.x2 == null) {
                    C58096Mr6.x2 = new LocalServiceImpl();
                }
            }
        }
        return C58096Mr6.x2;
    }

    @Override // com.ss.android.ugc.aweme.locale.ILocalService
    public final String LIZ(Context context) {
        String language = C39386Fd0.LIZIZ(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }
}
