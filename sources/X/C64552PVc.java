package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.PVc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64552PVc {
    public final C64537PUn LIZ;
    public C39745Fin LIZIZ;
    public final List<C64553PVd> LIZJ;

    public final C64551PVb LIZIZ() {
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            return new C64551PVb(this.LIZ, this.LIZIZ, this.LIZJ);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }

    public C64552PVc() {
        String uuid = UUID.randomUUID().toString();
        this.LIZIZ = C64551PVb.LJ;
        this.LIZJ = new ArrayList();
        this.LIZ = C64537PUn.encodeUtf8(uuid);
    }

    public final void LIZ(C64553PVd c64553PVd) {
        if (c64553PVd != null) {
            ((ArrayList) this.LIZJ).add(c64553PVd);
            return;
        }
        throw new NullPointerException("part == null");
    }

    public final void LIZJ(C39745Fin c39745Fin) {
        if (c39745Fin != null) {
            if (c39745Fin.LIZIZ.equals("multipart")) {
                this.LIZIZ = c39745Fin;
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("multipart != ");
            LIZ.append(c39745Fin);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException("type == null");
    }
}
