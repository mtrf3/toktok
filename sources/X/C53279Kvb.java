package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadConfig;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;

/* renamed from: X.Kvb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53279Kvb extends AbstractC65781Prl implements InterfaceC65784Pro<ImagePreloadConfig> {
    public static final C53279Kvb LJLIL = new C53279Kvb();

    public C53279Kvb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ImagePreloadConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ImagePreloadConfig imagePreloadConfig = ImagePreloadExperiment.NONE;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "ecom_schema_image_prefetch_config", 31744, ImagePreloadConfig.class, imagePreloadConfig);
        if (LJIJ == 0) {
            return imagePreloadConfig;
        }
        return LJIJ;
    }
}
