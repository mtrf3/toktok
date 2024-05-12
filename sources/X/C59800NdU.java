package X;

import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import kotlin.jvm.internal.o;

/* renamed from: X.NdU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59800NdU extends LynxViewClient {
    public final NUT LIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
    }

    public C59800NdU(NUT bulletBusiness) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZ = bulletBusiness;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        if (this.LIZ.LIZ(AdLynxStatBusiness.class) != null) {
            Double.valueOf(lynxPerfMetric.getFirsPageLayout()).longValue();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LIZ.LIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZJ();
        }
    }
}
