package com.ss.android.ugc.aweme.notification.api;

import X.AbstractC36908Ee8;
import X.AbstractC73547Stj;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C10K;
import X.C198517qh;
import X.C35971E9v;
import X.C38767FJj;
import X.C46104I7o;
import X.C46604IQu;
import X.C53272KvU;
import X.C54316LTk;
import X.C56630MKk;
import X.C75792yF;
import X.C76L;
import X.C78934UyQ;
import X.C78963Uyt;
import X.C85990Xow;
import X.C8HX;
import X.E4Q;
import X.E4T;
import X.EF7;
import X.FRV;
import X.InterfaceC195787mI;
import X.InterfaceC36228EJs;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.M57;
import X.T16;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import yq4.a;

/* loaded from: classes10.dex */
public final class MusNotificationApiManager {
    public static final NoticeApi LIZ;
    public static final NoticeWebcastApi LIZIZ;

    /* loaded from: classes10.dex */
    public interface NoticeApi {
        @E4T("/aweme/v1/notice/del/")
        C10K<BaseResponse> deleteNotice(@InterfaceC64989Pez("notice_id") String str);

        @E4Q("/aweme/janus/v1/notice/multi/")
        C76L<NoticeCombineResponse> fetchCombineNotice(@InterfaceC64989Pez("live_entrance") int i, @InterfaceC64989Pez("req_from") String str, @InterfaceC64989Pez("is_draw") long j, @InterfaceC64989Pez("content_type") int i2, @InterfaceC64989Pez("channel_id") int i3, @InterfaceC64989Pez("count") int i4, @InterfaceC36228EJs Map<String, String> map, @InterfaceC64989Pez("scenario") int i5, @InterfaceC64989Pez("has_shown_following_popup") boolean z, @InterfaceC64989Pez("clean_count_type") int i6, @InterfaceC64989Pez("Ecommercemsgexpversion") int i7);

        @E4Q("/aweme/v1/notice/multi/")
        C76L<NoticeListsResponse> fetchGroupNotice(@InterfaceC64989Pez("group_list") String str, @InterfaceC64989Pez("scenario") int i);

        @E4Q("/aweme/janus/v1/notice/multi/feed/")
        C10K<LiveNoticeMessageResponse> fetchLiveNotice(@InterfaceC64989Pez("req_from") String str, @InterfaceC64989Pez("is_draw") long j, @InterfaceC64989Pez("content_type") int i, @InterfaceC64989Pez("channel_id") int i2);

        @E4Q("aweme/v1/report/inbox/notice/")
        C76L<NoticeListsResponse> fetchReportInboxNotice();

        @E4Q("https://oec-api.tiktokv.com/chat/api/client/getLatestMessage")
        C76L<NoticeListsResponse> fetchShopInboxNotice();

        @E4T("/tiktok/v1/sharer/link/notice/ignore/")
        AbstractC73547Stj ignoreLinkNotice(@InterfaceC64989Pez("link_id") String str);

        @InterfaceC195787mI
        @E4T("/tiktok/notice/report_start/v1")
        AbstractC73672Svk<BaseResponse> reportColdStart(@InterfaceC64987Pex("trigger_notice_info") String str);

        @E4Q("/tiktok/user/relation/recommended_notice/update/v1")
        AbstractC73672Svk<BaseResponse> reportNoticeBoot();
    }

    /* loaded from: classes7.dex */
    public interface NoticeWebcastApi {
        @E4Q("/webcast/tab/")
        C10K<Object> fetchRecommendAvatars(@InterfaceC64989Pez("live_entrance") int i, @InterfaceC36228EJs Map<String, String> map);
    }

    static {
        String str;
        String str2 = M57.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        LIZ2.append("/");
        LIZ = (NoticeApi) C46104I7o.LJIIZILJ(X1D.LIZIZ(LIZ2), NoticeApi.class);
        if (C85990Xow.LJIIIZ()) {
            str = "https://webcast.tiktokv.com";
        } else {
            str = "https://webcast-va.tiktokv.com";
        }
        LIZIZ = (NoticeWebcastApi) C46104I7o.LJIIZILJ(str, NoticeWebcastApi.class);
    }

    public static C10K<LiveNoticeMessageResponse> LJFF() {
        return LIZ.fetchLiveNotice("tiktok_message", 0L, 3, 81);
    }

    public static void LJIIJ() {
        AbstractC73638SvC.LJIIZILJ(LIZ.reportNoticeBoot()).LJJIIJ(T16.LIZ()).LIZ(new C38767FJj());
    }

    public static C10K<BaseResponse> LIZ(String str) {
        return LIZ.deleteNotice(str);
    }

    public static AbstractC73547Stj LJI(String str) {
        return LIZ.ignoreLinkNotice(str);
    }

    public static void LJII(int i) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", "/aweme/v1/report/inbox/notice/");
        c198517qh.LIZ.put("status", Integer.valueOf(i));
        C8HX.LIZIZ("tns_api_status", "", c198517qh.LJ());
    }

    public static void LJIIIZ(String str) {
        AbstractC73638SvC.LJIIZILJ(LIZ.reportColdStart(str)).LJJIIJ(T16.LIZ()).LIZ(new FRV());
    }

    public static C76L LIZIZ(int i, boolean z) {
        Map<String, String> LJJIJLIJ = LiveOuterService.LJJJLL().LJJIJIL().LJJIJLIJ(EF7.LIZIZ());
        if (Boolean.TRUE.equals(a.LJFF().LJFF().getValue()) && C35971E9v.LIZ()) {
            LJJIJLIJ.put("is_non_personalized", "1");
        }
        NoticeApi noticeApi = LIZ;
        int i2 = !z ? 1 : 0;
        boolean LIZ2 = C56630MKk.LIZ();
        return noticeApi.fetchCombineNotice(5, "tiktok_message", 0L, 3, 81, i2, LJJIJLIJ, i, false, LIZ2 ? 1 : 0, C53272KvU.LIZ());
    }

    public static NoticeListsResponse LIZJ(int i, List list) {
        try {
            return LIZ.fetchGroupNotice(C75792yF.LIZJ(list), i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static void LJIIIIZZ(String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", "/aweme/v1/report/inbox/notice/");
        c198517qh.LIZ.put("status", 1);
        c198517qh.LIZ.put("error_message", str2);
        c198517qh.LIZ.put("tns_logId", str);
        C8HX.LIZIZ("tns_api_status", "", c198517qh.LJ());
    }

    public static NoticeListsResponse LIZLLL(int i, int i2, List list) {
        NoticeListsResponse noticeListsResponse;
        C76L<NoticeListsResponse> fetchShopInboxNotice;
        try {
            NoticeApi noticeApi = LIZ;
            C76L<NoticeListsResponse> fetchGroupNotice = noticeApi.fetchGroupNotice(C75792yF.LIZJ(list), i2);
            List<NoticeItems> list2 = null;
            try {
            } catch (Exception unused) {
                if (i == 37) {
                    LJII(1);
                }
            }
            if (i == 37) {
                fetchShopInboxNotice = noticeApi.fetchReportInboxNotice();
            } else {
                if (i == 599) {
                    fetchShopInboxNotice = noticeApi.fetchShopInboxNotice();
                }
                noticeListsResponse = fetchGroupNotice.get();
                if (!C78934UyQ.LJIJJ(list2) && noticeListsResponse != null) {
                    noticeListsResponse.setCollapseNotices(list2);
                }
                return noticeListsResponse;
            }
            if (fetchShopInboxNotice != null) {
                NoticeListsResponse noticeListsResponse2 = fetchShopInboxNotice.get();
                if (i == 37) {
                    if (noticeListsResponse2.status_code == 0) {
                        LJII(0);
                    } else {
                        LJIIIIZZ(noticeListsResponse2.getLobPb().getImprId(), String.valueOf(noticeListsResponse2.status_code));
                    }
                }
                list2 = noticeListsResponse2.getNotices();
            }
            noticeListsResponse = fetchGroupNotice.get();
            if (!C78934UyQ.LJIJJ(list2)) {
                noticeListsResponse.setCollapseNotices(list2);
            }
            return noticeListsResponse;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NoticeListsResponse LJ(List<MultiNotice> list, MutableLiveData<NoticeCombineDatas> mutableLiveData, int i) {
        try {
            C76L<NoticeListsResponse> fetchGroupNotice = LIZ.fetchGroupNotice(C75792yF.LIZJ(list), i);
            ArrayList arrayList = new ArrayList();
            try {
                NoticeCombineResponse noticeCombineResponse = (NoticeCombineResponse) LIZIZ(i, true).get();
                if (noticeCombineResponse != null) {
                    if (C46604IQu.LJ() && noticeCombineResponse.getData() != null) {
                        noticeCombineResponse.getData().setLiveNotices(null);
                    }
                    if (noticeCombineResponse.getData() != null) {
                        C78963Uyt.LJJIL(noticeCombineResponse.getData());
                    }
                    if (C54316LTk.LIZ && noticeCombineResponse.getData() != null) {
                        noticeCombineResponse.getData().setShopNotice(null);
                    }
                    mutableLiveData.postValue(noticeCombineResponse.getData());
                    if (noticeCombineResponse.getData() != null) {
                        if (noticeCombineResponse.getData().getShopNotice() != null) {
                            arrayList.addAll(noticeCombineResponse.getData().getShopNotice());
                        }
                        if (noticeCombineResponse.getData().getReportNotice() != null) {
                            arrayList.addAll(noticeCombineResponse.getData().getReportNotice());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            NoticeListsResponse noticeListsResponse = fetchGroupNotice.get();
            if (!C78934UyQ.LJIJJ(arrayList) && noticeListsResponse != null) {
                noticeListsResponse.setCollapseNotices(arrayList);
            }
            return noticeListsResponse;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
