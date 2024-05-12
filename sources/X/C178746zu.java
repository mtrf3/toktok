package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.6zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178746zu extends AbstractC65781Prl implements InterfaceC65784Pro<C35979EAd<String, C7AL>> {
    public static final C178746zu LJLIL = new C178746zu();

    public C178746zu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C35979EAd<String, C7AL> invoke() {
        int i = 30;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("tt_quick_comment_cache_limit", 30);
        } catch (Throwable unused) {
        }
        return new C35979EAd<>(i);
    }
}
