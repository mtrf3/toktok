package X;

import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA4 implements InterfaceC51344KDc {
    public final /* synthetic */ EcSearchSugAssem LIZ;

    public KA4(EcSearchSugAssem ecSearchSugAssem) {
        this.LIZ = ecSearchSugAssem;
    }

    @Override // X.InterfaceC51344KDc
    public final void LIZ() {
        String str = this.LIZ.H3().LJLJJL;
        if (str != null) {
            EcSearchSugAssem ecSearchSugAssem = this.LIZ;
            K4I LIZ = K4O.LIZ(str);
            String hv0 = ecSearchSugAssem.I3().hv0();
            LIZ.getClass();
            LIZ.LJI = hv0;
            LIZ.LJIIIIZZ = ecSearchSugAssem.I3().iv0();
            LIZ.LJII = C51214K8c.LJ(ecSearchSugAssem.I3().jv0());
            LIZ.LIZ();
            if (o.LJ(str, ecSearchSugAssem.I3().LJLJJI)) {
                OptimizerHelperServiceImpl.LJIIIZ().LIZLLL();
            }
        }
    }
}
