package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.OpenTikTokOnMuteConfig;

/* renamed from: X.Dy0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35592Dy0 extends AbstractC65781Prl implements InterfaceC65784Pro<OpenTikTokOnMuteConfig> {
    public static final C35592Dy0 LJLIL = new C35592Dy0();

    public C35592Dy0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.OpenTikTokOnMuteConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final OpenTikTokOnMuteConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        OpenTikTokOnMuteConfig openTikTokOnMuteConfig = C35591Dxz.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("open_tiktok_on_mute_settings", OpenTikTokOnMuteConfig.class, openTikTokOnMuteConfig);
        if (LJIIIIZZ == 0) {
            return openTikTokOnMuteConfig;
        }
        return LJIIIIZZ;
    }
}
