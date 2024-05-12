package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JhU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49856JhU {
    public static boolean LIZ;

    public static void LIZ(C49847JhL streamRoot) {
        o.LJIIIZ(streamRoot, "streamRoot");
        if (streamRoot.LIZJ != null) {
            streamRoot.LJII = true;
            return;
        }
        streamRoot.LJII = false;
        streamRoot.LIZJ = null;
        streamRoot.LIZLLL = null;
        streamRoot.LIZ = null;
        streamRoot.LJ = null;
        streamRoot.LIZIZ = null;
        streamRoot.LJFF = new C49863Jhb();
        boolean z = false;
        streamRoot.LJI = new C49854JhS(z, z, z, z, z, z, z, 4095);
    }
}
