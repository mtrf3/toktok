package X;

import android.content.res.Resources;
import kotlin.jvm.internal.o;

/* renamed from: X.aVX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93727aVX {
    public static float LIZ(float f) {
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        return f * system.getDisplayMetrics().density;
    }

    public static int LIZIZ(int i) {
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        return (int) ((i * system.getDisplayMetrics().density) + 0.5f);
    }
}
