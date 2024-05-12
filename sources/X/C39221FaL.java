package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.FaL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39221FaL {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, Context context) {
        o.LJIIJ(context, "context");
        Resources resources = context.getResources();
        o.LJFF(resources, "resources");
        return (int) (i / (resources.getDisplayMetrics().densityDpi / 160));
    }
}
