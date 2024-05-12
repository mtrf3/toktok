package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.3km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92923km {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(Context context, float f) {
        o.LJIIJ(context, "context");
        Resources resources = context.getResources();
        o.LJFF(resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
