package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ab.EcSearchShopResultPreloadConfigModel;

/* loaded from: classes9.dex */
public final class KFC extends AbstractC65781Prl implements InterfaceC65784Pro<EcSearchShopResultPreloadConfigModel> {
    public static final KFC LJLIL = new KFC();

    public KFC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.ab.EcSearchShopResultPreloadConfigModel] */
    @Override // X.InterfaceC65784Pro
    public final EcSearchShopResultPreloadConfigModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcSearchShopResultPreloadConfigModel ecSearchShopResultPreloadConfigModel = KF1.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("ec_search_shop_result_preload_config", EcSearchShopResultPreloadConfigModel.class, ecSearchShopResultPreloadConfigModel);
        if (LJIIIIZZ == 0) {
            return ecSearchShopResultPreloadConfigModel;
        }
        return LJIIIIZZ;
    }
}
