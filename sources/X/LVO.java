package X;

import android.util.SparseArray;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountMessage;

/* loaded from: classes10.dex */
public final class LVO implements LVU {
    public static final SparseArray<Class> LIZ;

    static {
        SparseArray<Class> sparseArray = new SparseArray<>();
        LIZ = sparseArray;
        sparseArray.put(1, NoticeCountMessage.class);
    }

    @Override // X.LVU
    public final Class LIZ(int i) {
        return LIZ.get(i);
    }
}
