package com.ss.android.ugc.aweme.services.now;

import android.app.Activity;

/* loaded from: classes8.dex */
public interface ICreativeNowService {
    ICreativeNowDataConverter dataConverter();

    ICreativeNowDraftService draftService();

    boolean isUnder18();

    ICreativeNowPublishService publishService();

    void startNowRecordActivity(Activity activity, String str, String str2, String str3, String str4, String str5);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void startNowRecordActivity$default(ICreativeNowService iCreativeNowService, Activity activity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            String str6 = str3;
            String str7 = str4;
            if (obj == null) {
                String str8 = null;
                if ((i & 8) != 0) {
                    str6 = null;
                }
                if ((i & 16) != 0) {
                    str7 = null;
                }
                if ((i & 32) == 0) {
                    str8 = str5;
                }
                iCreativeNowService.startNowRecordActivity(activity, str, str2, str6, str7, str8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startNowRecordActivity");
        }
    }
}
