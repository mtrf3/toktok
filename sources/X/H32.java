package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H32 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(H3F.LJLIL);

    public final C44428Hc8 LIZ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-counter>(...)");
        return (C44428Hc8) value;
    }

    public final void LIZJ() {
        if (LIZ().LIZIZ) {
            LIZIZ("repeat start");
        } else {
            LIZ().LIZLLL();
        }
    }

    public final void LIZLLL() {
        if (!LIZ().LIZIZ) {
            LIZIZ("repeat stop");
        } else {
            LIZ().LJ();
        }
    }

    public static void LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadWaitTimeCounter upload sdk call error: ");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C5L7.LIZIZ();
        H78.LIZJ(LIZIZ);
    }
}
