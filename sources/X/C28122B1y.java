package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.GuaranteeConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.B1y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28122B1y extends AbstractC65781Prl implements InterfaceC65784Pro<GuaranteeConfig> {
    public static final C28122B1y LJLIL = new C28122B1y();

    public C28122B1y() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final GuaranteeConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        GuaranteeConfig guaranteeConfig = C28121B1x.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ec_payment_guarantee_enhance", 31744, GuaranteeConfig.class, guaranteeConfig);
        if (LJIJ == 0) {
            C28121B1x.LIZ.getClass();
        } else {
            guaranteeConfig = LJIJ;
        }
        o.LJIIIIZZ(guaranteeConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return guaranteeConfig;
    }
}
