package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.UnreadCountForgivenessSettingsConfig;

/* renamed from: X.3Hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81433Hn extends AbstractC65781Prl implements InterfaceC65784Pro<UnreadCountForgivenessSettingsConfig> {
    public static final C81433Hn LJLIL = new C81433Hn();

    public C81433Hn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.appsettings.UnreadCountForgivenessSettingsConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final UnreadCountForgivenessSettingsConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        UnreadCountForgivenessSettingsConfig unreadCountForgivenessSettingsConfig = C81423Hm.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("tt_inbox_unread_message_forgiveness", UnreadCountForgivenessSettingsConfig.class, unreadCountForgivenessSettingsConfig);
        if (LJIIIIZZ == 0) {
            return unreadCountForgivenessSettingsConfig;
        }
        return LJIIIIZZ;
    }
}
