package X;

import android.app.Application;

/* renamed from: X.66i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1549666i {
    public static final Application LIZ = C60903NvH.LJ;

    public static int LIZIZ() {
        float LIZ2;
        boolean LIZ3 = AnonymousClass668.LIZ();
        Application application = LIZ;
        if (LIZ3) {
            LIZ2 = C170576mj.LIZ(application, 58.0f);
        } else {
            LIZ2 = C170576mj.LIZ(application, 62.0f);
        }
        return (int) LIZ2;
    }

    public static int LIZ(boolean z) {
        if (!AnonymousClass668.LIZ()) {
            if (z) {
                return (int) C170576mj.LIZ(LIZ, 33.0f);
            }
            return 0;
        }
        C157226Fa c157226Fa = C157226Fa.LIZ;
        if (c157226Fa.LJIILIIL()) {
            return SFS.LJI(-22.0d) + (c157226Fa.getBottomMargin() - c157226Fa.LIZLLL());
        }
        return SFS.LJI(36.0d);
    }
}
