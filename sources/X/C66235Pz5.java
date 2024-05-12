package X;

import com.ss.android.ugc.aweme.ttm.TTMConfigSettings;

/* renamed from: X.Pz5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66235Pz5 extends AbstractC65781Prl implements InterfaceC65784Pro<TTMConfigSettings.TTMConfig> {
    public static final C66235Pz5 LJLIL = new C66235Pz5();

    public C66235Pz5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TTMConfigSettings.TTMConfig invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            TTMConfigSettings.TTMConfig tTMConfig = TTMConfigSettings.LIZIZ;
            LJIIIZ.getClass();
            TTMConfigSettings.TTMConfig tTMConfig2 = (TTMConfigSettings.TTMConfig) FFL.LJIJ(true, "ttk_ttm_core_configs", 31744, TTMConfigSettings.TTMConfig.class, tTMConfig);
            if (tTMConfig2 == null) {
                TTMConfigSettings.LIZ.getClass();
                return tTMConfig;
            }
            return tTMConfig2;
        } catch (Throwable unused) {
            TTMConfigSettings.LIZ.getClass();
            return TTMConfigSettings.LIZIZ;
        }
    }
}
