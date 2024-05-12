package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.experiment.ProfileViewersConfig;

/* renamed from: X.8vQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226928vQ extends AbstractC65781Prl implements InterfaceC65784Pro<ProfileViewersConfig> {
    public static final C226928vQ LJLIL = new C226928vQ();

    public C226928vQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.profile.experiment.ProfileViewersConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ProfileViewersConfig invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("profile_views_config", ProfileViewersConfig.class, C226918vP.LIZIZ);
    }
}
