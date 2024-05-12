package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.lang.ref.WeakReference;

/* renamed from: X.6qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173046qi {
    public static WeakReference<CutsameDataItem> LIZ;
    public static WeakReference<ShortVideoContext> LIZIZ;
    public static String LIZJ;

    public static ShortVideoContext LIZ() {
        WeakReference<ShortVideoContext> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static CutsameDataItem LIZIZ() {
        WeakReference<CutsameDataItem> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
