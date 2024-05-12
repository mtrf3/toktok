package X;

import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes7.dex */
public final class E1E extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final E1E LJLIL = new E1E();

    public E1E() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        SettingsManager.LIZLLL().getClass();
        return Float.valueOf(SettingsManager.LIZJ("tablet_device_score", 0.0f));
    }
}
