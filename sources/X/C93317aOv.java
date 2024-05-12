package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.aOv, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93317aOv {
    public static WeakReference<Context> LIZ;

    public static Context LIZ() {
        WeakReference<Context> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        throw new RuntimeException("ContextContainer null");
    }
}
