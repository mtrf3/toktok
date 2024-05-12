package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PRd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64449PRd implements InterfaceC48865JFt {
    public final String LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("_drop_count_index_");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C64449PRd(String scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
        this.LIZIZ = 1;
    }

    @Override // X.InterfaceC48865JFt
    public final void LIZ(long j, long j2) {
        InterfaceC64451PRf interfaceC64451PRf = C64448PRc.LIZLLL;
        if (interfaceC64451PRf != null) {
            if (interfaceC64451PRf.LIZIZ(j, j2)) {
                InterfaceC64450PRe interfaceC64450PRe = C64448PRc.LJ;
                if (interfaceC64450PRe != null) {
                    interfaceC64450PRe.LIZJ(LIZIZ());
                    this.LIZIZ++;
                    InterfaceC64450PRe interfaceC64450PRe2 = C64448PRc.LJ;
                    if (interfaceC64450PRe2 != null) {
                        interfaceC64450PRe2.LJ(LIZIZ());
                        return;
                    } else {
                        o.LJIJI("_slowMethodSceneMarker");
                        throw null;
                    }
                }
                o.LJIJI("_slowMethodSceneMarker");
                throw null;
            }
            return;
        }
        o.LJIJI("_dropCountChecker");
        throw null;
    }
}
