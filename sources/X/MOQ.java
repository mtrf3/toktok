package X;

import com.ss.android.ugc.aweme.notification.api.NotificationApi;

/* loaded from: classes10.dex */
public final class MOQ {
    public static /* synthetic */ AbstractC73672Svk LIZ(NotificationApi.Api api, long j, int i, String str, String str2, int i2) {
        String str3 = str;
        long j2 = j;
        int i3 = i;
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        String str4 = null;
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) == 0) {
            str4 = str2;
        }
        return api.reportNoticeAction(j2, i3, str3, str4);
    }
}
