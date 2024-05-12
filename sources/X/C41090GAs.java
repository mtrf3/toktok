package X;

import Y.AfS46S0300000_7;
import Y.AfS59S0100000_7;
import Y.IDhS100S0100000_7;
import com.ss.android.ugc.aweme.geofencing.api.TranslatedRegionApi;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.util.List;

/* renamed from: X.GAs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41090GAs {
    public static List<TranslatedRegion> LIZ = C61878OQg.INSTANCE;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C41093GAv.LJLIL);

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (!LIZ.isEmpty()) {
            interfaceC65784Pro.invoke();
            return;
        }
        C73318Sq2 c73318Sq2 = (C73318Sq2) LIZIZ.getValue();
        TranslatedRegionApi.LIZ.getClass();
        c73318Sq2.LIZ(new C73524StM(C41492GQe.LIZ().getTranslatedRegions().LJIIJJI(C41091GAt.LJLIL).LJIIL(C73969T1h.LIZIZ()).LJIJJ(T16.LIZ()), new AfS59S0100000_7(interfaceC65784Pro, 79)).LJIILIIL(C41088GAq.LJLIL).LJIILLIIL(G94.LJLIL));
    }

    public static void LIZ(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        if (LIZ.isEmpty()) {
            LIZJ(interfaceC88472Yns, interfaceC88472Yns2);
        } else {
            interfaceC88472Yns.invoke(C62814Ol0.LJIIIIZZ(LIZ));
        }
    }

    public static void LIZJ(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        if (LIZ.isEmpty()) {
            C68322mC c68322mC = new C68322mC();
            C73318Sq2 c73318Sq2 = (C73318Sq2) LIZIZ.getValue();
            TranslatedRegionApi.LIZ.getClass();
            c73318Sq2.LIZ(new C73524StM(C41492GQe.LIZ().getTranslatedRegions().LJIIJJI(C41092GAu.LJLIL).LJIIL(C73969T1h.LIZIZ()).LJIJJ(T16.LIZ()), G92.LJLIL).LJIILIIL(new IDhS100S0100000_7(c68322mC, 9)).LJIILLIIL(new AfS46S0300000_7(c68322mC, interfaceC88472Yns, interfaceC88472Yns2, 7)));
            return;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(C62814Ol0.LJIIIIZZ(LIZ));
        }
        C41049G9d.LIZIZ(LIZ);
    }
}
