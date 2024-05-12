package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpModuleDSLBody;
import kotlin.jvm.internal.o;

/* renamed from: X.RbG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69854RbG extends AbstractC65781Prl implements InterfaceC65784Pro<PdpModuleDSLBody> {
    public static final C69854RbG LJLIL = new C69854RbG();

    public C69854RbG() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final PdpModuleDSLBody invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        PdpModuleDSLBody pdpModuleDSLBody = C69853RbF.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ecom_pdp_module_cfg_android", 31744, PdpModuleDSLBody.class, pdpModuleDSLBody);
        if (LJIJ != 0) {
            pdpModuleDSLBody = LJIJ;
        }
        o.LJIIIIZZ(pdpModuleDSLBody, "ABManager.getInstance()\n…e::class.java) ?: DEFAULT");
        return pdpModuleDSLBody;
    }
}
