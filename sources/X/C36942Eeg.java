package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;

/* renamed from: X.Eeg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36942Eeg {
    public static long LIZ;
    public static NLEModel LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(EL8.LJLIL);

    public static void LIZ() {
        LIZ = 0L;
        LIZIZ = null;
        C60903NvH.LJ.unregisterActivityLifecycleCallbacks((EL7) LIZJ.getValue());
        C124144u2.LIZ.getClass();
        C124144u2.LIZIZ = false;
    }

    public static Long LIZIZ(NLEModel nLEModel) {
        if (nLEModel == null || !C45087Hml.LJIILJJIL()) {
            return null;
        }
        LIZ();
        C60903NvH.LJ.registerActivityLifecycleCallbacks((EL7) LIZJ.getValue());
        LIZ = System.nanoTime();
        LIZIZ = nLEModel;
        C124144u2.LIZ.getClass();
        C124144u2.LIZIZ = true;
        return Long.valueOf(LIZ);
    }
}
