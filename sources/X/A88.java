package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.WwaPreloadChannelConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A88 extends AbstractC65781Prl implements InterfaceC65784Pro<WwaPreloadChannelConfig> {
    public static final A88 LJLIL = new A88();

    public A88() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final WwaPreloadChannelConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        WwaPreloadChannelConfig wwaPreloadChannelConfig = A87.LIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("wwa_channels", WwaPreloadChannelConfig.class, wwaPreloadChannelConfig);
        if (LJIIIIZZ != 0) {
            wwaPreloadChannelConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(wwaPreloadChannelConfig, "SettingsManager.getInsta…ss.java) ?: DEFAULT_VALUE");
        return wwaPreloadChannelConfig;
    }
}
