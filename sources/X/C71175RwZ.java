package X;

import com.ss.android.ugc.aweme.ecommercelive.common.popcard.settings.PinCardStyleConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.RwZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71175RwZ extends AbstractC65781Prl implements InterfaceC65784Pro<PinCardStyleConfig> {
    public static final C71175RwZ LJLIL = new C71175RwZ();

    public C71175RwZ() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PinCardStyleConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PinCardStyleConfig pinCardStyleConfig = C71174RwY.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ecommerce_pin_card_config", 31744, PinCardStyleConfig.class, pinCardStyleConfig);
        if (LJIJ == 0) {
            C71174RwY.LIZ.getClass();
        } else {
            pinCardStyleConfig = LJIJ;
        }
        o.LJIIIIZZ(pinCardStyleConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return pinCardStyleConfig;
    }
}
