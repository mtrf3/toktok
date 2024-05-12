package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Isf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48001Isf {
    public static C47998Isc LIZIZ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static boolean LIZJ = false;

    public static C47998Isc LIZ() {
        if (LIZIZ == null) {
            synchronized (C48001Isf.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C47998Isc();
                }
            }
        }
        return LIZIZ;
    }
}
