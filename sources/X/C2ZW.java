package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.model.PhotoModeConfig;

/* renamed from: X.2ZW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ZW extends AbstractC65781Prl implements InterfaceC65784Pro<PhotoModeConfig> {
    public static final C2ZW LJLIL = new C2ZW();

    public C2ZW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.model.PhotoModeConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PhotoModeConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("photo_mode_config", PhotoModeConfig.class, null);
        if (LJIIIIZZ == 0) {
            return new PhotoModeConfig(null, null, 3, null);
        }
        return LJIIIIZZ;
    }
}
