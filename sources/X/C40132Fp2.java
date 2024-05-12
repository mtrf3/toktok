package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.LiveSparkSwitchConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Fp2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40132Fp2 extends AbstractC65781Prl implements InterfaceC65784Pro<LiveSparkSwitchConfig> {
    public static final C40132Fp2 LJLIL = new C40132Fp2();

    public C40132Fp2() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final LiveSparkSwitchConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        LiveSparkSwitchConfig liveSparkSwitchConfig = C40131Fp1.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("ecom_live_spark_switch_config", LiveSparkSwitchConfig.class, liveSparkSwitchConfig);
        if (LJIIIIZZ == 0) {
            C40131Fp1.LIZ.getClass();
        } else {
            liveSparkSwitchConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(liveSparkSwitchConfig, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        return liveSparkSwitchConfig;
    }
}
