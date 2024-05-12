package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.2QC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2QC LJLIL = new C2QC();

    public C2QC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("motion_event_monitor_settings", true);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
