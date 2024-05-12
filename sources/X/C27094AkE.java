package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.OspJumpOptConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.AkE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27094AkE extends AbstractC65781Prl implements InterfaceC65784Pro<OspJumpOptConfig> {
    public static final C27094AkE LJLIL = new C27094AkE();

    public C27094AkE() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final OspJumpOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        OspJumpOptConfig ospJumpOptConfig = C27093AkD.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ecom_osp_jump_opt_android", 31744, OspJumpOptConfig.class, ospJumpOptConfig);
        if (LJIJ == 0) {
            C27093AkD.LIZ.getClass();
        } else {
            ospJumpOptConfig = LJIJ;
        }
        o.LJIIIIZZ(ospJumpOptConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return ospJumpOptConfig;
    }
}
