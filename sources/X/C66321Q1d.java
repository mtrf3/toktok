package X;

import android.util.LruCache;
import java.util.List;

/* renamed from: X.Q1d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66321Q1d {
    public LruCache<String, List<Q2L>> LIZ;

    public C66321Q1d(int i) {
        if (i > 0) {
            this.LIZ = new LruCache<>(i);
        }
    }
}
