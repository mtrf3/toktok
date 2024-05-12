package X;

import com.ss.android.ugc.aweme.ecommercelive.business.audience.config.PrefetchPinConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.RwJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71159RwJ extends AbstractC65781Prl implements InterfaceC65784Pro<PrefetchPinConfig> {
    public static final C71159RwJ LJLIL = new C71159RwJ();

    public C71159RwJ() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PrefetchPinConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PrefetchPinConfig prefetchPinConfig = C71158RwI.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ec_prefetch_pin_config", 31744, PrefetchPinConfig.class, prefetchPinConfig);
        if (LJIJ == 0) {
            C71158RwI.LIZ.getClass();
        } else {
            prefetchPinConfig = LJIJ;
        }
        o.LJIIIIZZ(prefetchPinConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return prefetchPinConfig;
    }
}
