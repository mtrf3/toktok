package X;

import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public final class Y7Z {
    public static void LIZ(String str) {
        Y7W y7w;
        WeakReference<Y7W> weakReference = Y7W.LJIILJJIL.get(str);
        if (weakReference != null && (y7w = weakReference.get()) != null) {
            y7w.LIZ(0L);
        }
    }
}
