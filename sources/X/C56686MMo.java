package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MMo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56686MMo {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(InboxEntranceResponse inboxEntranceResponse) {
        List<InboxEntranceCell> entranceCells;
        InboxEntranceCell inboxEntranceCell;
        List<MusNotice> items;
        NoticeItems notices;
        List<MusNotice> items2;
        if (inboxEntranceResponse != null && (entranceCells = inboxEntranceResponse.getEntranceCells()) != null) {
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
            if (inboxEntranceCell2 != null) {
                InboxEntranceExposedInfo exposedInfo = inboxEntranceCell2.getExposedInfo();
                if (exposedInfo != null && (notices = exposedInfo.getNotices()) != null && (items2 = notices.getItems()) != null) {
                    Iterator<MusNotice> it2 = items2.iterator();
                    while (it2.hasNext()) {
                        it2.next().dataSourceInterfaceName = "entrance_list";
                    }
                }
                NoticeItems noticePreloadItem = inboxEntranceCell2.getNoticePreloadItem();
                if (noticePreloadItem != null && (items = noticePreloadItem.getItems()) != null) {
                    Iterator<MusNotice> it3 = items.iterator();
                    while (it3.hasNext()) {
                        it3.next().dataSourceInterfaceName = "entrance_list";
                    }
                }
            }
        }
    }

    public static final void LIZIZ(NoticeListsResponse noticeListsResponse) {
        List<NoticeItems> notices;
        if (noticeListsResponse != null && (notices = noticeListsResponse.getNotices()) != null && (!notices.isEmpty())) {
            Iterator<NoticeItems> it = notices.iterator();
            while (it.hasNext()) {
                List<MusNotice> items = it.next().getItems();
                if (items != null) {
                    Iterator<MusNotice> it2 = items.iterator();
                    while (it2.hasNext()) {
                        it2.next().dataSourceInterfaceName = "notice_multi";
                    }
                }
            }
        }
    }
}
