package X;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.o;

/* renamed from: X.a3V, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91989a3V {
    public static final float LIZ(Number number) {
        o.LJIIIZ(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }
}
