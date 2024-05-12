package X;

import Y.IDcS14S1100000_10;
import android.util.LruCache;
import com.bytedance.im.core.model.RangeList;

/* renamed from: X.OqH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63141OqH {
    public static final LruCache<String, RangeList> LIZ = new LruCache<>(30);

    public static void LIZ(RangeList rangeList, String str) {
        LIZ.put(str, rangeList);
        RunnableC63345OtZ.LIZLLL(new IDcS14S1100000_10(rangeList, str, 2), null, C63346Ota.LIZIZ());
    }
}
