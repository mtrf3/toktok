package X;

import java.util.Iterator;
import java.util.List;
import ujb.s;

/* renamed from: X.Pdb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64903Pdb implements InterfaceC64917Pdp {
    public final List<String> LIZ;

    @Override // X.InterfaceC64917Pdp
    public final void LIZLLL(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
    }

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    public C64903Pdb(List<String> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC64917Pdp
    public final C64797Pbt<?> LIZIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        String LIZ = c64907Pdf.LIZIZ.LJFF.LIZ();
        Iterator<String> it = this.LIZ.iterator();
        while (it.hasNext()) {
            if (s.LJJJLZIJ(LIZ, it.next(), false)) {
                try {
                    c64907Pdf.LIZJ.LIZLLL("x-traceparent", PII.LIZ());
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
