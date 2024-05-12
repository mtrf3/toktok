package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7A {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(double d, Context context) {
        if (context.getResources() != null) {
            Resources resources = context.getResources();
            o.LJFF(resources, "context.resources");
            if (resources.getDisplayMetrics() != null) {
                o.LJFF(context.getResources(), "context.resources");
                return (int) ((d * r0.getDisplayMetrics().density) + 0.5f);
            }
            return 0;
        }
        return 0;
    }
}
