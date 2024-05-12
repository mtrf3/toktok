package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import java.util.List;

/* loaded from: classes10.dex */
public final class LVA {
    public static final List<Integer> LIZ = C47261Igj.LJJIJIIJI(210, 214);

    public static void LIZ(NoticeInboxFilterGroups noticeInboxFilterGroups) {
        List<Integer> list;
        List<Integer> list2 = null;
        if (noticeInboxFilterGroups.LIZ == C56702MNe.LIZ) {
            List<Integer> list3 = noticeInboxFilterGroups.groups;
            if (list3 != null) {
                list = ORZ.LLJILJILJ(list3);
                if (list != null) {
                    list.add(1000);
                }
            } else {
                list = null;
            }
            if (C54316LTk.LIZ && list != null) {
                list.removeAll(LIZ);
            }
            noticeInboxFilterGroups.groups = list;
        }
        if (C54316LTk.LIZ && noticeInboxFilterGroups.LIZ == 37) {
            List<Integer> list4 = noticeInboxFilterGroups.groups;
            if (list4 != null && (list2 = ORZ.LLJILJILJ(list4)) != null) {
                list2.removeAll(LIZ);
            }
            noticeInboxFilterGroups.groups = list2;
        }
    }
}
