package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MOM implements Comparator<NoticeChannelInfo> {
    @Override // java.util.Comparator
    public final int compare(NoticeChannelInfo noticeChannelInfo, NoticeChannelInfo noticeChannelInfo2) {
        NoticeChannelInfo first = noticeChannelInfo;
        NoticeChannelInfo second = noticeChannelInfo2;
        o.LJIIIZ(first, "first");
        o.LJIIIZ(second, "second");
        if (!second.hasRead) {
            if (first.hasRead) {
                return 1;
            }
        } else if (!first.hasRead) {
            return -1;
        }
        return 0;
    }
}
