package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MMk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56682MMk extends AbstractC56684MMm {
    public static final C56682MMk LJI = new C56682MMk();
    public static int LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;

    @Override // X.AbstractC56684MMm
    public final String LJ() {
        return "tt_inbox_janus_api_monitor";
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("status", Integer.valueOf(this.LIZIZ));
        c198517qh.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c198517qh.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c198517qh.LIZ.put("position", this.LJ);
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("request_scenario", Integer.valueOf(LJII));
        c198517qh.LIZ.put("log_id", this.LJFF);
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZJ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("follow_request_notice_count", Integer.valueOf(LJIIIIZZ));
        c198517qh.LIZ.put("live_notice_count", Integer.valueOf(LJIIIZ));
        c198517qh.LIZ.put("shop_notice_count", Integer.valueOf(LJIIJ));
        c198517qh.LIZ.put("report_notice_count", Integer.valueOf(LJIIJJI));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final void LIZLLL() {
        super.LIZLLL();
        LJII = 0;
        LJIIIIZZ = 0;
        LJIIIZ = 0;
        LJIIJ = 0;
        LJIIJJI = 0;
    }

    public final void LJIIIIZZ(NoticeCombineResponse combineResponse) {
        int i;
        int i2;
        int i3;
        List<NoticeItems> reportNotice;
        List<NoticeItems> shopNotice;
        List<CombineLiveNotice> liveNotices;
        FollowRequest followRequest;
        List<User> followRequestUser;
        LogPbBean logPb;
        o.LJIIIZ(combineResponse, "combineResponse");
        if (LJI()) {
            String str = null;
            int i4 = 0;
            if (combineResponse.getData() == null || combineResponse.error_code != 0) {
                C56682MMk c56682MMk = LJI;
                c56682MMk.LIZIZ = 0;
                c56682MMk.LIZLLL = combineResponse.error_code;
                c56682MMk.LIZJ = combineResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = combineResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                }
                c56682MMk.LJFF = str;
            } else {
                C56682MMk c56682MMk2 = LJI;
                c56682MMk2.LIZIZ = 1;
                c56682MMk2.LIZJ = combineResponse.status_code;
                c56682MMk2.LIZLLL = 0;
                NoticeCombineDatas data = combineResponse.getData();
                if (data != null && (logPb = data.getLogPb()) != null) {
                    str = logPb.getImprId();
                }
                c56682MMk2.LJFF = str;
                NoticeCombineDatas data2 = combineResponse.getData();
                if (data2 != null && (followRequest = data2.getFollowRequest()) != null && (followRequestUser = followRequest.getFollowRequestUser()) != null) {
                    i = followRequestUser.size();
                } else {
                    i = 0;
                }
                LJIIIIZZ = i;
                NoticeCombineDatas data3 = combineResponse.getData();
                if (data3 != null && (liveNotices = data3.getLiveNotices()) != null) {
                    i2 = liveNotices.size();
                } else {
                    i2 = 0;
                }
                LJIIIZ = i2;
                NoticeCombineDatas data4 = combineResponse.getData();
                if (data4 != null && (shopNotice = data4.getShopNotice()) != null) {
                    i3 = C45804HyK.LJJII(shopNotice);
                } else {
                    i3 = 0;
                }
                LJIIJ = i3;
                NoticeCombineDatas data5 = combineResponse.getData();
                if (data5 != null && (reportNotice = data5.getReportNotice()) != null) {
                    i4 = C45804HyK.LJJII(reportNotice);
                }
                LJIIJJI = i4;
            }
            LJII();
            return;
        }
        LIZLLL();
    }
}
