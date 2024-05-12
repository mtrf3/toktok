package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.experiment.DMSessionLoadConfig;

/* renamed from: X.3KR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KR extends AbstractC65781Prl implements InterfaceC65784Pro<DMSessionLoadConfig> {
    public static final C3KR LJLIL = new C3KR();

    public C3KR() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final DMSessionLoadConfig invoke() {
        DMSessionLoadConfig dMSessionLoadConfig;
        try {
            DMSessionLoadConfig dMSessionLoadConfig2 = (DMSessionLoadConfig) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_session_load_config", DMSessionLoadConfig.class, C3KQ.LIZ);
            C3C5.m7constructorimpl(dMSessionLoadConfig2);
            dMSessionLoadConfig = dMSessionLoadConfig2;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            dMSessionLoadConfig = LIZ;
        }
        if (C3C5.m12isFailureimpl(dMSessionLoadConfig) || dMSessionLoadConfig == 0) {
            return C3KQ.LIZ;
        }
        return dMSessionLoadConfig;
    }
}
