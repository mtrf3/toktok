package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.PDPHeaderImageExperiment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PDPImageConfig;

/* loaded from: classes16.dex */
public final class X9X extends AbstractC65781Prl implements InterfaceC65784Pro<PDPImageConfig> {
    public static final X9X LJLIL = new X9X();

    public X9X() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.ecommerce.core.ab.PDPImageConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PDPImageConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PDPImageConfig pDPImageConfig = PDPHeaderImageExperiment.none;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "ecom_pdp_header_img_setting", 31744, PDPImageConfig.class, pDPImageConfig);
        if (LJIJ == 0) {
            return pDPImageConfig;
        }
        return LJIJ;
    }
}
