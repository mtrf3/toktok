package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AppStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;

/* renamed from: X.3Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80753Ex {
    public static /* synthetic */ Object LIZ(TikTokImApi tikTokImApi, String str, String str2, int i, String str3, String str4, InterfaceC67352kd interfaceC67352kd, int i2) {
        String str5 = str3;
        String str6 = null;
        if ((i2 & 8) != 0) {
            str5 = null;
        }
        if ((i2 & 16) == 0) {
            str6 = str4;
        }
        return tikTokImApi.acknowledgeNoticeRead(str, str2, i, str5, str6, interfaceC67352kd);
    }

    public static /* synthetic */ Object LIZIZ(TikTokImApi tikTokImApi, String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, boolean z2, boolean z3, InterfaceC67352kd interfaceC67352kd, int i4) {
        boolean z4 = z3;
        boolean z5 = z2;
        String str5 = str2;
        int i5 = i3;
        String str6 = str;
        int i6 = i;
        int i7 = i2;
        boolean z6 = z;
        String str7 = "";
        if ((i4 & 1) != 0) {
            str6 = "";
        }
        if ((i4 & 2) != 0) {
            str5 = "";
        }
        if ((i4 & 4) == 0) {
            str7 = str3;
        }
        if ((i4 & 16) != 0) {
            i6 = -1;
        }
        if ((i4 & 32) != 0) {
            i7 = TopChatNoticePushStatus.PUSH_STATUS_UNKNOWN.getStatus();
        }
        if ((i4 & 64) != 0) {
            z6 = false;
        }
        if ((i4 & 128) != 0) {
            i5 = AppStatus.APP_STATUS_UNKNOWN.getStatus();
        }
        if ((i4 & 256) != 0) {
            z5 = false;
        }
        if ((i4 & 512) != 0) {
            z4 = false;
        }
        return tikTokImApi.getTopChatNotice(str6, str5, str7, str4, i6, i7, z6, i5, z5, z4, interfaceC67352kd);
    }
}
