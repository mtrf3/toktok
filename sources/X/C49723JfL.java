package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JfL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49723JfL {
    public static long LIZ = -1;
    public static boolean LIZIZ = true;
    public static String LIZJ = "";

    public static void LIZ(boolean z) {
        if (LIZ < 0 || !LIZIZ) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - LIZ;
        if (currentTimeMillis < 0) {
            return;
        }
        C49760Jfw c49760Jfw = new C49760Jfw();
        c49760Jfw.LJIIZILJ("first_frame_duration", String.valueOf(currentTimeMillis));
        c49760Jfw.LJIIZILJ("is_show_first_frame", String.valueOf(z));
        String chunkType = LIZJ;
        o.LJIIIZ(chunkType, "chunkType");
        c49760Jfw.LJIIZILJ("chunk_type", chunkType);
        c49760Jfw.LJIILIIL();
        LIZ = -1L;
        LIZIZ = false;
        LIZJ = "";
    }
}
