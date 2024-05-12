package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.sandbox.settings.PnsNetSandboxDfidConfigModel;

/* renamed from: X.Ezj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38247Ezj extends AbstractC65781Prl implements InterfaceC65784Pro<PnsNetSandboxDfidConfigModel> {
    public static final C38247Ezj LJLIL = new C38247Ezj();

    public C38247Ezj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.sandbox.settings.PnsNetSandboxDfidConfigModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PnsNetSandboxDfidConfigModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PnsNetSandboxDfidConfigModel pnsNetSandboxDfidConfigModel = C38246Ezi.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("pns_net_sandbox_dfid_config", PnsNetSandboxDfidConfigModel.class, pnsNetSandboxDfidConfigModel);
        if (LJIIIIZZ == 0) {
            return pnsNetSandboxDfidConfigModel;
        }
        return LJIIIIZZ;
    }
}
