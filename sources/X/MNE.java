package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class MNE<T> implements Comparator {
    public static final MNE<T> LJLIL = new MNE<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        BaseNotice baseNotice = (BaseNotice) obj;
        BaseNotice baseNotice2 = (BaseNotice) obj2;
        int i = baseNotice2.priority;
        int i2 = baseNotice.priority;
        int i3 = i - i2;
        if (i2 == i) {
            if (baseNotice2.createTime - baseNotice.createTime > 0) {
                return 1;
            }
        } else {
            if (i3 > 0) {
                return 1;
            }
            if (i3 >= 0) {
                return 0;
            }
        }
        return -1;
    }
}
