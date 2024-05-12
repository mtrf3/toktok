package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.84D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84D extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C84D LJLIL = new C84D();

    public C84D() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("photomode_fps_dot_opt_enable", false);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
