package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.GoH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42633GoH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C42633GoH LJLIL = new C42633GoH();

    public C42633GoH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("eventbus_logger", false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
