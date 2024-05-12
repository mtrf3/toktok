package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MMj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56681MMj {
    public final String LIZ;
    public final String LIZIZ;
    public volatile ActivitiesPerfCacheManager.JanusData LIZJ;
    public volatile ActivitiesPerfCacheManager.NoticeData LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;

    public static void LIZIZ(NoticeItems noticeItems) {
        LVG lvg;
        List<MusNotice> items = noticeItems.getItems();
        if (items != null) {
            for (MusNotice musNotice : items) {
                NoticeGroupAttrs LJIIIIZZ = C54362LVe.LJIIIIZZ(musNotice.type);
                if (LJIIIIZZ != null) {
                    lvg = LJIIIIZZ.clearOccasion;
                } else {
                    lvg = null;
                }
                if (lvg != LVG.AfterClick) {
                    musNotice.hasRead = true;
                }
            }
        }
    }

    public C56681MMj(String str, String language) {
        o.LJIIIZ(language, "language");
        this.LIZ = str;
        this.LIZIZ = language;
    }

    public static boolean LIZ(List list, BaseNotice baseNotice) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NoticeItems noticeItems = (NoticeItems) it.next();
                List<MusNotice> items = noticeItems.getItems();
                if (items != null) {
                    ArrayList arrayList = new ArrayList();
                    for (MusNotice musNotice : items) {
                        if (!o.LJ(musNotice.nid, baseNotice.nid)) {
                            arrayList.add(musNotice);
                        }
                    }
                    List<MusNotice> items2 = noticeItems.getItems();
                    if (items2 == null || arrayList.size() != items2.size()) {
                        noticeItems.setItems(arrayList);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void LIZJ(NoticeListsResponse noticeListsResponse, boolean z) {
        if (noticeListsResponse != null) {
            this.LIZLLL = new ActivitiesPerfCacheManager.NoticeData(SystemClock.currentThreadTimeMillis(), noticeListsResponse);
            this.LJ = z;
        }
    }
}
