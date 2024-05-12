package X;

import com.ss.android.ugc.aweme.poi.experiment.NearbyPreloadGeckoExperiment;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lab, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54525Lab extends AbstractC65781Prl implements InterfaceC88474Ynu<EnumC54527Lad, InterfaceC88472Yns<? super String, ? extends C76800UCe>, InterfaceC88472Yns<? super String, ? extends C76800UCe>, InterfaceC88472Yns<? super String, ? extends C76800UCe>, C76800UCe> {
    public static final C54525Lab LJLIL = new C54525Lab();

    public C54525Lab() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(EnumC54527Lad enumC54527Lad, InterfaceC88472Yns<? super String, ? extends C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, ? extends C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super String, ? extends C76800UCe> interfaceC88472Yns3) {
        Boolean bool;
        EnumC54527Lad scene = enumC54527Lad;
        InterfaceC88472Yns<? super String, ? extends C76800UCe> interfaceC88472Yns4 = interfaceC88472Yns;
        InterfaceC88472Yns<? super String, ? extends C76800UCe> interfaceC88472Yns5 = interfaceC88472Yns2;
        InterfaceC88472Yns<? super String, ? extends C76800UCe> interfaceC88472Yns6 = interfaceC88472Yns3;
        o.LJIIIZ(scene, "scene");
        if (!C54526Lac.LIZLLL) {
            int i = NearbyPreloadGeckoExperiment.LIZ().subStrategy;
            C54526Lac.LIZLLL = true;
            InterfaceC54498LaA interfaceC54498LaA = C54526Lac.LJ;
            if (interfaceC54498LaA != null) {
                bool = Boolean.valueOf(interfaceC54498LaA.LIZ(i, false, new AqS69S0400000_9(scene, (EnumC54527Lad) interfaceC88472Yns4, (InterfaceC88472Yns<? super String, C76800UCe>) interfaceC88472Yns5, (InterfaceC88472Yns<? super String, C76800UCe>) interfaceC88472Yns6, (InterfaceC88472Yns<? super String, C76800UCe>) 4)));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.FALSE)) {
                C54526Lac.LIZ(scene, (List) ((LinkedHashMap) C54526Lac.LIZIZ).get(scene), interfaceC88472Yns4, interfaceC88472Yns5, interfaceC88472Yns6);
                C54526Lac.LIZLLL = false;
            }
        }
        return C76800UCe.LIZ;
    }
}
