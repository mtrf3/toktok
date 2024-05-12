package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.7b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188797b1 {
    public static float LIZ(Context context, float f) {
        Resources resources = context.getResources();
        o.LJFF(resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
