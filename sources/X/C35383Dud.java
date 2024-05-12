package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Dud, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35383Dud extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35383Dud LJLIL = new C35383Dud();

    public C35383Dud() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("send_facebook_token_android", false);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
