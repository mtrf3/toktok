package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Kg3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52315Kg3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52315Kg3 LJLIL = new C52315Kg3();

    public C52315Kg3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_webview_auth", false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
