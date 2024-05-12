package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Kft, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52305Kft extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C52305Kft LJLIL = new C52305Kft();

    public C52305Kft() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("fix_view_model_store", 0);
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
