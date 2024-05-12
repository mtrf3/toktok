package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLU extends MP2 {
    @Override // X.MP2, X.C56757MPh
    public final boolean LJIIL(MLW reason) {
        ActivitiesPerfCacheManager.NoticeData noticeData;
        List<NoticeItems> notices;
        o.LJIIIZ(reason, "reason");
        MLW mlw = MLW.PRELOAD_FORM_CACHE_AND_REFRESH;
        if (reason == mlw) {
            C221018lt.LJFF("ActivitiesPreLoadModel", "start Load From Cache");
            if (reason == mlw) {
                this.LJIIL.LJIILLIIL = true;
            }
            C56681MMj LIZ = ActivitiesPerfCacheManager.LIZ();
            NoticePerfManager.JanusData janusData = null;
            if (LIZ != null) {
                synchronized (LIZ) {
                    noticeData = LIZ.LIZLLL;
                }
                if (noticeData != null && (notices = noticeData.resp.getNotices()) != null && !notices.isEmpty()) {
                    NoticePerfManager.NoticeData noticeData2 = new NoticePerfManager.NoticeData(noticeData.timestamp, noticeData.resp);
                    ActivitiesPerfCacheManager.JanusData LIZIZ = ActivitiesPerfCacheManager.LIZIZ();
                    if (LIZIZ != null && LIZIZ.resp.getData() != null) {
                        janusData = new NoticePerfManager.JanusData(LIZIZ.timestamp, LIZIZ.resp);
                    }
                    this.LJIIL.LJIIIZ(noticeData2.resp);
                    if (janusData != null) {
                        C56745MOv c56745MOv = this.LJIIJJI;
                        NoticeCombineResponse resp = janusData.resp;
                        c56745MOv.getClass();
                        o.LJIIIZ(resp, "resp");
                        c56745MOv.LJIIIIZZ(resp);
                        c56745MOv.LIZJ();
                        this.LJIIL.LJIIJJI(this.LJIIJJI.LJ());
                        this.LJIIL.LJIIJ(this.LJIIJJI.LJFF());
                    }
                    V1B.LJLJJI(LJIIIIZZ(), MQ0.LOADING);
                    int i = !LJIJ() ? 1 : 0;
                    if (C56805MRd.LIZJ()) {
                        EnumC56806MRe.LJLLI.LJFF(i);
                    }
                    MP2.LJIILLIIL(this, reason, false, false, 6);
                    C221018lt.LJFF("ActivitiesPreLoadModel", "injectCache finish");
                    return true;
                }
            }
            C221018lt.LJFF("ActivitiesPreLoadModel", "ModelHolder inject but resp invalid");
            super.LJIIL(MLW.FIRST_REFRESH);
            return true;
        }
        return LJIJJ(reason);
    }

    @Override // X.MP2
    public final void LJIJI(MLW reason) {
        o.LJIIIZ(reason, "reason");
        super.LJIJI(reason);
        if (reason == MLW.PRELOAD_FORM_CACHE_AND_REFRESH) {
            C221018lt.LJFF("ActivitiesPreLoadModel", "after load form cache, start Refresh");
            super.LJIIL(MLW.FIRST_REFRESH);
        }
    }
}
