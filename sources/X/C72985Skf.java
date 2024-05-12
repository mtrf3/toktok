package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Skf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72985Skf {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context.getResources().getConfiguration().getLayoutDirection() == 0) {
            return true;
        }
        return false;
    }

    public static Object LIZ(Context context, Object obj, Object obj2) {
        o.LJIIIZ(context, "<this>");
        if (context.getResources().getConfiguration().getLayoutDirection() == 0) {
            return obj;
        }
        return obj2;
    }
}
