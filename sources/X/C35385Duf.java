package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Duf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35385Duf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35385Duf LJLIL = new C35385Duf();

    public C35385Duf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("advance_omsdk_session_start_timing", false);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
