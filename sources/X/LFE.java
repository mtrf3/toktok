package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFE {
    public static final LFE LIZ = new LFE();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LFF.LJLIL);
    public static String LIZJ = "";

    public static String LIZ() {
        C53948LFg LIZJ2 = C53946LFe.LIZJ(null, null);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("- c:");
        LIZ2.append(C53947LFf.LIZLLL());
        LIZ2.append(',');
        LIZ2.append(C53947LFf.LIZ());
        LIZ2.append(";n:");
        LIZ2.append(LIZJ2.LIZIZ());
        LIZ2.append(',');
        LIZ2.append(LIZJ2.LIZ());
        return X1D.LIZIZ(LIZ2);
    }

    public static final void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(msg);
        LIZJ = X1D.LIZIZ(LIZ2);
        LFD lfd = (LFD) LIZIZ.getValue();
        if (lfd != null) {
            lfd.LIZIZ();
        }
        C10K.LIZIZ(LFC.LJLIL, C10K.LJIIIIZZ, null);
    }
}
