package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.E6b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35873E6b extends AbstractC65781Prl implements InterfaceC65784Pro<VopSignUpConfig> {
    public static final C35873E6b LJLIL = new C35873E6b();

    public C35873E6b() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final VopSignUpConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        VopSignUpConfig vopSignUpConfig = C35872E6a.LIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("vop_entry", VopSignUpConfig.class, vopSignUpConfig);
        if (LJIIIIZZ != 0) {
            vopSignUpConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(vopSignUpConfig, "SettingsManager.getInsta…t::class.java) ?: DEFAULT");
        return vopSignUpConfig;
    }
}
