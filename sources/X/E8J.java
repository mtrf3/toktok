package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopCloneConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8J extends AbstractC65781Prl implements InterfaceC65784Pro<VopCloneConfig> {
    public static final E8J LJLIL = new E8J();

    public E8J() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final VopCloneConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        VopCloneConfig vopCloneConfig = E8I.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "vop_clone_config", 31744, VopCloneConfig.class, vopCloneConfig);
        if (LJIJ != 0) {
            vopCloneConfig = LJIJ;
        }
        o.LJIIIIZZ(vopCloneConfig, "ABManager.getInstance().…t::class.java) ?: DEFAULT");
        return vopCloneConfig;
    }
}
