package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig;

/* renamed from: X.2yA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75742yA extends AbstractC65781Prl implements InterfaceC65784Pro<FakeMessageConfig.Config> {
    public static final C75742yA LJLIL = new C75742yA();

    public C75742yA() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final FakeMessageConfig.Config invoke() {
        FakeMessageConfig.Config config;
        try {
            FakeMessageConfig.Config config2 = (FakeMessageConfig.Config) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_fake_message_config", FakeMessageConfig.Config.class, FakeMessageConfig.LIZ);
            C3C5.m7constructorimpl(config2);
            config = config2;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            config = LIZ;
        }
        if (C3C5.m12isFailureimpl(config) || config == 0) {
            return FakeMessageConfig.LIZ;
        }
        return config;
    }
}
