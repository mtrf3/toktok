package X;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.FyB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40699FyB {
    public static void LIZ(Context context) {
        if (!C40700FyC.LIZ(C40698FyA.class)) {
            try {
                if (C40698FyA.LIZIZ != null) {
                    C40700FyC.LIZ(C40698FyA.class);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        C40698FyA c40698FyA = new C40698FyA(context);
        if (!C40700FyC.LIZ(C40698FyA.class)) {
            try {
                if (!C40700FyC.LIZ(c40698FyA)) {
                    C10760bY LIZ = C10760bY.LIZ(c40698FyA.LIZ);
                    o.LJIIIIZZ(LIZ, "getInstance(applicationContext)");
                    LIZ.LIZIZ(c40698FyA, new IntentFilter("com.parse.bolts.measurement_event"));
                }
            } catch (Throwable unused2) {
            }
        }
        if (!C40700FyC.LIZ(C40698FyA.class)) {
            try {
                C40698FyA.LIZIZ = c40698FyA;
            } catch (Throwable unused3) {
            }
        }
        C40700FyC.LIZ(C40698FyA.class);
    }
}
