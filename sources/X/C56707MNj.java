package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MNj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56707MNj extends AbstractC56684MMm {
    public static int LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static int LJIIL;
    public static int LJIILIIL;
    public static final C56707MNj LJI = new C56707MNj();
    public static String LJIIJJI = "";

    @Override // X.AbstractC56684MMm
    public final String LJ() {
        return "tt_inbox_notice_multi_api_monitor";
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("status", Integer.valueOf(this.LIZIZ));
        c198517qh.LIZ.put("status_code", Integer.valueOf(this.LIZJ));
        c198517qh.LIZ.put("error_code", Integer.valueOf(this.LIZLLL));
        c198517qh.LIZ.put("position", this.LJ);
        c198517qh.LIZ.put("is_first_refresh", Boolean.valueOf(LJIIIIZZ));
        c198517qh.LIZ.put("is_load_more", Boolean.valueOf(LJIIIZ));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("experiments", LJIIJJI);
        c198517qh.LIZ.put("request_scenario", Integer.valueOf(LJII));
        c198517qh.LIZ.put("log_id", this.LJFF);
        c198517qh.LIZ.put("has_more", Boolean.valueOf(LJIIJ));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final JSONObject LIZJ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("notice_count", Integer.valueOf(LJIIL));
        c198517qh.LIZ.put("notice_total", Integer.valueOf(LJIILIIL));
        return c198517qh.LJ();
    }

    @Override // X.AbstractC56684MMm
    public final void LIZLLL() {
        super.LIZLLL();
        LJII = 0;
        LJIIJJI = "";
        LJIIL = 0;
        LJIILIIL = 0;
        LJIIIIZZ = false;
        LJIIIZ = false;
        LJIIJ = false;
    }

    public final void LJIIIIZZ(NoticeListsResponse noticeListsResponse, int i) {
        String str;
        int i2;
        o.LJIIIZ(noticeListsResponse, "noticeListsResponse");
        if (LJI()) {
            boolean z = false;
            String str2 = null;
            NoticeItems noticeItems = null;
            if (C45804HyK.LJJII(noticeListsResponse.getNotices()) == 0 || noticeListsResponse.error_code != 0) {
                C56707MNj c56707MNj = LJI;
                c56707MNj.LIZIZ = 0;
                c56707MNj.LIZLLL = noticeListsResponse.error_code;
                c56707MNj.LIZJ = noticeListsResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = noticeListsResponse.extra;
                if (serverTimeExtra != null) {
                    str2 = serverTimeExtra.logid;
                }
                c56707MNj.LJFF = str2;
            } else {
                C56707MNj c56707MNj2 = LJI;
                c56707MNj2.LIZIZ = 1;
                c56707MNj2.LIZJ = noticeListsResponse.status_code;
                c56707MNj2.LIZLLL = 0;
                LogPbBean lobPb = noticeListsResponse.getLobPb();
                if (lobPb != null) {
                    str = lobPb.getImprId();
                } else {
                    str = null;
                }
                c56707MNj2.LJFF = str;
                LJIIL = C45804HyK.LJJII(noticeListsResponse.getNotices());
                List<NoticeItems> notices = noticeListsResponse.getNotices();
                if (notices != null) {
                    Iterator<NoticeItems> it = notices.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        i2 += it.next().getTotal();
                    }
                } else {
                    i2 = 0;
                }
                LJIILIIL = i2;
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    Iterator<NoticeItems> it2 = notices2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        NoticeItems next = it2.next();
                        if (i == next.getGroup()) {
                            noticeItems = next;
                            break;
                        }
                    }
                    NoticeItems noticeItems2 = noticeItems;
                    if (noticeItems2 != null) {
                        z = noticeItems2.getHasMore();
                    }
                }
                LJIIJ = z;
            }
            LJII();
            return;
        }
        LIZLLL();
    }
}
