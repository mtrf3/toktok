package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.ArI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27532ArI {
    public static View LIZ(int i, Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIIZ(context, "context");
        WeakReference<L9X> weakReference = L9X.LIZJ;
        L9X l9x = null;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<L9X> weakReference2 = L9X.LIZJ;
            if (weakReference2 != null) {
                l9x = weakReference2.get();
            }
            o.LJI(l9x);
            View LIZ = l9x.LIZ(i);
            if (z && viewGroup != null) {
                viewGroup.addView(LIZ);
                return LIZ;
            }
            return LIZ;
        }
        return AnonymousClass030.LIZLLL(context, i, viewGroup, z, "from(context).inflate(la…, parent, attachToParent)");
    }
}
