package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.settings.UploadAdWebPreloadInfoConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.NIx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59139NIx extends AbstractC65781Prl implements InterfaceC65784Pro<UploadAdWebPreloadInfoConfig.UAWPIConfig> {
    public static final C59139NIx LJLIL = new C59139NIx();

    public C59139NIx() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final UploadAdWebPreloadInfoConfig.UAWPIConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        UploadAdWebPreloadInfoConfig.UAWPIConfig uAWPIConfig = UploadAdWebPreloadInfoConfig.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("upload_ad_web_preload_info_config", UploadAdWebPreloadInfoConfig.UAWPIConfig.class, uAWPIConfig);
        if (LJIIIIZZ == 0) {
            UploadAdWebPreloadInfoConfig.LIZ.getClass();
        } else {
            uAWPIConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(uAWPIConfig, "SettingsManager.getInsta…ig::class.java) ?: CONFIG");
        return uAWPIConfig;
    }
}
