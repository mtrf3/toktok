package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PRc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64448PRc {
    public static boolean LIZIZ;
    public static InterfaceC48864JFs LIZJ;
    public static InterfaceC64451PRf LIZLLL;
    public static InterfaceC64450PRe LJ;
    public static InterfaceC64452PRg LJFF;
    public static final C64448PRc LIZ = new C64448PRc();
    public static final java.util.Map<String, C64449PRd> LJI = new LinkedHashMap();

    public static final void LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (!LIZIZ) {
            return;
        }
        InterfaceC64452PRg interfaceC64452PRg = LJFF;
        if (interfaceC64452PRg != null) {
            if (!interfaceC64452PRg.LIZ(scene)) {
                return;
            }
            java.util.Map<String, C64449PRd> map = LJI;
            C64449PRd c64449PRd = (C64449PRd) ((LinkedHashMap) map).get(scene);
            if (c64449PRd == null) {
                c64449PRd = new C64449PRd(scene);
                map.put(scene, c64449PRd);
            }
            if (!c64449PRd.LIZJ) {
                InterfaceC64450PRe interfaceC64450PRe = LJ;
                if (interfaceC64450PRe != null) {
                    interfaceC64450PRe.LJ(c64449PRd.LIZIZ());
                    InterfaceC48864JFs interfaceC48864JFs = LIZJ;
                    if (interfaceC48864JFs != null) {
                        interfaceC48864JFs.LIZ(c64449PRd);
                        c64449PRd.LIZJ = true;
                        return;
                    } else {
                        o.LJIJI("_doFrameDetector");
                        throw null;
                    }
                }
                o.LJIJI("_slowMethodSceneMarker");
                throw null;
            }
            return;
        }
        o.LJIJI("_sceneFilter");
        throw null;
    }

    public static final void LIZJ(String scene) {
        C64449PRd remove;
        o.LJIIIZ(scene, "scene");
        if (LIZIZ && (remove = LJI.remove(scene)) != null && remove.LIZJ) {
            InterfaceC64450PRe interfaceC64450PRe = LJ;
            if (interfaceC64450PRe != null) {
                interfaceC64450PRe.LIZJ(remove.LIZIZ());
                InterfaceC48864JFs interfaceC48864JFs = LIZJ;
                if (interfaceC48864JFs != null) {
                    interfaceC48864JFs.LIZIZ(remove);
                    remove.LIZIZ = 1;
                    return;
                } else {
                    o.LJIJI("_doFrameDetector");
                    throw null;
                }
            }
            o.LJIJI("_slowMethodSceneMarker");
            throw null;
        }
    }

    public static final void LIZ(C48863JFr c48863JFr, C72085SQv c72085SQv, C47261Igj c47261Igj, C66851QLn c66851QLn) {
        if (!LIZIZ) {
            synchronized (LIZ) {
                if (!LIZIZ) {
                    LIZJ = c48863JFr;
                    LIZLLL = c72085SQv;
                    LJ = c47261Igj;
                    LJFF = c66851QLn;
                    LIZIZ = true;
                }
            }
        }
    }
}
