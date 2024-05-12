package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.EcPageSourceConfigModel;

/* loaded from: classes7.dex */
public final class E9E extends AbstractC65781Prl implements InterfaceC65784Pro<EcPageSourceConfigModel> {
    public static final E9E LJLIL = new E9E();

    public E9E() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.ecommercebase.pagesource.EcPageSourceConfigModel] */
    @Override // X.InterfaceC65784Pro
    public final EcPageSourceConfigModel invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcPageSourceConfigModel ecPageSourceConfigModel = E9D.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("ec_page_source_config", EcPageSourceConfigModel.class, ecPageSourceConfigModel);
        if (LJIIIIZZ == 0) {
            return ecPageSourceConfigModel;
        }
        return LJIIIIZZ;
    }
}
