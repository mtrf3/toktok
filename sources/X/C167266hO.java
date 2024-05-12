package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.6hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167266hO extends AbstractC65781Prl implements InterfaceC65784Pro<VCOptConfig> {
    public static final C167266hO LJLIL = new C167266hO();

    public C167266hO() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final VCOptConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        VCOptConfig vCOptConfig = C167246hM.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "studio_vc_export_config", 31744, VCOptConfig.class, vCOptConfig);
        if (LJIJ != 0) {
            vCOptConfig = LJIJ;
        }
        o.LJIIIIZZ(vCOptConfig, "ABManager.getInstance().…ch::class.java) ?: CONFIG");
        return vCOptConfig;
    }
}
