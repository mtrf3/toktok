package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Kf2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52252Kf2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52252Kf2 LJLIL = new C52252Kf2();

    public C52252Kf2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("opt_pinch_listener_settings", false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
