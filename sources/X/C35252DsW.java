package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.DsW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35252DsW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35252DsW LJLIL = new C35252DsW();

    public C35252DsW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("upload_ad_web_preload_info", true);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
