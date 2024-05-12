package X;

import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class MMH {
    public static int LIZIZ;
    public static final List<MMJ> LIZLLL;
    public static final List<MMJ> LJ;
    public static final boolean LJFF;
    public static final MMH LIZ = new MMH();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    static {
        MMJ mmj = MMJ.SKYLIGHT_SHOW_TIME;
        MMJ mmj2 = MMJ.ENTRANCE_LIST_SHOW_TIME;
        LIZLLL = C47261Igj.LJJIJIIJI(mmj, mmj2, MMJ.DM_SHOW_TIME);
        LJ = C47261Igj.LJJIJIIJI(mmj, mmj2);
        LJFF = !DmNoticeProxyImpl.LJI().LIZIZ();
    }

    public static void LIZ() {
        if (PreloadManager.LIZ.compareAndSet(false, true)) {
            MMI mmi = MMI.SWITCH_TAB_TIMESTAMP;
            mmi.trackTime();
            MMJ.SKYLIGHT_SHOW_TIME.intervalStart();
            MMJ.ENTRANCE_LIST_SHOW_TIME.intervalStart();
            MMJ.DM_SHOW_TIME.intervalStart();
            MMI mmi2 = MMI.LAUNCH_TO_TAB_INTERVAL;
            MMI mmi3 = MMI.LAUNCH_TIMESTAMP;
            mmi2.setEventValue(mmi.minus(mmi3));
            MMI mmi4 = MMI.NOTICE_COUNT_TO_TAB_INTERVAL;
            MMI mmi5 = MMI.NOTICE_COUNT_TIMESTAMP;
            mmi4.setEventValue(mmi.minus(mmi5));
            MMI.LAUNCH_TO_NOTICE_COUNT_INTERVAL.setEventValue(mmi5.minus(mmi3));
            int LJIIJJI = C54362LVe.LJIIJJI();
            int LJIIJ = C54362LVe.LJIIJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("numCount= ");
            LIZ2.append(LJIIJJI);
            LIZ2.append(", dotCount = ");
            LIZ2.append(LJIIJ);
            C221018lt.LJFF("PreloadStatics", X1D.LIZIZ(LIZ2));
            long j = 0;
            MMI.TOTAL_UNREAD_COUNT.setEventValue(LJIIJJI > 0 ? LJIIJJI : 0L);
            MMI mmi6 = MMI.HAS_TAB_DOT;
            if (LJIIJJI == 0 && LJIIJ > 0) {
                j = 1;
            }
            mmi6.setEventValue(j);
            C188727au c188727au = new C188727au();
            for (MMI mmi7 : MMI.values()) {
                c188727au.LJ(mmi7.getEventValue(), mmi7.getEventKey());
            }
            FMX.LJIIL("inbox_switch_tab_perf", c188727au.LIZ);
        }
    }
}
