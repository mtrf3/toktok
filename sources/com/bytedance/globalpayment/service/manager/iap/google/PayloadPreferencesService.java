package com.bytedance.globalpayment.service.manager.iap.google;

import android.content.Context;

/* loaded from: classes14.dex */
public interface PayloadPreferencesService {
    void addQueryOrderParam(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2);

    void removePayload(Context context, String str);

    void removeQueryOrderParam(Context context, String str);
}
