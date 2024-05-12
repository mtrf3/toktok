package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.setting.SecureSDKConfigSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.N2f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58705N2f extends AbstractC65781Prl implements InterfaceC65784Pro<SecureSDKConfigSetting.SecureSDkConfig> {
    public static final C58705N2f LJLIL = new C58705N2f();

    public C58705N2f() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SecureSDKConfigSetting.SecureSDkConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SecureSDKConfigSetting.SecureSDkConfig secureSDkConfig = SecureSDKConfigSetting.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("commerce_sercurity_center_config", SecureSDKConfigSetting.SecureSDkConfig.class, secureSDkConfig);
        if (LJIIIIZZ == 0) {
            SecureSDKConfigSetting.LIZ.getClass();
        } else {
            secureSDkConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(secureSDkConfig, "SettingsManager.getInsta…ng::class.java) ?: CONFIG");
        return secureSDkConfig;
    }
}
