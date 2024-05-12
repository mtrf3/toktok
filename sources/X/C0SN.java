package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0SN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SN {
    public static final /* synthetic */ int LIZ = 0;

    public static EdgeEffect LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return C0SE.LIZ(context, null);
        }
        return new C0SH(context);
    }

    public static float LIZIZ(EdgeEffect edgeEffect) {
        o.LJIIIZ(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C0SE.LIZIZ(edgeEffect);
        }
        return 0.0f;
    }

    public static void LIZJ(EdgeEffect edgeEffect, int i) {
        o.LJIIIZ(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static void LJ(EdgeEffect edgeEffect, float f) {
        o.LJIIIZ(edgeEffect, "<this>");
        if (edgeEffect instanceof C0SH) {
            C0SH c0sh = (C0SH) edgeEffect;
            float f2 = c0sh.LIZIZ + f;
            c0sh.LIZIZ = f2;
            if (Math.abs(f2) > c0sh.LIZ) {
                c0sh.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static float LIZLLL(EdgeEffect edgeEffect, float f, float f2) {
        o.LJIIIZ(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C0SE.LIZJ(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
