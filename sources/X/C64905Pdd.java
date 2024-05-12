package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pdd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64905Pdd implements InterfaceC65108Pgu {
    public static final C64905Pdd LIZ = new C64905Pdd();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        if (o.LJ(C78939UyV.LJIIZILJ(c64907Pdf), "/webcast/assets/effects/")) {
            java.util.Map map = (java.util.Map) c64907Pdf.LIZJ.LIZ;
            String LJII = C34821Yg.LJII("accept-encoding");
            Object obj = map.get(LJII);
            if (obj == null) {
                obj = new ArrayList();
                map.put(LJII, obj);
            }
            List list = (List) obj;
            list.clear();
            list.add(new EJ6("accept-encoding", "no_comp"));
        }
    }
}
