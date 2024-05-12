package X;

import android.util.SparseIntArray;

/* loaded from: classes15.dex */
public final class W9E {
    public static final SparseIntArray LIZ = new SparseIntArray(0);

    public static W9W LIZ() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        return new W9W(0, i, LIZ);
    }
}
