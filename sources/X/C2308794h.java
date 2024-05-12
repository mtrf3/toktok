package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.94h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2308794h extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2308794h INSTANCE = new C2308794h();

    public C2308794h() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int i;
        boolean z;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("discover_fps_phone_performance_2", 3);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            i = 3;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
