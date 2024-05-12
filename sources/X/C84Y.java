package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.84Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84Y extends AbstractC65781Prl implements InterfaceC65784Pro<Double> {
    public static final C84Y LJLIL = new C84Y();

    public C84Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Double invoke() {
        SettingsManager.LIZLLL().getClass();
        return Double.valueOf(SettingsManager.LIZIZ("photo_mode_default_crop_full_screen_tolerance", 0.5d));
    }
}
