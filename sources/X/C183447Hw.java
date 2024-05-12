package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.7Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183447Hw extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C183447Hw LJLIL = new C183447Hw();

    public C183447Hw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("viewer_list_dialog_auth_type", 0);
        } catch (Exception unused) {
        }
        return Integer.valueOf(i);
    }
}
