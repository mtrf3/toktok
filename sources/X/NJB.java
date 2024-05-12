package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.settings.AdLandPageOptimizationModel;

/* loaded from: classes11.dex */
public final class NJB extends AbstractC65781Prl implements InterfaceC65784Pro<AdLandPageOptimizationModel> {
    public static final NJB LJLIL = new NJB();

    public NJB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.settings.AdLandPageOptimizationModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AdLandPageOptimizationModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AdLandPageOptimizationModel adLandPageOptimizationModel = NJA.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("ad_land_page_optimization", AdLandPageOptimizationModel.class, adLandPageOptimizationModel);
        if (LJIIIIZZ == 0) {
            return adLandPageOptimizationModel;
        }
        return LJIIIIZZ;
    }
}
