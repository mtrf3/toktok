package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.IHn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46363IHn extends AbstractC65781Prl implements InterfaceC65784Pro<CommerceSearchAdConfigSetting.CommerceSearchAdConfig> {
    public static final C46363IHn LJLIL = new C46363IHn();

    public C46363IHn() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final CommerceSearchAdConfigSetting.CommerceSearchAdConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        CommerceSearchAdConfigSetting.CommerceSearchAdConfig commerceSearchAdConfig = CommerceSearchAdConfigSetting.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("commerce_search_ad_config", CommerceSearchAdConfigSetting.CommerceSearchAdConfig.class, commerceSearchAdConfig);
        if (LJIIIIZZ == 0) {
            CommerceSearchAdConfigSetting.LIZ.getClass();
        } else {
            commerceSearchAdConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(commerceSearchAdConfig, "SettingsManager.getInsta…ng::class.java) ?: CONFIG");
        return commerceSearchAdConfig;
    }
}
