package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLS {
    public static final List<String> LIZ;
    public static List<NoticeCount> LIZIZ;
    public static List<NoticeInboxFilterGroups> LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static MultiViewModel LJFF;

    static {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(ArrayList<String>())");
        LIZ = synchronizedList;
    }

    public static void LJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resetInboxUnreadCountAsAfterMark, showBeforeMarkRead: ");
        LIZ2.append(LIZLLL);
        LIZ2.append(", afterMarkNoticeCount: ");
        LIZ2.append(LIZIZ);
        C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ2));
        if (LIZLLL && LIZIZ != null) {
            C221018lt.LJFF("InboxActivityHelper", "resetInboxUnreadCountAsAfterMark, rxInitNoticeCount");
            C54362LVe.LJIJI(new NoticeList(null, LIZIZ, 0L, null, LIZJ, null, null, 109, null)).LJJJJZ();
        }
        LJFF();
        C221018lt.LJFF("InboxActivityHelper", "resetNoticeCountAndShowMark, clearNoticeIds");
        LIZ.clear();
    }

    public static void LJFF() {
        MultiViewModel multiViewModel;
        InboxEntrancePod inboxEntrancePod;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resetShowBeforeMarkReadByActive, showBeforeMarkRead: ");
        LIZ2.append(LIZLLL);
        LIZ2.append(", isInInbox: ");
        HH1.LIZIZ(LIZ2, LJ, LIZ2, "InboxActivityHelper");
        if (!LJ) {
            return;
        }
        boolean z = LIZLLL;
        LIZLLL = false;
        if (z && (multiViewModel = LJFF) != null && (inboxEntrancePod = multiViewModel.LLFFF) != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("MultiViewModel#refreshEntranceData, beforeMarkUnreadCount: ");
            LIZ3.append(inboxEntrancePod.entranceCell.getBeforeMarkUnreadCount());
            LIZ3.append(", afterMarkUnreadCount: ");
            LIZ3.append(inboxEntrancePod.entranceCell.getUnreadCount());
            C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ3));
            multiViewModel.qv0(inboxEntrancePod.entranceCell, InboxEntranceCell.copy$default(inboxEntrancePod.entranceCell, 0, 0, 0, null, 0L, false, false, 0, 0, 0, null, null, inboxEntrancePod.entranceCell.getUnreadCount(), inboxEntrancePod.entranceCell.getUiInfo(), null, 20479, null), true);
        }
    }

    public static void LIZ(int i) {
        NoticeCount noticeCount;
        NoticeCount noticeCount2;
        if (LIZLLL) {
            List<NoticeCount> list = LIZIZ;
            Integer num = null;
            if (list != null) {
                Iterator<NoticeCount> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        noticeCount2 = it.next();
                        if (noticeCount2.getGroup() == i) {
                            break;
                        }
                    } else {
                        noticeCount2 = null;
                        break;
                    }
                }
                noticeCount = noticeCount2;
            } else {
                noticeCount = null;
            }
            StringBuilder LJ2 = C7MY.LJ("clearNoticeCountByGroup, group: ", i, ", count: ");
            if (noticeCount != null) {
                num = Integer.valueOf(noticeCount.getCount());
            }
            LJ2.append(num);
            C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LJ2));
            if (noticeCount == null) {
                return;
            }
            noticeCount.setCount(0);
        }
    }

    public static InboxEntranceCellUIInfo LIZIZ(InboxEntrancePod pod) {
        InboxEntranceCellUIInfo uiInfo;
        o.LJIIIZ(pod, "pod");
        if (!pod.entranceCell.isActivity()) {
            return pod.entranceCell.getUiInfo();
        }
        if (LIZLLL) {
            uiInfo = pod.entranceCell.getBeforeMarkUiInfo();
        } else {
            uiInfo = pod.entranceCell.getUiInfo();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getActivityUiInfo, showBeforeMarkRead: ");
        LIZ2.append(LIZLLL);
        LIZ2.append(", uiInfo: ");
        LIZ2.append(uiInfo);
        C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ2));
        return uiInfo;
    }

    public static List LIZJ(InboxEntranceResponse response) {
        List<NoticeCount> noticeCounts;
        o.LJIIIZ(response, "response");
        LIZJ = response.getGroups();
        LIZIZ = response.getNoticeCounts();
        if (LIZLLL) {
            noticeCounts = response.getBeforeMarkNoticeCounts();
        } else {
            noticeCounts = response.getNoticeCounts();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAndSetNoticeCounts, showBeforeMarkRead: ");
        LIZ2.append(LIZLLL);
        LIZ2.append(", noticeCounts: ");
        LIZ2.append(noticeCounts);
        C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ2));
        return noticeCounts;
    }

    public static int LIZLLL(InboxEntranceCell entranceCell) {
        int unreadCount;
        o.LJIIIZ(entranceCell, "entranceCell");
        if (!entranceCell.isActivity()) {
            return entranceCell.getUnreadCount();
        }
        if (LIZLLL) {
            unreadCount = entranceCell.getBeforeMarkUnreadCount();
        } else {
            unreadCount = entranceCell.getUnreadCount();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getEntranceUnreadCount, isActivity, showBeforeMarkRead: ");
        C1FL.LJFF(LIZ2, LIZLLL, ", unreadCount: ", unreadCount, ", beforeMarkUnreadCount: ");
        LIZ2.append(entranceCell.getBeforeMarkUnreadCount());
        LIZ2.append(", afterMarkUnreadCount: ");
        LIZ2.append(entranceCell.getUnreadCount());
        C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ2));
        return unreadCount;
    }

    public static void LJI(InboxEntranceResponse response) {
        boolean z;
        InboxEntranceCell inboxEntranceCell;
        InboxEntranceExposedInfo exposedInfo;
        NoticeItems notices;
        List<MusNotice> items;
        o.LJIIIZ(response, "response");
        C56691MMt.LIZ.getClass();
        if (C56691MMt.LIZ() && C53357Kwr.LIZIZ() && response.getBeforeMarkNoticeCounts() != null) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL = z;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setShowBeforeMarkReadByResponse, pull entrance/list, showBeforeMarkRead: ");
        LIZ2.append(LIZLLL);
        LIZ2.append(", redDotNotDisappear: ");
        LIZ2.append(C56691MMt.LIZ());
        LIZ2.append(", isDisplayNotification: ");
        LIZ2.append(C53357Kwr.LIZIZ());
        LIZ2.append("activity_sort_strategy: ");
        LIZ2.append(C53243Kv1.LIZ());
        C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ2));
        if (LIZLLL) {
            LIZ.clear();
            List<InboxEntranceCell> entranceCells = response.getEntranceCells();
            if (entranceCells != null) {
                Iterator<InboxEntranceCell> it = entranceCells.iterator();
                while (true) {
                    if (it.hasNext()) {
                        inboxEntranceCell = it.next();
                        if (inboxEntranceCell.isActivity()) {
                            break;
                        }
                    } else {
                        inboxEntranceCell = null;
                        break;
                    }
                }
                InboxEntranceCell inboxEntranceCell2 = inboxEntranceCell;
                if (inboxEntranceCell2 != null && (exposedInfo = inboxEntranceCell2.getExposedInfo()) != null && (notices = exposedInfo.getNotices()) != null && (items = notices.getItems()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (MusNotice musNotice : items) {
                        if (!musNotice.hasRead) {
                            arrayList.add(musNotice);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        BaseNotice baseNotice = (BaseNotice) it2.next();
                        List<String> list = LIZ;
                        String str = baseNotice.nid;
                        o.LJIIIIZZ(str, "it.nid");
                        list.add(str);
                    }
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("setUnreadNIds, unreadNIds: ");
            LIZ3.append(LIZ);
            C221018lt.LJFF("InboxActivityHelper", X1D.LIZIZ(LIZ3));
        }
    }
}
