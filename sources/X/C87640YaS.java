package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.experiment.ThreePartyAppClientInfoConfig;

/* renamed from: X.YaS, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87640YaS extends AbstractC65781Prl implements InterfaceC65784Pro<ThreePartyAppClientInfoConfig> {
    public static final C87640YaS LJLIL = new C87640YaS();

    public C87640YaS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.music.experiment.ThreePartyAppClientInfoConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ThreePartyAppClientInfoConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("3party_app_client_auth_info_config", ThreePartyAppClientInfoConfig.class, C87639YaR.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new ThreePartyAppClientInfoConfig();
        }
        return LJIIIIZZ;
    }
}
