package com.ss.android.ugc.aweme.notice.repo.api;

import X.C221018lt;
import X.C36309EMv;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.X1D;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes7.dex */
public final class NotificationApi {

    /* loaded from: classes7.dex */
    public interface INotificationApi {
        @E8L("/aweme/v1/feedback/cancel/")
        InterfaceC37276Ek4<String> cancelFeedback();

        @E8L("/aweme/v1/notice/count/")
        InterfaceC37276Ek4<NoticeList> query(@InterfaceC64986Pew("source") int i, @InterfaceC64986Pew("ab_settings") String str, @InterfaceC64986Pew("need_hv_follow_count") boolean z, @InterfaceC64986Pew("need_latest_notice_time") boolean z2);
    }

    public static NoticeList LIZ(int i, String str, boolean z, boolean z2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query notice/count, source=");
        LIZ.append(i);
        C221018lt.LJFF("NotificationApi", X1D.LIZIZ(LIZ));
        return ((INotificationApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C36309EMv.LIZ).create(INotificationApi.class)).query(i, str, z, z2).execute().LIZIZ;
    }
}
