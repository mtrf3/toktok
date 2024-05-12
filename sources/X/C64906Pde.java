package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Pde, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64906Pde implements InterfaceC65108Pgu {
    public static final C64906Pde LIZ = new C64906Pde();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        if (!c64907Pdf.LIZ) {
            return;
        }
        C22660uk c22660uk = c64907Pdf.LIZIZ.LJI;
        o.LJIIIIZZ(c22660uk, "request.mutableUrl.query");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        QJY.LJI(linkedHashMap, true);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c22660uk.LJ((String) entry.getKey(), (String) entry.getValue());
        }
        String LJIIZILJ = C78939UyV.LJIIZILJ(c64907Pdf);
        String pattern = C47959Irz.LIZLLL(31744, "aweme_request_hpack_optimization_v2", "", true);
        if (!o.LJ(pattern, E2P.LIZ.getPattern())) {
            o.LJIIIIZZ(pattern, "pattern");
            E2P.LIZ = new OJD(pattern);
        }
        if (E2P.LIZ.matches(LJIIZILJ)) {
            java.util.Map map = (java.util.Map) c64907Pdf.LIZJ.LIZ;
            String LJII = C34821Yg.LJII("force_tt_hpack_optimization");
            Object obj = map.get(LJII);
            if (obj == null) {
                obj = new ArrayList();
                map.put(LJII, obj);
            }
            List list = (List) obj;
            list.clear();
            list.add(new EJ6("force_tt_hpack_optimization", "true"));
        }
    }
}
