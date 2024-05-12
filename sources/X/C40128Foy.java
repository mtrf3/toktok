package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.SparkSwitchConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Foy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40128Foy extends AbstractC65781Prl implements InterfaceC65784Pro<SparkSwitchConfig> {
    public static final C40128Foy LJLIL = new C40128Foy();

    public C40128Foy() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SparkSwitchConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SparkSwitchConfig sparkSwitchConfig = C40127Fox.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("ecom_spark_switch_config", SparkSwitchConfig.class, sparkSwitchConfig);
        if (LJIIIIZZ == 0) {
            C40127Fox.LIZ.getClass();
        } else {
            sparkSwitchConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(sparkSwitchConfig, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        return sparkSwitchConfig;
    }
}
